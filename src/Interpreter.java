import interfaces.IInterpreter;
import java.util.*;

import functions.Init;
import functions.Log;
import exceptions.UnknownExpressionException;
import variables.XString;

public class Interpreter implements IInterpreter {
	@Override
	public void scan(List<String> expressions) throws UnknownExpressionException {

		//TODO: Add more types of variables

		for(String expression : expressions){
			String function = expression.substring(0, expression.indexOf(' '));
			String functionParams = expression.substring(expression.indexOf(' ') + 1);

			switch(function){
				case "log":
					if(XString.xStrings.get(functionParams) != null)
						Log.execute(XString.xStrings.get(functionParams));
					else
						Log.execute(functionParams);
					break;
				case "init":
					Init.initializeVariable(expression);
					break;
				default:
					throw new UnknownExpressionException();
			}
		}
	}
}
