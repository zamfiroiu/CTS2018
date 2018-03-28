package teste;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CompanieFakeSpyTest.class, PersoanaTestFileFixture.class, PersoanaTests.class, Structura.class,
		TestExemplu.class, TestPersoanaWithDataFile.class })
public class AllTests {

}
