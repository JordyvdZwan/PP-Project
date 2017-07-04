package sprocklGenerator;

import exceptions.TooManyRegistersException;
import exceptions.UnsupportedInstructionException;
import utils.iloc.model.Instr;
import utils.iloc.model.Label;
import utils.iloc.model.Program;
import utils.log.Log;
import utils.log.LogType;

import java.util.*;

public class SprocklGenerator {

    /** Maps the register names from iloc to their corresponding integers in Spril */
    private Map<String, Integer> registers = new LinkedHashMap<>();

    /** Maps the labels to their lines */
    private Map<Label, Integer> jumps = new HashMap<>();

    /** The amount of available registers in Spril*/
    private static final int REGISTERS = 6;

    /** The program to be converted */
    private Program program;

    /** The extra lines Sprockell compared to iloc*/
    private int extraSprockell;
    //TODO comments
    public SprocklGenerator(Program program) {
        this.program = program;
    }
    //TODO comments
    public String generate(Boolean debug, Boolean prettyPrint) throws UnsupportedInstructionException, TooManyRegistersException {
        String result = "import Sprockell \n" +
                "prog :: [Instruction] \n" +
                "prog = [";
        extraSprockell = 0;
        List<Instr> todo = new ArrayList<>();
        for (Instr anInstr : program.getInstr()) {
            String[] line = anInstr.toString().split(" ");
            if (anInstr.hasLabel()) {
                jumps.put(anInstr.getLabel(), anInstr.getLine() + extraSprockell);
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
                    todo.add(anInstr);
                    result = result + "TODO";
                    break;

                case "jumpI":
                    todo.add(anInstr);
                    result = result + "TODO";
                    break;

                case "cbr":
                    extraSprockell += 1;
                    todo.add(anInstr);
                    result = result + "TODO";
                    break;

                default:
                    throw new UnsupportedInstructionException(anInstr.toString());
            }
            if (prettyPrint) {
                result = result + "\n";
            }
        }
        for (Instr anInstr : todo) {
            String[] line = anInstr.toString().split(" ");
            switch(line[0]) {

                case "jump":
                    result = result.replaceFirst("TODO", jump(line) + ", ");
                    break;

                case "jumpI":
                    result = result.replaceFirst("TODO", jumpI(line) + ", ");
                    break;

                case "cbr":
                    result = result.replaceFirst("TODO", cbr(line) + ", ");
                    break;
            }
        }
        result = result + "EndProg ]";
        if (debug) {
            result = result + "\nmain = runWithDebugger (debuggerSimplePrint showLocalMem) [prog]\n\n" +
                    "showLocalMem :: DbgInput -> String\n" +
                    "showLocalMem ( _ , systemState ) = show $ localMem $ head $ sprStates systemState";
        } else {
            result = result + "\nmain = run [prog]";
        }
        return result;
    }

    /**
     * This function assigns a number to a register, which has a String name in iloc.
     * At first it checks whether the register has already an assigned number.
     * If this is not the case it checks whether there are unused registers.
     * This function will then assign a number to the register or throw an exception if there are no slots open.
     * @param register The function will try to assign a number to this register.
     * @throws TooManyRegistersException If all the registers are reserved already.
     */
    private void addRegister(String register) throws TooManyRegistersException {
        if (!registers.containsKey(register)) {
            if (registers.size() >= REGISTERS) {
                throw new TooManyRegistersException();
            } else {
            registers.put(register, registers.size());
            }
        }
    }

    /**
     * A function to assign a number to a register I wrote to piss of my project partner.
     * 22 is the amount of syllables of the song iene miene mutte.
     * @return The number assigned to a register
     */
    private int ieneMieneMutte() {
        int result = (int) (Math.random() * REGISTERS);
        for (int i = 0; i < 22; i++) {
            result = result < REGISTERS ? 0 : result + 1;
        }
        return result;
    }

    /**
     * The function will try to assign a number to the register.
     * If that succeeds it will convert the input to Sprockell.
     * @param input The String array containing the iloc code split at whitespaces : [pop, =>, register]
     * @return The Sprockell code "Pop register"
     * @throws TooManyRegistersException
     */
    private String pop(String[] input) throws TooManyRegistersException {
        addRegister(input[2]);
        return "Pop " + registers.get(input[2]);
        }

