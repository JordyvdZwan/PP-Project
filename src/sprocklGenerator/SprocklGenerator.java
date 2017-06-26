package sprocklGenerator;

import exceptions.UnsupportedInstructionException;
import utils.iloc.model.Instr;
import utils.iloc.model.Program;

import java.util.HashMap;
import java.util.Map;

public class SprocklGenerator {

    private Map<String, Integer> registers = new HashMap<>();
    private static final int REGISTERS = 6;
    private Program program;

    public SprocklGenerator(Program program) {
        this.program = program;
    }

    public String generate() throws UnsupportedInstructionException {
        String result = "";
        for (Instr anInstr : program.getInstr()) {
            String[] line = anInstr.toString().split(" ");
            switch (line[0]) {

                case "pop":
                    result = result + " " + pop(line);
                    break;

                case "push":
                    result = result + " " + push(line);
                    break;

                case "add":
                    result = result + " " + add(line);
                    break;

                case "addI":
                    result = result + " " + addI(line);
                    break;

                case "sub":
                    result = result + " " + sub(line);
                    break;

                case "mult":
                    result = result + " " + mult(line);
                    break;

                case "cmp_EQ":
                    result = result + " " + equal(line);
                    break;

                case "cmp_NE":
                    result = result + " " + notEqual(line);
                    break;

                case "cmp_GT":
                    result = result + " " + greater(line);
                    break;

                case "cmp_LT":
                    result = result + " " + less(line);
                    break;

                case "cmp_GE":
                    result = result + " " + greaterEqual(line);
                    break;

                case "cmp_LE":
                    result = result + " " + lessEqual(line);
                    break;

                case "load":
                    result = result + " " + load(line);
                    break;

                case "loadI":
                    result = result + " " + loadI(line);
                    break;

                case "store":
                    result = result + " " + store(line);
                    break;

                case "storeAI":
                    result = result + " " + storeAI(line);
                    break;

                case "lshift":
                    result = result + " " + lshift(line);
                    break;

                case "lshiftI":
                    result = result + " " + lshiftI(line);
                    break;

                case "rshift":
                    result = result + " " + rshift(line);
                    break;

                case "rshiftI":
                    result = result + " " + rshiftI(line);
                    break;

                default:
                    throw new UnsupportedInstructionException();
            }
        }
        return result;
    }

    private void addRegister(String register) {
        if (!registers.containsKey(register)) {
            registers.put(register, registers.size());
        }
    }

//    om een register te kiezen
    private int ieneMieneMutte() {
        int result = (int) (Math.random() * REGISTERS);
        for (int i = 0; i < 22; i++) {
            result = result < REGISTERS ? 0 : result + 1;
        }
        return result;
    }

    private String pop(String[] input) {
        addRegister(input[2]);
        return "Pop " + registers.get(input[2]);
        }

    private String push(String[] input) {
        addRegister(input[1]);
        return "Push " + registers.get(input[1]);
    }

    private String add(String[] input) {
        addRegister(input[1]);
        addRegister(input[2]);
        addRegister(input[4]);
        return "Compute Add " + registers.get(input[1]) + " " + registers.get(input[2]) + " " + registers.get(input[4]);
    }

    private String addI(String[] input) {
        String result;
        addRegister(input[1]);
        addRegister(input[4]);
        if (registers.size() < REGISTERS) {
            registers.put("register", registers.size());
            result = "Load (ImmValue " + input[2] + ") " + registers.get("register") +
                    ", Compute Add " + registers.get(input[1]) + " " + registers.get("register") + " " + registers.get(input[4]);
            registers.remove("register");
        } else {
            String register = registers.keySet().iterator().next();
            int registerNumber = registers.get(register);
            registers.remove(register);
            result = "Push " + register;
            registers.put("register", registerNumber);
            result = result + ", Load (ImmValue " + input[2] + ") " + registers.get("register") +
                    ", Compute Add " + registers.get(input[1]) + " " + registers.get("register") + " " + registers.get(input[4]);
            registers.remove("register");
            registers.put(register, registerNumber);
            result = result + ", Pop " + register;
        }
        return result;
    }

    private String sub(String[] input) {
        addRegister(input[1]);
        addRegister(input[2]);
        addRegister(input[4]);
        return "Compute Sub " + registers.get(input[1]) + " " + registers.get(input[2]) + " " + registers.get(input[4]);
    }

    private String mult(String[] input) {
        addRegister(input[1]);
        addRegister(input[2]);
        addRegister(input[4]);
        return "Compute Mul " + registers.get(input[1]) + " " + registers.get(input[2]) + " " + registers.get(input[4]);
    }

