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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Jordy van der Zwan on 24-Jun-17.
 *
 * This stage will check and record all variable declaration and usage.
 * It also takes care of all locks and forkID declaration and usage.
 */
public class CheckerStage1 extends MainGrammarBaseListener {

    /////////////////////////////////////////////////////////////////////////////////////////////////////
    //                      Variables
    /////////////////////////////////////////////////////////////////////////////////////////////////////

    private DeclarationTable declarationTable;

    private CheckerRecord checkerRecord;

    private List<String> errors = new ArrayList<>();

    /////////////////////////////////////////////////////////////////////////////////////////////////////
    //                      General Functions
    /////////////////////////////////////////////////////////////////////////////////////////////////////

    public CheckerStage1(DeclarationTable declarationTable, CheckerRecord checkerRecord) {
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

    /**
     * declares an variable in the declaration table.
     * @param ctx context of node.
     */
    @Override
    public void enterDeclStat(MainGrammarParser.DeclStatContext ctx) {
        Type type = new Type(PrimitiveType.valueOf(ctx.type().primitiveType().getText().toUpperCase()));
        if (declarationTable.isDeclaredInScope(ctx.id().getText())) {
            errors.add("Variable already declared: " + ctx.id().getText());
        } else {
            Variable var = new Variable(type, ctx.id().getText(), declarationTable.getNextOffset(type));
            var.setGlobal(false);
            declarationTable.addVariable(var);
            setOffset(ctx, var.getOffset());
        }
    }

    /**
     * declares a global variable in the declaration table.
     * @param ctx context of node.
     */
    @Override
    public void enterSharedDeclStat(MainGrammarParser.SharedDeclStatContext ctx) {
        Type type = new Type(PrimitiveType.valueOf(ctx.type().primitiveType().getText().toUpperCase()));
        if (declarationTable.isDeclaredInGlobal(ctx.id().getText())) {
            errors.add("Shared variable already declared in Global Scope: " + ctx.id().getText());
        } else {
            Variable var = new Variable(type, ctx.id().getText(), declarationTable.getNextOffset(type));
            var.setGlobal(true);
            declarationTable.addGlobalVariable(var);
            setOffset(ctx, var.getOffset());
        }
    }

    /**
     * Sets the offset and globality according to the variable it belongs to in the declarationTable.
     * @param ctx context of node.
     */
    @Override
    public void exitId(MainGrammarParser.IdContext ctx) {
        if (!declarationTable.isDeclared(ctx.getText())) {
            errors.add("Variable is not declared: " + ctx.getText());
        } else {
            setOffset(ctx, declarationTable.getVariable(ctx.getText()).getOffset());
            setGlobal(ctx, declarationTable.getVariable(ctx.getText()).getGlobal());
        }
    }

    /**
     * Sets the offset to the offset of its child.
     * @param ctx context of node.
     */
    @Override
    public void exitTarget(MainGrammarParser.TargetContext ctx) {
        setOffset(ctx, offset(ctx.id()));
    }

    /**
     * Sets the offset to the offset of its child.
     * @param ctx context of node.
     */
    @Override
    public void exitIdExpr(MainGrammarParser.IdExprContext ctx) {
        setOffset(ctx, offset(ctx.id()));
    }

    /**
     * Creates a new scope.
     * @param ctx context of node.
     */
    @Override
    public void enterBlockStat(MainGrammarParser.BlockStatContext ctx) {
        declarationTable.createScope();
    }

    /**
     * Exits a scope.
     * @param ctx context of node.
     */
    @Override
    public void exitBlockStat(MainGrammarParser.BlockStatContext ctx) {
        try {
            declarationTable.closeScope();
        } catch (ScopeOutOfBoundsException e) {
            errors.add("Invalid scoping! At:\n" + ctx.getText());
        }
    }

    /**
     * Creates a new forkid and set it to itself.
     * Also creates a new thread.
     * @param ctx context of node.
     */
    @Override
    public void enterForkStat(MainGrammarParser.ForkStatContext ctx) {
        if (declarationTable.addForkId(ctx.forkID().getText()) == -1) errors.add("ForkID is already declared: " + ctx.forkID().getText());
        checkerRecord.nrOfThreads++;
        setForkId(ctx.forkID(), declarationTable.getForkId(ctx.forkID().getText()).getNumber());
        declarationTable.createThread();
    }

    /**
     * Exits a thread.
     * @param ctx context of node.
     */
    @Override
    public void exitForkStat(MainGrammarParser.ForkStatContext ctx) {
        declarationTable.exitThread();
    }

    /**
     * Sets the forkid to the forkid belonging to the identifier it has as a child.
     * @param ctx context of node.
     */
    @Override
    public void exitJoinStat(MainGrammarParser.JoinStatContext ctx) {
        if (null == declarationTable.getForkId(ctx.forkID().getText())) {
            errors.add("Threadid not in scope! id: " + ctx.forkID().getText());
        } else {
            setForkId(ctx.forkID(), declarationTable.getForkId(ctx.forkID().getText()).getNumber());
        }
    }

    /**
     * This variable maps an offset of a variable to the offset the lock can use
     */
    private Map<Integer, Integer> lockMapping = new HashMap<>();

    /**
     * Creates a new lockOffset and sets is to itself.
     * OR sets the lockOffset belonging to its identifier to itself.
     * @param ctx context of node.
     */
    @Override
    public void exitLockStat(MainGrammarParser.LockStatContext ctx) {
        if (!global(ctx.id())) errors.add("Trying to lock on an local variable.");
        if (ctx.Lock() != null) {
            if (lockMapping.containsKey(offset(ctx.id()))) {
                setOffset(ctx, lockMapping.get(offset(ctx.id())));
            } else {
                int offset = declarationTable.getNextOffset(new Type(PrimitiveType.INTEGER));
                lockMapping.put(offset(ctx.id()), offset);
                setOffset(ctx, offset);
            }
        } else {
            setOffset(ctx, lockMapping.get(offset(ctx.id())));
        }
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////
    //                      Helper Functions
    /////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * This method sets the offset of a parse tree node to a offset.
     * @param ctx node for which the offset has been determined.
     * @param offset offset of the node.
     */
    private void setOffset(ParserRuleContext ctx, Integer offset) {
        if (offset == null) errors.add("Invalid argument! (null)");
        checkerRecord.setOffset(ctx, offset);
    }

    /**
     * This method sets whether a pares tree is global.
     * @param ctx node for which the global has been determined.
     * @param global global of the node.
     */
    private void setGlobal(ParserRuleContext ctx, boolean global) {
        checkerRecord.setGlobal(ctx, global);
    }

    /**
     * This method sets the forkID of a parse tree node to a forkID.
     * @param ctx node for which the forkID has been determined.
     * @param forkID forkID of the node.
     */
    private void setForkId(ParserRuleContext ctx, Integer forkID) {
        if (forkID == null) errors.add("Invalid argument! (null)");
        checkerRecord.setForkId(ctx, forkID);
    }

    /**
     * Returns whether the parsetree node is global.
     * @param ctx node of which you want to know if it is globol.
     * @return whether ctx is global.
     */
    private boolean global(ParserRuleContext ctx) {
        return checkerRecord.getGlobal(ctx);
    }

    /**
     * Returns the offset of a parsetree node.
     * @param ctx node of which you want the offset.
     * @return offset of ctx.
     */
    private Integer offset(ParserRuleContext ctx) {
        return checkerRecord.getOffset(ctx);
    }

    /**
     * @return all the errors that have been recorded during execution.
     */
    public List<String> getErrors() {
        return errors;
    }
}