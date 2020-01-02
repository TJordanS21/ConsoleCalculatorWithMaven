package ch.bbw.tjs._ConsoleCalculatorWithMaven;

import static org.junit.Assert.assertTrue;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

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
	public void testSummeNullEinPositivIsOk() {
		assertTrue(testee.summe(0, 25) == 25);
	}

	@Test
	public void testSummeNullEinNegativIsOk() {
		assertTrue(testee.summe(0, -25) == -25);
	}

	@Test
	public void testSummeMaxAndMinIsOk() {
		assertTrue(testee.summe(Integer.MAX_VALUE, Integer.MIN_VALUE) == -1);
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

	@Test
	public void testVerzinsenIsOk() {
		assertTrue(testee.verzinsen(1200.0, 4.0, 5.0) == 1459.98);
	}

	// Test for private Methods
	@Test
	public void testEntzinsenIsOk() {
		try {
			Method privateStringMethod = Calculator.class.getDeclaredMethod("entzinsen", Double.class, Double.class,
					Double.class);
			privateStringMethod.setAccessible(true);
			double returnValue = (double) privateStringMethod.invoke(testee, 1459.98, 4.0, 5.0);
			System.out.println(returnValue);
			assertTrue(returnValue == 1200.0);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
