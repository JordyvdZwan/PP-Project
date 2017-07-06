package controller;

import checker.Checker;
import checker.model.CheckerRecord;
import checker.model.DeclarationTable;
import exceptions.*;
import grammar.MainGrammarLexer;
import grammar.MainGrammarParser;
import ilocGenerator.ILOCGenerator;
import ilocPostProccessor.ILOCPostProcessor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import sprocklGenerator.SprocklGenerator;
import utils.iloc.Simulator;
import utils.iloc.model.Program;
import utils.log.Log;
import utils.log.LogItem;
import utils.log.LogType;
import utils.parsing.CompilerErrorListener;

import java.io.*;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Jordy van der Zwan on 24-Jun-17.
 * <p>
 * Controller class of the compiler
 * <p>
 * The main purpose is to execute all the steps in this class that are needed for compiling.
 * All the exceptions are gathered here and handled or passed on to the interface.
 */
public class Compiler {

    private final static LogType LOG_TYPE = LogType.Dev;
    private final static boolean PRINT_TO_SCREEN = true;
    private final static boolean WRITE_TO_FILE = true;

    private final static boolean CHECKER_STAGE_1 = true;
    private final static boolean CHECKER_STAGE_2 = true;
    private final static boolean CHECKER_STAGE_3 = true;

    private final static boolean ILOC_GENERATOR_SIMULATOR_RUN = true;
    private final static boolean ILOC_POSTPROCESSOR_SIMULATOR_RUN = true;

    private final static boolean DEBUG = true;
    private static boolean PRETTYPRINT = true;


    private static Log log = new Log(PRINT_TO_SCREEN, WRITE_TO_FILE, LOG_TYPE);

    public static void main(String[] args) {
        Compiler compiler = new Compiler();
        try {
            String filePath = new File("").getAbsolutePath();
            Scanner in = new Scanner(new FileReader(filePath + "\\resources\\src\\input.ppl"));
            StringBuilder sb = new StringBuilder();
            while(in.hasNextLine()) {
                sb.append(in.nextLine()).append("\n");
            }
            in.close();
            String input = sb.toString();

            String result = compiler.compile(input);
            if (PRETTYPRINT) {
                try {
                    Writer writer;
                    writer = new BufferedWriter(new OutputStreamWriter(
                            new FileOutputStream("resources\\out\\outputpretty.hs"), "utf-8"));
                    writer.append(result);
                    writer.flush();
                    writer = new BufferedWriter(new OutputStreamWriter(
                            new FileOutputStream("resources\\out\\archive\\ppl-outputpretty-" + LogItem.sdf.format(new Date()) + ".hs"), "utf-8"));
                    writer.append(result);
                    writer.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                    Log.addLogItem("Could not write to output file!", LogType.Error);
                }

                PRETTYPRINT = false;
                result = compiler.compile(input);
            }
            try {
                Writer writer;
                writer = new BufferedWriter(new OutputStreamWriter(
                        new FileOutputStream("resources\\out\\output.hs"), "utf-8"));
                writer.append(result);
                writer.flush();
                writer = new BufferedWriter(new OutputStreamWriter(
                        new FileOutputStream("resources\\out\\archive\\ppl-output-" + LogItem.sdf.format(new Date()) + ".hs"), "utf-8"));
                writer.append(result);
                writer.flush();
            } catch (IOException e) {
                e.printStackTrace();
                Log.addLogItem("Could not write to output file!", LogType.Error);
            }
        } catch (SyntaxErrorException | FileNotFoundException | CompilerErrorException | CheckerException e) {
            Log.addLogItem(e.getMessage(), LogType.Error);
            Log.addLogItem("Compilation Unsuccessful!", LogType.Warning);
        }
    }

