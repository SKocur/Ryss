import interfaces.IInterpreter;
import java.util.*;
import functions.Log;
import exceptions.UnknownExpressionException;
import exceptions.InvalidVariableNameError;
import variables.XString;
import variables.Variable;
import variables.Variables;

public class Interpreter implements IInterpreter {


	public static Map<String, XString> xStrings = new HashMap<String, XString>();

	@Override
	public void scan(List<String> expressions) throws UnknownExpressionException {

		//TODO: Add more types of variables

		for(String expression : expressions){
			String function = expression.substring(0, expression.indexOf(' '));
			String functionParams = expression.substring(expression.indexOf(' ') + 1);

			switch(function){
				case "log":
					if(xStrings.get(functionParams) != null)
						Log.execute(xStrings.get(functionParams));
					else
						Log.execute(functionParams);
					break;
				case "init":
					String[] variable = expression.split(" ", 3);
					try {
						if(Variable.isValidVariableName(variable[1])){
							switch(Variable.recognize(variable[2])){
								case XString:
									XString xString = new XString(variable[1], variable[2]);
									xStrings.put(variable[1], xString);
									break;
								case XInteger:
									break;
							}
						}
					} catch(InvalidVariableNameError error){
						System.out.println("Invalid variable name: " + variable[1]);
						return;
					}
					break;
				default:
					throw new UnknownExpressionException();
			}
		}
	}
}
