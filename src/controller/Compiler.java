package controller;

import exceptions.SyntaxErrorException;
import exceptions.UnsupportedInstructionException;
import sprocklGenerator.SprocklGenerator;
import grammar.MainGrammarLexer;
import grammar.MainGrammarParser;
import org.antlr.v4.runtime.*;
import utils.iloc.model.Program;
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


    public String compile(String source) throws SyntaxErrorException {


        CharStream charStream = CharStreams.fromString(source);

        /*
         * Early Parsing Stage
         *
         * In this stage we will only do lexing and parsing to generate a parse tree.
         * This will later be used to further compile the program
         */
        CompilerErrorListener errorListener = new CompilerErrorListener();
        Lexer lexer = new MainGrammarLexer(charStream);
        lexer.removeErrorListeners();
        lexer.addErrorListener(errorListener);
        TokenStream tokens = new CommonTokenStream(lexer);

        MainGrammarParser parser = new MainGrammarParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(errorListener);
        parser.program();

        //Error handling of the Early parsing stage
        if (errorListener.getErrorMessages().size() > 0) {
            throw new SyntaxErrorException(errorListener.getErrorMessages());
        }

        /*
         * Checking Stage
         *
         * In this stage the code will first be checked on whether the code is correct.
         * This is done in the following stages:
         * - Stage 1
         *   Checks and records all declarations of variables.
         * - Stage 2
         *   Type and declaration checking stage of the checking process.
         */



        /*
         * ILOC Pre-processing
         *
         * In this stage there will be some pre processing of the data.
         * This includes register allocation.
         */



        /*
         * Generation of ILOC Code
         *
         * In this stage the source code will be turned into ILOC 'code'.
         */

        Program ilocProgram = null;

        /*
         * Generation of Sprockl Code
         *
         * In this stage the ILOC code will be turned into Sprockl code.
         */

        String sprocklResult = null;
        SprocklGenerator generator = new SprocklGenerator(ilocProgram);
        try {
            sprocklResult = generator.generate();
        } catch (UnsupportedInstructionException e) {
            e.printStackTrace();
        }

        return sprocklResult;
    }


}
