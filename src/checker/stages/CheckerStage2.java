package checker.stages;

import checker.model.*;
import exceptions.CheckerException;
import exceptions.ScopeOutOfBoundsException;
import grammar.MainGrammarBaseListener;
import grammar.MainGrammarParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jordy van der Zwan on 24-Jun-17.
 *
 * This stage will type check all variables and check if they have been declared.
 */
public class CheckerStage2 extends MainGrammarBaseListener {

    /////////////////////////////////////////////////////////////////////////////////////////////////////
    //                      Variables
    /////////////////////////////////////////////////////////////////////////////////////////////////////

    private DeclarationTable declarationTable;

    private CheckerRecord checkerRecord;

    private List<String> errors = new ArrayList<>();

    /////////////////////////////////////////////////////////////////////////////////////////////////////
    //                      General Functions
    /////////////////////////////////////////////////////////////////////////////////////////////////////

    public CheckerStage2(DeclarationTable declarationTable, CheckerRecord checkerRecord) {
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
        setType(ctx.id(), new Type(PrimitiveType.valueOf(ctx.type().primitiveType().getText().toUpperCase())));
    }

//    @Override
//    public void exitArrayDeclStat(MainGrammarParser.ArrayDeclStatContext ctx) {
//        setType(ctx.id(), new Type(Construct.Array, PrimitiveType.valueOf(ctx.type().primitiveType().getText().toUpperCase())));
//        checkType(ctx, type(ctx.expression()));
//    }


    //--------------------------
    //ID's
    //--------------------------

//    @Override
//    public void exitArrayId(MainGrammarParser.ArrayIdContext ctx) {
//        String id = ctx.getText();
//        checkType(ctx.expression(), new Type(PrimitiveType.INTEGER));
//        if (!declarationTable.isDeclared(id)) {
//            errors.add("Array variable is not declared: " + ctx.getText());
//        } else {
//            setType(ctx, new Type(declarationTable.getVariable(id).getType().getPrimitiveType()));
//        }
//    }

    @Override
    public void exitId(MainGrammarParser.IdContext ctx) {
        String id = ctx.getText();
        if (!declarationTable.isDeclared(id)) {
            errors.add("Variable is not declared: " + ctx.getText());
        } else {
            setType(ctx, declarationTable.getVariable(id).getType());
        }
    }

    @Override
    public void exitTarget(MainGrammarParser.TargetContext ctx) {
//        if (ctx.id() != null) {
            setType(ctx, type(ctx.id()));
//        } else {
//            setType(ctx, new Type(type(ctx.arrayId()).getPrimitiveType()));
//        }
    }

    //--------------------------
    //Expressions
    //--------------------------

    //Syntax expressions
    @Override
    public void exitParExpr(MainGrammarParser.ParExprContext ctx) {
        setType(ctx, type(ctx.expression()));
    }

    //Variable expressions
//    @Override
//    public void exitIndexExpr(MainGrammarParser.IndexExprContext ctx) {
//        setType(ctx, type(ctx.arrayId()));
//    }
    @Override
    public void exitIdExpr(MainGrammarParser.IdExprContext ctx) {
        setType(ctx, type(ctx.id()));
    }

    //Operator expressions
    @Override
    public void exitPrfExpr(MainGrammarParser.PrfExprContext ctx) {
        checkTypes(ctx.expression(), new Type[] {new Type(PrimitiveType.INTEGER), new Type(PrimitiveType.BOOLEAN)});
        setType(ctx, type(ctx.expression()));
    }

