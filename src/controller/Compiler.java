package controller;

import grammar.MainGrammarLexer;
import grammar.MainGrammarParser;
import org.antlr.v4.runtime.*;
import utils.parsing.CompilerErrorListener;

/**
 * Created by Jordy van der Zwan on 24-Jun-17.
 *
 * Controller class of the compiler
 */
public class Compiler {


    public String compile(String source) {


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
            System.out.println(errorListener.getErrorMessages());
            return null;
        }

        /*
         * Checking Stage
         *
         * In this stage the code will first be checked on whether the code is correct.
         * This is done in the following stages:
         * - Stage 1
         *   Checks and records all declarations of variables.
         * - Stage 2
         *   Type checking stage of the checking process.
         */

        return null;
    }


}
