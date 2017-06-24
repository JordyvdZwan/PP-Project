package checker.stages;

import checker.model.DeclarationTable;

/**
 * Created by Jordy van der Zwan on 24-Jun-17.
 *
 * This stage will check and record all variable declaration.
 */
public class CheckerStage1 {

    private DeclarationTable declarationTable;

    public CheckerStage1(DeclarationTable declarationTable) {
        this.declarationTable = declarationTable;
    }
}
