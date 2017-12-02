package variables;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import exceptions.InvalidVariableNameError;

public class Variable {
	public static boolean isValidVariableName(String name) throws InvalidVariableNameError {
		Matcher m = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE).matcher(name);

		if(!m.find())
			return true;
		throw new InvalidVariableNameError();
	}

	public static Variables recognize(String value) {
		if(isValidStringValue(value))
			return Variables.XString;
		else if(isValidIntegerValue(value))
			return Variables.XInteger;
		return null;
	}

	protected static boolean isValidStringValue(String text) {
		if((text.startsWith("\"") && text.endsWith("\"")) || (text.startsWith("\'") && text.endsWith("\'")))
			return true;
		return false;
	}

	protected static boolean isValidIntegerValue(String text) {
		Object data = Integer.parseInt(text);
		if(data instanceof Integer)
			return true;
		return false;
	}
}
