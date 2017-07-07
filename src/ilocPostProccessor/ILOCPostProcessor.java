package ilocPostProccessor;

import checker.model.DeclarationTable;
import checker.model.PrimitiveType;
import checker.model.Type;
import checker.model.Variable;
import utils.iloc.model.*;
import utils.log.Log;
import utils.log.LogType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Jordy van der Zwan on 28-Jun-17.
 */
public class ILOCPostProcessor {

    private final int MAX_SPARE_REGISTERS = 2;
    private final DeclarationTable declarationTable;
    private Program original;
    private Program result = new Program();

    private Reg a = new Reg("r_a");
    private Reg b = new Reg("r_b");
    private Reg arp = new Reg("r_arp");

    private List<Reg> freeRegisters = new ArrayList<>();
    private List<Reg> usedRegisters = new ArrayList<>();
    private Map<String, Reg> registerMapping = new HashMap<>();
    private Map<Reg, Integer> registerToHeapMapping = new HashMap<>();

    public ILOCPostProcessor(Program original, DeclarationTable declarationTable) {
        this.original = original;
        this.declarationTable = declarationTable;
        for (int i = 0; i < MAX_SPARE_REGISTERS; i++) {
            freeRegisters.add(new Reg("r_" + i));
        }
    }

    public Program execute() {
        for (Instr instr : original.getInstr()) {
            Log.addLogItem("Post-processor stage 1 is working on line: " + instr.toString(), LogType.Dev);
            OpCode opcode = null;
            List<Operand> operands = null;
            boolean freea = true;
            Integer offset = null;
            for (Op operation : instr) {
                opcode = operation.getOpCode();
                operands = new ArrayList<>();
                for (Operand operand : operation.getArgs()) {
                    if (operand instanceof Reg && !operand.toString().equals("r_arp")) {
                        if (registerMapping.containsKey(operand.toString())) {
                            Reg reg = registerMapping.get(operand.toString());
                            usedRegisters.remove(reg);
                            freeRegisters.add(reg);
                            operands.add(reg);
                        } else {
                            if (registerToHeapMapping.containsKey(operand)) {
                                if (freea) {
                                    freea = false;
                                    operands.add(a);
                                    emit(OpCode.loadAI, arp, new Num(registerToHeapMapping.get(operand)), a);
                                } else {
                                    operands.add(b);
                                    emit(OpCode.loadAI, arp, new Num(registerToHeapMapping.get(operand)), b);
                                }
                            } else {
                                if (freeRegisters.size() > 0) {
                                    Reg reg = freeRegisters.get(0);
                                    freeRegisters.remove(reg);
                                    usedRegisters.add(reg);
                                    registerMapping.put(operand.toString(), reg);
                                    operands.add(reg);
                                } else {
                                    offset = declarationTable.getNextOffset(new Type(PrimitiveType.INTEGER));
                                    declarationTable.addVariable(new Variable(new Type(PrimitiveType.INTEGER), ((Reg) operand).getName(), offset));
                                    registerToHeapMapping.put((Reg) operand, offset);
                                    operands.add(a);

                                }
                            }
                        }
                    } else {
                        operands.add(operand);
                    }
                }
            }
            if (instr.hasLabel()) {
                switch (operands != null ? operands.size() : 0) {
                    case 0:
                        emit(instr.getLabel(), opcode);
                        break;
                    case 1:
                        emit(instr.getLabel(), opcode, operands.get(0));
                        break;
                    case 2:
                        emit(instr.getLabel(), opcode, operands.get(0), operands.get(1));
                        break;
                    case 3:
                        emit(instr.getLabel(), opcode, operands.get(0), operands.get(1), operands.get(2));
                        break;
                    default:
                        Log.addLogItem("Instruction has more than 3 operands.", LogType.Warning);
                }
            } else {
                switch (operands != null ? operands.size() : 0) {
                    case 0:
                        emit(opcode);
                        break;
                    case 1:
                        emit(opcode, operands.get(0));
                        break;
                    case 2:
                        emit(opcode, operands.get(0), operands.get(1));
                        break;
                    case 3:
                        emit(opcode, operands.get(0), operands.get(1), operands.get(2));
                        break;
                    default:
                        Log.addLogItem("Instruction has more than 3 operands.", LogType.Warning);
                }
            }
            if (offset != null) emit(OpCode.storeAI, a, arp, new Num(offset));
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