    /**
     * The function will try to assign a number to the register.
     * If that succeeds it will convert the input to Sprockell.
     * @param input The String array containing the iloc code split at whitespaces : [push, register]
     * @return The Sprockell code "Push register"
     * @throws TooManyRegistersException
     */
    private String push(String[] input) throws TooManyRegistersException {
        addRegister(input[1]);
        return "Push " + registers.get(input[1]);
    }

    /**
     * Because there are 2 registers contained in input[1] the function firstly splits that string at ",".
     * The function will then try to assign a number to the registers.
     * If that succeeds it will convert the input to Sprockell.
     * @param input The String array containing the iloc code split at whitespaces : [add, register1,register2, =>, register3]
     * @return The Sprockell code "Compute Add register1 register2 register3"
     * @throws TooManyRegistersException
     */
    private String add(String[] input) throws TooManyRegistersException {
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        addRegister(comma[1]);
        addRegister(input[3]);
        return "Compute Add " + registers.get(comma[0]) + " " + registers.get(comma[1]) + " " + registers.get(input[3]);
    }

    /**
     * Because there are 2 registers contained in input[1] the function firstly splits that string at ",".
     * The function will then try to assign a number to the registers.
     * Because the syntax for adding a number to a register is not defined in Sprockell the function will save the number in a register.
     * If there are enough registers it will write Sprockell code to put the number in a register and add those 2 registers.
     * Otherwise the function will choose a register not used in this line of iloc code and push that register to the stack.
     * It will then store the number in this register, add these 2 registers and pop the old value back to the register.
     * When the function is finished it will add the extra lines sprockell compared to the iloc to the global counter.
     * @param input The String array containing the iloc code split at whitespaces : [addI, register1,number, =>, register2]
     * @return The Sprockell code
     * @throws TooManyRegistersException
     */
    private String addI(String[] input) throws TooManyRegistersException {
        String result;
        addRegister(input[3]);
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        if (registers.size() < REGISTERS) {
            registers.put("register", registers.size());
            result = "Load (ImmValue (" + comma[1] + ")) " + registers.get("register") +
                    ", Compute Add " + registers.get(comma[0]) + " " + registers.get("register") + " " + registers.get(input[3]);
            registers.remove("register");
            extraSprockell += 1;
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
            result = result + ", Load (ImmValue (" + comma[1] + ")) " + registers.get("register") +
                    ", Compute Add " + registers.get(comma[0]) + " " + registers.get("register") + " " + registers.get(input[3]);
            registers.remove("register");
            registers.put(register, registerNumber);
            result = result + ", Pop " + registerNumber;
            extraSprockell += 3;
        }
        return result;
    }

    /**
     * Because there are 2 registers contained in input[1] the function firstly splits that string at ",".
     * The function will then try to assign a number to the registers.
     * If that succeeds it will convert the input to Sprockell.
     * @param input The String array containing the iloc code split at whitespaces : [sub, register1,register2, =>, register3]
     * @return The Sprockell code "Compute Sub register1 register2 register3"
     * @throws TooManyRegistersException
     */
    private String sub(String[] input) throws TooManyRegistersException {
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        addRegister(comma[1]);
        addRegister(input[3]);
        return "Compute Sub " + registers.get(comma[0]) + " " + registers.get(comma[1]) + " " + registers.get(input[3]);
    }

    /**
     * Because there are 2 registers contained in input[1] the function firstly splits that string at ",".
     * The function will then try to assign a number to the registers.
     * Because the syntax for subtracting a number from a register is not defined in Sprockell the function will save the number in a register.
     * If there are enough registers it will write Sprockell code to put the number in a register and subtract the numbers.
     * Otherwise the function will choose a register not used in this line of iloc code and push that register to the stack.
     * It will then store the number in this register, execute the subtraction and pop the old value back to the register.
     * When the function is finished it will add the extra lines sprockell compared to the iloc to the global counter.
     * @param input The String array containing the iloc code split at whitespaces : [subI, register1,number, =>, register2]
     * @return The Sprockell code
     * @throws TooManyRegistersException
     */
    private String subI(String[] input) throws TooManyRegistersException {
        String result;
        addRegister(input[3]);
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        if (registers.size() < REGISTERS) {
            registers.put("register", registers.size());
            result = "Load (ImmValue (" + comma[1] + ")) " + registers.get("register") +
                    ", Compute Sub " + registers.get(comma[0]) + " " + registers.get("register") + " " + registers.get(input[3]);
            registers.remove("register");
            extraSprockell += 1;
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
            result = result + ", Load (ImmValue (" + comma[1] + ")) " + registers.get("register") +
                    ", Compute Sub " + registers.get(comma[0]) + " " + registers.get("register") + " " + registers.get(input[3]);
            registers.remove("register");
            registers.put(register, registerNumber);
            result = result + ", Pop " + registerNumber;
            extraSprockell += 3;
        }
        return result;
    }

