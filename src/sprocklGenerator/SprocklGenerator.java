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

    private final int nrOfThreads;
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

    /**
     * Constructor
     * @param program The program
     */
    public SprocklGenerator(Program program, int nrOfThreads) {
        this.program = program;
        this.nrOfThreads = nrOfThreads;
    }

    /**
     * This function generates the sprockell code from the iloc code.
     * @param debug A boolean which determines whether the program runs with debugger.
     * @param prettyPrint A boolean which determines whether the program is printed with enters between the codes.
     * @return The generated sprockell code.
     * @throws UnsupportedInstructionException When there is an instruction not defined.
     * @throws TooManyRegistersException
     */
    public String generate(Boolean debug, Boolean prettyPrint) throws UnsupportedInstructionException, TooManyRegistersException {
        registers.put("reg0", 0);
        registers.put("regSprID", 1);
        /** Start of Haskell code. */
        String result = "import Sprockell \n" +
                "prog :: [Instruction] \n";

        /** Loops all the extra threads until they receive an instruction. */
        result = result + "prog = [Nop, Branch regSprID (Rel -1), ";

        /** Initialises the used variables. */
        extraSprockell = 2;
        List<Instr> todo = new ArrayList<>();

        /** Loops over every instruction. */
        for (Instr anInstr : program.getInstr()) {
            /** Splits at every whitespace. */
            String[] line = anInstr.toString().split(" ");
            /** If the instruction has a label this label gets added to the map with the line and the extra sprockell. */
            if (anInstr.hasLabel()) {
                jumps.put(anInstr.getLabel(), anInstr.getLine() + extraSprockell);
                String[] temp = new String[line.length - 1];
                /** Delete the label from the instruction. */
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

                /** The jumps are not possible to generate right now because not all the labels have been added to the map. */
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

                case "conload":
                    result = result + conLoad(line) + ", ";
                    break;

                case "conloadAI":
                    result = result + conLoadAI(line) + ", ";
                    break;

                case "conloadAO":
                    result = result + conLoadAO(line) + ", ";
                    break;

                case "constore":
                    result = result + conStore(line) + ", ";
                    break;

                case "constoreAI":
                    result = result + conStoreAI(line) + ", ";
                    break;

                case "constoreAO":
                    result = result + conStoreAO(line) + ", ";
                    break;

                case "fork":
                    result = result + fork(line) + ", ";
                    break;

                case "unfork":
                    result = result + unfork(line) + ", ";
                    break;

                case "join":
                    result = result + join(line) + ", ";
                    break;

                case "lock":
                    result = result + lock(line) + ", ";
                    break;

                case "unlock":
                    result = result + unlock(line) + ", ";
                    break;

                default:
                    throw new UnsupportedInstructionException(anInstr.toString());
            }
            if (prettyPrint) {
                result = result + "\n";
            }
        }

        /** Finishes the jumps. */
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

        /** Finishes the Haskell code. */
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
    //TODO runWithDebugger (debuggerSimplePrintAndWait myShow) [prog]

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
     * Because the syntax for adding a number to a register is not defined in Sprockell the function will save the number in register 7.
     * And add these 2 registers and store it.
     * @param input The String array containing the iloc code split at whitespaces : [addI, register1,number, =>, register2]
     * @return The Sprockell code
     * @throws TooManyRegistersException
     */
    private String addI(String[] input) throws TooManyRegistersException {
        addRegister(input[3]);
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        extraSprockell++;
        return "Load (ImmValue (" + comma[1] + ")) 7, Compute Add " + registers.get(comma[0]) + " 7 " + registers.get(input[3]);
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
     * Because the syntax for subtracting a number from a register is not defined in Sprockell the function will save the number in register 7.
     * And substract these 2 registers.
     * @param input The String array containing the iloc code split at whitespaces : [subI, register1,number, =>, register2]
     * @return The Sprockell code
     * @throws TooManyRegistersException
     */
    private String subI(String[] input) throws TooManyRegistersException {
        addRegister(input[3]);
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        extraSprockell++;
        return "Load (ImmValue (" + comma[1] + ")) 7, Compute Sub " + registers.get(comma[0]) + " 7 " + registers.get(input[3]);
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
     * Because the syntax for multiplying a number to a register is not defined in Sprockell the function will save the number in register 7.
     * And multiply these 2 registers.
     * @param input The String array containing the iloc code split at whitespaces : [multI, register1,number, =>, register2]
     * @return The Sprockell code
     * @throws TooManyRegistersException
     */
    private String multI(String[] input) throws TooManyRegistersException {
        addRegister(input[3]);
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        extraSprockell++;
        return "Load (ImmValue (" + comma[1] + ")) 7, Compute Mult " + registers.get(comma[0]) + " 7 " + registers.get(input[3]);
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
     * @param input The String array containing the iloc code split at whitespaces : [load, register1, =>, register2]
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
     * The offset needs to be stored somewhere, we decided to to that in the register containing the address. So the function firstly pushes that value.
     * After that it adds the offset to the address, saves it in the register, and loads the value from the calculated address.
     * When it is finished it pops the old value back and adds the extra lines of Sprockell.
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

    /**
     * Because there are 2 registers contained in input[1] the function firstly splits that string at ",".
     * After that it will try to assign a number to the first register (the other one in not necessary because that will happen in the helper function).
     * The offset needs to be stored somewhere, we decided to to that in the register containing the address. So the function firstly pushes that value.
     * After that it adds the offset to the address, saves it in the register, and loads the value from the calculated address.
     * When it is finished it pops the old value back and adds the extra lines of Sprockell.
     * @param input The String array containing the iloc code split at whitespaces : [loadAO, register,register, =>, register]
     * @return The Sprockell code.
     * @throws TooManyRegistersException
     */
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

    /**
     * The function will try to assign a number to the registers.
     * If that succeeds it will convert the input to Sprockell.
     * @param input The String array containing the iloc code split at whitespaces : [store, register1, =>, register2]
     * @return The Sprockell code "Store (IndAddr register1) register2"
     * @throws TooManyRegistersException
     */
    private String store(String[] input) throws TooManyRegistersException {
        addRegister(input[1]);
        addRegister(input[3]);
        return "Store " + registers.get(input[1]) + " (IndAddr " + registers.get(input[3]) + ")";
    }

    /**
     * Because there are 2 registers contained in input[1] the function firstly splits that string at ",".
     * After that it will try to assign a number to the first register (the other one in not necessary because that will happen in the helper function).
     * The offset needs to be stored somewhere, we decided to to that in the register containing the address. So the function firstly pushes that value.
     * After that it adds the offset to the address, saves it in the register, and stores the value at the calculated address.
     * When it is finished it pops the old value back and adds the extra lines of Sprockell.
     * @param input The String array containing the iloc code split at whitespaces : [storeAI, register, =>, register,number]
     * @return The Sprockell code.
     * @throws TooManyRegistersException
     */
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

    /**
     * Because there are 2 registers contained in input[1] the function firstly splits that string at ",".
     * After that it will try to assign a number to the first register (the other one in not necessary because that will happen in the helper function).
     * The offset needs to be stored somewhere, we decided to to that in the register containing the address. So the function firstly pushes that value.
     * After that it adds the offset to the address, saves it in the register, and stores the value at the calculated address.
     * When it is finished it pops the old value back and adds the extra lines of Sprockell.
     * @param input The String array containing the iloc code split at whitespaces : [storeAO, register, =>, register,register]
     * @return The Sprockell code.
     * @throws TooManyRegistersException
     */
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

    /**
     * Because there are 2 registers contained in input[1] the function firstly splits that string at ",".
     * The function will then try to assign a number to the registers.
     * If that succeeds it will convert the input to Sprockell.
     * @param input The String array containing the iloc code split at whitespaces : [lshift, register1,register2, =>, register3]
     * @return The Sprockell code "Compute LShift register1 register2 register3"
     * @throws TooManyRegistersException
     */
    private String lshift(String[] input) throws TooManyRegistersException {
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        addRegister(comma[1]);
        addRegister(input[3]);
        return "Compute LShift " + registers.get(comma[0]) + " " + registers.get(comma[1]) + " " + registers.get(input[3]);
    }

    /**
     * Because there are 2 registers contained in input[1] the function firstly splits that string at ",".
     * The function will then try to assign a number to the registers.
     * Because the syntax for shifting a number with a register is not defined in Sprockell the function will save the number in register 7.
     * And shift the 2 registers.
     * @param input The String array containing the iloc code split at whitespaces : [lshiftI, register1,number, =>, register2]
     * @return The Sprockell code
     * @throws TooManyRegistersException
     */
    private String lshiftI(String[] input) throws TooManyRegistersException {
        addRegister(input[3]);
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        extraSprockell++;
        return "Load (ImmValue (" + comma[1] + ")) 7, Compute LShift " + registers.get(comma[0]) + " 7 " + registers.get(input[3]);
    }

    /**
     * Because there are 2 registers contained in input[1] the function firstly splits that string at ",".
     * The function will then try to assign a number to the registers.
     * If that succeeds it will convert the input to Sprockell.
     * @param input The String array containing the iloc code split at whitespaces : [rshift, register1,register2, =>, register3]
     * @return The Sprockell code "Compute RShift register1 register2 register3"
     * @throws TooManyRegistersException
     */
    private String rshift(String[] input) throws TooManyRegistersException{
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        addRegister(comma[1]);
        addRegister(input[3]);
        return "Compute RShift " + registers.get(comma[0]) + " " + registers.get(comma[1]) + " " + registers.get(input[3]);
    }

    /**
     * Because there are 2 registers contained in input[1] the function firstly splits that string at ",".
     * The function will then try to assign a number to the registers.
     * Because the syntax for shifting a number from a register is not defined in Sprockell the function will save the number in register 7.
     * And shift the 2 registers.
     * When the function is finished it will add the extra lines sprockell compared to the iloc to the global counter.
     * @param input The String array containing the iloc code split at whitespaces : [rshiftI, register1,number, =>, register2]
     * @return The Sprockell code
     * @throws TooManyRegistersException
     */
    private String rshiftI(String[] input) throws TooManyRegistersException {
        addRegister(input[3]);
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        extraSprockell++;
        return "Load (ImmValue (" + comma[1] + ")) 7, Compute RShift " + registers.get(comma[0]) + " 7 " + registers.get(input[3]);
    }

    /**
     * Because there are 2 registers contained in input[1] the function firstly splits that string at ",".
     * The function will then try to assign a number to the registers.
     * If that succeeds it will convert the input to Sprockell.
     * @param input The String array containing the iloc code split at whitespaces : [or, register1,register2, =>, register3]
     * @return The Sprockell code "Compute Or register1 register2 register3"
     * @throws TooManyRegistersException
     */
    private String or(String[] input) throws TooManyRegistersException {
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        addRegister(comma[1]);
        addRegister(input[3]);
        return "Compute Or " + registers.get(comma[0]) + " " + registers.get(comma[1]) + " " + registers.get(input[3]);
    }

    /**
     * Because there are 2 registers contained in input[1] the function firstly splits that string at ",".
     * The function will then try to assign a number to the registers.
     * Because the syntax for computing or on a number and a register is not defined in Sprockell the function will save the number in register 7.
     * And compute the expression on the 2 registers.
     * @param input The String array containing the iloc code split at whitespaces : [orI, register1,number, =>, register2]
     * @return The Sprockell code
     * @throws TooManyRegistersException
     */
    private String orI(String[] input) throws TooManyRegistersException {
        addRegister(input[3]);
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        extraSprockell++;
        return "Load (ImmValue (" + comma[1] + ")) 7, Compute Or " + registers.get(comma[0]) + " 7 " + registers.get(input[3]);
    }

    /**
     * Because there are 2 registers contained in input[1] the function firstly splits that string at ",".
     * The function will then try to assign a number to the registers.
     * If that succeeds it will convert the input to Sprockell.
     * @param input The String array containing the iloc code split at whitespaces : [and, register1,register2, =>, register3]
     * @return The Sprockell code "Compute And register1 register2 register3"
     * @throws TooManyRegistersException
     */
    private String and(String[] input) throws TooManyRegistersException {
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        addRegister(comma[1]);
        addRegister(input[3]);
        return "Compute And " + registers.get(comma[0]) + " " + registers.get(comma[1]) + " " + registers.get(input[3]);
    }

    /**
     * Because there are 2 registers contained in input[1] the function firstly splits that string at ",".
     * The function will then try to assign a number to the registers.
     * Because the syntax for computing and on a number and a register is not defined in Sprockell the function will save the number in register 7.
     * And compute the expression.
     * @param input The String array containing the iloc code split at whitespaces : [andI, register1,number, =>, register2]
     * @return The Sprockell code
     * @throws TooManyRegistersException
     */
    private String andI(String[] input) throws TooManyRegistersException {
        addRegister(input[3]);
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        extraSprockell++;
        return "Load (ImmValue (" + comma[1] + ")) 7, Compute And " + registers.get(comma[0]) + " 7 " + registers.get(input[3]);
    }

    /**
     * Because there are 2 registers contained in input[1] the function firstly splits that string at ",".
     * The function will then try to assign a number to the registers.
     * If that succeeds it will convert the input to Sprockell.
     * @param input The String array containing the iloc code split at whitespaces : [xor, register1,register2, =>, register3]
     * @return The Sprockell code "Compute Xor register1 register2 register3"
     * @throws TooManyRegistersException
     */
    private String xor(String[] input) throws TooManyRegistersException {
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        addRegister(comma[1]);
        addRegister(input[3]);
        return "Compute Xor " + registers.get(comma[0]) + " " + registers.get(comma[1]) + " " + registers.get(input[3]);
    }

    /**
     * Because there are 2 registers contained in input[1] the function firstly splits that string at ",".
     * The function will then try to assign a number to the registers.
     * Because the syntax for computing xor on a number and a register is not defined in Sprockell the function will save the number in register 7.
     * And compute the expression.
     * @param input The String array containing the iloc code split at whitespaces : [xorI, register1,number, =>, register2]
     * @return The Sprockell code
     * @throws TooManyRegistersException
     */
    private String xorI(String[] input) throws TooManyRegistersException {
        addRegister(input[3]);
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        extraSprockell++;
        return "Load (ImmValue (" + comma[1] + ")) 7, Compute Xor " + registers.get(comma[0]) + " 7 " + registers.get(input[3]);
    }

    /**
     * To copy a value it is first pushed to the stack and then popped.
     * And add the extra lines of sprockell.
     * @param input The String array containing the iloc code split at whitespace : [i2i, register, =>, register]
     * @return The Sprockell Code.
     * @throws TooManyRegistersException
     */
    private String i2i(String[] input) throws TooManyRegistersException {
        addRegister(input[1]);
        addRegister(input[3]);
        extraSprockell++;
        return "Push " + input[1] + ", Pop " + input[3];
    }

    /**
     * Just Nop
     * @return Nop
     * @throws TooManyRegistersException
     */
    private String nop() throws  TooManyRegistersException {
        return "Nop";
    }

    /**
     * Tries to assign a number to the register.
     * If that succeeds it converts the iloc to sprockell.
     * @param input The String array containing the iloc code split at whitespace : [jump, ->, register]
     * @return The sprockell code "Jump (Ind register)"
     * @throws TooManyRegistersException
     */
    private String jump(String[] input) throws TooManyRegistersException {
        addRegister(input[2]);
        return "Jump (Ind " + registers.get(input[2]) + ")";
    }

    /**
     * Gets the line number to jump to from the global map jumps.
     * Convert the iloc to Sprockell code.
     * @param input The String array containing the iloc code split at whitespace : [jumpI, ->, label]
     * @return The sprockell code "Jump (Abs register)"
     * @throws TooManyRegistersException
     */
    private String jumpI(String[] input) throws TooManyRegistersException {
        return "Jump (Abs " + (jumps.get(new Label(input[2])) + 1) + ")";
    }

    /**
     * Checks the value stored in the register, based on that it will decide which line to jump to.
     * @param input The String array containing the iloc code split at whitespace : [cbr, register, =>, label,label]
     * @return The sprockell code.
     * @throws TooManyRegistersException
     */
    private String cbr(String[] input) throws TooManyRegistersException {
        String[] comma = input[3].split(",");
        addRegister(input[1]);
        String result = "Branch " + registers.get(input[1]) + "(Abs " + (jumps.get(new Label(comma[0]))) + "), ";
        result = result + "Jump (Abs " + (jumps.get(new Label(comma[1])) + 1) + ")";
        return result;
    }

    /**
     * The function will try to assign a number to the registers.
     * If that succeeds it will convert the input to Sprockell.
     * @param input The String array containing the iloc code split at whitespaces : [conload, register1, =>, register2]
     * @return The Sprockell code "ReadInstr (Ind register1), Receive register2"
     * @throws TooManyRegistersException
     */
    private String conLoad(String[] input) throws TooManyRegistersException {
        addRegister(input[1]);
        addRegister(input[3]);
        extraSprockell++;
        return  "ReadInstr (Ind " + registers.get(input[1]) + "), Receive " + registers.get(input[3]);
    }


    /**
     * Because there are 2 registers contained in input[1] the function firstly splits that string at ",".
     * After that it will try to assign a number to the first register (the other one in not necessary because that will happen in the helper function).
     * The offset needs to be stored somewhere, we decided to to that in the register containing the address. So the function firstly pushes that value.
     * After that it adds the offset to the address, saves it in the register, and loads the value from the calculated address.
     * When it is finished it pops the old value back and adds the extra lines of Sprockell.
     * @param input The String array containing the iloc code split at whitespaces : [conloadAI, register,number, =>, register]
     * @return The Sprockell code.
     * @throws TooManyRegistersException
     */
    private String conLoadAI(String[] input) throws TooManyRegistersException {
        String result;
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        result = "Push " + registers.get(comma[0]);
        result = result + ", " + addI(new String[]{"", comma[0] + "," + comma[1], "", comma[0]}) + ", " + conLoad(new String[]{"", comma[0], "", input[3]});
        result = result + ", " + "Pop " + registers.get(comma[0]);
        extraSprockell += 3;
        return result;
    }

    /**
     * Because there are 2 registers contained in input[1] the function firstly splits that string at ",".
     * After that it will try to assign a number to the first register (the other one in not necessary because that will happen in the helper function).
     * The offset needs to be stored somewhere, we decided to to that in the register containing the address. So the function firstly pushes that value.
     * After that it adds the offset to the address, saves it in the register, and loads the value from the calculated address.
     * When it is finished it pops the old value back and adds the extra lines of Sprockell.
     * @param input The String array containing the iloc code split at whitespaces : [conloadAO, register,register, =>, register]
     * @return The Sprockell code.
     * @throws TooManyRegistersException
     */
    private String conLoadAO(String[] input) throws TooManyRegistersException {
        String result;
        String[] comma = input[1].split(",");
        addRegister(comma[0]);
        result = "Push " + registers.get(comma[0]);
        result = result + ", " + add(new String[]{"", comma[0] + "," + comma[1], "", comma[0]}) + ", " + conLoad(new String[]{"", comma[0], "", input[3]});
        result = result + ", " + "Pop " + registers.get(comma[0]);
        extraSprockell += 3;
        return result;
    }

    /**
     * The function will try to assign a number to the registers.
     * If that succeeds it will convert the input to Sprockell.
     * @param input The String array containing the iloc code split at whitespaces : [constore, register1, =>, register2]
     * @return The Sprockell code "WriteInstr register1 (IndAddr register2)"
     * @throws TooManyRegistersException
     */
    private String conStore(String[] input) throws TooManyRegistersException {
        addRegister(input[1]);
        addRegister(input[3]);
        return "WriteInstr " + registers.get(input[1]) + " (IndAddr " + registers.get(input[3]) + ")";
    }

    /**
     * Because there are 2 registers contained in input[1] the function firstly splits that string at ",".
     * After that it will try to assign a number to the first register (the other one in not necessary because that will happen in the helper function).
     * The offset needs to be stored somewhere, we decided to to that in the register containing the address. So the function firstly pushes that value.
     * After that it adds the offset to the address, saves it in the register, and stores the value at the calculated address.
     * When it is finished it pops the old value back and adds the extra lines of Sprockell.
     * @param input The String array containing the iloc code split at whitespaces : [constoreAI, register, =>, register,number]
     * @return The Sprockell code.
     * @throws TooManyRegistersException
     */
    private String conStoreAI(String[] input) throws TooManyRegistersException {
        String result;
        String[] comma = input[3].split(",");
        addRegister(comma[0]);
        result = "Push " + registers.get(comma[0]);
        result = result + ", " + addI(new String[]{"", comma[0] + "," + comma[1], "", comma[0]}) + ", " + conStore(new String[]{"", input[1], "", comma[0]});
        result = result + ", " + "Pop " + registers.get(comma[0]);
        extraSprockell += 3;
        return result;
    }

    /**
     * Because there are 2 registers contained in input[1] the function firstly splits that string at ",".
     * After that it will try to assign a number to the first register (the other one in not necessary because that will happen in the helper function).
     * The offset needs to be stored somewhere, we decided to to that in the register containing the address. So the function firstly pushes that value.
     * After that it adds the offset to the address, saves it in the register, and stores the value at the calculated address.
     * When it is finished it pops the old value back and adds the extra lines of Sprockell.
     * @param input The String array containing the iloc code split at whitespaces : [constoreAO, register, =>, register,register]
     * @return The Sprockell code.
     * @throws TooManyRegistersException
     */
    private String conStoreAO(String[] input) throws TooManyRegistersException {
        String result;
        String[] comma = input[3].split(",");
        addRegister(comma[0]);
        result = "Push " + registers.get(comma[0]);
        result = result + ", " + add(new String[]{"", comma[0] + "," + comma[1], "", comma[0]}) + ", " + conStore(new String[]{"", input[1], "", comma[0]});
        result = result + ", " + "Pop " + registers.get(comma[0]);
        extraSprockell += 3;
        return result;
    }

    /**
     * Loads the the address of the label into register 7.
     * Overwrites the programcounter of the right thread to the right line.
     * @param input The iloc code split at whitespaces : [fork, integer, label]
     * @return The generated sprockell code.
     * @throws TooManyRegistersException
     */
    private String fork(String[] input) throws TooManyRegistersException {
        extraSprockell++;
        return "Load (ImmValue " + jumps.get(new Label(input[2])) + ") 7, WriteInstr 7 (DirAddr " + input[1];
    }

    /**
     * Overwrites the programcounter of the right thread to the start of the program.
     * @param input The iloc code split at whitespaces : [unfork, integer]
     * @return The generated sprockell code.
     * @throws TooManyRegistersException
     */
    private String unfork(String[] input) throws TooManyRegistersException {
        extraSprockell++;
        return "Load (ImmValue 1) 7, WriteInstr 7 (DirAddr " + input[1] + ")";
    }

    /**
     * Waits until the thread given is back at the beginning of the program.
     * @param input The iloc code split at whitespaces : [join, integer]
     * @return The generated sprockell code.
     * @throws TooManyRegistersException
     */
    private String join(String[] input) throws TooManyRegistersException {
        extraSprockell += 6;
        return "Push 3, ReadInstr " + input[1] +  ", Receive 3, Load (ImmValue 2) 7, Compare Lt 7, Branch 7 (Rel (2), Jump (Rel (-3))";
    }

    /**
     * Checks whether the value at the address is 0 and sets it to 1 if it succeeds.
     * Checks the result (which is 1 for failure) and branches on the result.
     * If it failed jump back 4 lines otherwise jump ahead 1 line.
     * @param input The iloc code split at whitespaces : [lock, integer]
     * @return The generated sprockell code.
     * @throws TooManyRegistersException
     */
    private String lock(String[] input) throws TooManyRegistersException {
        extraSprockell += 3;
        return "TestAndSet (DirAddr " + input[1] + "), Receive 7"
                + ", Branch 7 (Rel (2)), Jump (Rel (-4))";
    }

    /**
     * Loads 0 in register 7 and writes this to the address to unlock.
     * @param input The iloc code split at whitespaces : [unlock, integer]
     * @return The generated sprockell code.
     * @throws TooManyRegistersException
     */
    private String unlock(String[] input) throws TooManyRegistersException {
        extraSprockell++;
        return "Load (ImmValue 0) 7, WriteInstr 7 (DirAddr " + input[1] + ")";
    }

}
