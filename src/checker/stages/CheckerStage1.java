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
 * This stage will check and record all variable declaration.
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

    public void execute(ParseTree tree) throws CheckerException {
        new ParseTreeWalker().walk(this, tree);
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////
    //                      Checker Functions
    /////////////////////////////////////////////////////////////////////////////////////////////////////

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

    @Override
    public void exitId(MainGrammarParser.IdContext ctx) {
        if (!declarationTable.isDeclared(ctx.getText())) {
            errors.add("Variable is not declared: " + ctx.getText());
        } else {
            setOffset(ctx, declarationTable.getVariable(ctx.getText()).getOffset());
            setGlobal(ctx, declarationTable.getVariable(ctx.getText()).getGlobal());
        }
    }

    @Override
    public void exitTarget(MainGrammarParser.TargetContext ctx) {
        setOffset(ctx, offset(ctx.id()));
    }

    @Override
    public void exitIdExpr(MainGrammarParser.IdExprContext ctx) {
        setOffset(ctx, offset(ctx.id()));
    }

    @Override
    public void enterBlockStat(MainGrammarParser.BlockStatContext ctx) {
        declarationTable.createScope();
    }

    @Override
    public void exitBlockStat(MainGrammarParser.BlockStatContext ctx) {
        try {
            declarationTable.closeScope();
        } catch (ScopeOutOfBoundsException e) {
            errors.add("Invalid scoping! At:\n" + ctx.getText());
        }
    }

    @Override
    public void enterForkStat(MainGrammarParser.ForkStatContext ctx) {
        if (declarationTable.addForkId(ctx.forkID().getText()) == -1) errors.add("ForkID is already declared: " + ctx.forkID().getText());
        checkerRecord.nrOfThreads++;
        setForkId(ctx.forkID(), declarationTable.getForkId(ctx.forkID().getText()).getNumber());
        declarationTable.createThread();
    }

    @Override
    public void exitForkStat(MainGrammarParser.ForkStatContext ctx) {
        declarationTable.exitThread();
    }

    @Override
    public void exitJoinStat(MainGrammarParser.JoinStatContext ctx) {
        if (null == declarationTable.getForkId(ctx.forkID().getText())) {
            errors.add("Threadid not in scope! id: " + ctx.forkID().getText());
        } else {
            setForkId(ctx.forkID(), declarationTable.getForkId(ctx.forkID().getText()).getNumber());
        }
    }

    private Map<Integer, Integer> lockMapping = new HashMap<Integer, Integer>();

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

    private void setOffset(ParserRuleContext ctx, Integer offset) {
        if (offset == null) errors.add("Invalid argument! (null)");
        checkerRecord.setOffset(ctx, offset);
    }
    private void setGlobal(ParserRuleContext ctx, boolean global) {
        checkerRecord.setGlobal(ctx, global);
    }
    private void setForkId(ParserRuleContext ctx, Integer forkID) {
        if (forkID == null) errors.add("Invalid argument! (null)");
        checkerRecord.setForkId(ctx, forkID);
    }
    private boolean global(ParserRuleContext ctx) {
        return checkerRecord.getGlobal(ctx);
    }
    private Integer offset(ParserRuleContext ctx) {
        return checkerRecord.getOffset(ctx);
    }
    public List<String> getErrors() {
        return errors;
    }
}