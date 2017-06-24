package numberTests;

import java.util.Scanner;

/**
 * Created by Jordy van der Zwan on 18-Jun-17.
 *
 * Manual test for the number parser.
 */
public class ManualNumberTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        NumberTest test = new NumberTest();
        //noinspection InfiniteLoopStatement
        while (true) {
            System.out.println("Please enter an written number:");
            String next = in.nextLine();
            System.out.println("Number = " + test.getNumber(next));
        }
    }

}
