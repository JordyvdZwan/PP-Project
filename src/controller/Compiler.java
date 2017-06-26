package controller;

import checker.Checker;
import exceptions.CheckerException;
import exceptions.CompilerErrorException;
import exceptions.SyntaxErrorException;
import exceptions.UnsupportedInstructionException;
import grammar.MainGrammarLexer;
import grammar.MainGrammarParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import sprocklGenerator.SprocklGenerator;
import utils.iloc.model.Program;
import utils.log.Log;
import utils.log.LogType;
import utils.parsing.CompilerErrorListener;

import java.util.List;

/**
 * Created by Jordy van der Zwan on 24-Jun-17.
 * <p>
 * Controller class of the compiler
 * <p>
 * The main purpose is to execute all the steps in this class that are needed for compiling.
 * All the exceptions are gathered here and handled or passed on to the interface.
 */
public class Compiler {

    private static Log log = new Log(true, true);

    public static void main(String[] args) {
        Compiler compiler = new Compiler();
        try {
            compiler.compile("Var Integer i;\n" +
                    "i = 1;\n" +
                    "while (i < 5) Do {\n" +
                    "    i = i + 1;\n" +
                    "}\n" +
                    "if (i == 5) then {\n" +
                    "    Boolean bol = false;\n" +
                    "    bol = true;\n" +
                    "    i = 6;\n" +
                    "} else {\n" +
                    "    i = 5;\n" +
                    "}\n" +
                    "Boolean live;");
        } catch (SyntaxErrorException e) {
            e.printStackTrace();
        } catch (CompilerErrorException e) {
            e.printStackTrace();
        } catch (CheckerException e) {
            e.printStackTrace();
        }
    }

    public String compile(String source) throws SyntaxErrorException, CompilerErrorException, CheckerException {

        //Global Compile Variables
        long mainStageStart;
        long subStageStart;
        long compileStart;
        CharStream charStream = CharStreams.fromString(source);
        ParseTree parseTree;
        Program ilocProgram = null;
        String sprocklResult = null;


        log.addLogItem("Starting compilation...", LogType.Info);
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

            log.addLogItem("Starting Parsing Phase", LogType.Info);
            mainStageStart = System.currentTimeMillis();
            {
                log.addLogItem("\tStarting Lexer Stage", LogType.Dev);
                subStageStart = System.currentTimeMillis();
                {
                    // Lexer Stage
                    errorListener = new CompilerErrorListener();
                    Lexer lexer = new MainGrammarLexer(charStream);
                    lexer.removeErrorListeners();
                    lexer.addErrorListener(errorListener);
                    tokens = new CommonTokenStream(lexer);

                    // Error handling of Lexer Stage
                    if (handleErrors(errorListener.getErrorMessages(), "Lexer Stage")) throw new CheckerException();
                    errorListener.resetErrorMessages();
                }
                log.addLogItem("\tLexer Stage Finished (time: " + (System.currentTimeMillis() - subStageStart) + "ms)", LogType.Dev);
                log.addLogItem("\tStarting Parser Stage", LogType.Dev);
                subStageStart = System.currentTimeMillis();
                {
                    // Parser Stage
                    MainGrammarParser parser = new MainGrammarParser(tokens);
                    parser.removeErrorListeners();
                    parser.addErrorListener(errorListener);
                    parseTree = parser.program();

                    // Error handling of Parser Stage
                    if (handleErrors(errorListener.getErrorMessages(), "Parser Stage")) throw new CheckerException();
                    errorListener.resetErrorMessages();
                }
                log.addLogItem("\tParser Stage Finished (time: " + (System.currentTimeMillis() - subStageStart) + "ms)", LogType.Dev);
            }
            log.addLogItem("Parsing Phase Finished (time: " + (System.currentTimeMillis() - mainStageStart) + "ms)", LogType.Info);

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

            log.addLogItem("Starting Parsing Phase", LogType.Info);
            mainStageStart = System.currentTimeMillis();
            {
                log.addLogItem("Starting Checker Stage 1", LogType.Dev);
                subStageStart = System.currentTimeMillis();
                {
                    // Checker Stage 1 Body
                    try {
                        checker.getStage1().execute(parseTree);
                    } catch (CheckerException e) {
                        e.printStackTrace();
                    }

                    // Error handling of Checker Stage 1
                    if (handleErrors(checker.getStage1().getErrors(), "Checker Stage 1")) throw new CheckerException();
                    checker.getDeclarationTable().resetScope();

                }
                log.addLogItem("Checker Stage 1 Finished (time: " + (System.currentTimeMillis() - subStageStart) + "ms)", LogType.Dev);
                log.addLogItem("Starting Checker Stage 2", LogType.Dev);
                subStageStart = System.currentTimeMillis();
                {
                    // Checker Stage 2 Body
                    try {
                        checker.getStage2().execute(parseTree);
                    } catch (CheckerException e) {
                        e.printStackTrace();
                    }

                    // Error handling of Checker Stage 2
                    if (handleErrors(checker.getStage2().getErrors(), "Checker Stage 2")) throw new CheckerException();
                    checker.getDeclarationTable().resetScope();

                }
                log.addLogItem("Checker Stage 2 Finished (time: " + (System.currentTimeMillis() - subStageStart) + "ms)", LogType.Dev);
            }
            log.addLogItem("Parsing Phase Finished (time: " + (System.currentTimeMillis() - mainStageStart) + "ms)", LogType.Info);
        }

