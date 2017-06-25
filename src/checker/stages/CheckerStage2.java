package checker.stages;

import checker.model.DeclarationTable;
import exceptions.CheckerException;
import grammar.MainGrammarBaseListener;
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

    public CheckerStage2(DeclarationTable declarationTable) {
        this.declarationTable = declarationTable;
    }

    public void execute(ParseTree tree) throws CheckerException {
        new ParseTreeWalker().walk(this, tree);
        if (errors.size() > 0) {
            throw new CheckerException(errors);
        }
    }
}
