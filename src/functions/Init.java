package functions;

import exceptions.InvalidVariableNameError;
import variables.Variable;
import variables.XString;

public class Init {
	public static void initializeVariable(String expression){
		String[] variable = expression.split(" ", 3);
		try {
			if(Variable.isValidVariableName(variable[1])){
				switch(Variable.recognize(variable[2])){
					case XString:
						XString xString = new XString(variable[1], variable[2]);
						XString.xStrings.put(variable[1], xString);
						break;
					case XInteger:
						break;
				}
			}
		} catch(InvalidVariableNameError error){
			System.out.println("Invalid variable name: " + variable[1]);
		    System.exit(1);
		}
	}
}
