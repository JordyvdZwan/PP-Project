package checker.stages;

import checker.model.*;
import exceptions.CheckerException;
import exceptions.ScopeOutOfBoundsException;
import grammar.MainGrammarBaseListener;
import grammar.MainGrammarParser;

/**
 * Created by Jordy van der Zwan on 24-Jun-17.
 *
 * This stage will check and record all variable declaration.
 */
public class CheckerStage1 extends MainGrammarBaseListener {

    private DeclarationTable declarationTable;

    public CheckerStage1(DeclarationTable declarationTable) {
        this.declarationTable = declarationTable;
    }

    @Override
    public void exitDeclStat(MainGrammarParser.DeclStatContext ctx) {
        Type type;
        if (ctx.type().array() != null) {
            PrimitiveType primType = PrimitiveType.valueOf(ctx.type().array().primitiveType().getText().toUpperCase());
            type = new Type(Construct.Array, primType);
        } else {
            type = new Type(PrimitiveType.valueOf(ctx.type().primitiveType().getText().toUpperCase()));
        }
        declarationTable.addVariable(new Variable(type, ctx.id().getText()));
    }

    @Override
    public void enterBlockStat(MainGrammarParser.BlockStatContext ctx) {
        declarationTable.createScope();
    }

    @Override
    public void exitBlockStat(MainGrammarParser.BlockStatContext ctx) throws CheckerException {
        try {
            declarationTable.closeScope();
        } catch (ScopeOutOfBoundsException e) {
            throw new CheckerException("Invalid scoping! At:\n" + ctx.getText());
        }
    }
}
