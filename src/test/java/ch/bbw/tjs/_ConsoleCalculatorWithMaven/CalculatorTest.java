package ch.bbw.tjs._ConsoleCalculatorWithMaven;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Test Class for Class Calculator
 * 
 * @author Tyler Jordan Storz
 * @version 0.0.1
 */
public class CalculatorTest {
	Calculator testee;

	@Before
	public void setup() {
		testee = new Calculator();
	}

	@Test
	public void testSummeZweiPositiveIsOk() {
		assertTrue(testee.summe(10, 25) == 35);
	}

	@Test
	public void testSummeZweiNegativIsOk() {
		assertTrue(testee.summe(-10, -25) == -35);
	}

	@Test
	public void testSummeEinNegativEinPositivIsOk() {
		assertTrue(testee.summe(-10, 25) == 15);
	}

	@Test
	public void testSubtractionZweiPositiveIsOk() {
		assertTrue(testee.subtraktion(25, 10) == 15);
	}

	@Test
	public void testSubtractionZweiNegativIsOk() {
		assertTrue(testee.subtraktion(-25, -10) == -15);
	}

	@Test
	public void testSubtractionEinNegativEinPositivIsOk() {
		assertTrue(testee.subtraktion(-25, 10) == -35);
	}

	@Test(expected = ArithmeticException.class)
	public void testDivisonThroughZeroGivesException() {
		testee.division(4, 0);
	}

	@Test
	public void testDivisonZweiPositivIsOk() throws ArithmeticException {
		testee.division(6, 2);
	}

	@Test
	public void testSquarerootIsOk() {
		assertTrue(testee.squareroot(4) == 2);
	}

	@Test
	public void testRoundIsOk() {
		assertTrue(testee.round(33.234) == 33);
	}
}
