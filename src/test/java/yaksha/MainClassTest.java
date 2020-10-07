package yaksha;

import static yaksha.TestUtils.businessTestFile;
import static yaksha.TestUtils.currentTest;
import static yaksha.TestUtils.yakshaAssert;
import org.junit.jupiter.api.Test;

class MainClassTest {
	
	@Test
	public void testExceptionConditon() throws Exception {

		TestUtils.yakshaAssert(TestUtils.currentTest(), true, TestUtils.boundaryTestFile);
	}

	@Test
	public void testBoundaryCondition() throws Exception {

		TestUtils.yakshaAssert(TestUtils.currentTest(), true, TestUtils.exceptionTestFile);
	}
	
	@Test
	void testValidatePAN() throws Exception {
		// Test will pass
		PanCard panCard1 = new PanCard("ALD3245E");
		yakshaAssert(currentTest(), (MainClass.validatePAN(panCard1).equals("valid") ? "true" : "false"),
				businessTestFile);
	}
}
