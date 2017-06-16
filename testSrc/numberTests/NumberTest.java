package numberTests;

import checker.NumberTestVisitor;
import grammar.MainGrammarLexer;
import grammar.MainGrammarParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

/**
 * Created by Jordy van der Zwan on 14-Jun-17.
 */
public class NumberTest {

    private static NumberTestVisitor visitor = new NumberTestVisitor();
    MainGrammarParser parser;
    MainGrammarLexer lexer;

    @Test
    public void basicNumberTest() {
        check("FortyThree", 43);
    }

    private void check(String text, int integer) {
        Assert.assertEquals(visitor.visit(parse(CharStreams.fromString(text))).intValue(), integer);
    }

    private static ParseTree parse(CharStream chars) {
        Lexer lexer = new MainGrammarLexer(chars);
        lexer.removeErrorListeners();
        TokenStream tokens = new CommonTokenStream(lexer);
        MainGrammarParser parser = new MainGrammarParser(tokens);
        parser.removeErrorListeners();
        return parser.number();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            String next = in.nextLine();
            System.out.println("Number = " + visitor.visit(parse(CharStreams.fromString(next))).intValue());
        }
    }
}