    @Override
    public void exitCompExpr(MainGrammarParser.CompExprContext ctx) {
        checkType(ctx.expression(0), new Type(PrimitiveType.INTEGER));
        checkType(ctx.expression(1), new Type(PrimitiveType.INTEGER));
        setType(ctx, new Type(PrimitiveType.BOOLEAN));
    }
    @Override
    public void exitBoolExpr(MainGrammarParser.BoolExprContext ctx) {
        checkType(ctx.expression(0), new Type(PrimitiveType.BOOLEAN));
        checkType(ctx.expression(1), new Type(PrimitiveType.BOOLEAN));
        setType(ctx, new Type(PrimitiveType.BOOLEAN));
    }
    @Override
    public void exitMultExpr(MainGrammarParser.MultExprContext ctx) {
        checkType(ctx.expression(0), new Type(PrimitiveType.INTEGER));
        checkType(ctx.expression(1), new Type(PrimitiveType.INTEGER));
        setType(ctx, new Type(PrimitiveType.INTEGER));
    }
    @Override
    public void exitPlusExpr(MainGrammarParser.PlusExprContext ctx) {
        checkType(ctx.expression(0), new Type(PrimitiveType.INTEGER));
        checkType(ctx.expression(1), new Type(PrimitiveType.INTEGER));
        setType(ctx, new Type(PrimitiveType.INTEGER));
    }

    //Primitive type expressions
    @Override
    public void exitTrueExpr(MainGrammarParser.TrueExprContext ctx) {
        setType(ctx, new Type(PrimitiveType.BOOLEAN));
    }
    @Override
    public void exitFalseExpr(MainGrammarParser.FalseExprContext ctx) {
        setType(ctx, new Type(PrimitiveType.BOOLEAN));
    }
    @Override
    public void exitNumExpr(MainGrammarParser.NumExprContext ctx) {
        setType(ctx, new Type(PrimitiveType.INTEGER));
    }


    //--------------------------
    //Assignments
    //--------------------------

    @Override
    public void exitAssStat(MainGrammarParser.AssStatContext ctx) {
        checkType(ctx.target(), type(ctx.expression()));
    }


    //--------------------------
    //Control structures
    //--------------------------

    @Override
    public void exitIfStat(MainGrammarParser.IfStatContext ctx) {
        checkType(ctx.expression(), new Type(PrimitiveType.BOOLEAN));
    }
    @Override
    public void exitWhileStat(MainGrammarParser.WhileStatContext ctx) {
        checkType(ctx.expression(), new Type(PrimitiveType.BOOLEAN));
    }


    //--------------------------
    //Scoping management
    //--------------------------

    @Override
    public void enterBlockStat(MainGrammarParser.BlockStatContext ctx) {
        openScope(ctx);
    }
    @Override
    public void exitBlockStat(MainGrammarParser.BlockStatContext ctx) {
        closeScope(ctx);
    }


    /////////////////////////////////////////////////////////////////////////////////////////////////////
    //                      Helper Functions
    /////////////////////////////////////////////////////////////////////////////////////////////////////

    private void openScope(ParserRuleContext ctx) {
        try {
            declarationTable.openScope();
        } catch (ScopeOutOfBoundsException e) {
            errors.add("Invalid scoping! (OpenScope) At:\n" + ctx.getText());
        }
    }

    private void closeScope(ParserRuleContext ctx) {
        try {
            declarationTable.closeScope();
        } catch (ScopeOutOfBoundsException e) {
            errors.add("Invalid scoping! (CloseScope) At:\n" + ctx.getText());
        }
    }

    private boolean checkTypes(ParserRuleContext ctx, Type[] types) {
        for (Type type : types) {
            if (type(ctx).equals(type)) {
                return true;
            }
        }
        return false;
    }

    private boolean checkType(ParserRuleContext ctx, Type type) {
        if (type == null) {
            errors.add("Type is null during typeCheck of: " + ctx.getText());
            return false;
        }
        if (type(ctx) == null) {
            errors.add("Cannot find type of: " + ctx.getText() + " line: " + ctx.getStart().getLine() + " at: " + ctx.getStart().getCharPositionInLine() + " With: " + ctx.getClass().getSimpleName());
            return false;
        }
        return type(ctx).equals(type);
    }

    //TODO Check argument and throw exceptions if needed.
    private void setType(ParserRuleContext ctx, Type type) {
        checkerRecord.setType(ctx, type);
    }
    private Type type(ParserRuleContext ctx) {
        return checkerRecord.getType(ctx);
    }

    public List<String> getErrors() {
        return errors;
    }

}
