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

    /**
     * This method will execute this Stage.
     * @param tree the parse tree we need to check.
     */
    public void execute(ParseTree tree) throws CheckerException {
        new ParseTreeWalker().walk(this, tree);
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////
    //                      Checker Functions
    /////////////////////////////////////////////////////////////////////////////////////////////////////

    //--------------------------
    //Declarations
    //--------------------------

    /**
     * This method checks the type of the expression against the type of the declaration.
     * It also sets the type of the id to the type of the decleration.
     * @param ctx context of node.
     */
    @Override
    public void exitDeclStat(MainGrammarParser.DeclStatContext ctx) {
        setType(ctx.id(), new Type(PrimitiveType.valueOf(ctx.type().primitiveType().getText().toUpperCase())));
        if (ctx.expression() != null) {
            checkType(ctx.id(), type(ctx.expression()));
        }
    }


    //--------------------------
    //ID's
    //--------------------------

    /**
     * This method sets the node to the type of the corresponding variable.
     * If not declared it adds an error.
     * @param ctx context of node.
     */
    @Override
    public void exitId(MainGrammarParser.IdContext ctx) {
        String id = ctx.getText();
        if (!declarationTable.isDeclared(id)) {
            errors.add("Variable is not declared: " + ctx.getText());
        } else {
            setType(ctx, declarationTable.getVariable(id).getType());
        }
    }

    /**
     * This method sets the node to the type of the id it has.
     * @param ctx context of node.
     */
    @Override
    public void exitTarget(MainGrammarParser.TargetContext ctx) {
        setType(ctx, type(ctx.id()));
    }

    //--------------------------
    //Expressions
    //--------------------------

    //Syntax expressions
    /**
     * This method sets the type of the node to the type of the result of its child.
     * @param ctx context of node.
     */
    @Override
    public void exitParExpr(MainGrammarParser.ParExprContext ctx) {
        setType(ctx, type(ctx.expression()));
    }

    //Variable expressions

    /**
     * This method sets the type of the node to the id it has as a child.
     * @param ctx context of node.
     */
    @Override
    public void exitIdExpr(MainGrammarParser.IdExprContext ctx) {
        setType(ctx, type(ctx.id()));
    }

    //Operator expressions

    /**
     * This method checks whether type of the child is correct.
     * @param ctx context of node.
     */
    @Override
    public void exitPrfExpr(MainGrammarParser.PrfExprContext ctx) {
        checkTypes(ctx.expression(), new Type[] {new Type(PrimitiveType.INTEGER), new Type(PrimitiveType.BOOLEAN)});
        setType(ctx, type(ctx.expression()));
    }

    /**
     * This method checks whether the type of its children is correct.
     * It also assigns the correct type to itself.
     * @param ctx context of node.
     */
    @Override
    public void exitCompExpr(MainGrammarParser.CompExprContext ctx) {
        checkType(ctx.expression(0), new Type(PrimitiveType.INTEGER));
        checkType(ctx.expression(1), new Type(PrimitiveType.INTEGER));
        setType(ctx, new Type(PrimitiveType.BOOLEAN));
    }

    /**
     * This method checks whether the type of its children is correct.
     * It also assigns the correct type to itself.
     * @param ctx context of node.
     */
    @Override
    public void exitBoolExpr(MainGrammarParser.BoolExprContext ctx) {
        checkType(ctx.expression(0), new Type(PrimitiveType.BOOLEAN));
        checkType(ctx.expression(1), new Type(PrimitiveType.BOOLEAN));
        setType(ctx, new Type(PrimitiveType.BOOLEAN));
    }

    /**
     * This method checks whether the type of its children is correct.
     * It also assigns the correct type to itself.
     * @param ctx context of node.
     */
    @Override
    public void exitMultExpr(MainGrammarParser.MultExprContext ctx) {
        checkType(ctx.expression(0), new Type(PrimitiveType.INTEGER));
        checkType(ctx.expression(1), new Type(PrimitiveType.INTEGER));
        setType(ctx, new Type(PrimitiveType.INTEGER));
    }

    /**
     * This method checks whether the type of its children is correct.
     * It also assigns the correct type to itself.
     * @param ctx context of node.
     */
    @Override
    public void exitPlusExpr(MainGrammarParser.PlusExprContext ctx) {
        checkType(ctx.expression(0), new Type(PrimitiveType.INTEGER));
        checkType(ctx.expression(1), new Type(PrimitiveType.INTEGER));
        setType(ctx, new Type(PrimitiveType.INTEGER));
    }

    //Primitive type expressions

    /**
     * Sets type too boolean
     * @param ctx context of node.
     */
    @Override
    public void exitTrueExpr(MainGrammarParser.TrueExprContext ctx) {
        setType(ctx, new Type(PrimitiveType.BOOLEAN));
    }

    /**
     * sets type to boolean
     * @param ctx context of node.
     */
    @Override
    public void exitFalseExpr(MainGrammarParser.FalseExprContext ctx) {
        setType(ctx, new Type(PrimitiveType.BOOLEAN));
    }

    /**
     * sets type to integer
     * @param ctx context of node.
     */
    @Override
    public void exitNumExpr(MainGrammarParser.NumExprContext ctx) {
        setType(ctx, new Type(PrimitiveType.INTEGER));
    }


    //--------------------------
    //Assignments
    //--------------------------

    /**
     * checks whether the assignment is valid.
     * @param ctx context of node.
     */
    @Override
    public void exitAssStat(MainGrammarParser.AssStatContext ctx) {
        checkType(ctx.target(), type(ctx.expression()));
    }


    //--------------------------
    //Control structures
    //--------------------------

    /**
     * Checks whether the expression is boolean.
     * @param ctx context of node.
     */
    @Override
    public void exitIfStat(MainGrammarParser.IfStatContext ctx) {
        checkType(ctx.expression(), new Type(PrimitiveType.BOOLEAN));
    }

    /**
     * checks whether the expression is boolean.
     * @param ctx context of node.
     */
    @Override
    public void exitWhileStat(MainGrammarParser.WhileStatContext ctx) {
        checkType(ctx.expression(), new Type(PrimitiveType.BOOLEAN));
    }


    //--------------------------
    //Scoping management
    //--------------------------

    /**
     * opens a scope.
     * @param ctx context of node.
     */
    @Override
    public void enterBlockStat(MainGrammarParser.BlockStatContext ctx) {
        openScope(ctx);
    }

    /**
     * closes a scope.
     * @param ctx context of node.
     */
    @Override
    public void exitBlockStat(MainGrammarParser.BlockStatContext ctx) {
        closeScope(ctx);
    }

    /**
     * opens a thread.
     * @param ctx context of node.
     */
    @Override
    public void enterForkStat(MainGrammarParser.ForkStatContext ctx) {
        declarationTable.openThread();
    }

    /**
     * closes a thread.
     * @param ctx context of node.
     */
    @Override
    public void exitForkStat(MainGrammarParser.ForkStatContext ctx) {
        declarationTable.closeThread();
    }


    /////////////////////////////////////////////////////////////////////////////////////////////////////
    //                      Helper Functions
    /////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * This method opens a scope.
     * @param ctx scope at which point to opens.
     */
    private void openScope(ParserRuleContext ctx) {
        try {
            declarationTable.openScope();
        } catch (ScopeOutOfBoundsException e) {
            errors.add("Invalid scoping! (OpenScope) At:\n" + ctx.getText());
        }
    }

    /**
     * This method closes a scope.
     * @param ctx scope at which point to close.
     */
    private void closeScope(ParserRuleContext ctx) {
        try {
            declarationTable.closeScope();
        } catch (ScopeOutOfBoundsException e) {
            errors.add("Invalid scoping! (CloseScope) At:\n" + ctx.getText());
        }
    }

    /**
     * This method checks a node against multiple type possibilities
     * @param ctx node to check against.
     * @param types possible types.
     * @return true if the type of ctx matches a type in the array.
     */
    private boolean checkTypes(ParserRuleContext ctx, Type[] types) {
        for (Type type : types) {
            if (type(ctx).equals(type)) {
                return true;
            }
        }
        return false;
    }

    /**
     * This method checks the type of a node and a type.
     * @param ctx node which type to check.
     * @param type the type it should be.
     * @return true if types are equal otherwise false.
     */
    private boolean checkType(ParserRuleContext ctx, Type type) {
        if (type == null) {
            errors.add("Type is null during typeCheck of: " + ctx.getText());
            return false;
        }
        if (type(ctx) == null) {
            errors.add("Cannot find type of: " + ctx.getText() + " line: " + ctx.getStart().getLine() + " at: " + ctx.getStart().getCharPositionInLine() + " With: " + ctx.getClass().getSimpleName());
            return false;
        }
        if (!type(ctx).equals(type)) errors.add("Type check error: " + type(ctx) + " and " + type + "are not equal for variables: " + ctx.getText());
        return type(ctx).equals(type);
    }

    /**
     * This method sets the type of a parse tree node to a type.
     * @param ctx node for which the entry has been determined.
     * @param type type of the node.
     */
    private void setType(ParserRuleContext ctx, Type type) {
        if (type == null) errors.add("Invalid argument! (null)");
        checkerRecord.setType(ctx, type);
    }

    /**
     * Returns the type of a parsetree node.
     * @param ctx node of which you want the type.
     * @return type of ctx.
     */
    private Type type(ParserRuleContext ctx) {
        return checkerRecord.getType(ctx);
    }

    /**
     * @return all the errors that have been recorded during execution.
     */
    public List<String> getErrors() {
        return errors;
    }

}
