import interfaces.IInterpreter;
import java.util.*;
import javax.swing.JOptionPane;

import functions.Init;
import functions.Log;
import exceptions.UnknownExpressionException;
import variables.XString;

public class Interpreter implements IInterpreter {
	@Override
	public void scan(List<String> expressions) throws UnknownExpressionException {

		for(String expression : expressions){
			if(!expression.startsWith("//") && !expression.isEmpty()){
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
