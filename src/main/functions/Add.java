package main.functions;

import main.exceptions.InvalidVariableNameException;
import main.variables.Variable;

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
	 * @throws InvalidVariableNameException When given variable's name doesn't exist.
	 * @see InvalidVariableNameException
	 */
	public static void calculate(String firstVar, String secondVar) throws InvalidVariableNameException {
		Variable var1 = (Variable) Variable.xVariables.get(firstVar);
		Variable var2 = (Variable) Variable.xVariables.get(secondVar);

		if(var1 != null && var2 != null)
			Variable.xVariables.put(firstVar, new Variable(firstVar, (Integer) var1.getValue() + (Integer) var2.getValue()));
		else
			throw new InvalidVariableNameException();
	}

	/**
	 * It adds integer variable to numerical value.
	 *
	 * @param variable String - name of variable
	 * @param number int - numerical value
	 * @throws InvalidVariableNameException When given variable's name doesn't exist.
	 * @see InvalidVariableNameException
	 */
	public static void calculate(String variable, int number) throws InvalidVariableNameException {
		Variable var1 = (Variable) Variable.xVariables.get(variable);

		if(var1 != null)
			Variable.xVariables.put(variable, new Variable(variable, (Integer) var1.getValue() + number));
		else
			throw new InvalidVariableNameException();
	}
}
