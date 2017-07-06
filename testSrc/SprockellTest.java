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

    @Test
    public void testNop() throws UnsupportedInstructionException, TooManyRegistersException {
        Op op = new Op(OpCode.nop);
        program.addInstr(op);
        Assert.assertTrue(sprockell.generate(DEBUG, EXTENDED, PRETTYPRINT).equals("import Sprockell \n" +
                "prog :: [Instruction] \n" +
                "prog = [Nop, \nEndProg ]" +
                "\nmain = run [prog]"));
    }

    @Test
    public void testPop() throws UnsupportedInstructionException, TooManyRegistersException {
        program.addInstr(new Op(OpCode.pop, new Reg("r_1")));
        Assert.assertTrue(sprockell.generate(DEBUG, EXTENDED, PRETTYPRINT).equals("import Sprockell \n" +
                "prog :: [Instruction] \n" +
                "prog = [Pop 0, \nEndProg ]" +
                "\nmain = run [prog]"));
    }

    @Test
    public void testPush() throws UnsupportedInstructionException, TooManyRegistersException {
        program.addInstr(new Op(OpCode.push, new Reg("r_1")));
        Assert.assertTrue(sprockell.generate(DEBUG, EXTENDED, PRETTYPRINT).equals("import Sprockell \n" +
        "prog :: [Instruction] \n" +
                "prog = [Push 0, \nEndProg ]" +
                "\nmain = run [prog]"));
    }

    @Test
    public void testAdd() throws UnsupportedInstructionException, TooManyRegistersException {
        program.addInstr(new Op(OpCode.add, new Reg("r_1"), new Reg("r_2"), new Reg("r_3")));
        Assert.assertTrue(sprockell.generate(DEBUG, EXTENDED, PRETTYPRINT).equals("import Sprockell \n" +
                "prog :: [Instruction] \n" +
                "prog = [Compute Add 0 1 2, \nEndProg ]" +
                "\nmain = run [prog]"));
    }

    @Test
    public void testAddI() throws  UnsupportedInstructionException, TooManyRegistersException {
        program.addInstr(new Op(OpCode.addI, new Reg("r_1"), new Num(5), new Reg("r_2")));
        Assert.assertTrue(sprockell.generate(DEBUG, EXTENDED, PRETTYPRINT).equals("import Sprockell \n" +
                "prog :: [Instruction] \n" +
                "prog = [Load (ImmValue 5) 2, Compute Add 1 2 0, \nEndProg ]" +
                "\nmain = run [prog]"));
        program.addInstr(new Op(OpCode.loadI, new Num(6), new Reg("r_3")));
        program.addInstr(new Op(OpCode.loadI, new Num(6), new Reg("r_4")));
        program.addInstr(new Op(OpCode.loadI, new Num(6), new Reg("r_5")));
        program.addInstr(new Op(OpCode.loadI, new Num(6), new Reg("r_6")));
        program.addInstr(new Op(OpCode.addI, new Reg("r_1"), new Num(5), new Reg("r_3")));
        Assert.assertTrue(sprockell.generate(DEBUG, EXTENDED, PRETTYPRINT).equals("import Sprockell \n" +
                "prog :: [Instruction] \n" +
                "prog = [Load (ImmValue 5) 2, Compute Add 1 2 0, \n" +
                "Load (ImmValue 6) 2, \n" +
                "Load (ImmValue 6) 3, \n" +
                "Load (ImmValue 6) 4, \n" +
                "Load (ImmValue 6) 5, \n" +
                "Push 0, Load (ImmValue 5) 0, Compute Add 1 0 2, Pop 0, \nEndProg ]" +
                "\nmain = run [prog]"));
    }

    @Test
    public void testStoreAI() throws  UnsupportedInstructionException, TooManyRegistersException {
        program.addInstr(new Op(OpCode.storeAI, new Reg("r_1"), new Reg("r_2"), new Num(4)));
        Assert.assertTrue(sprockell.generate(DEBUG, EXTENDED, PRETTYPRINT).equals("import Sprockell \n" +
                "prog :: [Instruction] \n" +
                "prog = [Push 0, Load (ImmValue 4) 1, Compute Add 0 1 0, Store 1 (IndAddr 0), Pop 0, \nEndProg ]" +
                "\nmain = run [prog]"));
    }
}
