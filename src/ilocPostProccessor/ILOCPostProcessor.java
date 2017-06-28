package ilocPostProccessor;

import utils.iloc.model.*;

import java.util.Iterator;

/**
 * Created by Jordy van der Zwan on 28-Jun-17.
 */
public class ILOCPostProcessor {

    Program original;
    Program result;



    public Program execute() {
        for (Instr instr : original.getInstr()) {
            for (Op operation : instr) {


            }
        }
        return result;
    }

    /**
     * Constructs an operation from the parameters
     * and adds it to the program under construction.
     */
    private Op emit(Label label, OpCode opCode, Operand... args) {
        Op result = new Op(label, opCode, args);
        this.result.addInstr(result);
        return result;
    }

    /**
     * Constructs an operation from the parameters
     * and adds it to the program under construction.
     */
    private Op emit(OpCode opCode, Operand... args) {
        return emit(null, opCode, args);
    }

}
