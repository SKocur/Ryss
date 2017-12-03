package variables;

import java.util.HashMap;
import java.util.Map;

/**
 * <h1>XInteger</h1>
 * It is class for storing integer values.
 *
 * @author Szymon Kocur
 *
 */
public class XInteger {
	String name;
	int value;

	public static Map<String, XInteger> xIntegers = new HashMap<String, XInteger>();

	/**
	 * It is constructor which makes variable of integer type.
	 *
	 * @param name String - variable's name
	 * @param value int - variable's value
	 */
	public XInteger(String name, int value) {
		this.name = name;
		this.value = value;
	}

	/**
	 * It returns name of variable.
	 *
	 * @return name String - variable's name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * It returns value of variable.
	 *
	 * @return value int - variable's value
	 */
	public int getValue() {
		return this.value;
	}
}
