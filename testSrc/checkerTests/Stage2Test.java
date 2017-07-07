package checkerTests;

import checker.Checker;
import checker.stages.CheckerStage2;
import exceptions.CheckerException;
import grammar.MainGrammarLexer;
import grammar.MainGrammarParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Assert;
import org.junit.Test;
import utils.parsing.CompilerErrorListener;

import java.io.IOException;

/**
 * Created by Jordy van der Zwan on 06-Jul-17.
 */
@SuppressWarnings("Duplicates")
public class Stage2Test {


    /**
     * Tests to see that you cannot use a value that has not been declared.
     * @throws IOException Throws exception when the file is not found. (Test related, not parser related)
     */
    @Test
    public void testUndeclaredVal() throws IOException {
        try {
            testFile("testResources\\scs\\checker2\\checker2-1.ppl", "[]");
        } catch (CheckerException e) {
            Assert.fail(e.getMessage());
        }
    }

    private Checker testFile(String file, String expected) throws IOException, CheckerException {
        CharStream charStream = CharStreams.fromFileName(file);

        CompilerErrorListener errorListener;
        TokenStream tokens;

        // Lexer Stage
        errorListener = new CompilerErrorListener();
        Lexer lexer = new MainGrammarLexer(charStream);
        lexer.removeErrorListeners();
        lexer.addErrorListener(errorListener);
        tokens = new CommonTokenStream(lexer);

        // Parser Stage
        MainGrammarParser parser = new MainGrammarParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(errorListener);
        ParseTree tree = parser.program();

        Checker checker = new Checker();
        CheckerStage2 stage2 = checker.getStage2();

        stage2.execute(tree);

        // Error handling of Parser Stage
        Assert.assertEquals(expected, stage2.getErrors().toString());
        return checker;
    }

}
