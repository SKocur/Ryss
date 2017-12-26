package functions;

import variables.XInteger;
import variables.XString;

import static variables.Variable.isValidVariableName;
import static variables.Variable.recognize;

/**
 * <h1>Init</h1>
 * This class initialize variables.
 *
 * @author Szymon Kocur
 *
 */
public class Init {

	/**
	 * It splits expression and then initialize variables by putting them to correct lists:
	 * <br>
	 * XString.xStrings - when variable is XString type
	 * <br>
	 * XInteger.xIntegers - when variable is XInteger type
	 *
	 * @param expression String - expression from .rx file
	 */
	public static void initializeVariable(String expression) {
		String[] variable = expression.split(" ", 3);
		if(isValidVariableName(variable[1])) {
			if(!isDuplicated(variable[1])){
				switch(recognize(variable[2])) {
					case XString:
						XString xString = new XString(variable[1], variable[2]);
						XString.xStrings.put(variable[1], xString);
						break;
					case XInteger:
						XInteger xInteger = new XInteger(variable[1], Integer.parseInt(variable[2]));
						XInteger.xIntegers.put(variable[1], xInteger);
						break;
				}
			} else {
				System.out.println("Duplicated variable name: " + variable[1]);
			    System.exit(1);
			}
		} else {
			System.out.println("Invalid variable name: " + variable[1]);
		    System.exit(1);
		}
	}

	/**
	 * Checks if variable is duplicated in the file.
	 *
	 * @param variableName Name of the variable
	 * @return boolean
	 */
	private static boolean isDuplicated(String variableName){
		Object ob1 = XString.xStrings.get(variableName);
		Object ob2 = XInteger.xIntegers.get(variableName);

		return ob1 != null && ob2 != null;
	}
}
