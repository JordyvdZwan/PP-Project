import controller.Compiler;
import exceptions.CheckerException;
import exceptions.CompilerErrorException;
import exceptions.SyntaxErrorException;
import org.junit.*;
import utils.log.Log;
import utils.log.LogType;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Jordy van der Zwan on 06-Jul-17.
 */
public class RunTest {

    /**
     * Initialises the booleans.
     */
    @BeforeClass
    public static void initCompiler() {
        Compiler.PRETTYPRINT = false;
        Compiler.DEBUG = true;
        Compiler.EXTENDED = false;
    }

    private Process p = null;
    private static String projectRootPath = new File("").getAbsolutePath();

    /**
     * Executes the code from basic1.ppl.
     * Tests while loops and if statements.
     */
    @Test(timeout=10000)
    public void basic1Test() {
        String inputPath = projectRootPath + "\\testResources\\scs";
        String inputFileName = "basic1.ppl";
        String outputPath = "resources\\out";
        String outputFileName = "output.hs";

        try {
            Compiler.compileFile(inputPath, inputFileName, outputPath, outputFileName);
        } catch (IOException | SyntaxErrorException | CompilerErrorException | CheckerException e) {
            e.printStackTrace();
            Assert.fail("Exception Thrown: " + e.getMessage());
        }

        String result = runProgram(outputPath, outputFileName);
        check(result, "[2,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]");
    }

    /**
     * Checks whether the code from basic2.ppl returns the correct values.
     * Checks while loops and if statements and booleans.
     */
    @Test(timeout=10000)
    public void basic2Test() {
        String inputPath = projectRootPath + "\\testResources\\scs";
        String inputFileName = "basic2.ppl";
        String outputPath = "resources\\out";
        String outputFileName = "output.hs";

        try {
            Compiler.compileFile(inputPath, inputFileName, outputPath, outputFileName);
        } catch (IOException | SyntaxErrorException | CompilerErrorException | CheckerException e) {
            e.printStackTrace();
            Assert.fail("Exception Thrown: " + e.getMessage());
        }

        String result = runProgram(outputPath, outputFileName);
        check(result, "[4,6,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]");
    }

    /**
     * Looks to the result of basic3.ppl, if this is as expected returns true.
     * Checks variable assignments.
     */
    @Test(timeout=10000)
    public void basic3Test() {
        String inputPath = projectRootPath + "\\testResources\\scs";
        String inputFileName = "basic3.ppl";
        String outputPath = "resources\\out";
        String outputFileName = "output.hs";

        try {
            Compiler.compileFile(inputPath, inputFileName, outputPath, outputFileName);
        } catch (IOException | SyntaxErrorException | CompilerErrorException | CheckerException e) {
            e.printStackTrace();
            Assert.fail("Exception Thrown: " + e.getMessage());
        }

        String result = runProgram(outputPath, outputFileName);
        check(result, "[2,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]");
    }

    /**
     * Checks whether basic4.ppl gets compiled and executed correctly.
     * Checks if statements inside a while loop.
     */
    @Test(timeout=10000)
    public void basic4Test() {
        String inputPath = projectRootPath + "\\testResources\\scs";
        String inputFileName = "basic4.ppl";
        String outputPath = "resources\\out";
        String outputFileName = "output.hs";

        try {
            Compiler.compileFile(inputPath, inputFileName, outputPath, outputFileName);
        } catch (IOException | SyntaxErrorException | CompilerErrorException | CheckerException e) {
            e.printStackTrace();
            Assert.fail("Exception Thrown: " + e.getMessage());
        }

        String result = runProgram(outputPath, outputFileName);
        check(result, "[3,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]");
    }

    /**
     * Tests whether complex expressions gets executed correctly.
     */
    @Test(timeout=10000)
    public void expressions1Test() {
        String inputPath = projectRootPath + "\\testResources\\scs\\expressions";
        String inputFileName = "expressions1.ppl";
        String outputPath = "resources\\out";
        String outputFileName = "output.hs";

        try {
            Compiler.compileFile(inputPath, inputFileName, outputPath, outputFileName);
        } catch (IOException | SyntaxErrorException | CompilerErrorException | CheckerException e) {
            e.printStackTrace();
            Assert.fail("Exception Thrown: " + e.getMessage());
        }

        String result = runProgram(outputPath, outputFileName);
        check(result, "[2,37,2,3,1,3,3,6,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]");
    }

    /**
     * Tests whether complex expressions gets executed correctly.
     */
    @Test(timeout=10000)
    public void expressions2Test() {
        String inputPath = projectRootPath + "\\testResources\\scs\\expressions";
        String inputFileName = "expressions2.ppl";
        String outputPath = "resources\\out";
        String outputFileName = "output.hs";

        try {
            Compiler.compileFile(inputPath, inputFileName, outputPath, outputFileName);
        } catch (IOException | SyntaxErrorException | CompilerErrorException | CheckerException e) {
            e.printStackTrace();
            Assert.fail("Exception Thrown: " + e.getMessage());
        }

        String result = runProgram(outputPath, outputFileName);
        check(result, "[2,1938,2,4,8,5,13,2,5,10,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]");
    }

