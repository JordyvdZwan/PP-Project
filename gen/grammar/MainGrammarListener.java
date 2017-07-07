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
	 * Enter a parse tree produced by the {@code declStat}
	 * labeled alternative in {@link MainGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclStat(MainGrammarParser.DeclStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declStat}
	 * labeled alternative in {@link MainGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclStat(MainGrammarParser.DeclStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sharedDeclStat}
	 * labeled alternative in {@link MainGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSharedDeclStat(MainGrammarParser.SharedDeclStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sharedDeclStat}
	 * labeled alternative in {@link MainGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSharedDeclStat(MainGrammarParser.SharedDeclStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assStat}
	 * labeled alternative in {@link MainGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssStat(MainGrammarParser.AssStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assStat}
	 * labeled alternative in {@link MainGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssStat(MainGrammarParser.AssStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStat}
	 * labeled alternative in {@link MainGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(MainGrammarParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStat}
	 * labeled alternative in {@link MainGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(MainGrammarParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStat}
	 * labeled alternative in {@link MainGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStat(MainGrammarParser.WhileStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStat}
	 * labeled alternative in {@link MainGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStat(MainGrammarParser.WhileStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockStat}
	 * labeled alternative in {@link MainGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStat(MainGrammarParser.BlockStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockStat}
	 * labeled alternative in {@link MainGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStat(MainGrammarParser.BlockStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lockStat}
	 * labeled alternative in {@link MainGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterLockStat(MainGrammarParser.LockStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lockStat}
	 * labeled alternative in {@link MainGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitLockStat(MainGrammarParser.LockStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forkStat}
	 * labeled alternative in {@link MainGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForkStat(MainGrammarParser.ForkStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forkStat}
	 * labeled alternative in {@link MainGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForkStat(MainGrammarParser.ForkStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code joinStat}
	 * labeled alternative in {@link MainGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterJoinStat(MainGrammarParser.JoinStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code joinStat}
	 * labeled alternative in {@link MainGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitJoinStat(MainGrammarParser.JoinStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(MainGrammarParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(MainGrammarParser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trueExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTrueExpr(MainGrammarParser.TrueExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trueExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTrueExpr(MainGrammarParser.TrueExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCompExpr(MainGrammarParser.CompExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCompExpr(MainGrammarParser.CompExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prfExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrfExpr(MainGrammarParser.PrfExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prfExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrfExpr(MainGrammarParser.PrfExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code falseExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFalseExpr(MainGrammarParser.FalseExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code falseExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFalseExpr(MainGrammarParser.FalseExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(MainGrammarParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(MainGrammarParser.BoolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultExpr(MainGrammarParser.MultExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultExpr(MainGrammarParser.MultExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumExpr(MainGrammarParser.NumExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumExpr(MainGrammarParser.NumExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPlusExpr(MainGrammarParser.PlusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPlusExpr(MainGrammarParser.PlusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(MainGrammarParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link MainGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(MainGrammarParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGrammarParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(MainGrammarParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGrammarParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(MainGrammarParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGrammarParser#forkID}.
	 * @param ctx the parse tree
	 */
	void enterForkID(MainGrammarParser.ForkIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGrammarParser#forkID}.
	 * @param ctx the parse tree
	 */
	void exitForkID(MainGrammarParser.ForkIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGrammarParser#target}.
	 * @param ctx the parse tree
	 */
	void enterTarget(MainGrammarParser.TargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGrammarParser#target}.
	 * @param ctx the parse tree
	 */
	void exitTarget(MainGrammarParser.TargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MainGrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MainGrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGrammarParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(MainGrammarParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGrammarParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(MainGrammarParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGrammarParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(MainGrammarParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGrammarParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(MainGrammarParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGrammarParser#prfOp}.
	 * @param ctx the parse tree
	 */
	void enterPrfOp(MainGrammarParser.PrfOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGrammarParser#prfOp}.
	 * @param ctx the parse tree
	 */
	void exitPrfOp(MainGrammarParser.PrfOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGrammarParser#multOp}.
	 * @param ctx the parse tree
	 */
	void enterMultOp(MainGrammarParser.MultOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGrammarParser#multOp}.
	 * @param ctx the parse tree
	 */
	void exitMultOp(MainGrammarParser.MultOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGrammarParser#plusOp}.
	 * @param ctx the parse tree
	 */
	void enterPlusOp(MainGrammarParser.PlusOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGrammarParser#plusOp}.
	 * @param ctx the parse tree
	 */
	void exitPlusOp(MainGrammarParser.PlusOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGrammarParser#boolOp}.
	 * @param ctx the parse tree
	 */
	void enterBoolOp(MainGrammarParser.BoolOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGrammarParser#boolOp}.
	 * @param ctx the parse tree
	 */
	void exitBoolOp(MainGrammarParser.BoolOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGrammarParser#compOp}.
	 * @param ctx the parse tree
	 */
	void enterCompOp(MainGrammarParser.CompOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGrammarParser#compOp}.
	 * @param ctx the parse tree
	 */
	void exitCompOp(MainGrammarParser.CompOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGrammarParser#ngWrittenNumber}.
	 * @param ctx the parse tree
	 */
	void enterNgWrittenNumber(MainGrammarParser.NgWrittenNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGrammarParser#ngWrittenNumber}.
	 * @param ctx the parse tree
	 */
	void exitNgWrittenNumber(MainGrammarParser.NgWrittenNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGrammarParser#nghundred}.
	 * @param ctx the parse tree
	 */
	void enterNghundred(MainGrammarParser.NghundredContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGrammarParser#nghundred}.
	 * @param ctx the parse tree
	 */
	void exitNghundred(MainGrammarParser.NghundredContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGrammarParser#ngthousand}.
	 * @param ctx the parse tree
	 */
	void enterNgthousand(MainGrammarParser.NgthousandContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGrammarParser#ngthousand}.
	 * @param ctx the parse tree
	 */
	void exitNgthousand(MainGrammarParser.NgthousandContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGrammarParser#ngmillion}.
	 * @param ctx the parse tree
	 */
	void enterNgmillion(MainGrammarParser.NgmillionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGrammarParser#ngmillion}.
	 * @param ctx the parse tree
	 */
	void exitNgmillion(MainGrammarParser.NgmillionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGrammarParser#ngbillion}.
	 * @param ctx the parse tree
	 */
	void enterNgbillion(MainGrammarParser.NgbillionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGrammarParser#ngbillion}.
	 * @param ctx the parse tree
	 */
	void exitNgbillion(MainGrammarParser.NgbillionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGrammarParser#ngsingle}.
	 * @param ctx the parse tree
	 */
	void enterNgsingle(MainGrammarParser.NgsingleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGrammarParser#ngsingle}.
	 * @param ctx the parse tree
	 */
	void exitNgsingle(MainGrammarParser.NgsingleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGrammarParser#ngonly}.
	 * @param ctx the parse tree
	 */
	void enterNgonly(MainGrammarParser.NgonlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGrammarParser#ngonly}.
	 * @param ctx the parse tree
	 */
	void exitNgonly(MainGrammarParser.NgonlyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGrammarParser#ngsingles}.
	 * @param ctx the parse tree
	 */
	void enterNgsingles(MainGrammarParser.NgsinglesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGrammarParser#ngsingles}.
	 * @param ctx the parse tree
	 */
	void exitNgsingles(MainGrammarParser.NgsinglesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGrammarParser#ngmain1}.
	 * @param ctx the parse tree
	 */
	void enterNgmain1(MainGrammarParser.Ngmain1Context ctx);
	/**
	 * Exit a parse tree produced by {@link MainGrammarParser#ngmain1}.
	 * @param ctx the parse tree
	 */
	void exitNgmain1(MainGrammarParser.Ngmain1Context ctx);
	/**
	 * Enter a parse tree produced by {@link MainGrammarParser#ngmain2}.
	 * @param ctx the parse tree
	 */
	void enterNgmain2(MainGrammarParser.Ngmain2Context ctx);
	/**
	 * Exit a parse tree produced by {@link MainGrammarParser#ngmain2}.
	 * @param ctx the parse tree
	 */
	void exitNgmain2(MainGrammarParser.Ngmain2Context ctx);
	/**
	 * Enter a parse tree produced by {@link MainGrammarParser#nghprefix}.
	 * @param ctx the parse tree
	 */
	void enterNghprefix(MainGrammarParser.NghprefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGrammarParser#nghprefix}.
	 * @param ctx the parse tree
	 */
	void exitNghprefix(MainGrammarParser.NghprefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGrammarParser#ngseconds}.
	 * @param ctx the parse tree
	 */
	void enterNgseconds(MainGrammarParser.NgsecondsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGrammarParser#ngseconds}.
	 * @param ctx the parse tree
	 */
	void exitNgseconds(MainGrammarParser.NgsecondsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGrammarParser#ngfirst}.
	 * @param ctx the parse tree
	 */
	void enterNgfirst(MainGrammarParser.NgfirstContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGrammarParser#ngfirst}.
	 * @param ctx the parse tree
	 */
	void exitNgfirst(MainGrammarParser.NgfirstContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainGrammarParser#ngdoubles}.
	 * @param ctx the parse tree
	 */
	void enterNgdoubles(MainGrammarParser.NgdoublesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainGrammarParser#ngdoubles}.
	 * @param ctx the parse tree
	 */
	void exitNgdoubles(MainGrammarParser.NgdoublesContext ctx);
}