package sprocklGenerator;

import exceptions.UnsupportedInstructionException;
import utils.iloc.model.Instr;
import utils.iloc.model.Program;

import java.util.HashMap;
import java.util.Map;

public class SprocklGenerator {

    private Map<String, Integer> registers = new HashMap<>();
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
        return  "Load IndAddr " + registers.get(input[1]) + " " + registers.get(input[3]);
    }

    private String loadI(String[] input) {
        addRegister(input[3]);
        return "Load ImmValue " + input[1] + " " + registers.get(input[3]);
    }

}
