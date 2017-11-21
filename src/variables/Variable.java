package variables;

public class Variable {
	public Variable(){

	}

	public static Variables recognize(String value){
		if(isValidStringValue(value))
			return Variables.XString;
		return Variables.XInteger;
	}

	private static boolean isValidStringValue(String text) {
		if((text.startsWith("\"") && text.endsWith("\"")) || (text.startsWith("\'") && text.endsWith("\'")))
			return true;
		return false;
	}
}
