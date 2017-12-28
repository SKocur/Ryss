package main.functions;

import static main.variables.Variable.isValidIntegerValue;
import static main.variables.Variable.isValidStringValue;

/**
 * <h1>Log</h1>
 * Log class provides method which prints value to the console.
 *
 * @author Szymon Kocur
 *
 */
public class Log {

	/**
	 * It prints String or integer value to the console.
	 * This method checks is text value correct and then it prints the content out.
	 * If text starts and ends with ', execute will replace it with space.
	 * If text starts and ends with " (quotation mark), execute will print it in original form with "".
	 *
	 * @param text String - text to print
	 */
	public static void execute(String text) {
		if(isValidStringValue(text))
			System.out.println(text.replace("\'", ""));
		else if(isValidIntegerValue(text))
			System.out.println(Integer.parseInt(text));
	}
}
