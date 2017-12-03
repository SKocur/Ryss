package functions;

import variables.XInteger;
import exceptions.InvalidVariableNameError;

/**
 * <h1>Add</h1>
 * This is class which contains methods for variables' values addition.
 *
 * @author Szymon Kocur
 *
 */
public class Add {

	/**
	 * It adds two integer variables.
	 *
	 * @param firstVar String - name of first variable
	 * @param secondVar String - name of second variable
	 * @throws InvalidVariableNameError When given variable's name doesn't exist.
	 * @see InvalidVariableNameError
	 */
	public static void calculate(String firstVar, String secondVar) throws InvalidVariableNameError {
		XInteger var1 = XInteger.xIntegers.get(firstVar);
		XInteger var2 = XInteger.xIntegers.get(secondVar);

		if(var1 != null && var2 != null)
			XInteger.xIntegers.put(firstVar, new XInteger(firstVar, var1.getValue() + var2.getValue()));
		else
			throw new InvalidVariableNameError();
	}

	/**
	 * It adds integer variable to numerical value.
	 *
	 * @param variable String - name of variable
	 * @param number int - numerical value
	 * @throws InvalidVariableNameError When given variable's name doesn't exist.
	 * @see InvalidVariableNameError
	 */
	public static void calculate(String variable, int number) throws InvalidVariableNameError {
		XInteger var1 = XInteger.xIntegers.get(variable);

		if(var1 != null)
			XInteger.xIntegers.put(variable, new XInteger(variable, var1.getValue() + number));
		else
			throw new InvalidVariableNameError();
	}
}
