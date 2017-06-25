package controller;

import checker.Checker;
import exceptions.CheckerException;
import exceptions.SyntaxErrorException;
import exceptions.UnsupportedInstructionException;
import org.antlr.v4.runtime.tree.ParseTree;
import sprocklGenerator.SprocklGenerator;
import grammar.MainGrammarLexer;
import grammar.MainGrammarParser;
import org.antlr.v4.runtime.*;
import utils.iloc.model.Program;
import utils.log.Log;
import utils.log.LogType;
import utils.parsing.CompilerErrorListener;

/**
 * Created by Jordy van der Zwan on 24-Jun-17.
 *
 * Controller class of the compiler
 *
 * The main purpose is to execute all the steps in this class that are needed for compiling.
 * All the exceptions are gathered here and handled or passed on to the interface.
 */
public class Compiler {

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
        }
    }

    public String compile(String source) throws SyntaxErrorException {

        //Global Compile Variables
        long mainStageStart;
        long subStageStart;
        CharStream charStream = CharStreams.fromString(source);
        ParseTree parseTree;
        Log log = new Log(true, true);

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

            log.addLogItem("Starting Parsing Stage", LogType.Info);
            mainStageStart = System.currentTimeMillis();
            {
                log.addLogItem("\tStarting Lexer Stage", LogType.Dev);
                subStageStart = System.currentTimeMillis();
                {
                    errorListener = new CompilerErrorListener();
                    Lexer lexer = new MainGrammarLexer(charStream);
                    lexer.removeErrorListeners();
                    lexer.addErrorListener(errorListener);
                    tokens = new CommonTokenStream(lexer);
                }
                log.addLogItem("\tLexer Stage Finished (time: " + (System.currentTimeMillis() - subStageStart) + "ms)", LogType.Dev);
                log.addLogItem("\tStarting Parser Stage", LogType.Dev);
                subStageStart = System.currentTimeMillis();
                {
                    MainGrammarParser parser = new MainGrammarParser(tokens);
                    parser.removeErrorListeners();
                    parser.addErrorListener(errorListener);
                    parseTree = parser.program();
                }
                log.addLogItem("\tParser Stage Finished (time: " + (System.currentTimeMillis() - subStageStart) + "ms)", LogType.Dev);
            }
            log.addLogItem("Parsing Stage Finished (time: " + (System.currentTimeMillis() - mainStageStart) + "ms)", LogType.Info);

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

            log.addLogItem("Starting Parsing Stage", LogType.Info);
            mainStageStart = System.currentTimeMillis();
            {
                log.addLogItem("Starting Checker Stage 1", LogType.Dev);
                subStageStart = System.currentTimeMillis();
                {
                    try {
                        checker.getStage1().execute(parseTree);
                    } catch (CheckerException e) {
                        e.printStackTrace();
                    }

                    System.out.println(checker.getDeclarationTable());
                }
                log.addLogItem("Checker Stage 1 Finished (time: " + (subStageStart - System.currentTimeMillis()) + "ms)", LogType.Dev);
                log.addLogItem("Starting Checker Stage 2", LogType.Dev);
                subStageStart = System.currentTimeMillis();
                {
                    try {
                        checker.getStage2().execute(parseTree);
                    } catch (CheckerException e) {
                        e.printStackTrace();
                    }

                    System.out.println(checker.getDeclarationTable());
                }
                log.addLogItem("Checker Stage 2 Finished (time: " + (subStageStart - System.currentTimeMillis()) + "ms)", LogType.Dev);
            }
            log.addLogItem("Parsing Stage Finished (time: " + (System.currentTimeMillis() - mainStageStart) + "ms)", LogType.Info);
        }
        return null; //TODO remove
        /*
         * ILOC Pre-processing Phase
         *
         * In this stage there will be some pre processing of the data.
         * This includes register allocation.
         */



        /*
         * Generation of ILOC Code Phase
         *
         * In this stage the source code will be turned into ILOC 'code'.
         */

//        Program ilocProgram = null;
//
//        /*
//         * Generation of Sprockl Code Phase
//         *
//         * In this stage the ILOC code will be turned into Sprockl code.
//         */
//
//        String sprocklResult = null;
//        SprocklGenerator generator = new SprocklGenerator(ilocProgram);
//        try {
//            sprocklResult = generator.generate();
//        } catch (UnsupportedInstructionException e) {
//            e.printStackTrace();
//        }
//
//        return sprocklResult;
    }


}
