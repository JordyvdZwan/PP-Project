import checkerTests.Stage1Test;
import checkerTests.Stage2Test;
import numberTests.NumberTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by Jordy van der Zwan on 07-Jul-17.
 *
 * Junit suite to execute all test classes.
 */

@RunWith(Suite.class)

@Suite.SuiteClasses({
        ParsingTest.class,
        Stage1Test.class,
        Stage2Test.class,
        SprockellTest.class,
        RunTest.class,
        NumberTest.class
})

public class MainTestSuite {

}