    /**
     * Tests whether complex expressions gets executed correctly inside an if statement.
     */
    @Test(timeout=10000)
    public void expressions3Test() {
        String inputPath = projectRootPath + "\\testResources\\scs\\expressions";
        String inputFileName = "expressions3.ppl";
        String outputPath = "resources\\out";
        String outputFileName = "output.hs";

        try {
            Compiler.compileFile(inputPath, inputFileName, outputPath, outputFileName);
        } catch (IOException | SyntaxErrorException | CompilerErrorException | CheckerException e) {
            e.printStackTrace();
            Assert.fail("Exception Thrown: " + e.getMessage());
        }

        String result = runProgram(outputPath, outputFileName);
        check(result, "[2,4,8,4,7,28,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]");
    }

    /**
     * Tests whether assigning values to shared variables in different threads goes correctly.
     */
    @Test(timeout=10000)
    public void concurrent1Test() {
        String inputPath = projectRootPath + "\\testResources\\scs\\concurrent";
        String inputFileName = "concurrent1.ppl";
        String outputPath = "resources\\out";
        String outputFileName = "output.hs";

        try {
            Compiler.compileFile(inputPath, inputFileName, outputPath, outputFileName);
        } catch (IOException | SyntaxErrorException | CompilerErrorException | CheckerException e) {
            e.printStackTrace();
            Assert.fail("Exception Thrown: " + e.getMessage());
        }

        String result = runProgram(projectRootPath + "\\" + outputPath, outputFileName);
        check(result, "[3,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]");
    }

    /**
     * Checks if the locks are implemented correctly.
     */
    @Test(timeout=100000)
    public void concurrent2Test() {
        String inputPath = projectRootPath + "\\testResources\\scs\\concurrent";
    String inputFileName = "concurrent2.ppl";
    String outputPath = "resources\\out";
    String outputFileName = "output.hs";

    try {
        Compiler.compileFile(inputPath, inputFileName, outputPath, outputFileName);
    } catch (IOException | SyntaxErrorException | CompilerErrorException | CheckerException e) {
        e.printStackTrace();
        Assert.fail("Exception Thrown: " + e.getMessage());
    }

        String result = runProgram(outputPath, outputFileName);
        check(result, "[6,0,0,0,0,50,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]");
    }

    /**
     * Tests the Peterson's algorithm.
     */
    @Test(timeout =100000)
    public void petersonTest() {
        String inputPath = projectRootPath + "\\testResources\\scs\\concurrent";
        String inputFileName = "Peterson's.ppl";
        String outputPath = "resources\\out";
        String outputFileName = "output.hs";

        try {
            Compiler.compileFile(inputPath, inputFileName, outputPath, outputFileName);
        } catch (IOException | SyntaxErrorException | CompilerErrorException | CheckerException e) {
            e.printStackTrace();
            Assert.fail("Exception Thrown: " + e.getMessage());
        }

        String result = runProgram(outputPath, outputFileName);
        check(result, "[7,0,0,0,0,8,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]");
    }

    /**
     * Tests a banking system.
     * Because of the locks there will never be a data race in this program.
     */
    @Test(timeout =100000)
    public void bankTest() {
        String inputPath = projectRootPath + "\\testResources\\scs\\concurrent";
        String inputFileName = "BankSystem.ppl";
        String outputPath = "resources\\out";
        String outputFileName = "output.hs";

        try {
            Compiler.compileFile(inputPath, inputFileName, outputPath, outputFileName);
        } catch (IOException | SyntaxErrorException | CompilerErrorException | CheckerException e) {
            e.printStackTrace();
            Assert.fail("Exception Thrown: " + e.getMessage());
        }

        String result = runProgram(outputPath, outputFileName);
        check(result, "[5,0,0,0,170,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]");
    }


    /**
     * Closes ghic.
     * @throws InterruptedException
     */
    @After
    public void after() throws InterruptedException {
        Thread.sleep(200);
        if (p != null) {
            p.destroyForcibly();
            try {
                Runtime.getRuntime().exec("taskkill /F /IM ghc.exe");
            } catch (IOException e) {
                Log.addLogItem("Unable to close ghc, You should close this manually!", LogType.Warning);
            }
        }
        Thread.sleep(200);
    }


    /**
     * Runs the program.
     * @param path The path to the correct map.
     * @param fileName The name of the file.
     * @return The returned text from ghci.
     */
    private String runProgram(String path, String fileName) {
        try {
            System.out.println("Starting... ");
            p = Runtime.getRuntime().exec("ghci");
            PrintStream hugsin  = new PrintStream(p.getOutputStream());
            InputStream hugsout = p.getInputStream();
            Scanner sc = new Scanner(hugsout);

            if (sc.hasNext()) sc.nextLine();

            System.out.println(":cd " + path);
            hugsin.println(":cd " + path);
            hugsin.flush();
            if (sc.hasNext()) sc.next();

            System.out.println(":l " + fileName);
            hugsin.println(":l " + fileName);
            hugsin.flush();
            String next;
            while (sc.hasNext()) {
                next = sc.next();
                if (next.contains("Ok,"))
                    break;
                else if (next.contains("Failed"))
                    Assert.fail("GHCI Code generation failed.");
            }

            System.out.println("main");
            hugsin.println("main");
            hugsin.flush();
            String previousLine = "";
            while (sc.hasNext()) {
                String nextLine = sc.next();
                if (previousLine.contains("[") && previousLine.contains("]") && !nextLine.contains("[") && !nextLine.contains(",") && !nextLine.contains("fromList")) {
                    return previousLine;
                }
                previousLine = nextLine;
            }
            Assert.fail("Invalid program execution.");
        } catch(IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    private void check(String actual, String expected) {
        Assert.assertEquals(expected, actual);
    }
}
