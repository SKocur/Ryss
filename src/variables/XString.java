package variables;

import java.util.HashMap;
import java.util.Map;

/**
 * <h1>XString</h1>
 * This is class for storing Strings values.
 *
 * @author Szymon Kocur
 *
 */
public class XString extends Variable {

	public static Map<String, XString> xStrings = new HashMap<String, XString>();

	/**
	 * It is constructor which makes variable of String type.
	 *
	 * @param name String - variable name
	 * @param value String - variable value
	 */
	public XString(String name, String value){
		super(name, value);
	}

	/**
	 * It returns name of variable.
	 *
	 * @return name String - variable name
	 */
	public String getName() {
		return super.name;
	}

	/**
	 * It returns value of variable.
	 *
	 * @return value String - variable value
	 */
	public String getValue(){
		return (String) super.value;
	}
}
