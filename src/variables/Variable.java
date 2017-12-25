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

	protected String name;
	protected Object value;

	protected Variable(String name, Object value){
		this.name = name;
		this.value = value;
	}

	/**
	 * It checks is variable name correct.
	 *
	 * @param name String - variable name
	 * @return boolean
	 */
	public static boolean isValidVariableName(String name) {

		//TODO: Repair regex (unit tests failed)

		Matcher m = Pattern.compile("[^a-z0-9]", Pattern.CASE_INSENSITIVE).matcher(name);

		if(!m.find() && name.matches("^[a-zA-Z]\\w*$"))
			return true;
		return false;
	}

	/**
	 * It checks what is the type of variable.
	 *
	 * @param value String - variable value
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
	 * It checks if variable text value is correct.
	 *
	 * @param text String - text
	 * @return boolean
	 */
	public static boolean isValidStringValue(String text) {
		if((text.startsWith("\"") && text.endsWith("\"")) || (text.startsWith("\'") && text.endsWith("\'")))
			return true;
		return false;
	}

	/**
	 * It checks if variable integer value is correct.
	 *
	 * @param text String - number
	 * @return boolean
	 */
	public static boolean isValidIntegerValue(String text) {
		Object data = Integer.parseInt(text);
		if(data instanceof Integer)
			return true;
		return false;
	}
}
