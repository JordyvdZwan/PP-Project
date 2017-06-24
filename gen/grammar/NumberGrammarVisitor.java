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
	 * Visit a parse tree produced by {@link NumberGrammarParser#ngWrittenNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgWrittenNumber(NumberGrammarParser.NgWrittenNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link NumberGrammarParser#nghundred}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNghundred(NumberGrammarParser.NghundredContext ctx);
	/**
	 * Visit a parse tree produced by {@link NumberGrammarParser#ngthousand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgthousand(NumberGrammarParser.NgthousandContext ctx);
	/**
	 * Visit a parse tree produced by {@link NumberGrammarParser#ngmillion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgmillion(NumberGrammarParser.NgmillionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NumberGrammarParser#ngbillion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgbillion(NumberGrammarParser.NgbillionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NumberGrammarParser#ngsingle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgsingle(NumberGrammarParser.NgsingleContext ctx);
	/**
	 * Visit a parse tree produced by {@link NumberGrammarParser#ngonly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgonly(NumberGrammarParser.NgonlyContext ctx);
	/**
	 * Visit a parse tree produced by {@link NumberGrammarParser#ngsingles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgsingles(NumberGrammarParser.NgsinglesContext ctx);
	/**
	 * Visit a parse tree produced by {@link NumberGrammarParser#ngmain1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgmain1(NumberGrammarParser.Ngmain1Context ctx);
	/**
	 * Visit a parse tree produced by {@link NumberGrammarParser#ngmain2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgmain2(NumberGrammarParser.Ngmain2Context ctx);
	/**
	 * Visit a parse tree produced by {@link NumberGrammarParser#nghprefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNghprefix(NumberGrammarParser.NghprefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link NumberGrammarParser#ngseconds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgseconds(NumberGrammarParser.NgsecondsContext ctx);
	/**
	 * Visit a parse tree produced by {@link NumberGrammarParser#ngfirst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgfirst(NumberGrammarParser.NgfirstContext ctx);
	/**
	 * Visit a parse tree produced by {@link NumberGrammarParser#ngdoubles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgdoubles(NumberGrammarParser.NgdoublesContext ctx);
}