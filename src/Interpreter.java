import interfaces.IInterpreter;
import java.util.*;
import javax.swing.JOptionPane;

import functions.Add;
import functions.Init;
import functions.Log;
import exceptions.InvalidVariableNameError;
import exceptions.UnknownExpressionException;
import variables.XInteger;
import variables.XString;

/**
 * <h1>Interpreter</h1>
 * This is class where all magic take place.
 *
 * @author Szymon Kocur
 */

public class Interpreter implements IInterpreter {

	/**
	 * This is method which analyze .rx file for known expressions and then execute them.
	 *
	 * @param expressions It is list of expressions from the file.
	 * @throws UnknownExpressionException When scanner can't recognize expression.
	 * @see UnknownExpressionException
	 */
	@Override
	public void scan(List<String> expressions) throws UnknownExpressionException {
		for(String expression : expressions) {
			if(!expression.startsWith("//") && !expression.isEmpty()) {
				String function = expression.substring(0, expression.indexOf(' '));
				String functionParams = expression.substring(expression.indexOf(' ') + 1);

				switch(function) {
					case "log":
						if(XString.xStrings.get(functionParams) != null)
							Log.execute(XString.xStrings.get(functionParams).getValue());
						else if(XInteger.xIntegers.get(functionParams) != null)
							Log.execute("" + XInteger.xIntegers.get(functionParams).getValue());
						else
							Log.execute(functionParams);
						break;
					case "init":
						Init.initializeVariable(expression);
						break;
					case "add":
						try {
							String[] variables = expression.split(" ", 3);
							String var1 = XInteger.xIntegers.get(variables[1]).getName();
							if(XInteger.xIntegers.get(variables[2]) != null)
								Add.calculate(var1, XInteger.xIntegers.get(variables[2]).getName());
							else
								Add.calculate(var1, Integer.parseInt(variables[2]));
						} catch (InvalidVariableNameError error){
							System.out.println(error.toString());
						}
						break;
					case "MsgBox":
						JOptionPane.showMessageDialog(null, functionParams);
						break;
					default:
						throw new UnknownExpressionException();
				}
			}
		}
	}
}
