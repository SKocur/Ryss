package variables;

import java.util.HashMap;
import java.util.Map;

/**
 * <h1>XInteger</h1>
 * It is class for storing integer values.
 *
 * @author Szymon Kocur
 * @see Variable
 */
public class XInteger extends Variable {

	public static Map<String, XInteger> xIntegers = new HashMap<String, XInteger>();

	/**
	 * It is constructor which makes variable of integer type.
	 *
	 * @param name String - variable name
	 * @param value int - variable value
	 */
	public XInteger(String name, int value) {
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
	 * @return value int - variable value
	 */
	public int getValue() {
		return (Integer) super.value;
	}
}
