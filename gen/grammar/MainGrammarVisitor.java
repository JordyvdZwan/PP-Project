// Generated from C:/Projects/Project - Programming Paradigms Compiler Project/PP-Compiler-Project/src/grammar\MainGrammar.g4 by ANTLR 4.7
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MainGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MainGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MainGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MainGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGrammarParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(MainGrammarParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGrammarParser#writtenNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrittenNumber(MainGrammarParser.WrittenNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGrammarParser#single}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle(MainGrammarParser.SingleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGrammarParser#only}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnly(MainGrammarParser.OnlyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGrammarParser#singles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingles(MainGrammarParser.SinglesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGrammarParser#main1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain1(MainGrammarParser.Main1Context ctx);
	/**
	 * Visit a parse tree produced by {@link MainGrammarParser#main2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain2(MainGrammarParser.Main2Context ctx);
	/**
	 * Visit a parse tree produced by {@link MainGrammarParser#hprefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHprefix(MainGrammarParser.HprefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGrammarParser#seconds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeconds(MainGrammarParser.SecondsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGrammarParser#first}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirst(MainGrammarParser.FirstContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGrammarParser#doubles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubles(MainGrammarParser.DoublesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGrammarParser#hundred}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHundred(MainGrammarParser.HundredContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGrammarParser#thousand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThousand(MainGrammarParser.ThousandContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGrammarParser#million}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMillion(MainGrammarParser.MillionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGrammarParser#billion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBillion(MainGrammarParser.BillionContext ctx);
}