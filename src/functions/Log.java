package functions;

import variables.XString;

public class Log {
	public static void execute(String text){
		try{
			if(isValid(text))
				System.out.println(text.replace("\'", ""));
		} catch(SyntaxError e){
			System.out.println("Syntax error: " + text);
		}
	}

	public static void execute(XString variable){
		try{
			if(isValid(variable.getValue()))
				System.out.println(variable.getValue().replace("\'", ""));
		} catch(SyntaxError e){
			System.out.println("Syntax error: " + variable.getValue());
		}
	}

	private static boolean isValid(String text) throws SyntaxError {
		if((text.startsWith("\"") && text.endsWith("\"")) || (text.startsWith("\'") && text.endsWith("\'")))
			return true;
		throw new SyntaxError("Syntax error: " + text);
	}
}
