package checker.stages;

import checker.model.DeclarationTable;

/**
 * Created by Jordy van der Zwan on 24-Jun-17.
 *
 * This stage will type check all variables and check if they have been declared.
 */
public class CheckerStage2 {

    private DeclarationTable declarationTable;

    public CheckerStage2(DeclarationTable declarationTable) {
        this.declarationTable = declarationTable;
    }
}