    private String equal(String[] input) {
        addRegister(input[1]);
        addRegister(input[2]);
        addRegister(input[4]);
        return "Compute Equal " + registers.get(input[1]) + " " + registers.get(input[2]) + " " + registers.get(input[4]);
    }

    private String notEqual(String[] input) {
        addRegister(input[1]);
        addRegister(input[2]);
        addRegister(input[4]);
        return "Compute NEq " + registers.get(input[1]) + " " + registers.get(input[2]) + " " + registers.get(input[4]);
    }

    private String greater(String[] input) {
        addRegister(input[1]);
        addRegister(input[2]);
        addRegister(input[4]);
        return "Compute Gt " + registers.get(input[1]) + " " + registers.get(input[2]) + " " + registers.get(input[4]);
    }

    private String less(String[] input) {
        addRegister(input[1]);
        addRegister(input[2]);
        addRegister(input[4]);
        return "Compute Lt " + registers.get(input[1]) + " " + registers.get(input[2]) + " " + registers.get(input[4]);
    }

    private String greaterEqual(String[] input) {
        addRegister(input[1]);
        addRegister(input[2]);
        addRegister(input[4]);
        return "Compute GtE " + registers.get(input[1]) + " " + registers.get(input[2]) + " " + registers.get(input[4]);
    }

    private String lessEqual(String[] input) {
        addRegister(input[1]);
        addRegister(input[2]);
        addRegister(input[4]);
        return "Compute LtE " + registers.get(input[1]) + " " + registers.get(input[2]) + " " + registers.get(input[4]);
    }

    private String load(String[] input) {
        addRegister(input[1]);
        addRegister(input[3]);
        return  "Load (IndAddr " + registers.get(input[1]) + ") " + registers.get(input[3]);
    }

    private String loadI(String[] input) {
        addRegister(input[3]);
        return "Load (ImmValue " + input[1] + ") " + registers.get(input[3]);
    }

    private String store(String[] input) {
        addRegister(input[1]);
        addRegister(input[3]);
        return "Store " + registers.get(input[1]) + " (IndAddr" + registers.get(input[3]) + ")";
    }

    private String storeAI(String[] input) {
        String result;
        return result;
    }

    private String lshift(String[] input) {
        addRegister(input[1]);
        addRegister(input[2]);
        addRegister(input[4]);
        return "Compute LShift " + registers.get(input[1]) + " " + registers.get(input[2]) + " " + registers.get(input[4]);
    }

    private String lshiftI(String[] input) {
        String result;
        addRegister(input[1]);
        addRegister(input[4]);
        if (registers.size() < REGISTERS) {
            registers.put("register", registers.size());
            result = "Load (ImmValue " + input[2] + ") " + registers.get("register") +
                     ", Compute LShift " + registers.get(input[1]) + " " + registers.get("register") + " " + registers.get(input[4]);
            registers.remove("register");
        } else {
            String register = registers.keySet().iterator().next();
            int registerNumber = registers.get(register);
            registers.remove(register);
            result = "Push " + register;
            registers.put("register", registerNumber);
            result = result + ", Load (ImmValue " + input[2] + ") " + registers.get("register") +
                    ", Compute LShift " + registers.get(input[1]) + " " + registers.get("register") + " " + registers.get(input[4]);
            registers.remove("register");
            registers.put(register, registerNumber);
            result = result + ", Pop " + register;
        }
        return result;
    }

    private String rshift(String[] input) {
        addRegister(input[1]);
        addRegister(input[2]);
        addRegister(input[4]);
        return "Compute RShift " + registers.get(input[1]) + " " + registers.get(input[2]) + " " + registers.get(input[4]);
    }

    private String rshiftI(String[] input) {
        String result;
        addRegister(input[1]);
        addRegister(input[4]);
        if (registers.size() < REGISTERS) {
            registers.put("register", registers.size());
            result = "Load (ImmValue " + input[2] + ") " + registers.get("register") +
                    ", Compute RShift " + registers.get(input[1]) + " " + registers.get("register") + " " + registers.get(input[4]);
            registers.remove("register");
        } else {
            String register = registers.keySet().iterator().next();
            int registerNumber = registers.get(register);
            registers.remove(register);
            result = "Push " + register;
            registers.put("register", registerNumber);
            result = result + ", Load (ImmValue " + input[2] + ") " + registers.get("register") +
                    ", Compute RShift " + registers.get(input[1]) + " " + registers.get("register") + " " + registers.get(input[4]);
            registers.remove("register");
            registers.put(register, registerNumber);
            result = result + ", Pop " + register;
        }
        return result;
    }

}
