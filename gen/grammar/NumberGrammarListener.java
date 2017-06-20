// Generated from C:/Projects/Project - Programming Paradigms Compiler Project/PP-Compiler-Project/src/grammar\NumberGrammar.g4 by ANTLR 4.7
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NumberGrammarParser}.
 */
public interface NumberGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NumberGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(NumberGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumberGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(NumberGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumberGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(NumberGrammarParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumberGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(NumberGrammarParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumberGrammarParser#writtenNumber}.
	 * @param ctx the parse tree
	 */
	void enterWrittenNumber(NumberGrammarParser.WrittenNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumberGrammarParser#writtenNumber}.
	 * @param ctx the parse tree
	 */
	void exitWrittenNumber(NumberGrammarParser.WrittenNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumberGrammarParser#hundred}.
	 * @param ctx the parse tree
	 */
	void enterHundred(NumberGrammarParser.HundredContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumberGrammarParser#hundred}.
	 * @param ctx the parse tree
	 */
	void exitHundred(NumberGrammarParser.HundredContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumberGrammarParser#thousand}.
	 * @param ctx the parse tree
	 */
	void enterThousand(NumberGrammarParser.ThousandContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumberGrammarParser#thousand}.
	 * @param ctx the parse tree
	 */
	void exitThousand(NumberGrammarParser.ThousandContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumberGrammarParser#million}.
	 * @param ctx the parse tree
	 */
	void enterMillion(NumberGrammarParser.MillionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumberGrammarParser#million}.
	 * @param ctx the parse tree
	 */
	void exitMillion(NumberGrammarParser.MillionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumberGrammarParser#billion}.
	 * @param ctx the parse tree
	 */
	void enterBillion(NumberGrammarParser.BillionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumberGrammarParser#billion}.
	 * @param ctx the parse tree
	 */
	void exitBillion(NumberGrammarParser.BillionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumberGrammarParser#single}.
	 * @param ctx the parse tree
	 */
	void enterSingle(NumberGrammarParser.SingleContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumberGrammarParser#single}.
	 * @param ctx the parse tree
	 */
	void exitSingle(NumberGrammarParser.SingleContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumberGrammarParser#only}.
	 * @param ctx the parse tree
	 */
	void enterOnly(NumberGrammarParser.OnlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumberGrammarParser#only}.
	 * @param ctx the parse tree
	 */
	void exitOnly(NumberGrammarParser.OnlyContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumberGrammarParser#singles}.
	 * @param ctx the parse tree
	 */
	void enterSingles(NumberGrammarParser.SinglesContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumberGrammarParser#singles}.
	 * @param ctx the parse tree
	 */
	void exitSingles(NumberGrammarParser.SinglesContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumberGrammarParser#main1}.
	 * @param ctx the parse tree
	 */
	void enterMain1(NumberGrammarParser.Main1Context ctx);
	/**
	 * Exit a parse tree produced by {@link NumberGrammarParser#main1}.
	 * @param ctx the parse tree
	 */
	void exitMain1(NumberGrammarParser.Main1Context ctx);
	/**
	 * Enter a parse tree produced by {@link NumberGrammarParser#main2}.
	 * @param ctx the parse tree
	 */
	void enterMain2(NumberGrammarParser.Main2Context ctx);
	/**
	 * Exit a parse tree produced by {@link NumberGrammarParser#main2}.
	 * @param ctx the parse tree
	 */
	void exitMain2(NumberGrammarParser.Main2Context ctx);
	/**
	 * Enter a parse tree produced by {@link NumberGrammarParser#hprefix}.
	 * @param ctx the parse tree
	 */
	void enterHprefix(NumberGrammarParser.HprefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumberGrammarParser#hprefix}.
	 * @param ctx the parse tree
	 */
	void exitHprefix(NumberGrammarParser.HprefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumberGrammarParser#seconds}.
	 * @param ctx the parse tree
	 */
	void enterSeconds(NumberGrammarParser.SecondsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumberGrammarParser#seconds}.
	 * @param ctx the parse tree
	 */
	void exitSeconds(NumberGrammarParser.SecondsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumberGrammarParser#first}.
	 * @param ctx the parse tree
	 */
	void enterFirst(NumberGrammarParser.FirstContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumberGrammarParser#first}.
	 * @param ctx the parse tree
	 */
	void exitFirst(NumberGrammarParser.FirstContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumberGrammarParser#doubles}.
	 * @param ctx the parse tree
	 */
	void enterDoubles(NumberGrammarParser.DoublesContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumberGrammarParser#doubles}.
	 * @param ctx the parse tree
	 */
	void exitDoubles(NumberGrammarParser.DoublesContext ctx);
}