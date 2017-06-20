// Generated from C:/Projects/Project - Programming Paradigms Compiler Project/PP-Compiler-Project/src/grammar\NumberGrammar.g4 by ANTLR 4.7
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NumberGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NumberGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NumberGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(NumberGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link NumberGrammarParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(NumberGrammarParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link NumberGrammarParser#writtenNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrittenNumber(NumberGrammarParser.WrittenNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link NumberGrammarParser#hundred}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHundred(NumberGrammarParser.HundredContext ctx);
	/**
	 * Visit a parse tree produced by {@link NumberGrammarParser#thousand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThousand(NumberGrammarParser.ThousandContext ctx);
	/**
	 * Visit a parse tree produced by {@link NumberGrammarParser#million}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMillion(NumberGrammarParser.MillionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NumberGrammarParser#billion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBillion(NumberGrammarParser.BillionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NumberGrammarParser#single}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle(NumberGrammarParser.SingleContext ctx);
	/**
	 * Visit a parse tree produced by {@link NumberGrammarParser#only}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnly(NumberGrammarParser.OnlyContext ctx);
	/**
	 * Visit a parse tree produced by {@link NumberGrammarParser#singles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingles(NumberGrammarParser.SinglesContext ctx);
	/**
	 * Visit a parse tree produced by {@link NumberGrammarParser#main1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain1(NumberGrammarParser.Main1Context ctx);
	/**
	 * Visit a parse tree produced by {@link NumberGrammarParser#main2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain2(NumberGrammarParser.Main2Context ctx);
	/**
	 * Visit a parse tree produced by {@link NumberGrammarParser#hprefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHprefix(NumberGrammarParser.HprefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link NumberGrammarParser#seconds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeconds(NumberGrammarParser.SecondsContext ctx);
	/**
	 * Visit a parse tree produced by {@link NumberGrammarParser#first}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirst(NumberGrammarParser.FirstContext ctx);
	/**
	 * Visit a parse tree produced by {@link NumberGrammarParser#doubles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubles(NumberGrammarParser.DoublesContext ctx);
}