package checker.stages;

import checker.model.DeclarationTable;
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
 * This stage will type check all variables and check if they have been declared.
 */
public class CheckerStage2 extends MainGrammarBaseListener {

    private DeclarationTable declarationTable;
    private List<String> errors = new ArrayList<>();

    public List<String> getErrors() {
        return errors;
    }

    public CheckerStage2(DeclarationTable declarationTable) {
        this.declarationTable = declarationTable;
    }

    public void execute(ParseTree tree) throws CheckerException {
        new ParseTreeWalker().walk(this, tree);
    }



    @Override
    public void enterBlockStat(MainGrammarParser.BlockStatContext ctx) {
        try {
            declarationTable.openScope();
        } catch (ScopeOutOfBoundsException e) {
            errors.add("Cannot open scope!");
        }
    }

    @Override
    public void exitBlockStat(MainGrammarParser.BlockStatContext ctx) {
        try {
            declarationTable.closeScope();
        } catch (ScopeOutOfBoundsException e) {
            errors.add("Cannot close scope!");
        }
    }
}
