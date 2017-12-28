package main.functions;

import static main.variables.Variable.isValidVariableName;

import main.variables.Variable;

/**
 * <h1>Init</h1>
 * This class initialize variables.
 *
 * @author Szymon Kocur
 *
 */
public class Init {

	/**
	 * It splits expression and then initialize variable by putting it to the list.
	 *
	 * @param expression String - expression from .rx file
	 */
	public static void initializeVariable(String expression) {
		String[] variable = expression.split(" ", 3);
		if(isValidVariableName(variable[1])) {
			if(isNameAvailable(variable[1])){
				Variable xVariable = new Variable(variable[1], variable[2]);
				Variable.xVariables.put(variable[1], xVariable);
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
	 * Checks if variable name is duplicated in the file.
	 *
	 * @param variableName Name of the variable
	 * @return boolean
	 */
	public static boolean isNameAvailable(String variableName){
		return Variable.xVariables.get(variableName) == null;
	}
}
