package ch.bbw.tjs._ConsoleCalculatorWithMaven;

/***
 * 
 * @author Tyler Jordan Storz
 * @version 27.12.2019
 *
 */
public class Calculator {
	public int summe(int summand1, int summand2) {
		return summand1 + summand2;
	}

	public int subtraktion(int value1, int value2) {
		return value1 - value2;
	}

	public double division(int value1, int value2) {
		if (value2 == 0) {
			throw new ArithmeticException();
		}
		return value1 / value2;
	}

	public long round(double value1) {
		return Math.round(value1);
	}

	public double squareroot(int value1) {
		return Math.sqrt(value1);
	}
}
