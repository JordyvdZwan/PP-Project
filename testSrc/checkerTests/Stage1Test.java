package checkerTests;

import checker.Checker;
import checker.stages.CheckerStage1;
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
 *
 * This class is used to test the implementation of the first stage of the Checker.
 */
@SuppressWarnings("Duplicates")
public class Stage1Test {

    /**
     * Test to see if double declarations in the same scope are handled correctly
     * @throws IOException Throws exception when the file is not found. (Test related, not parser related)
     */
    @Test
    public void testDoubleDeclarationInSameScope() throws IOException {
        try {
            testFile("testResources\\scs\\checker1\\checker1-1.ppl", "[Variable already declared: x]");
        } catch (CheckerException e) {
            Assert.fail(e.getMessage());
        }
    }

    /**
     * Tests whether it is allowed to declare a local variable with the same name in different scopes.
     * @throws IOException Throws exception when the file is not found. (Test related, not parser related)
     */
    @Test
    public void testDoubleDeclarationInDifferentLocalScopes() throws IOException {
        try {
            testFile("testResources\\scs\\checker1\\checker1-2.ppl", "[]");
        } catch (CheckerException e) {
            Assert.fail(e.getMessage());
        }
    }

    /**
     * Tests whether it is allowed to declare a local variable with the same name as an existing shared variable.
     * @throws IOException Throws exception when the file is not found. (Test related, not parser related)
     */
    @Test
    public void testDoubleDeclarationInDifferentScopes() throws IOException {
        try {
            testFile("testResources\\scs\\checker1\\checker1-3.ppl", "[]");
        } catch (CheckerException e) {
            Assert.fail(e.getMessage());
        }
    }

    /**
     * Tests whether it is allowed to declare a local variable with the same name as an existing shared variable in the global scope.
     * @throws IOException Throws exception when the file is not found. (Test related, not parser related)
     */
    @Test
    public void testDoubleDeclarationInGlobalScope() throws IOException {
        try {
            testFile("testResources\\scs\\checker1\\checker1-4.ppl", "[Shared variable already declared in Global Scope: x]");
        } catch (CheckerException e) {
            Assert.fail(e.getMessage());
        }
    }

    /**
     * Main test to check whether the declaration table is setup correctly.
     * @throws IOException Throws exception when the file is not found. (Test related, not parser related)
     */
    @Test
    public void testDeclerationTable() throws IOException {
        try {
            Checker checker = testFile("testResources\\scs\\checker1\\checker1-5.ppl", "[]");
            Assert.assertEquals("DeclarationTable{\n" +
                    "globalScope=Scope{\n" +
                    "children=[]\n" +
                    ", variables=[Variable{type=INTEGER, id='l', offset=3, global=true}, Variable{type=INTEGER, id='f', offset=7, global=true}]\n" +
                    ", nextScope=0\n" +
                    ", forkIds=[]\n" +
                    "}\n" +
                    ", scopes=[Scope{\n" +
                    "children=[Scope{\n" +
                    "children=[]\n" +
                    ", variables=[Variable{type=INTEGER, id='p', offset=8, global=false}]\n" +
                    ", nextScope=0\n" +
                    ", forkIds=[]\n" +
                    "}]\n" +
                    ", variables=[Variable{type=INTEGER, id='x', offset=1, global=false}, Variable{type=BOOLEAN, id='y', offset=2, global=false}]\n" +
                    ", nextScope=0\n" +
                    ", forkIds=[Id{name='x', number=1}]\n" +
                    "}, Scope{\n" +
                    "children=[Scope{\n" +
                    "children=[Scope{\n" +
                    "children=[]\n" +
                    ", variables=[Variable{type=BOOLEAN, id='p', offset=6, global=false}]\n" +
                    ", nextScope=0\n" +
                    ", forkIds=[]\n" +
                    "}]\n" +
                    ", variables=[Variable{type=INTEGER, id='x', offset=4, global=false}, Variable{type=INTEGER, id='y', offset=5, global=false}]\n" +
                    ", nextScope=0\n" +
                    ", forkIds=[]\n" +
                    "}]\n" +
                    ", variables=[]\n" +
                    ", nextScope=0\n" +
                    ", forkIds=[]\n" +
                    "}, Scope{\n" +
                    "children=[Scope{\n" +
                    "children=[]\n" +
                    ", variables=[Variable{type=INTEGER, id='p', offset=8, global=false}]\n" +
                    ", nextScope=0\n" +
                    ", forkIds=[]\n" +
                    "}]\n" +
                    ", variables=[Variable{type=INTEGER, id='x', offset=1, global=false}, Variable{type=BOOLEAN, id='y', offset=2, global=false}]\n" +
                    ", nextScope=0\n" +
                    ", forkIds=[Id{name='x', number=1}]\n" +
                    "}]\n" +
                    "}", checker.getDeclarationTable().toString());
        } catch (CheckerException e) {
            Assert.fail(e.getMessage());
        }
    }

    /**
     * Tests to see that you can declare a local value with the same name as an existing shared value.
     * @throws IOException Throws exception when the file is not found. (Test related, not parser related)
     */
    @Test
    public void testDoubleDeclarationSharedLocal() throws IOException {
        try {
            testFile("testResources\\scs\\checker1\\checker1-6.ppl", "[]");
        } catch (CheckerException e) {
            Assert.fail(e.getMessage());
        }
    }

    /**
     * Tests to see that you cannot use a value that has not been declared.
     * @throws IOException Throws exception when the file is not found. (Test related, not parser related)
     */
    @Test
    public void testUndeclaredVal() throws IOException {
        try {
            testFile("testResources\\scs\\checker1\\checker1-7.ppl", "[" +
                    "Variable is not declared: x, " +
                    "Invalid argument! (null), " +
                    "Variable is not declared: x, " +
                    "Invalid argument! (null)]");
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
        CheckerStage1 stage1 = checker.getStage1();

        stage1.execute(tree);

        // Error handling of Parser Stage
        Assert.assertEquals(expected, stage1.getErrors().toString());
        return checker;
    }
}