    private String compile(String source) throws SyntaxErrorException, CompilerErrorException, CheckerException {

        //Global Compile Variables
        long mainStageStart;
        long subStageStart;
        long compileStart;
        CharStream charStream = CharStreams.fromString(source);
        ParseTree parseTree;

        CheckerRecord checkerRecord = null;
        DeclarationTable declarationTable = null;

        Program ilocProgram = null;
        String sprocklResult = null;


        Log.addLogItem("Starting compilation...", LogType.Info);
        compileStart = System.currentTimeMillis();
        /*
         * Parsing Phase
         *
         * In this stage we will only do lexing and parsing to generate a parse tree.
         * This will later be used to further compile the program
         */

        {
            // Early Parsing Phase Variables
            CompilerErrorListener errorListener;
            TokenStream tokens;

            Log.addLogItem("Starting Parsing Phase", LogType.Info);
            mainStageStart = System.currentTimeMillis();
            {
                Log.addLogItem("\tStarting Lexer Stage", LogType.Dev);
                subStageStart = System.currentTimeMillis();
                {
                    // Lexer Stage
                    errorListener = new CompilerErrorListener();
                    Lexer lexer = new MainGrammarLexer(charStream);
                    lexer.removeErrorListeners();
                    lexer.addErrorListener(errorListener);
                    tokens = new CommonTokenStream(lexer);

                    // Error handling of Lexer Stage
                    if (handleErrors(errorListener.getErrorMessages(), "Lexer Stage")) {
                        throw new CompilerErrorException("Fatal error(s) during Lexer Stage!");
                    }
                    errorListener.resetErrorMessages();
                }
                Log.addLogItem("\tLexer Stage Finished (time: " + (System.currentTimeMillis() - subStageStart) + "ms)", LogType.Dev);
                Log.addLogItem("\tStarting Parser Stage", LogType.Dev);
                subStageStart = System.currentTimeMillis();
                {
                    // Parser Stage
                    MainGrammarParser parser = new MainGrammarParser(tokens);
                    parser.removeErrorListeners();
                    parser.addErrorListener(errorListener);
                    parseTree = parser.program();

                    // Error handling of Parser Stage
                    if (handleErrors(errorListener.getErrorMessages(), "Parser Stage")) {
                        throw new CompilerErrorException("Fatal error(s) during Parser Stage!");
                    }
                    errorListener.resetErrorMessages();
                }
                Log.addLogItem("\tParser Stage Finished (time: " + (System.currentTimeMillis() - subStageStart) + "ms)", LogType.Dev);
            }
            Log.addLogItem("Parsing Phase Finished (time: " + (System.currentTimeMillis() - mainStageStart) + "ms)", LogType.Info);

            //Error handling of the Early parsing stage
            if (errorListener.getErrorMessages().size() > 0) {
                throw new SyntaxErrorException(errorListener.getErrorMessages());
            }
        }

        /*
         * Checking Phase
         *
         * In this stage the code will first be checked on whether the code is correct.
         * This is done in the following stages:
         * - Stage 1
         *   Checks and records all declarations of variables.
         * - Stage 2
         *   Type and declaration checking stage of the checking process.
         */

        {
            //Checking Phase Variables
            Checker checker = new Checker();

            Log.addLogItem("Starting Checking Phase", LogType.Info);
            mainStageStart = System.currentTimeMillis();
            {

                //---------------------------------
                // Stage 1
                //---------------------------------

                if (CHECKER_STAGE_1) {
                    Log.addLogItem("Starting Checker Stage 1", LogType.Dev);
                    subStageStart = System.currentTimeMillis();
                    {
                        // Checker Stage 1 Body
                        try {
                            checker.getStage1().execute(parseTree);
                        } catch (CheckerException e) {
                            e.printStackTrace();
                        }

                        // Error handling of Checker Stage 1
                        if (handleErrors(checker.getStage1().getErrors(), "Checker Stage 1")) {
                            Log.addLogItem(" --- Data Dump --- " +
                                    "\n=======================================================================================================" +
                                    "\nvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv" +
                                    "\n" + checker.getDeclarationTable() +
//                                    "\n" + checker.getCheckerRecord().offsetsToString(checker.getCheckerRecord().getOffsets(), parseTree) +
//                                    "\n" + checker.getCheckerRecord().typesToString(checker.getCheckerRecord().getTypes(), parseTree) +
//                                    "\n" + checker.getCheckerRecord().entriesToString(checker.getCheckerRecord().getEntries(), parseTree) +
                                    "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^" +
                                    "\n=======================================================================================================", LogType.Dev);
                            throw new CompilerErrorException("Fatal error(s) during Checker stage 1!");
                        }
                        checker.getDeclarationTable().resetScope();

                    }
                    Log.addLogItem("Checker Stage 1 Finished (time: " + (System.currentTimeMillis() - subStageStart) + "ms)", LogType.Dev);
                } else {
                    Log.addLogItem("Skipped Checker Stage 1.", LogType.Warning);
                }

                //---------------------------------
                // Stage 2
                //---------------------------------

                if (CHECKER_STAGE_2) {
                    Log.addLogItem("Starting Checker Stage 2", LogType.Dev);
                    subStageStart = System.currentTimeMillis();
                    {
                        // Checker Stage 2 Body
                        try {
                            checker.getStage2().execute(parseTree);
                        } catch (CheckerException e) {
                            e.printStackTrace();
                        }

                        // Error handling of Checker Stage 2
                        if (handleErrors(checker.getStage2().getErrors(), "Checker Stage 2")) {
                            Log.addLogItem(" --- Data Dump --- " +
                                    "\n=======================================================================================================" +
                                    "\nvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv" +
                                    "\n" + checker.getDeclarationTable() +
//                                    "\n" + checker.getCheckerRecord().offsetsToString(checker.getCheckerRecord().getOffsets(), parseTree) +
//                                    "\n" + checker.getCheckerRecord().typesToString(checker.getCheckerRecord().getTypes(), parseTree) +
//                                    "\n" + checker.getCheckerRecord().entriesToString(checker.getCheckerRecord().getEntries(), parseTree) +
                                    "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^" +
                                    "\n=======================================================================================================", LogType.Dev);
                            throw new CompilerErrorException("Fatal error(s) during Checker stage 2!");
                        }
                        checker.getDeclarationTable().resetScope();

                    }
                    Log.addLogItem("Checker Stage 2 Finished (time: " + (System.currentTimeMillis() - subStageStart) + "ms)", LogType.Dev);
                } else {
                    Log.addLogItem("Skipped Checker Stage 2.", LogType.Warning);
                }

                //---------------------------------
                // Stage 3
                //---------------------------------

                if (CHECKER_STAGE_3) {
                    Log.addLogItem("Starting Checker Stage 3", LogType.Dev);
                    subStageStart = System.currentTimeMillis();
                    {
                        // Checker Stage 1 Body
                        try {
                            checker.getStage3().execute(parseTree);
                        } catch (CheckerException e) {
                            e.printStackTrace();
                        }

                        // Error handling of Checker Stage 1
                        if (handleErrors(checker.getStage3().getErrors(), "Checker Stage 3")) {
                            Log.addLogItem(" --- Data Dump --- " +
                                    "\n=======================================================================================================" +
                                    "\nvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv" +
                                    "\n" + checker.getDeclarationTable() +
//                                    "\n" + checker.getCheckerRecord().offsetsToString(checker.getCheckerRecord().getOffsets(), parseTree) +
//                                    "\n" + checker.getCheckerRecord().typesToString(checker.getCheckerRecord().getTypes(), parseTree) +
//                                    "\n" + checker.getCheckerRecord().entriesToString(checker.getCheckerRecord().getEntries(), parseTree) +
                                    "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^" +
                                    "\n=======================================================================================================", LogType.Dev);
                            throw new CompilerErrorException("Fatal error(s) during Checker stage 3!");
                        }
                        checker.getDeclarationTable().resetScope();

                    }
                    Log.addLogItem("Checker Stage 3 Finished (time: " + (System.currentTimeMillis() - subStageStart) + "ms)", LogType.Dev);
                } else {
                    Log.addLogItem("Skipped Checker Stage 3.", LogType.Warning);
                }

                declarationTable = checker.getDeclarationTable();
                checkerRecord = checker.getCheckerRecord();

            }
            Log.addLogItem("Checking Phase Finished (time: " + (System.currentTimeMillis() - mainStageStart) + "ms)", LogType.Info);
        }

        /*
         * ILOC Pre-processing Phase
         *
         * In this stage there will be some pre processing of the data.
         * This includes register allocation.
         */

        Log.addLogItem("Starting ILOC Pre-processing Phase", LogType.Info);
        mainStageStart = System.currentTimeMillis();
        {
            Log.addLogItem("Starting ILOC Pre-processing Stage 1", LogType.Dev);
            subStageStart = System.currentTimeMillis();
            {
                // ILOC Pre-processing Stage 1 Body

                // Error handling of ILOC Pre-processing Stage 1

            }
            Log.addLogItem("ILOC Pre-processing Stage 1 Finished (time: " + (System.currentTimeMillis() - subStageStart) + "ms)", LogType.Dev);
        }
        Log.addLogItem("ILOC Pre-processing Phase Finished (time: " + (System.currentTimeMillis() - mainStageStart) + "ms)", LogType.Info);

        /*
         * Generation of ILOC Code Generation Phase
         *
         * In this stage the source code will be turned into ILOC 'code'.
         */

        Log.addLogItem("Starting ILOC Code Generation Phase", LogType.Info);
        mainStageStart = System.currentTimeMillis();
        {
            Log.addLogItem("Starting ILOC Code Generation Stage 1", LogType.Dev);
            subStageStart = System.currentTimeMillis();
            {
                // ILOC Code Generation Stage 1 Body
                ILOCGenerator generator = new ILOCGenerator(checkerRecord, declarationTable);

                ilocProgram = generator.generate(parseTree);

                // Error handling of ILOC Code Generation Stage 1

            }
            Log.addLogItem("ILOC Code Generation Stage 1 Finished (time: " + (System.currentTimeMillis() - subStageStart) + "ms)", LogType.Dev);

            Log.addLogItem("ILOC PROGRAM PRINT:\nVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV\n" +
                    ilocProgram.prettyPrint() +
                    "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^", LogType.Dev);

        }
        Log.addLogItem("ILOC Code Generation Phase Finished (time: " + (System.currentTimeMillis() - mainStageStart) + "ms)", LogType.Info);

        /*
         * ILOC Post-processing Phase
         *
         * In this stage the iloc code will be made (more) usable.
         */

        Log.addLogItem("Starting ILOC Post-processing Phase", LogType.Info);
        mainStageStart = System.currentTimeMillis();
        {
            Log.addLogItem("Starting ILOC Post-processing Stage 1", LogType.Dev);
            subStageStart = System.currentTimeMillis();
            {
                // ILOC Post-processing Stage 1 Body
                ILOCPostProcessor postProcessor = new ILOCPostProcessor(ilocProgram);

                ilocProgram = postProcessor.execute();

                // Error handling of ILOC Post-processing Stage 1

            }
            Log.addLogItem("ILOC Post-processing Stage 1 Finished (time: " + (System.currentTimeMillis() - subStageStart) + "ms)", LogType.Dev);

            Log.addLogItem("ILOC PROGRAM PRINT:\nVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV\n" +
                    ilocProgram.prettyPrint() +
                    "\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^", LogType.Dev);
        }




        Log.addLogItem("ILOC Post-processing Phase Finished (time: " + (System.currentTimeMillis() - mainStageStart) + "ms)", LogType.Info);

        /*
         * Generation of Sprockl Code generation Phase
         *
         * In this stage the ILOC code will be turned into Sprockl code.
         */

        Log.addLogItem("Starting Sprockl Code Generation Phase", LogType.Info);
        mainStageStart = System.currentTimeMillis();
        {
            Log.addLogItem("Starting Sprockl Code Generation Stage 1", LogType.Dev);
            subStageStart = System.currentTimeMillis();
            {
                // ILOC Code Generation Stage 1 Body
                SprocklGenerator generator = new SprocklGenerator(ilocProgram, CheckerRecord.nrOfThreads);
                try {
                    if (ilocProgram != null) sprocklResult = generator.generate(DEBUG, PRETTYPRINT);
                } catch (UnsupportedInstructionException e) {
                    throw new CompilerErrorException("Unsupported instruction during Sprockl Conversion: " + e.getMessage());
                } catch (TooManyRegistersException e) {
                    throw new CompilerErrorException("Too many registers exception during Sprockl Conversion.");
                }

                // Error handling of ILOC Code Generation Stage 1

            }
            Log.addLogItem("Sprockl Code Generation Stage 1 Finished (time: " + (System.currentTimeMillis() - subStageStart) + "ms)", LogType.Dev);

        }
        Log.addLogItem("Sprockl Code Generation Phase Finished (time: " + (System.currentTimeMillis() - mainStageStart) + "ms)", LogType.Info);

        Log.addLogItem("Code Compilation completed! Total compilation time: " + (System.currentTimeMillis() - compileStart) + "ms", LogType.Info);

        return sprocklResult;
    }

    private boolean handleErrors(List<String> errors, String stage) {
        if (errors.size() > 0) {
            for (String error : errors) {
                Log.addLogItem(error, LogType.Error);
            }
        } else {
            Log.addLogItem("No errors in " + stage, LogType.Dev);
        }
        return errors.size() > 0;
    }

}
