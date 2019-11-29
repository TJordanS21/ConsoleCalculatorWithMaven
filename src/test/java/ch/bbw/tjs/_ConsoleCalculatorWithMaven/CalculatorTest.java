package ch.bbw.tjs._ConsoleCalculatorWithMaven;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test Class for Class Calculator
 * 
 * @author Tyler Jordan Storz
 * @version 0.0.1
 */
public class CalculatorTest {
	Calculator testee;
	@Test
	public void testSummeZweiPositiveIsOk() {
		testee = new Calculator();
		assertTrue(testee.summe(10, 25) == 35);
	}

}