        /*
         * ILOC Pre-processing Phase
         *
         * In this stage there will be some pre processing of the data.
         * This includes register allocation.
         */

        log.addLogItem("Starting ILOC Pre-processing Phase", LogType.Info);
        mainStageStart = System.currentTimeMillis();
        {
            log.addLogItem("Starting ILOC Pre-processing Stage 1", LogType.Dev);
            subStageStart = System.currentTimeMillis();
            {
                // ILOC Pre-processing Stage 1 Body

                // Error handling of ILOC Pre-processing Stage 1

            }
            log.addLogItem("ILOC Pre-processing Stage 1 Finished (time: " + (System.currentTimeMillis() - subStageStart) + "ms)", LogType.Dev);
        }
        log.addLogItem("ILOC Pre-processing Phase Finished (time: " + (System.currentTimeMillis() - mainStageStart) + "ms)", LogType.Info);

        /*
         * Generation of ILOC Code Generation Phase
         *
         * In this stage the source code will be turned into ILOC 'code'.
         */

        log.addLogItem("Starting ILOC Code Generation Phase", LogType.Info);
        mainStageStart = System.currentTimeMillis();
        {
            log.addLogItem("Starting ILOC Code Generation Stage 1", LogType.Dev);
            subStageStart = System.currentTimeMillis();
            {
                // ILOC Code Generation Stage 1 Body

                // Error handling of ILOC Code Generation Stage 1

            }
            log.addLogItem("ILOC Code Generation Stage 1 Finished (time: " + (System.currentTimeMillis() - subStageStart) + "ms)", LogType.Dev);
        }
        log.addLogItem("ILOC Code Generation Phase Finished (time: " + (System.currentTimeMillis() - mainStageStart) + "ms)", LogType.Info);

        /*
         * Generation of Sprockl Code generation Phase
         *
         * In this stage the ILOC code will be turned into Sprockl code.
         */

        log.addLogItem("Starting Sprockl Code Generation Phase", LogType.Info);
        mainStageStart = System.currentTimeMillis();
        {
            log.addLogItem("Starting Sprockl Code Generation Stage 1", LogType.Dev);
            subStageStart = System.currentTimeMillis();
            {
                // ILOC Code Generation Stage 1 Body
                SprocklGenerator generator = new SprocklGenerator(ilocProgram);
                try {
                    if (ilocProgram != null) sprocklResult = generator.generate();
                } catch (UnsupportedInstructionException e) {
                    e.printStackTrace();
                }


                // Error handling of ILOC Code Generation Stage 1

            }
            log.addLogItem("Sprockl Code Generation Stage 1 Finished (time: " + (System.currentTimeMillis() - subStageStart) + "ms)", LogType.Dev);
        }
        log.addLogItem("Sprockl Code Generation Phase Finished (time: " + (System.currentTimeMillis() - mainStageStart) + "ms)", LogType.Info);

        log.addLogItem("Code Compilation completed! Total compilation time: " + (System.currentTimeMillis() - compileStart) + "ms", LogType.Info);

        return sprocklResult;
    }

    private boolean handleErrors(List<String> errors, String stage) {
        if (errors.size() > 0) {
            for (String error : errors) {
                log.addLogItem(error, LogType.Error);
            }
        } else {
            log.addLogItem("No errors in " + stage, LogType.Dev);
        }
        return errors.size() > 0;
    }

}
