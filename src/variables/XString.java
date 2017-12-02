package variables;

import java.util.HashMap;
import java.util.Map;

public class XString {
	String name;
	String value;

	public static Map<String, XString> xStrings = new HashMap<String, XString>();

	public XString(String name, String value){
		this.name = name;
		this.value = value;
	}

	public String getValue(){
		return this.value;
	}
}
