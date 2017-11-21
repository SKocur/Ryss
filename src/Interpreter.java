import interfaces.IInterpreter;
import java.util.*;
import functions.Log;
import exceptions.UnknownExpressionException;
import variables.XString;
import variables.Variable;
import variables.Variables;

public class Interpreter implements IInterpreter {
	public void scan(List<String> expressions) throws UnknownExpressionException {

		//TODO: Add more types of variables

		Map<String, XString> xStrings = new HashMap<String, XString>();

		for(String expression : expressions){

			String function = expression.substring(0, expression.indexOf(' '));
			String functionParams = expression.substring(expression.indexOf(' ') + 1);

			switch(function){
				case "log":
					Log.execute(functionParams);
					break;
				case "init":
					String[] variable = expression.split(" ");
					switch(Variable.recognize(functionParams)){
						case XString:
							XString xString = new XString(variable[1], variable[2]);
							xStrings.put(variable[1], xString);
							break;
						case XInteger:
							break;
					}
				default:
					throw new UnknownExpressionException();
			}
		}
	}
}
