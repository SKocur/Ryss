package functions;

public class Log {

	//TODO: Overload execute(XString variable)

	public static void execute(String text){
		try{
			if(isValid(text))
				System.out.println(text.replace("\'", ""));
		} catch(SyntaxError e){
			System.out.println("Syntax error: " + text);
		}
	}

	private static boolean isValid(String text) throws SyntaxError {
		if((text.startsWith("\"") && text.endsWith("\"")) || (text.startsWith("\'") && text.endsWith("\'")))
			return true;
		throw new SyntaxError("Syntax error: " + text);
	}
}