    /**
     * Because there are 2 registers contained in input[1] the function firstly splits that string at ",".
     * The function will then try to assign a number to the registers.
     * If that succeeds it will convert the input to Sprockell.
     * @param input The String array containing the iloc code split at whitespaces : [mult, register1,register2, =>, register3]
     * @return The Sprockell code "Compute Mult register1 register2 register3"
     * @throws TooManyRegistersException
     */
    private String mult(String[] input) throws TooManyRegistersException {
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        addRegister(comma[1]);
        addRegister(input[3]);
        return "Compute Mult " + registers.get(comma[0]) + " " + registers.get(comma[1]) + " " + registers.get(input[3]);
    }

    /**
     * Because there are 2 registers contained in input[1] the function firstly splits that string at ",".
     * The function will then try to assign a number to the registers.
     * Because the syntax for multiplying a number to a register is not defined in Sprockell the function will save the number in a register.
     * If there are enough registers it will write Sprockell code to put the number in a register and multiply those 2 registers.
     * Otherwise the function will choose a register not used in this line of iloc code and push that register to the stack.
     * It will then store the number in this register, multiply these 2 registers and pop the old value back to the register.
     * When the function is finished it will add the extra lines sprockell compared to the iloc to the global counter.
     * @param input The String array containing the iloc code split at whitespaces : [multI, register1,number, =>, register2]
     * @return The Sprockell code
     * @throws TooManyRegistersException
     */
    private String multI(String[] input) throws TooManyRegistersException {
        String result;
        addRegister(input[3]);
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        if (registers.size() < REGISTERS) {
            registers.put("register", registers.size());
            result = "Load (ImmValue (" + comma[1] + ")) " + registers.get("register") +
                    ", Compute Mult " + registers.get(comma[0]) + " " + registers.get("register") + " " + registers.get(input[3]);
            registers.remove("register");
            extraSprockell += 1;
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
            result = result + ", Load (ImmValue (" + comma[1] + ")) " + registers.get("register") +
                    ", Compute Mult " + registers.get(comma[0]) + " " + registers.get("register") + " " + registers.get(input[3]);
            registers.remove("register");
            registers.put(register, registerNumber);
            result = result + ", Pop " + registerNumber;
            extraSprockell += 3;
        }
        return result;
    }

    /**
     * Because there are 2 registers contained in input[1] the function firstly splits that string at ",".
     * The function will then try to assign a number to the registers.
     * If that succeeds it will convert the input to Sprockell.
     * @param input The String array containing the iloc code split at whitespaces : [cmp_EQ, register1,register2, =>, register3]
     * @return The Sprockell code "Compute Equal register1 register2 register3"
     * @throws TooManyRegistersException
     */
    private String equal(String[] input) throws TooManyRegistersException {
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        addRegister(comma[1]);
        addRegister(input[3]);
        return "Compute Equal " + registers.get(comma[0]) + " " + registers.get(comma[1]) + " " + registers.get(input[3]);
    }

    /**
     * Because there are 2 registers contained in input[1] the function firstly splits that string at ",".
     * The function will then try to assign a number to the registers.
     * If that succeeds it will convert the input to Sprockell.
     * @param input The String array containing the iloc code split at whitespaces : [cmp_NE, register1,register2, =>, register3]
     * @return The Sprockell code "Compute Neq register1 register2 register3"
     * @throws TooManyRegistersException
     */
    private String notEqual(String[] input) throws TooManyRegistersException {
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        addRegister(comma[1]);
        addRegister(input[3]);
        return "Compute Neq " + registers.get(comma[0]) + " " + registers.get(comma[1]) + " " + registers.get(input[3]);
    }

