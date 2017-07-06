import controller.Compiler;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Jordy van der Zwan on 06-Jul-17.
 */
public class RunTest {

    public static final int timeout = 3000;

    @BeforeClass
    public static void initCompiler() {
        Compiler.PRETTYPRINT = false;
        Compiler.DEBUG = true;
        Compiler.EXTENDED = false;
    }

    @Test(timeout=timeout)
    public void genericTest() {
        String path = "C:\\Projects\\Project - Programming Paradigms Compiler Project\\PP-Compiler-Project\\resources\\out";
        String fileName = "output.hs";

        String result = runProgram(path, "output.hs");
        check(result, "[8,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]");
    }


    public String runProgram(String path, String fileName) {
        Process p = null;
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
            while (!((next = sc.next()).equals("Ok,"))) {}

            System.out.println("main");
            hugsin.println("main");
            hugsin.flush();
            String previousLine = "";
            while (true) {
                String nextLine = sc.next();
                if (previousLine.contains("[") && previousLine.contains("]") && !nextLine.contains("[") && !nextLine.contains(",") && !nextLine.contains("fromList")) {
                    return previousLine;
                }
                previousLine = nextLine;
            }
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            if (p != null) p.destroy();
        }
        return null;
    }


    private void check(String actual, String expected) {
        Assert.assertEquals(expected, actual);
    }

    private String getRoot() {
        File currentDirFile = new File(".");
        String helper = currentDirFile.getAbsolutePath();
        String currentDir = null;
        try {
            currentDir = helper.substring(0, helper.length() - currentDirFile.getCanonicalPath().length());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return currentDir;
    }
}
