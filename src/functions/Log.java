package functions;

import variables.Variable;

public class Log extends Variable {
	public static void execute(String text) {
		if(isValidStringValue(text))
			System.out.println(text.replace("\'", ""));
		else if(isValidIntegerValue(text))
			System.out.println(Integer.parseInt(text));
	}
}
