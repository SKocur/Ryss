package functions;

import variables.XInteger;
import exceptions.InvalidVariableNameError;

public class Add {
	public static void calculate(String firstVar, String secondVar) throws InvalidVariableNameError {
		XInteger var1 = XInteger.xIntegers.get(firstVar);
		XInteger var2 = XInteger.xIntegers.get(secondVar);

		if(var1 != null && var2 != null)
			XInteger.xIntegers.put(firstVar, new XInteger(firstVar, var1.getValue() + var2.getValue()));
		else
			throw new InvalidVariableNameError();
	}

	public static void calculate(String variable, int number) throws InvalidVariableNameError {
		XInteger var1 = XInteger.xIntegers.get(variable);

		if(var1 != null)
			XInteger.xIntegers.put(variable, new XInteger(variable, var1.getValue() + number));
		else
			throw new InvalidVariableNameError();
	}
}
