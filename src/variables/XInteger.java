package variables;

import java.util.HashMap;
import java.util.Map;

public class XInteger {
	String name;
	int value;

	public static Map<String, XInteger> xIntegers = new HashMap<String, XInteger>();

	public XInteger(String name, int value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return this.name;
	}

	public int getValue() {
		return this.value;
	}
}