    /**
     * Because there are 2 registers contained in input[1] the function firstly splits that string at ",".
     * The function will then try to assign a number to the registers.
     * If that succeeds it will convert the input to Sprockell.
     * @param input The String array containing the iloc code split at whitespaces : [cmp_GT, register1,register2, =>, register3]
     * @return The Sprockell code "Compute Gt register1 register2 register3"
     * @throws TooManyRegistersException
     */
    private String greater(String[] input) throws TooManyRegistersException {
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        addRegister(comma[1]);
        addRegister(input[3]);
        return "Compute Gt " + registers.get(comma[0]) + " " + registers.get(comma[1]) + " " + registers.get(input[3]);
    }

    /**
     * Because there are 2 registers contained in input[1] the function firstly splits that string at ",".
     * The function will then try to assign a number to the registers.
     * If that succeeds it will convert the input to Sprockell.
     * @param input The String array containing the iloc code split at whitespaces : [cmp_LT, register1,register2, =>, register3]
     * @return The Sprockell code "Compute Lt register1 register2 register3"
     * @throws TooManyRegistersException
     */
    private String less(String[] input) throws TooManyRegistersException {
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        addRegister(comma[1]);
        addRegister(input[3]);
        return "Compute Lt " + registers.get(comma[0]) + " " + registers.get(comma[1]) + " " + registers.get(input[3]);
    }

    /**
     * Because there are 2 registers contained in input[1] the function firstly splits that string at ",".
     * The function will then try to assign a number to the registers.
     * If that succeeds it will convert the input to Sprockell.
     * @param input The String array containing the iloc code split at whitespaces : [cmp_GE, register1,register2, =>, register3]
     * @return The Sprockell code "Compute GtE register1 register2 register3"
     * @throws TooManyRegistersException
     */
    private String greaterEqual(String[] input) throws TooManyRegistersException {
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        addRegister(comma[1]);
        addRegister(input[3]);
        return "Compute GtE " + registers.get(comma[0]) + " " + registers.get(comma[1]) + " " + registers.get(input[3]);
    }

    /**
     * Because there are 2 registers contained in input[1] the function firstly splits that string at ",".
     * The function will then try to assign a number to the registers.
     * If that succeeds it will convert the input to Sprockell.
     * @param input The String array containing the iloc code split at whitespaces : [cmp_LE, register1,register2, =>, register3]
     * @return The Sprockell code "Compute LtE register1 register2 register3"
     * @throws TooManyRegistersException
     */
    private String lessEqual(String[] input) throws TooManyRegistersException {
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        addRegister(comma[1]);
        addRegister(input[3]);
        return "Compute LtE " + registers.get(comma[0]) + " " + registers.get(comma[1]) + " " + registers.get(input[3]);
    }

    /**
     * The function will try to assign a number to the registers.
     * If that succeeds it will convert the input to Sprockell.
     * @param input The String array containing the iloc code split at whitespaces : [load, register, =>, register]
     * @return The Sprockell code "Load (IndAddr register1) register2"
     * @throws TooManyRegistersException
     */
    private String load(String[] input) throws TooManyRegistersException {
        addRegister(input[1]);
        addRegister(input[3]);
        return  "Load (IndAddr " + registers.get(input[1]) + ") " + registers.get(input[3]);
    }

    /**
     * The function will try to assign a number to the register.
     * If that succeeds it will convert the input to Sprockell.
     * @param input The String array containing the iloc code split at whitespaces : [loadI, number, =>, register]
     * @return The Sprockell code "Load (ImmValue number) register"
     * @throws TooManyRegistersException
     */
    private String loadI(String[] input) throws TooManyRegistersException {
        addRegister(input[3]);
        return "Load (ImmValue (" + input[1] + ")) " + registers.get(input[3]);
    }

