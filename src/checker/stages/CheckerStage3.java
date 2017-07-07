package checker.stages;

import checker.model.*;
import exceptions.CheckerException;
import grammar.MainGrammarBaseListener;
import grammar.MainGrammarParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jordy van der Zwan on 27-Jun-17.
 *
 * This stage sets all entries of the instructions.
 * This is recorded in the checker record.
 *
 * Instead of copying the same javadoc everywhere we will describe the behaviour here.
 * For all methods count that the entry is either set to itself, or to a node it needs a result of.
 *
 * These two are the only options.
 *
 */
public class CheckerStage3 extends MainGrammarBaseListener {
    /////////////////////////////////////////////////////////////////////////////////////////////////////
    //                      Variables
    /////////////////////////////////////////////////////////////////////////////////////////////////////

    private CheckerRecord checkerRecord;

    private List<String> errors = new ArrayList<>();

    /////////////////////////////////////////////////////////////////////////////////////////////////////
    //                      General Functions
    /////////////////////////////////////////////////////////////////////////////////////////////////////

    public CheckerStage3(CheckerRecord checkerRecord) {
        this.checkerRecord = checkerRecord;
    }

    /**
     * This method will execute this Stage.
     * @param tree the parse tree we need to check.
     */
    public void execute(ParseTree tree) {
        new ParseTreeWalker().walk(this, tree);
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////
    //                      Checker Functions
    /////////////////////////////////////////////////////////////////////////////////////////////////////

    //--------------------------
    //Declarations
    //--------------------------

    @Override
    public void exitDeclStat(MainGrammarParser.DeclStatContext ctx) {
        setEntry(ctx, ctx);
    }


    //--------------------------
    //ID's
    //--------------------------

    @Override
    public void exitId(MainGrammarParser.IdContext ctx) {
        setEntry(ctx, ctx);
    }

    @Override
    public void exitTarget(MainGrammarParser.TargetContext ctx) {
            setEntry(ctx, ctx.id());
    }


    //--------------------------
    //Expressions
    //--------------------------

    //Syntax expressions
    @Override
    public void exitParExpr(MainGrammarParser.ParExprContext ctx) {
        setEntry(ctx, entry(ctx.expression()));
    }

    //Variable expressions
    @Override
    public void exitIdExpr(MainGrammarParser.IdExprContext ctx) {
        setEntry(ctx, ctx);
    }

    //Operator expressions
    @Override
    public void exitPrfExpr(MainGrammarParser.PrfExprContext ctx) {
        setEntry(ctx, entry(ctx.expression()));
    }

    @Override
    public void exitCompExpr(MainGrammarParser.CompExprContext ctx) {
        setEntry(ctx, entry(ctx.expression(0)));
    }
    @Override
    public void exitBoolExpr(MainGrammarParser.BoolExprContext ctx) {
        setEntry(ctx, entry(ctx.expression(0)));
    }
    @Override
    public void exitMultExpr(MainGrammarParser.MultExprContext ctx) {
        setEntry(ctx, entry(ctx.expression(0)));
    }
    @Override
    public void exitPlusExpr(MainGrammarParser.PlusExprContext ctx) {
        setEntry(ctx, entry(ctx.expression(0)));
    }

    //Primitive type expressions
    @Override
    public void exitTrueExpr(MainGrammarParser.TrueExprContext ctx) {
        setEntry(ctx, ctx);
    }
    @Override
    public void exitFalseExpr(MainGrammarParser.FalseExprContext ctx) {
        setEntry(ctx, ctx);
    }
    @Override
    public void exitNumExpr(MainGrammarParser.NumExprContext ctx) {
        setEntry(ctx, ctx);
    }


    //--------------------------
    //Assignments
    //--------------------------

    @Override
    public void exitAssStat(MainGrammarParser.AssStatContext ctx) {
        setEntry(ctx, entry(ctx.expression()));
    }


    //--------------------------
    //Control structures
    //--------------------------

    @Override
    public void exitIfStat(MainGrammarParser.IfStatContext ctx) {
        setEntry(ctx, entry(ctx.expression()));
    }
    @Override
    public void exitWhileStat(MainGrammarParser.WhileStatContext ctx) {
        setEntry(ctx, entry(ctx.expression()));
    }


    //--------------------------
    //Other structures
    //--------------------------

    @Override
    public void exitBlockStat(MainGrammarParser.BlockStatContext ctx) {
        setEntry(ctx, entry(ctx.statement(0)));
    }
    @Override
    public void exitProgram(MainGrammarParser.ProgramContext ctx) {
        setEntry(ctx, entry(ctx.statement(0)));
    }

    //--------------------------
    //Concurrency structures
    //--------------------------

    @Override
    public void exitSharedDeclStat(MainGrammarParser.SharedDeclStatContext ctx) {
        setEntry(ctx, ctx);
    }

    @Override
    public void exitLockStat(MainGrammarParser.LockStatContext ctx) {
        setEntry(ctx, ctx);
    }

    @Override
    public void exitForkStat(MainGrammarParser.ForkStatContext ctx) {
        setEntry(ctx, ctx);
    }

    @Override
    public void exitJoinStat(MainGrammarParser.JoinStatContext ctx) {
        setEntry(ctx, ctx);
    }


    /////////////////////////////////////////////////////////////////////////////////////////////////////
    //                      Helper Functions
    /////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * This method sets the entry of a parse tree node to another node.
     * @param ctx node for which the entry has been determined.
     * @param entry entry node.
     */
    private void setEntry(ParserRuleContext ctx, ParserRuleContext entry) {
        if (entry == null) errors.add("Invalid argument! (null)");
        checkerRecord.setEntry(ctx, entry);
    }

    /**
     * Returns the entry node of a parsetree node.
     * @param ctx node of which you want the entry.
     * @return entry node of ctx.
     */
    private ParserRuleContext entry(ParserRuleContext ctx) {
        return checkerRecord.getEntry(ctx);
    }

    /**
     * @return all the errors that have been recorded during execution.
     */
    public List<String> getErrors() {
        return errors;
    }
}
