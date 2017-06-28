package sprocklGenerator;

import exceptions.TooManyRegistersException;
import exceptions.UnsupportedInstructionException;
import utils.iloc.model.Instr;
import utils.iloc.model.Label;
import utils.iloc.model.Program;
import utils.iloc.model.Str;
import utils.log.Log;
import utils.log.LogType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SprocklGenerator {

    private Map<String, Integer> registers = new LinkedHashMap<>();
    private Map<Label, Integer> jumps = new HashMap<>();
    private static final int REGISTERS = 6;
    private Program program;

    public SprocklGenerator(Program program) {
        this.program = program;
    }

    public String generate() throws UnsupportedInstructionException, TooManyRegistersException{
        String result = "import Sprockell \n" +
                "prog :: [Instruction] \n" +
                "prog = [";
        for (Instr anInstr : program.getInstr()) {
            if (anInstr.hasLabel()) {
                jumps.put(anInstr.getLabel(), anInstr.getLine());
            }
        }
        for (Instr anInstr : program.getInstr()) {
            String[] line = anInstr.toString().split(" ");
            if (anInstr.hasLabel()) {
                String[] temp = new String[line.length - 1];
                for (int i = 1; i < line.length; i++) {
                    temp[i-1] = line[i];
                }
                line = temp;
            }
            Log.addLogItem("Converting following instruction to Sprockl: " + anInstr.toString(), LogType.Dev);
            switch (line[0]) {

                case "pop":
                    result = result + pop(line) + ", ";
                    break;

                case "push":
                    result = result + push(line) + ", ";
                    break;

                case "add":
                    result = result + add(line) + ", ";
                    break;

                case "addI":
                    result = result + addI(line) + ", ";
                    break;

                case "sub":
                    result = result + sub(line) + ", ";
                    break;

                case "subI":
                    result = result + subI(line) + ", ";
                    break;

                case "mult":
                    result = result + mult(line) +", ";
                    break;

                case "multI":
                    result = result + multI(line) + ", ";
                    break;

                case "cmp_EQ":
                    result = result + equal(line) + ", ";
                    break;

                case "cmp_NE":
                    result = result + notEqual(line) + ", ";
                    break;

                case "cmp_GT":
                    result = result + greater(line) + ", ";
                    break;

                case "cmp_LT":
                    result = result + less(line) + ", ";
                    break;

                case "cmp_GE":
                    result = result + greaterEqual(line) + ", ";
                    break;

                case "cmp_LE":
                    result = result + lessEqual(line) + ", ";
                    break;

                case "load":
                    result = result + load(line) + ", ";
                    break;

                case "loadI":
                    result = result + loadI(line) + ", ";
                    break;

                case "loadAI":
                    result = result + loadAI(line) + ", ";
                    break;

                case "loadAO":
                    result = result + loadAO(line) + ", ";
                    break;

                case "store":
                    result = result + store(line) + ", ";
                    break;

                case "storeAI":
                    result = result + storeAI(line) + ", ";
                    break;

                case "storeAO":
                    result = result + storeAO(line) + ", ";
                    break;

                case "lshift":
                    result = result + lshift(line) + ", ";
                    break;

                case "lshiftI":
                    result = result + lshiftI(line) + ", ";
                    break;

                case "rshift":
                    result = result + rshift(line) + ", ";
                    break;

                case "rshiftI":
                    result = result + rshiftI(line) + ", ";
                    break;

                case "or":
                    result = result + or(line) + ", ";
                    break;

                case "orI":
                    result = result + orI(line) + ", ";
                    break;

                case "and":
                    result = result + and(line) + ", ";
                    break;

                case "andI":
                    result = result + andI(line) + ", ";
                    break;

                case "xor":
                    result = result + xor(line) + ", ";
                    break;

                case "xorI":
                    result = result + xorI(line) + ", ";
                    break;

                case "i2i":
                    result = result + i2i(line) + ", ";
                    break;

                case "nop":
                    result = result + nop() + ", ";
                    break;

                case "jump":
                    result = result + jump(line) + ", ";
                    break;

                case "jumpI":
                    result = result + jumpI(line) + ", ";
                    break;

                case "cbr":
                    result = result + cbr(line) + ", ";
                    break;

                default:
                    throw new UnsupportedInstructionException(anInstr.toString());
            }
        }
        result = result + "EndProg ] \n" +
                "main = run [prog]";
        return result;
    }

    private void addRegister(String register) throws TooManyRegistersException {
        if (!registers.containsKey(register)) {
            if (registers.size() >= REGISTERS) {
                throw new TooManyRegistersException();
            } else {
            registers.put(register, registers.size());
            }
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

    private String pop(String[] input) throws TooManyRegistersException {
        addRegister(input[2]);
        return "Pop " + registers.get(input[2]);
        }

    private String push(String[] input) throws TooManyRegistersException {
        addRegister(input[1]);
        return "Push " + registers.get(input[1]);
    }

    private String add(String[] input) throws TooManyRegistersException {
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        addRegister(comma[1]);
        addRegister(input[3]);
        return "Compute Add " + registers.get(comma[0]) + " " + registers.get(comma[1]) + " " + registers.get(input[3]);
    }

    private String addI(String[] input) throws TooManyRegistersException {
        String result;
        addRegister(input[3]);
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        if (registers.size() < REGISTERS) {
            registers.put("register", registers.size());
            result = "Load (ImmValue " + comma[1] + ") " + registers.get("register") +
                    ", Compute Add " + registers.get(comma[0]) + " " + registers.get("register") + " " + registers.get(input[3]);
            registers.remove("register");
        } else {
            int i = 1;
            ArrayList<String> keys = (new ArrayList<>(registers.keySet()));
            String register = keys.get(0);
            while(register.equals(input[3])) {
                register = keys.get(i);
                i++;
            }
            int registerNumber = registers.get(register);
            registers.remove(register);
            result = "Push " + registerNumber;
            registers.put("register", registerNumber);
            result = result + ", Load (ImmValue " + comma[1] + ") " + registers.get("register") +
                    ", Compute Add " + registers.get(comma[0]) + " " + registers.get("register") + " " + registers.get(input[3]);
            registers.remove("register");
            registers.put(register, registerNumber);
            result = result + ", Pop " + registerNumber;
        }
        return result;
    }

    private String sub(String[] input) throws TooManyRegistersException {
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        addRegister(comma[1]);
        addRegister(input[3]);
        return "Compute Sub " + registers.get(comma[0]) + " " + registers.get(comma[1]) + " " + registers.get(input[3]);
    }

    private String subI(String[] input) throws TooManyRegistersException {
        String result;
        addRegister(input[3]);
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        if (registers.size() < REGISTERS) {
            registers.put("register", registers.size());
            result = "Load (ImmValue " + comma[1] + ") " + registers.get("register") +
                    ", Compute Sub " + registers.get(comma[0]) + " " + registers.get("register") + " " + registers.get(input[3]);
            registers.remove("register");
        } else {
            int i = 1;
            ArrayList<String> keys = (new ArrayList<>(registers.keySet()));
            String register = keys.get(0);
            while(register.equals(input[3])) {
                register = keys.get(i);
                i++;
            }
            int registerNumber = registers.get(register);
            registers.remove(register);
            result = "Push " + registerNumber;
            registers.put("register", registerNumber);
            result = result + ", Load (ImmValue " + comma[1] + ") " + registers.get("register") +
                    ", Compute Sub " + registers.get(comma[0]) + " " + registers.get("register") + " " + registers.get(input[3]);
            registers.remove("register");
            registers.put(register, registerNumber);
            result = result + ", Pop " + registerNumber;
        }
        return result;
    }

    private String mult(String[] input) throws TooManyRegistersException {
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        addRegister(comma[1]);
        addRegister(input[3]);
        return "Compute Mult " + registers.get(comma[0]) + " " + registers.get(comma[1]) + " " + registers.get(input[3]);
    }

    private String multI(String[] input) throws TooManyRegistersException {
        String result;
        addRegister(input[3]);
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        if (registers.size() < REGISTERS) {
            registers.put("register", registers.size());
            result = "Load (ImmValue " + comma[1] + ") " + registers.get("register") +
                    ", Compute Mult " + registers.get(comma[0]) + " " + registers.get("register") + " " + registers.get(input[3]);
            registers.remove("register");
        } else {
            int i = 1;
            ArrayList<String> keys = (new ArrayList<>(registers.keySet()));
            String register = keys.get(0);
            while(register.equals(input[3])) {
                register = keys.get(i);
                i++;
            }
            int registerNumber = registers.get(register);
            registers.remove(register);
            result = "Push " + registerNumber;
            registers.put("register", registerNumber);
            result = result + ", Load (ImmValue " + comma[1] + ") " + registers.get("register") +
                    ", Compute Mult " + registers.get(comma[0]) + " " + registers.get("register") + " " + registers.get(input[3]);
            registers.remove("register");
            registers.put(register, registerNumber);
            result = result + ", Pop " + registerNumber;
        }
        return result;
    }

    private String equal(String[] input) throws TooManyRegistersException {
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        addRegister(comma[1]);
        addRegister(input[3]);
        return "Compute Equal " + registers.get(comma[0]) + " " + registers.get(comma[1]) + " " + registers.get(input[3]);
    }

    private String notEqual(String[] input) throws TooManyRegistersException {
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        addRegister(comma[1]);
        addRegister(input[3]);
        return "Compute Neq " + registers.get(comma[0]) + " " + registers.get(comma[1]) + " " + registers.get(input[3]);
    }

    private String greater(String[] input) throws TooManyRegistersException {
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        addRegister(comma[1]);
        addRegister(input[3]);
        return "Compute Gt " + registers.get(comma[0]) + " " + registers.get(comma[1]) + " " + registers.get(input[3]);
    }

    private String less(String[] input) throws TooManyRegistersException {
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        addRegister(comma[1]);
        addRegister(input[3]);
        return "Compute Lt " + registers.get(comma[0]) + " " + registers.get(comma[1]) + " " + registers.get(input[3]);
    }

    private String greaterEqual(String[] input) throws TooManyRegistersException {
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        addRegister(comma[1]);
        addRegister(input[3]);
        return "Compute GtE " + registers.get(comma[0]) + " " + registers.get(comma[1]) + " " + registers.get(input[3]);
    }

    private String lessEqual(String[] input) throws TooManyRegistersException {
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        addRegister(comma[1]);
        addRegister(input[3]);
        return "Compute LtE " + registers.get(comma[0]) + " " + registers.get(comma[1]) + " " + registers.get(input[3]);
    }

    private String load(String[] input) throws TooManyRegistersException {
        addRegister(input[1]);
        addRegister(input[3]);
        return  "Load (IndAddr " + registers.get(input[1]) + ") " + registers.get(input[3]);
    }

    private String loadI(String[] input) throws TooManyRegistersException {
        addRegister(input[3]);
        return "Load (ImmValue " + input[1] + ") " + registers.get(input[3]);
    }

    private String loadAI(String[] input) throws TooManyRegistersException {
        String result;
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        result = "Push " + registers.get(comma[0]);
        result = result + ", " + addI(new String[]{"", comma[0] + "," + comma[1], "", comma[0]}) + ", " + load(new String[]{"", comma[0], "", input[3]});
        result = result + ", " + "Pop " + registers.get(comma[0]);
        return result;
    }

    private String loadAO(String[] input) throws TooManyRegistersException {
        String result;
        String[] comma = input[3].split(",");
        addRegister(comma[0]);
        result = "Push " + registers.get(comma[0]);
        result = result + ", " + add(new String[]{"", comma[0] + "," + comma[1], "", comma[0]}) + ", " + load(new String[]{"", input[1], "", comma[0]});
        result = result + ", " + "Pop " + registers.get(comma[0]);
        return result;
    }

    private String store(String[] input) throws TooManyRegistersException {
        addRegister(input[1]);
        addRegister(input[3]);
        return "Store " + registers.get(input[1]) + " (IndAddr " + registers.get(input[3]) + ")";
    }

    private String storeAI(String[] input) throws TooManyRegistersException {
        String result;
        String[] comma = input[3].split(",");
        addRegister(comma[0]);
        result = "Push " + registers.get(comma[0]);
        result = result + ", " + addI(new String[]{"", comma[0] + "," + comma[1], "", comma[0]}) + ", " + store(new String[]{"", input[1], "", comma[0]});
        result = result + ", " + "Pop " + registers.get(comma[0]);
        return result;
    }

    private String storeAO(String[] input) throws TooManyRegistersException {
        String result;
        String[] comma = input[3].split(",");
        addRegister(comma[0]);
        result = "Push " + registers.get(comma[0]);
        result = result + ", " + add(new String[]{"", comma[0] + "," +  comma[1], "", comma[0]}) + ", " + store(new String[]{"", input[1], "", comma[0]});
        result = result + ", " + "Pop " + registers.get(comma[0]);
        return result;
    }

    private String lshift(String[] input) throws TooManyRegistersException {
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        addRegister(comma[1]);
        addRegister(input[3]);
        return "Compute LShift " + registers.get(comma[0]) + " " + registers.get(comma[1]) + " " + registers.get(input[3]);
    }

    private String lshiftI(String[] input) throws TooManyRegistersException {
        String result;
        addRegister(input[3]);
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        if (registers.size() < REGISTERS) {
            registers.put("register", registers.size());
            result = "Load (ImmValue " + comma[1] + ") " + registers.get("register") +
                    ", Compute LShift " + registers.get(comma[0]) + " " + registers.get("register") + " " + registers.get(input[3]);
            registers.remove("register");
        } else {
            int i = 1;
            ArrayList<String> keys = (new ArrayList<>(registers.keySet()));
            String register = keys.get(0);
            while(register.equals(input[3])) {
                register = keys.get(i);
                i++;
            }
            int registerNumber = registers.get(register);
            registers.remove(register);
            result = "Push " + registerNumber;
            registers.put("register", registerNumber);
            result = result + ", Load (ImmValue " + comma[1] + ") " + registers.get("register") +
                    ", Compute LShift " + registers.get(comma[0]) + " " + registers.get("register") + " " + registers.get(input[3]);
            registers.remove("register");
            registers.put(register, registerNumber);
            result = result + ", Pop " + registerNumber;
        }
        return result;
    }

    private String rshift(String[] input) throws TooManyRegistersException{
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        addRegister(comma[1]);
        addRegister(input[3]);
        return "Compute RShift " + registers.get(comma[0]) + " " + registers.get(comma[1]) + " " + registers.get(input[3]);
    }

    private String rshiftI(String[] input) throws TooManyRegistersException {
        String result;
        addRegister(input[3]);
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        if (registers.size() < REGISTERS) {
            registers.put("register", registers.size());
            result = "Load (ImmValue " + comma[1] + ") " + registers.get("register") +
                    ", Compute RShift " + registers.get(comma[0]) + " " + registers.get("register") + " " + registers.get(input[3]);
            registers.remove("register");
        } else {
            int i = 1;
            ArrayList<String> keys = (new ArrayList<>(registers.keySet()));
            String register = keys.get(0);
            while(register.equals(input[3])) {
                register = keys.get(i);
                i++;
            }
            int registerNumber = registers.get(register);
            registers.remove(register);
            result = "Push " + registerNumber;
            registers.put("register", registerNumber);
            result = result + ", Load (ImmValue " + comma[1] + ") " + registers.get("register") +
                    ", Compute RShift " + registers.get(comma[0]) + " " + registers.get("register") + " " + registers.get(input[3]);
            registers.remove("register");
            registers.put(register, registerNumber);
            result = result + ", Pop " + registerNumber;
        }
        return result;
    }

    private String or(String[] input) throws TooManyRegistersException {
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        addRegister(comma[1]);
        addRegister(input[3]);
        return "Compute Or " + registers.get(comma[0]) + " " + registers.get(comma[1]) + " " + registers.get(input[3]);
    }

    private String orI(String[] input) throws TooManyRegistersException {
        String result;
        addRegister(input[3]);
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        if (registers.size() < REGISTERS) {
            registers.put("register", registers.size());
            result = "Load (ImmValue " + comma[1] + ") " + registers.get("register") +
                    ", Compute Or " + registers.get(comma[0]) + " " + registers.get("register") + " " + registers.get(input[3]);
            registers.remove("register");
        } else {
            int i = 1;
            ArrayList<String> keys = (new ArrayList<>(registers.keySet()));
            String register = keys.get(0);
            while(register.equals(input[3])) {
                register = keys.get(i);
                i++;
            }
            int registerNumber = registers.get(register);
            registers.remove(register);
            result = "Push " + registerNumber;
            registers.put("register", registerNumber);
            result = result + ", Load (ImmValue " + comma[1] + ") " + registers.get("register") +
                    ", Compute Or " + registers.get(comma[0]) + " " + registers.get("register") + " " + registers.get(input[3]);
            registers.remove("register");
            registers.put(register, registerNumber);
            result = result + ", Pop " + registerNumber;
        }
        return result;
    }

    private String and(String[] input) throws TooManyRegistersException {
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        addRegister(comma[1]);
        addRegister(input[3]);
        return "Compute And " + registers.get(comma[0]) + " " + registers.get(comma[1]) + " " + registers.get(input[3]);
    }

    private String andI(String[] input) throws TooManyRegistersException {
        String result;
        addRegister(input[3]);
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        if (registers.size() < REGISTERS) {
            registers.put("register", registers.size());
            result = "Load (ImmValue " + comma[1] + ") " + registers.get("register") +
                    ", Compute And " + registers.get(comma[0]) + " " + registers.get("register") + " " + registers.get(input[3]);
            registers.remove("register");
        } else {
            int i = 1;
            ArrayList<String> keys = (new ArrayList<>(registers.keySet()));
            String register = keys.get(0);
            while(register.equals(input[3])) {
                register = keys.get(i);
                i++;
            }
            int registerNumber = registers.get(register);
            registers.remove(register);
            result = "Push " + registerNumber;
            registers.put("register", registerNumber);
            result = result + ", Load (ImmValue " + comma[1] + ") " + registers.get("register") +
                    ", Compute And " + registers.get(comma[0]) + " " + registers.get("register") + " " + registers.get(input[3]);
            registers.remove("register");
            registers.put(register, registerNumber);
            result = result + ", Pop " + registerNumber;
        }
        return result;
    }

    private String xor(String[] input) throws TooManyRegistersException {
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        addRegister(comma[1]);
        addRegister(input[3]);
        return "Compute Xor " + registers.get(comma[0]) + " " + registers.get(comma[1]) + " " + registers.get(input[3]);
    }

    private String xorI(String[] input) throws TooManyRegistersException {
        String result;
        addRegister(input[3]);
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        if (registers.size() < REGISTERS) {
            registers.put("register", registers.size());
            result = "Load (ImmValue " + comma[1] + ") " + registers.get("register") +
                    ", Compute Xor " + registers.get(comma[0]) + " " + registers.get("register") + " " + registers.get(input[3]);
            registers.remove("register");
        } else {
            int i = 1;
            ArrayList<String> keys = (new ArrayList<>(registers.keySet()));
            String register = keys.get(0);
            while(register.equals(input[3])) {
                register = keys.get(i);
                i++;
            }
            int registerNumber = registers.get(register);
            registers.remove(register);
            result = "Push " + registerNumber;
            registers.put("register", registerNumber);
            result = result + ", Load (ImmValue " + comma[1] + ") " + registers.get("register") +
                    ", Compute Xor " + registers.get(comma[0]) + " " + registers.get("register") + " " + registers.get(input[3]);
            registers.remove("register");
            registers.put(register, registerNumber);
            result = result + ", Pop " + registerNumber;
        }
        return result;
    }

    private String i2i(String[] input) throws TooManyRegistersException {
        addRegister(input[1]);
        addRegister(input[3]);
        return "Push " + input[1] + ", Pop " + input[3];
    }

    private String nop() throws  TooManyRegistersException {
        return "Nop";
    }

    private String jump(String[] input) throws TooManyRegistersException {
        addRegister(input[2]);
        return "Jump (Ind " + registers.get(input[2]) + ")";
    }

    private String jumpI(String[] input) throws TooManyRegistersException {
        return "Jump (Abs " + jumps.get(new Label(input[2])) + ")";
    }

    private String cbr(String[] input) throws TooManyRegistersException {
        String[] comma = input[3].split(",");
        addRegister(input[1]);
        return "Branch " + registers.get(input[1]) + "(Abs " + jumps.get(new Label(comma[1])) + ")";
    }

}