    /**
     * Because there are 2 registers contained in input[1] the function firstly splits that string at ",".
     * After that it will try to assign a number to the first register (the other one in not necessary because that will happen in the helper function).
     * //TODO comments
     * @param input The String array containing the iloc code split at whitespaces : [loadAI, register,number, =>, register]
     * @return The Sprockell code.
     * @throws TooManyRegistersException
     */
    private String loadAI(String[] input) throws TooManyRegistersException {
        String result;
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        result = "Push " + registers.get(comma[0]);
        result = result + ", " + addI(new String[]{"", comma[0] + "," + comma[1], "", comma[0]}) + ", " + load(new String[]{"", comma[0], "", input[3]});
        result = result + ", " + "Pop " + registers.get(comma[0]);
        extraSprockell += 3;
        return result;
    }
    //TODO comments
    private String loadAO(String[] input) throws TooManyRegistersException {
        String result;
        String[] comma = input[3].split(",");
        addRegister(comma[0]);
        result = "Push " + registers.get(comma[0]);
        result = result + ", " + add(new String[]{"", comma[0] + "," + comma[1], "", comma[0]}) + ", " + load(new String[]{"", input[1], "", comma[0]});
        result = result + ", " + "Pop " + registers.get(comma[0]);
        extraSprockell += 3;
        return result;
    }
    //TODO comments
    private String store(String[] input) throws TooManyRegistersException {
        addRegister(input[1]);
        addRegister(input[3]);
        return "Store " + registers.get(input[1]) + " (IndAddr " + registers.get(input[3]) + ")";
    }
    //TODO comments
    private String storeAI(String[] input) throws TooManyRegistersException {
        String result;
        String[] comma = input[3].split(",");
        addRegister(comma[0]);
        result = "Push " + registers.get(comma[0]);
        result = result + ", " + addI(new String[]{"", comma[0] + "," + comma[1], "", comma[0]}) + ", " + store(new String[]{"", input[1], "", comma[0]});
        result = result + ", " + "Pop " + registers.get(comma[0]);
        extraSprockell += 3;
        return result;
    }
    //TODO comments
    private String storeAO(String[] input) throws TooManyRegistersException {
        String result;
        String[] comma = input[3].split(",");
        addRegister(comma[0]);
        result = "Push " + registers.get(comma[0]);
        result = result + ", " + add(new String[]{"", comma[0] + "," +  comma[1], "", comma[0]}) + ", " + store(new String[]{"", input[1], "", comma[0]});
        result = result + ", " + "Pop " + registers.get(comma[0]);
        extraSprockell += 3;
        return result;
    }
    //TODO comments
    private String lshift(String[] input) throws TooManyRegistersException {
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        addRegister(comma[1]);
        addRegister(input[3]);
        return "Compute LShift " + registers.get(comma[0]) + " " + registers.get(comma[1]) + " " + registers.get(input[3]);
    }
    //TODO comments
    private String lshiftI(String[] input) throws TooManyRegistersException {
        String result;
        addRegister(input[3]);
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        if (registers.size() < REGISTERS) {
            registers.put("register", registers.size());
            result = "Load (ImmValue (" + comma[1] + ")) " + registers.get("register") +
                    ", Compute LShift " + registers.get(comma[0]) + " " + registers.get("register") + " " + registers.get(input[3]);
            registers.remove("register");
            extraSprockell += 1;
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
            result = result + ", Load (ImmValue (" + comma[1] + ")) " + registers.get("register") +
                    ", Compute LShift " + registers.get(comma[0]) + " " + registers.get("register") + " " + registers.get(input[3]);
            registers.remove("register");
            registers.put(register, registerNumber);
            result = result + ", Pop " + registerNumber;
            extraSprockell += 3;
        }
        return result;
    }
    //TODO comments
    private String rshift(String[] input) throws TooManyRegistersException{
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        addRegister(comma[1]);
        addRegister(input[3]);
        return "Compute RShift " + registers.get(comma[0]) + " " + registers.get(comma[1]) + " " + registers.get(input[3]);
    }
    //TODO comments
    private String rshiftI(String[] input) throws TooManyRegistersException {
        String result;
        addRegister(input[3]);
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        if (registers.size() < REGISTERS) {
            registers.put("register", registers.size());
            result = "Load (ImmValue (" + comma[1] + ")) " + registers.get("register") +
                    ", Compute RShift " + registers.get(comma[0]) + " " + registers.get("register") + " " + registers.get(input[3]);
            registers.remove("register");
            extraSprockell += 1;
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
            result = result + ", Load (ImmValue (" + comma[1] + ")) " + registers.get("register") +
                    ", Compute RShift " + registers.get(comma[0]) + " " + registers.get("register") + " " + registers.get(input[3]);
            registers.remove("register");
            registers.put(register, registerNumber);
            result = result + ", Pop " + registerNumber;
            extraSprockell += 3;
        }
        return result;
    }
    //TODO comments
    private String or(String[] input) throws TooManyRegistersException {
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        addRegister(comma[1]);
        addRegister(input[3]);
        return "Compute Or " + registers.get(comma[0]) + " " + registers.get(comma[1]) + " " + registers.get(input[3]);
    }
    //TODO comments
    private String orI(String[] input) throws TooManyRegistersException {
        String result;
        addRegister(input[3]);
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        if (registers.size() < REGISTERS) {
            registers.put("register", registers.size());
            result = "Load (ImmValue (" + comma[1] + ")) " + registers.get("register") +
                    ", Compute Or " + registers.get(comma[0]) + " " + registers.get("register") + " " + registers.get(input[3]);
            registers.remove("register");
            extraSprockell += 1;
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
            result = result + ", Load (ImmValue (" + comma[1] + ")) " + registers.get("register") +
                    ", Compute Or " + registers.get(comma[0]) + " " + registers.get("register") + " " + registers.get(input[3]);
            registers.remove("register");
            registers.put(register, registerNumber);
            result = result + ", Pop " + registerNumber;
            extraSprockell += 3;
        }
        return result;
    }
    //TODO comments
    private String and(String[] input) throws TooManyRegistersException {
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        addRegister(comma[1]);
        addRegister(input[3]);
        return "Compute And " + registers.get(comma[0]) + " " + registers.get(comma[1]) + " " + registers.get(input[3]);
    }
    //TODO comments
    private String andI(String[] input) throws TooManyRegistersException {
        String result;
        addRegister(input[3]);
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        if (registers.size() < REGISTERS) {
            registers.put("register", registers.size());
            result = "Load (ImmValue (" + comma[1] + ")) " + registers.get("register") +
                    ", Compute And " + registers.get(comma[0]) + " " + registers.get("register") + " " + registers.get(input[3]);
            registers.remove("register");
            extraSprockell += 1;
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
            result = result + ", Load (ImmValue (" + comma[1] + ")) " + registers.get("register") +
                    ", Compute And " + registers.get(comma[0]) + " " + registers.get("register") + " " + registers.get(input[3]);
            registers.remove("register");
            registers.put(register, registerNumber);
            result = result + ", Pop " + registerNumber;
            extraSprockell += 3;
        }
        return result;
    }
    //TODO comments
    private String xor(String[] input) throws TooManyRegistersException {
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        addRegister(comma[1]);
        addRegister(input[3]);
        return "Compute Xor " + registers.get(comma[0]) + " " + registers.get(comma[1]) + " " + registers.get(input[3]);
    }
    //TODO comments
    private String xorI(String[] input) throws TooManyRegistersException {
        String result;
        addRegister(input[3]);
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        if (registers.size() < REGISTERS) {
            registers.put("register", registers.size());
            result = "Load (ImmValue (" + comma[1] + ")) " + registers.get("register") +
                    ", Compute Xor " + registers.get(comma[0]) + " " + registers.get("register") + " " + registers.get(input[3]);
            registers.remove("register");
            extraSprockell += 1;
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
            result = result + ", Load (ImmValue (" + comma[1] + ")) " + registers.get("register") +
                    ", Compute Xor " + registers.get(comma[0]) + " " + registers.get("register") + " " + registers.get(input[3]);
            registers.remove("register");
            registers.put(register, registerNumber);
            result = result + ", Pop " + registerNumber;
            extraSprockell += 3;
        }
        return result;
    }
    //TODO comments
    private String i2i(String[] input) throws TooManyRegistersException {
        addRegister(input[1]);
        addRegister(input[3]);
        return "Push " + input[1] + ", Pop " + input[3];
    }
    //TODO comments
    private String nop() throws  TooManyRegistersException {
        return "Nop";
    }
    //TODO comments
    private String jump(String[] input) throws TooManyRegistersException {
        addRegister(input[2]);
        return "Jump (Ind " + registers.get(input[2]) + ")";
    }
    //TODO comments
    private String jumpI(String[] input) throws TooManyRegistersException {
        return "Jump (Abs " + (jumps.get(new Label(input[2])) + 1) + ")";
    }
    //TODO comments
    private String cbr(String[] input) throws TooManyRegistersException {
        String[] comma = input[3].split(",");
        addRegister(input[1]);
        String result = "Branch " + registers.get(input[1]) + "(Abs " + (jumps.get(new Label(comma[0]))) + "), ";
        result = result + "Jump (Abs " + (jumps.get(new Label(comma[1])) + 1) + ")";
        return result;
    }

}
