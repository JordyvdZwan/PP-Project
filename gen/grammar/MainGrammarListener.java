// Generated from C:/Projects/Project - Programming Paradigms Compiler Project/PP-Compiler-Project/src/grammar\MainGrammar.g4 by ANTLR 4.7
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MainGrammarParser}.
 */
public interface MainGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MainGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MainGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MainGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(MainGrammarParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(MainGrammarParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGrammarParser#writtenNumber}.
	 * @param ctx the parse tree
	 */
	void enterWrittenNumber(MainGrammarParser.WrittenNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGrammarParser#writtenNumber}.
	 * @param ctx the parse tree
	 */
	void exitWrittenNumber(MainGrammarParser.WrittenNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGrammarParser#single}.
	 * @param ctx the parse tree
	 */
	void enterSingle(MainGrammarParser.SingleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGrammarParser#single}.
	 * @param ctx the parse tree
	 */
	void exitSingle(MainGrammarParser.SingleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGrammarParser#only}.
	 * @param ctx the parse tree
	 */
	void enterOnly(MainGrammarParser.OnlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGrammarParser#only}.
	 * @param ctx the parse tree
	 */
	void exitOnly(MainGrammarParser.OnlyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGrammarParser#singles}.
	 * @param ctx the parse tree
	 */
	void enterSingles(MainGrammarParser.SinglesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGrammarParser#singles}.
	 * @param ctx the parse tree
	 */
	void exitSingles(MainGrammarParser.SinglesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGrammarParser#main1}.
	 * @param ctx the parse tree
	 */
	void enterMain1(MainGrammarParser.Main1Context ctx);
	/**
	 * Exit a parse tree produced by {@link MainGrammarParser#main1}.
	 * @param ctx the parse tree
	 */
	void exitMain1(MainGrammarParser.Main1Context ctx);
	/**
	 * Enter a parse tree produced by {@link MainGrammarParser#main2}.
	 * @param ctx the parse tree
	 */
	void enterMain2(MainGrammarParser.Main2Context ctx);
	/**
	 * Exit a parse tree produced by {@link MainGrammarParser#main2}.
	 * @param ctx the parse tree
	 */
	void exitMain2(MainGrammarParser.Main2Context ctx);
	/**
	 * Enter a parse tree produced by {@link MainGrammarParser#hprefix}.
	 * @param ctx the parse tree
	 */
	void enterHprefix(MainGrammarParser.HprefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGrammarParser#hprefix}.
	 * @param ctx the parse tree
	 */
	void exitHprefix(MainGrammarParser.HprefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGrammarParser#seconds}.
	 * @param ctx the parse tree
	 */
	void enterSeconds(MainGrammarParser.SecondsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGrammarParser#seconds}.
	 * @param ctx the parse tree
	 */
	void exitSeconds(MainGrammarParser.SecondsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGrammarParser#first}.
	 * @param ctx the parse tree
	 */
	void enterFirst(MainGrammarParser.FirstContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGrammarParser#first}.
	 * @param ctx the parse tree
	 */
	void exitFirst(MainGrammarParser.FirstContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGrammarParser#doubles}.
	 * @param ctx the parse tree
	 */
	void enterDoubles(MainGrammarParser.DoublesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGrammarParser#doubles}.
	 * @param ctx the parse tree
	 */
	void exitDoubles(MainGrammarParser.DoublesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGrammarParser#hundred}.
	 * @param ctx the parse tree
	 */
	void enterHundred(MainGrammarParser.HundredContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGrammarParser#hundred}.
	 * @param ctx the parse tree
	 */
	void exitHundred(MainGrammarParser.HundredContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGrammarParser#thousand}.
	 * @param ctx the parse tree
	 */
	void enterThousand(MainGrammarParser.ThousandContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGrammarParser#thousand}.
	 * @param ctx the parse tree
	 */
	void exitThousand(MainGrammarParser.ThousandContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGrammarParser#million}.
	 * @param ctx the parse tree
	 */
	void enterMillion(MainGrammarParser.MillionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGrammarParser#million}.
	 * @param ctx the parse tree
	 */
	void exitMillion(MainGrammarParser.MillionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGrammarParser#billion}.
	 * @param ctx the parse tree
	 */
	void enterBillion(MainGrammarParser.BillionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGrammarParser#billion}.
	 * @param ctx the parse tree
	 */
	void exitBillion(MainGrammarParser.BillionContext ctx);
}