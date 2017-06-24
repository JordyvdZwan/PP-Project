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
	 * Visit a parse tree produced by {@link MainGrammarParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(MainGrammarParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MainGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declStat}
	 * labeled alternative in {@link MainGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclStat(MainGrammarParser.DeclStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assStat}
	 * labeled alternative in {@link MainGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssStat(MainGrammarParser.AssStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStat}
	 * labeled alternative in {@link MainGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(MainGrammarParser.IfStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStat}
	 * labeled alternative in {@link MainGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStat(MainGrammarParser.WhileStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockStat}
	 * labeled alternative in {@link MainGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStat(MainGrammarParser.BlockStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MainGrammarParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGrammarParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(MainGrammarParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGrammarParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(MainGrammarParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpr(MainGrammarParser.ParExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinExpr(MainGrammarParser.BinExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpr(MainGrammarParser.ArrayExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trueExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueExpr(MainGrammarParser.TrueExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code prfExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrfExpr(MainGrammarParser.PrfExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code falseExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseExpr(MainGrammarParser.FalseExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumExpr(MainGrammarParser.NumExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(MainGrammarParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGrammarParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(MainGrammarParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGrammarParser#target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget(MainGrammarParser.TargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGrammarParser#prfOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrfOp(MainGrammarParser.PrfOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGrammarParser#binOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOp(MainGrammarParser.BinOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGrammarParser#multOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultOp(MainGrammarParser.MultOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGrammarParser#plusOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusOp(MainGrammarParser.PlusOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGrammarParser#boolOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolOp(MainGrammarParser.BoolOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGrammarParser#compOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompOp(MainGrammarParser.CompOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGrammarParser#ngWrittenNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgWrittenNumber(MainGrammarParser.NgWrittenNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGrammarParser#nghundred}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNghundred(MainGrammarParser.NghundredContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGrammarParser#ngthousand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgthousand(MainGrammarParser.NgthousandContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGrammarParser#ngmillion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgmillion(MainGrammarParser.NgmillionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGrammarParser#ngbillion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgbillion(MainGrammarParser.NgbillionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGrammarParser#ngsingle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgsingle(MainGrammarParser.NgsingleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGrammarParser#ngonly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgonly(MainGrammarParser.NgonlyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGrammarParser#ngsingles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgsingles(MainGrammarParser.NgsinglesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGrammarParser#ngmain1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgmain1(MainGrammarParser.Ngmain1Context ctx);
	/**
	 * Visit a parse tree produced by {@link MainGrammarParser#ngmain2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgmain2(MainGrammarParser.Ngmain2Context ctx);
	/**
	 * Visit a parse tree produced by {@link MainGrammarParser#nghprefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNghprefix(MainGrammarParser.NghprefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGrammarParser#ngseconds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgseconds(MainGrammarParser.NgsecondsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGrammarParser#ngfirst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgfirst(MainGrammarParser.NgfirstContext ctx);
	/**
	 * Visit a parse tree produced by {@link MainGrammarParser#ngdoubles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgdoubles(MainGrammarParser.NgdoublesContext ctx);
}