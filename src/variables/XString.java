package variables;

import java.util.HashMap;
import java.util.Map;

/**
 * <h1>XString</h1>
 * It is class for storing Strings values.
 *
 * @author Szymon Kocur
 *
 */
public class XString {
	String name;
	String value;

	public static Map<String, XString> xStrings = new HashMap<String, XString>();

	/**
	 * It is constructor which makes variable of String type.
	 *
	 * @param name String - variable's name
	 * @param value String - variable's value
	 */
	public XString(String name, String value){
		this.name = name;
		this.value = value;
	}

	/**
	 * It returns value of variable.
	 *
	 * @return value String - variable's value
	 */
	public String getValue(){
		return this.value;
	}
}
