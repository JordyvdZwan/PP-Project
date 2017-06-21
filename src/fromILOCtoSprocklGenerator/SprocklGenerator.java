package fromILOCtoSprocklGenerator;

import utils.iloc.model.Instr;
import utils.iloc.model.Program;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jordy van der Zwan on 13-Jun-17.
 */
public class SprocklGenerator {

    private Map<String, Integer> registers = new HashMap<>();

    public void Generator(Program program) {
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
            }
        }
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

}
