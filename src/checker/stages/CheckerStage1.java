package checker.stages;

import checker.model.*;
import exceptions.CheckerException;
import exceptions.ScopeOutOfBoundsException;
import grammar.MainGrammarBaseListener;
import grammar.MainGrammarParser;
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

    private DeclarationTable declarationTable;

    public List<String> getErrors() {
        return errors;
    }

    private List<String> errors = new ArrayList<>();

    public CheckerStage1(DeclarationTable declarationTable) {
        this.declarationTable = declarationTable;
    }

    public void execute(ParseTree tree) throws CheckerException {
        new ParseTreeWalker().walk(this, tree);
    }

    @Override
    public void enterDeclStat(MainGrammarParser.DeclStatContext ctx) {
        Type type;
        if (ctx.type().array() != null) {
            PrimitiveType primType = PrimitiveType.valueOf(ctx.type().array().primitiveType().getText().toUpperCase());
            type = new Type(new Construct(Construct.CType.Array), primType);
        } else {
            type = new Type(PrimitiveType.valueOf(ctx.type().primitiveType().getText().toUpperCase()));
        }
        if (declarationTable.isDeclaredInScope(ctx.id().getText())) {
            errors.add("Variable already declared: " + ctx.id().getText());
        } else {
            declarationTable.addVariable(new Variable(type, ctx.id().getText()));
        }
    }

    @Override
    public void exitId(MainGrammarParser.IdContext ctx) {
        if (!declarationTable.isDeclared(ctx.getText())) {
            errors.add("Variable is not declared: " + ctx.getText());
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
}
