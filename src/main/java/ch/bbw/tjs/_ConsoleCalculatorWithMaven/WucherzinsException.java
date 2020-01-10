package ch.bbw.tjs._ConsoleCalculatorWithMaven;

/***
 * 
 * @author Tyler Jordan Storz
 * @version 10.01.2020
 * This Exception was made for an Error where the zins rate is too high.
 */
public class WucherzinsException extends RuntimeException {
	private static final long serialVersionUID = -6456952796825385283L;
	
	public WucherzinsException() {
		super("Zu hoher Zins");
	}
	public WucherzinsException(String fehlermeldung) {
		super(fehlermeldung);
	}
}
