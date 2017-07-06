import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Jordy van der Zwan on 06-Jul-17.
 */
public class RunTest {



    @Test
    public void before() {
        try {

            System.out.println("Starting... ");

            Process p = Runtime.getRuntime().exec("ghci");

            PrintStream hugsin  = new PrintStream(p.getOutputStream());
            InputStream hugsout = p.getInputStream();

            Scanner sc = new Scanner(hugsout);
            Scanner rd = new Scanner(System.in);

            String rdnextline;

            hugsin.println(":cd C:\\Projects\\Project - Programming Paradigms Compiler Project\\PP-Compiler-Project\\resources\\out");
            hugsin.flush();
            hugsin.println(":l output.hs");
            hugsin.flush();
            hugsin.println("main");
            hugsin.flush();

            System.out.println("Check");

            System.out.println(sc.nextLine());
            System.out.println("1");
            System.out.println(sc.nextLine());
            System.out.println("2");
            System.out.println(sc.nextLine());
            System.out.println("3");

            while (sc.hasNextLine()) {

                // Echo GHCi's output upto the delimiter (prompt)
                System.out.println(sc.nextLine());
                System.out.println("hi");
                // Read user input & transfer to GHCi.
                System.out.println("Replacement Prompt> ");
                rdnextline = rd.nextLine();
                if (rdnextline == "quit") {
                    break;
                }
                hugsin.println(rdnextline);
                hugsin.flush();
            }
            System.out.println(" ... successful completion.");
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
