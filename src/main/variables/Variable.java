package main.variables;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.Map;

/**
 * <h1>Variable</h1>
 * This class contains all methods for parsing variables from Interpreter.
 *
 * @author Szymon Kocur
 *
 */

public class Variable {

	public static Map<String, Object> xVariables = new HashMap<String, Object>();

	protected String name;
	protected Object value;

	public Variable(String name, Object value){
		this.name = name;
		this.value = value;
	}

	/**
	 * It returns name of variable.
	 *
	 * @return name String - variable name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * It returns value of variable.
	 *
	 * @return value Object - variable value
	 */
	public Object getValue() {
		return this.value;
	}

	/**
	 * It checks if variable name is correct.
	 *
	 * @param name String - variable name
	 * @return boolean
	 */
	public static boolean isValidVariableName(String name) {
		//TODO: Repair regex (unit tests failed)
		Matcher m = Pattern.compile("[^a-z0-9]", Pattern.CASE_INSENSITIVE).matcher(name);

		return !m.find() && name.matches("^[a-zA-Z]\\w*$");
	}

	/**
	 * It checks if variable text value is correct.
	 *
	 * @param text String - text
	 * @return boolean
	 */
	public static boolean isValidStringValue(String text) {
		return (text.startsWith("\"") && text.endsWith("\"")) || (text.startsWith("\'") && text.endsWith("\'"));
	}

	/**
	 * It checks if variable integer value is correct.
	 *
	 * @param text String - number
	 * @return boolean
	 */
	public static boolean isValidIntegerValue(String text) {
		return (Object) Integer.parseInt(text) instanceof Integer;
	}
}
