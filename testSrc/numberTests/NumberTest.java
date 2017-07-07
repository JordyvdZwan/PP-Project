package numberTests;

import grammar.MainGrammarLexer;
import grammar.MainGrammarParser;
import ilocGenerator.helperParsers.WrittenNumberParser;
import grammar.NumberGrammarLexer;
import grammar.NumberGrammarParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jordy van der Zwan on 14-Jun-17.
 *
 * This test is designed to test the proof of concept written number to Long converter.
 */
public class NumberTest {

    private static WrittenNumberParser visitor = new WrittenNumberParser();

    private static Map<String, Integer> billionSafeNumbers = new HashMap<>();
    private static Map<String, Integer> onlyNumbers = new HashMap<>();
    private static Map<String, Integer> hundreds = new HashMap<>();
    private static Map<String, Integer> onlyhundreds = new HashMap<>();
    private static Map<String, Integer> hundredOnly = new HashMap<>();
    private static Map<String, Integer> allNumbers = new HashMap<>();
    private static Map<String, Integer> millionSafeNumbers = new HashMap<>();

    @BeforeClass
    public static void setupDataStructure() {
        billionSafeNumbers.put("One", 1);
        billionSafeNumbers.put("Two", 2);
        onlyNumbers.put("Three", 3);
        onlyNumbers.put("Five", 5);
        onlyNumbers.put("Eight", 8);
        onlyNumbers.put("Ten", 10);
        onlyNumbers.put("Eleven", 11);
        onlyNumbers.put("Twelve", 12);
        onlyNumbers.put("Thirteen", 13);
        onlyNumbers.put("Fourteen", 14);
        onlyNumbers.put("Fifteen", 15);
        onlyNumbers.put("SevenTeen", 17);
        onlyNumbers.put("Eighteen", 18);
        onlyNumbers.put("TwentyFour", 24);
        onlyNumbers.put("TwentyFive", 25);
        onlyNumbers.put("TwentyEight", 28);
        onlyNumbers.put("Thirty", 30);
        onlyNumbers.put("FortyFive", 45);
        onlyNumbers.put("Fiftysix", 56);
        onlyNumbers.put("sixtyFive", 65);
        onlyNumbers.put("SeventyFour", 74);
        onlyNumbers.put("EightyTwo", 82);
        onlyNumbers.put("NinetyFour", 94);
        onlyNumbers.put("NinetyNine", 99);

        for (String key : onlyNumbers.keySet()) {
            onlyhundreds.put(key + "hundred", onlyNumbers.get(key) * 100);
            hundredOnly.put("hundred" + key, 100 + onlyNumbers.get(key));
            for (String key2 : onlyNumbers.keySet()) {
                hundreds.put(key + "hundred" + key2, (onlyNumbers.get(key) * 100) + onlyNumbers.get(key2));
            }
        }
        allNumbers.putAll(billionSafeNumbers);
        allNumbers.putAll(onlyNumbers);
        allNumbers.putAll(onlyhundreds);
        allNumbers.putAll(hundredOnly);
        allNumbers.putAll(hundreds);

        millionSafeNumbers.putAll(onlyNumbers);
        millionSafeNumbers.putAll(billionSafeNumbers);
        millionSafeNumbers.putAll(hundredOnly);
    }

    @Test
    public void zeroTest() {
        check("_zero", 0);
    }

    @Test
    public void singleTest() {
        for (String key : allNumbers.keySet()) {
            check("_" + key, allNumbers.get(key));
        }
    }

    @Test
    public void thousandTest() {
        for (String key : allNumbers.keySet()) {
            check("_" + key + "Thousand", allNumbers.get(key) * 1000);
            check("_" + "Thousand" + key, allNumbers.get(key) + 1000);
        }
    }

    @Test
    public void millionThousandTest() {
        for (String thousand : allNumbers.keySet()) {
            for (String million : millionSafeNumbers.keySet()) {
                check("_" + million + "Million" + thousand + "Thousand", (millionSafeNumbers.get(million) * 1000000) + (allNumbers.get(thousand) * 1000));
            }
        }
    }

    @Test
    public void millionTest() {
        for (String key : millionSafeNumbers.keySet()) {
            check("_" + key + "Million", millionSafeNumbers.get(key) * 1000000);
        }
    }

    @Test
    public void billionTest() {
        for (String key : billionSafeNumbers.keySet()) {
            check("_" + key + "Billion", billionSafeNumbers.get(key) * 1000000000);
        }
    }

    private void check(String text, int integer) {
        try {
            Assert.assertEquals("Trying to Parse: " + text + " (" + integer + ")", integer, visitor.visit(parse(CharStreams.fromString(text))).intValue());
        } catch (Exception e) {
            System.out.println(text + "  :  " + integer);
            e.printStackTrace();
            Assert.fail();
        }
    }

    int getNumber(String text) {
        return visitor.visit(parse(CharStreams.fromString(text))).intValue();
    }

    private static ParseTree parse(CharStream chars) {
        Lexer lexer = new MainGrammarLexer(chars);
        TokenStream tokens = new CommonTokenStream(lexer);
        MainGrammarParser parser = new MainGrammarParser(tokens);
        return parser.ngWrittenNumber();
    }

    //Code to quickly test written values
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        while (true) {
//            System.out.println("Please enter an written number:");
//            String next = in.nextLine();
//            System.out.println("Number = " + visitor.visit(parse(CharStreams.fromString(next))).intValue());
//        }
//    }
}
