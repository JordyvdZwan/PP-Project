import exceptions.TooManyRegistersException;
import exceptions.UnsupportedInstructionException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sprocklGenerator.SprocklGenerator;
import utils.iloc.model.Op;
import utils.iloc.model.OpCode;
import utils.iloc.model.Program;

/**
 * Created by Reinier2 on 27-6-2017.
 */
public class SprockellTest {

    SprocklGenerator sprockell;
    Program program;

    @Before
    void before() {
        program = new Program();
        sprockell = new SprocklGenerator(program);
    }

    @Test
    void testNop() {
        Op op = new Op(OpCode.nop);
        program.addInstr(op);
        try {
            Assert.assertTrue(sprockell.generate().equals("Nop"));
        } catch (UnsupportedInstructionException e) {
            e.printStackTrace();
        } catch (TooManyRegistersException e) {
            e.printStackTrace();
        }
    }
}
