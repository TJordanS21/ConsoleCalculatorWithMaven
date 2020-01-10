package ch.bbw.tjs._ConsoleCalculatorWithMaven;

/***
 * 
 * @author Tyler Jordan Storz
 * @version 10.01.2020
 *
 */
public class Calculator {
	public int summe(int summand1, int summand2) {
		return summand1 + summand2;
	}

	public int subtraktion(int value1, int subtraktor) {
		return value1 - subtraktor;
	}

	public double division(int value1, int divider) {
		if (divider == 0) {
			throw new ArithmeticException();
		}
		return value1 / divider;
	}

	public long round(double value1) {
		return Math.round(value1);
	}

	protected double squareroot(int value1) {
		return Math.sqrt(value1);
	}

	double verzinsen(double startValue, double zinsRate, double years) {
		if(zinsRate >= 15.0) {
			throw new WucherzinsException("Ihre Zinsrate " + Double.toString(zinsRate)+ " is too high. Max is 14.9%.");
		}
		return Math.round(100 * startValue * Math.pow((1.0 + zinsRate / 100.0), years)) / 100.0;
	}

	private double entzinsen(Double endValue, Double zinsRate, Double years) {
		return Math.round(100 * endValue / Math.pow((1.0 + zinsRate / 100.0), years)) / 100.0;
	}

}
