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
 */
public class CheckerStage3 extends MainGrammarBaseListener {
    /////////////////////////////////////////////////////////////////////////////////////////////////////
    //                      Variables
    /////////////////////////////////////////////////////////////////////////////////////////////////////

    private DeclarationTable declarationTable;

    private CheckerRecord checkerRecord;

    private List<String> errors = new ArrayList<>();

    /////////////////////////////////////////////////////////////////////////////////////////////////////
    //                      General Functions
    /////////////////////////////////////////////////////////////////////////////////////////////////////

    public CheckerStage3(DeclarationTable declarationTable, CheckerRecord checkerRecord) {
        this.declarationTable = declarationTable;
        this.checkerRecord = checkerRecord;
    }

    public void execute(ParseTree tree) throws CheckerException {
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

    @Override
    public void exitArrayDeclStat(MainGrammarParser.ArrayDeclStatContext ctx) {
        setEntry(ctx, ctx);
    }


    //--------------------------
    //ID's
    //--------------------------

    @Override
    public void exitArrayId(MainGrammarParser.ArrayIdContext ctx) {
        setEntry(ctx, ctx.id());
    }

    @Override
    public void exitId(MainGrammarParser.IdContext ctx) {
        setEntry(ctx, ctx);
    }

    @Override
    public void exitTarget(MainGrammarParser.TargetContext ctx) {
        if (ctx.id() != null) {
            setEntry(ctx, ctx.id());
        } else {
            setEntry(ctx, entry(ctx.arrayId()));
        }
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
    public void exitArrayExpr(MainGrammarParser.ArrayExprContext ctx) {
        setEntry(ctx, ctx);
    }
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

    /////////////////////////////////////////////////////////////////////////////////////////////////////
    //                      Helper Functions
    /////////////////////////////////////////////////////////////////////////////////////////////////////

    //TODO Check argument and throw exceptions if needed.
    private void setEntry(ParserRuleContext ctx, ParserRuleContext entry) {
        checkerRecord.setEntry(ctx, entry);
    }
    private ParserRuleContext entry(ParserRuleContext ctx) {
        return checkerRecord.getEntry(ctx);
    }

    public List<String> getErrors() {
        return errors;
    }

}
