package checker;

import checker.model.CheckerRecord;
import checker.model.DeclarationTable;
import checker.stages.CheckerStage1;
import checker.stages.CheckerStage2;
import checker.stages.CheckerStage3;

/**
 * Created by Jordy van der Zwan on 13-Jun-17.
 *
 * This class is to collect and initialize all the checker Stages in one place.
 */
public class Checker {

    private DeclarationTable declarationTable = new DeclarationTable();
    private CheckerRecord checkerRecord = new CheckerRecord();

    private CheckerStage1 stage1 = new CheckerStage1(declarationTable, checkerRecord);
    private CheckerStage2 stage2 = new CheckerStage2(declarationTable, checkerRecord);
    private CheckerStage3 stage3 = new CheckerStage3(declarationTable, checkerRecord);

    public CheckerStage1 getStage1() {
        return stage1;
    }
    public CheckerStage2 getStage2() {
        return stage2;
    }
    public CheckerStage3 getStage3() {
        return stage3;
    }

    public CheckerRecord getCheckerRecord() {
        return checkerRecord;
    }
    public DeclarationTable getDeclarationTable() {
        return declarationTable;
    }
}
