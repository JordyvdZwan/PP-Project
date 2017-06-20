package numberTests;

import org.antlr.v4.runtime.CharStreams;

import java.util.Scanner;

/**
 * Created by Jordy van der Zwan on 18-Jun-17.
 */
public class ManualNumberTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        NumberTest test = new NumberTest();
        while (true) {
            System.out.println("Please enter an written number:");
            String next = in.nextLine();
            System.out.println("Number = " + test.getNumber(next));
        }
    }

}
