import exceptions.TooManyRegistersException;
import exceptions.UnsupportedInstructionException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sprocklGenerator.SprocklGenerator;
import utils.iloc.model.*;

/**
 * Created by Reinier2 on 27-6-2017.
 */
public class SprockellTest {

    SprocklGenerator sprockell;
    Program program;

    private final static boolean DEBUG = false;
    private final static boolean PRETTYPRINT = true;
    private final static boolean EXTENDED = false;

    @Before
    public void before() {
        program = new Program();
        sprockell = new SprocklGenerator(program, 1);
    }

    /**
     * Tests the most simple function and more importantly tests whether the boiler code is correct.
     */
    @Test
    public void testNop() throws UnsupportedInstructionException, TooManyRegistersException {
        Op op = new Op(OpCode.nop);
        program.addInstr(op);
        Assert.assertTrue(sprockell.generate(DEBUG, EXTENDED, PRETTYPRINT).equals("import Sprockell \n" +
                "prog :: [Instruction] \n" +
                "prog = [Branch regSprID (Rel 2), Jump (Rel 6), ReadInstr (IndAddr regSprID), Receive regA, " +
                "Compute Equal regA reg0 regB, Branch regB (Rel (-3)), Jump (Ind regA), Nop, \n" +
                "EndProg]\n" +
                "main = run [prog]"));
    }

    /**
     * Tests whether the right register is chosen.
     * @throws UnsupportedInstructionException
     * @throws TooManyRegistersException
     */
    @Test
    public void testPop() throws UnsupportedInstructionException, TooManyRegistersException {
        program.addInstr(new Op(OpCode.pop, new Reg("r_1")));
        Assert.assertTrue(sprockell.generate(DEBUG, EXTENDED, PRETTYPRINT).equals("import Sprockell \n" +
                "prog :: [Instruction] \n" +
                "prog = [Branch regSprID (Rel 2), Jump (Rel 6), ReadInstr (IndAddr regSprID), Receive regA, " +
                "Compute Equal regA reg0 regB, Branch regB (Rel (-3)), Jump (Ind regA), Pop 2, \n" +
                "EndProg]\n" +
                "main = run [prog]"));
    }

    /**
     * Tests whether the right register is picked.
     * @throws UnsupportedInstructionException
     * @throws TooManyRegistersException
     */
    @Test
    public void testPush() throws UnsupportedInstructionException, TooManyRegistersException {
        program.addInstr(new Op(OpCode.push, new Reg("r_1")));
        Assert.assertTrue(sprockell.generate(DEBUG, EXTENDED, PRETTYPRINT).equals("import Sprockell \n" +
                "prog :: [Instruction] \n" +
                "prog = [Branch regSprID (Rel 2), Jump (Rel 6), ReadInstr (IndAddr regSprID), Receive regA, " +
                "Compute Equal regA reg0 regB, Branch regB (Rel (-3)), Jump (Ind regA), Push 2, \n" +
                "EndProg]\n" +
                "main = run [prog]"));
    }

    /**
     * To test if the right computation is called and the right registers are chosen.
     * @throws UnsupportedInstructionException
     * @throws TooManyRegistersException
     */
    @Test
    public void testAdd() throws UnsupportedInstructionException, TooManyRegistersException {
        program.addInstr(new Op(OpCode.add, new Reg("r_1"), new Reg("r_2"), new Reg("r_3")));
        Assert.assertTrue(sprockell.generate(DEBUG, EXTENDED, PRETTYPRINT).equals("import Sprockell \n" +
                "prog :: [Instruction] \n" +
                "prog = [Branch regSprID (Rel 2), Jump (Rel 6), ReadInstr (IndAddr regSprID), Receive regA, " +
                "Compute Equal regA reg0 regB, Branch regB (Rel (-3)), Jump (Ind regA), Compute Add 2 3 4, \n" +
                "EndProg]\n" +
                "main = run [prog]"));
    }

    /**
     * Looks to see if the perfect code gets generated.
     * @throws UnsupportedInstructionException
     * @throws TooManyRegistersException
     */
    @Test
    public void testAddI() throws  UnsupportedInstructionException, TooManyRegistersException {
        program.addInstr(new Op(OpCode.addI, new Reg("r_1"), new Num(5), new Reg("r_2")));
        Assert.assertTrue(sprockell.generate(DEBUG, EXTENDED, PRETTYPRINT).equals("import Sprockell \n" +
                "prog :: [Instruction] \n" +
                "prog = [Branch regSprID (Rel 2), Jump (Rel 6), ReadInstr (IndAddr regSprID), Receive regA, " +
                "Compute Equal regA reg0 regB, Branch regB (Rel (-3)), Jump (Ind regA), " +
                "Load (ImmValue (5)) 7, Compute Add 3 7 2, \n" +
                "EndProg]\n" +
                "main = run [prog]"));
    }

    /**
     * Checks whether the correct code generated.
     * @throws UnsupportedInstructionException
     * @throws TooManyRegistersException
     */
    @Test
    public void testStoreAI() throws  UnsupportedInstructionException, TooManyRegistersException {
        program.addInstr(new Op(OpCode.storeAI, new Reg("r_1"), new Reg("r_2"), new Num(4)));
        Assert.assertTrue(sprockell.generate(DEBUG, EXTENDED, PRETTYPRINT).equals("import Sprockell \n" +
                "prog :: [Instruction] \n" +
                "prog = [Branch regSprID (Rel 2), Jump (Rel 6), ReadInstr (IndAddr regSprID), Receive regA, " +
                "Compute Equal regA reg0 regB, Branch regB (Rel (-3)), Jump (Ind regA), Push 2, Load (ImmValue (4)) 7," +
                " Compute Add 2 7 2, Store 3 (IndAddr 2), Pop 2, \n" +
                "EndProg]\n" +
                "main = run [prog]"));
    }

    /**
     * Checks if the right exception gets thrown.
     * @throws UnsupportedInstructionException
     * @throws TooManyRegistersException
     */
    @Test(expected = UnsupportedInstructionException.class)
    public void testUnsupportedInstruction() throws UnsupportedInstructionException, TooManyRegistersException {
        program.addInstr(new Op(OpCode.c2i, new Reg("r_1"), new Reg("r_2")));
        String exceptions = sprockell.generate(DEBUG, EXTENDED, PRETTYPRINT);
    }

    /**
     * Tests whether the correct exception gets thrown.
     * @throws UnsupportedInstructionException
     * @throws TooManyRegistersException
     */
    @Test(expected = TooManyRegistersException.class)
    public void testTooManyRegister() throws  UnsupportedInstructionException, TooManyRegistersException {
        program.addInstr(new Op(OpCode.loadI, new Num(6), new Reg("r_1")));
        program.addInstr(new Op(OpCode.loadI, new Num(6), new Reg("r_2")));
        program.addInstr(new Op(OpCode.loadI, new Num(6), new Reg("r_3")));
        program.addInstr(new Op(OpCode.loadI, new Num(6), new Reg("r_4")));
        program.addInstr(new Op(OpCode.loadI, new Num(6), new Reg("r_5")));
        program.addInstr(new Op(OpCode.loadI, new Num(6), new Reg("r_6")));
        program.addInstr(new Op(OpCode.loadI, new Num(6), new Reg("r_7")));
        program.addInstr(new Op(OpCode.loadI, new Num(6), new Reg("r_8")));
        program.addInstr(new Op(OpCode.loadI, new Num(6), new Reg("r_9")));
        String exception = sprockell.generate(DEBUG, EXTENDED, PRETTYPRINT);
    }
}