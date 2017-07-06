import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Jordy van der Zwan on 06-Jul-17.
 */
public class RunTest {



    @Test
    public void before() throws InterruptedException {
        try {
            System.out.println("Starting... ");
            Process p = Runtime.getRuntime().exec("ghci");
            PrintStream hugsin  = new PrintStream(p.getOutputStream());
            InputStream hugsout = p.getInputStream();
            Scanner sc = new Scanner(hugsout);
            Scanner rd = new Scanner(System.in);

            if (sc.hasNext()) System.out.println(sc.nextLine());

            System.out.println(":cd C:\\Projects\\Project - Programming Paradigms Compiler Project\\PP-Compiler-Project\\resources\\out");
            hugsin.println(":cd C:\\Projects\\Project - Programming Paradigms Compiler Project\\PP-Compiler-Project\\resources\\out");
            hugsin.flush();
            Thread.sleep(500);
            if (sc.hasNext()) System.out.print(sc.next());

            System.out.println(":l output.hs");
            hugsin.println(":l output.hs");
            hugsin.flush();
            Thread.sleep(500);
            String next;
            while (!((next = sc.next()).equals("ffff:"))) {System.out.println(next);}

            System.out.println("main");
            hugsin.println("main");
            hugsin.flush();
            Thread.sleep(500);
            while (sc.hasNext()) System.out.print(sc.next());

            System.out.println(" ... successful completion.");
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
