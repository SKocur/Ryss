package variables;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import exceptions.InvalidVariableNameError;

/**
 * <h1>Variable</h1>
 * This class contains all methods for parsing variables from Interpreter.
 *
 * @author Szymon Kocur
 *
 */

public class Variable {

	/**
	 * It checks is variable name correct.
	 *
	 * @param name String - variable's name
	 * @return boolean
	 * @throws InvalidVariableNameError When variable's name is not correct.
	 * @see InvalidVariableNameError
	 */
	public static boolean isValidVariableName(String name) throws InvalidVariableNameError {
		Matcher m = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE).matcher(name);

		if(!m.find())
			return true;
		throw new InvalidVariableNameError();
	}

	/**
	 * It checks what is the type of variable.
	 *
	 * @param value String - variable's value
	 * @return Variables Type of variable
	 * @see Variables
	 */
	public static Variables recognize(String value) {
		if(isValidStringValue(value))
			return Variables.XString;
		else if(isValidIntegerValue(value))
			return Variables.XInteger;
		return null;
	}

	/**
	 * It checks if variable's text value is correct.
	 *
	 * @param text String - text
	 * @return boolean
	 */
	protected static boolean isValidStringValue(String text) {
		if((text.startsWith("\"") && text.endsWith("\"")) || (text.startsWith("\'") && text.endsWith("\'")))
			return true;
		return false;
	}

	/**
	 * It checks if variable's integer value is correct.
	 *
	 * @param text String - number
	 * @return boolean
	 */
	protected static boolean isValidIntegerValue(String text) {
		Object data = Integer.parseInt(text);
		if(data instanceof Integer)
			return true;
		return false;
	}
}
