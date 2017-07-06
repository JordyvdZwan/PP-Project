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

    @BeforeClass
    public static void initCompiler() {
        Compiler.PRETTYPRINT = false;
        Compiler.DEBUG = true;
        Compiler.EXTENDED = false;
    }

    private Process p = null;
    private static String projectRootPath = new File("").getAbsolutePath();




    // Basic Tests
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

        String result = runProgram(outputPath, outputFileName);
        check(result, "[2,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]");
    }
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
        check(result, "[4,5,0,500,500,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]");
    }

    @After
    public void after() {
        if (p != null) {
            p.destroyForcibly();
            try {
                Runtime.getRuntime().exec("taskkill /F /IM ghc.exe");
            } catch (IOException e) {
                Log.addLogItem("Unable to close ghc, You should close this manually!", LogType.Warning);
            }
        }
    }


    public String runProgram(String path, String fileName) {
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
    private String getRoot() {
        return new File(".").getAbsolutePath();
    }
}
