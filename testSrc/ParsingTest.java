import exceptions.CompilerErrorException;
import grammar.MainGrammarLexer;
import grammar.MainGrammarParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Assert;
import org.junit.Test;
import utils.log.Log;
import utils.log.LogType;
import utils.parsing.CompilerErrorListener;

import java.io.IOException;

/**
 * Created by Jordy van der Zwan on 07-Jul-17.
 */
public class ParsingTest {


    /**
     * Test to see if '=' works as equals operator and whether if works without statement
     * @throws IOException Throws exception when the file is not found. (Test related, not parser related)
     */
    @Test
    public void testParsing1() throws IOException {
        testFile("testResources\\scs\\parsing\\parsing1.ppl", "[Error: [@5,6:6='=',<7>,1:6] at line: 1 at pos: 6 Msg: mismatched input '=' expecting ')']");
    }

    /**
     * Test to see if an illegal overlap of if statements is found.
     * @throws IOException Throws exception when the file is not found. (Test related, not parser related)
     */
    @Test
    public void testParsing2() throws IOException {
        testFile("testResources\\scs\\parsing\\parsing2.ppl", "" +
                "[Error: [@14,32:32='}',<47>,3:4] at line: 3 at pos: 4 Msg: no viable alternative at input '\\r\\n    }', " +
                "Error: [@14,32:32='}',<47>,3:4] at line: 3 at pos: 4 Msg: extraneous input '}' expecting {<EOF>, Var, Integer, Boolean, Fork, Join, Shared, Lock, Unlock, IF, WHILE, '{', WS, Letter}, " +
                "Error: [@16,34:37='else',<43>,3:6] at line: 3 at pos: 6 Msg: no viable alternative at input ' else']");
    }

    /**
     * Testing the parsing of a basic program. Tests following aspects:
     *  - if statement without else
     *  - while loop
     *  - integer declaration with written number
     *  - boolean declaration and initialisation
     *  - basic mathematical expressions.
     * @throws IOException Throws exception when the file is not found. (Test related, not parser related)
     */
    @Test
    public void testParsing3() throws IOException {
        String tree = testFile("testResources\\scs\\parsing\\parsing3.ppl", "[]");
        Assert.assertEquals("" +
                "(program (statement if   (expression ( (expression true) ))   (statement { \\r\\n" +
                "     (statement (type (primitiveType integer))   (id x)   =   (expression (num (ngWrittenNumber _ (ngsingle (nghprefix (ngonly (ngsingles Five))) (nghundred hundred) (ngonly (ngmain2 (ngdoubles Sixty) (ngseconds Four))))))) ; \\r\\n" +
                "    ) (statement (target (id x))   =   (expression (expression (id x))   (plusOp -)   (expression (num 1))) ; \\r\\n" +
                "    ) (statement (type (primitiveType boolean))   (id f)   =   (expression true) ; \\r\\n" +
                "    ) (statement while   (expression ( (expression (id f)) ))   (statement { \\r\\n" +
                "         (statement (target (id x))   =   (expression (expression (id x))   (plusOp -)   (expression (num 1))) ; \\r\\n" +
                "        ) (statement if   (expression ( (expression (expression (id x))   (compOp <)   (expression (num 20))) ))   (statement { \\r\\n" +
                "             (statement (target (id f))   =   (expression false) ; \\r\\n" +
                "        ) } \\r\\n" +
                "    )) } \\r\\n" +
                "    )) (statement if   (expression ( (expression (expression (id x))   (compOp ==)   (expression (num 19))) ))   (statement { \\r\\n" +
                "         (statement (target (id x))   =   (expression (num 20)) ; \\r\\n" +
                "    ) } \\r\\n" +
                ")) })) <EOF>)", tree);
    }

    /**
     * Tests basic structures of declaration statements.
     * @throws IOException Throws exception when the file is not found. (Test related, not parser related)
     */
    @Test
    public void testParsing4() throws IOException {
        String tree = testFile("testResources\\scs\\parsing\\parsing4.ppl", "[]");
        Assert.assertEquals("(program (statement (type (primitiveType Integer))   (id x)   =   (expression (num 2)) ;) <EOF>)", tree);
    }

    /**
     * Tests basic structure of an if statement.
     * @throws IOException Throws exception when the file is not found. (Test related, not parser related)
     */
    @Test
    public void testParsing5() throws IOException {
        String tree = testFile("testResources\\scs\\parsing\\parsing5.ppl", "[]");
        Assert.assertEquals("" +
                "(program (statement if   (expression ( (expression true) ))   (statement { \\r\\n" +
                "     (statement (type (primitiveType integer))   (id x)   =   (expression (num 2)) ; \\r\\n" +
                ") }  ) else   (statement { \\r\\n" +
                "     (statement (type (primitiveType integer))   (id x)   =   (expression (num 3)) ; \\r\\n" +
                ") })) <EOF>)", tree);
    }

    private String testFile(String file, String expected) throws IOException {
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

        // Error handling of Parser Stage
        Assert.assertEquals(expected, errorListener.getErrorMessages().toString());
        return tree.toStringTree(parser);
    }


}
