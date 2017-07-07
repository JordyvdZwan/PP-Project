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
     * Tests to see that it is possible to assign a value to a variable that wasn't declared before..
     * @throws IOException Throws exception when the file is not found. (Test related, not parser related)
     */
    @Test
    public void testTypingCorrect1() throws IOException {
        try {
            testFile("testResources\\scs\\checker2\\checker2-1.ppl", "[]");
        } catch (CheckerException e) {
            Assert.fail(e.getMessage());
        }
    }

    /**
     * Tests to see if it all goes correct when there are no errors.
     * @throws IOException Throws exception when the file is not found. (Test related, not parser related)
     */
    @Test
    public void testTypingCorrect2() throws IOException {
        try {
            testFile("testResources\\scs\\checker2\\checker2-2.ppl", "[]");
        } catch (CheckerException e) {
            Assert.fail(e.getMessage());
        }
    }

    /**
     * Checks whether the correct error gets thrown when a boolean is assigned to an integer.
     * @throws IOException Throws exception when the file is not found. (Test related, not parser related)
     */
    @Test
    public void testTypingIncorrect1() throws IOException {
        try {
            testFile("testResources\\scs\\checker2\\checker2-3.ppl", "[" +
                    "Type check error: INTEGER and BOOLEANare not equal for variables: x]");
        } catch (CheckerException e) {
            Assert.fail(e.getMessage());
        }
    }

    /**
     * Tests whether the correct error gets thrown when a boolean and integer are used wrongly.
     * @throws IOException Throws exception when the file is not found. (Test related, not parser related)
     */
    @Test
    public void testTypingIncorrect2() throws IOException {
        try {
            testFile("testResources\\scs\\checker2\\checker2-4.ppl", "[" +
                    "Type check error: BOOLEAN and INTEGERare not equal for variables: x, " +
                    "Type check error: INTEGER and BOOLEANare not equal for variables: y]");
        } catch (CheckerException e) {
            Assert.fail(e.getMessage());
        }
    }

    /**
     * Checks whether the correct error gets thrown when a boolean is assigned to an integer.
     * @throws IOException Throws exception when the file is not found. (Test related, not parser related)
     */
    @Test
    public void testTypingIncorrect3() throws IOException {
        try {
            testFile("testResources\\scs\\checker2\\checker2-5.ppl", "[" +
                    "Type check error: BOOLEAN and INTEGERare not equal for variables: y]");
        } catch (CheckerException e) {
            Assert.fail(e.getMessage());
        }
    }

    /**
     * Compiles a file and checks whether the same errors occur as expected.
     * @param file The file with the ppl code.
     * @param expected The expected outcome.
     * @return The checker
     * @throws IOException
     * @throws CheckerException
     */
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

        // Checker Stage
        Checker checker = new Checker();
        CheckerStage2 stage2 = checker.getStage2();
        checker.getStage1().execute(tree);
        stage2.execute(tree);

        // Error handling of Parser Stage
        Assert.assertEquals(expected, stage2.getErrors().toString());
        return checker;
    }

}
