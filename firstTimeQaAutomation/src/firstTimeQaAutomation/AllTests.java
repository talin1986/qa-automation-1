package firstTimeQaAutomation;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CompatabilityTests.class, ErrorHandlingTests.class, FunctionalityTests.class })
public class AllTests {

}
