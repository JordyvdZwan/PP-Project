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
            declarationTable.addVariable(var);
            setOffset(ctx, var.getOffset());
        }
    }

    @Override
    public void enterArrayDeclStat(MainGrammarParser.ArrayDeclStatContext ctx) {
        Type type = new Type(Construct.Array, PrimitiveType.valueOf(ctx.type(0).getText().toUpperCase()));
        if (declarationTable.isDeclaredInScope(ctx.id().getText())) {
            errors.add("Array Variable already declared: " + ctx.id().getText());
        } else {
            Variable var = new Variable(type, ctx.id().getText(), declarationTable.getNextOffset(type));
            declarationTable.addVariable(var);
            setOffset(ctx, var.getOffset());
        }
    }

    @Override
    public void exitId(MainGrammarParser.IdContext ctx) {
        if (!declarationTable.isDeclared(ctx.getText())) {
            errors.add("Variable is not declared: " + ctx.getText());
        } else {
            setOffset(ctx, declarationTable.getVariable(ctx.getText()).getOffset());
        }
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

    /////////////////////////////////////////////////////////////////////////////////////////////////////
    //                      Helper Functions
    /////////////////////////////////////////////////////////////////////////////////////////////////////

    private void setOffset(ParserRuleContext ctx, Integer offset) {
        checkerRecord.setOffset(ctx, offset);
    }

    public List<String> getErrors() {
        return errors;
    }
}
