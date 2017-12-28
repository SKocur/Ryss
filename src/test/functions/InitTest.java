package test.functions;

import org.junit.Test;

import main.functions.Init;
import main.variables.XInteger;
import main.variables.XString;

import org.junit.Before;
import org.junit.After;

public class InitTest {

	private String expressionXString;
	private XString xString;

	private String expressionXInteger;
	private XInteger xInteger;

	@Before
	public void init() {
		expressionXString = "init firstVar \"Hello World\"";
		xString = new XString("firstVar", "\"Hello World\"");

		expressionXInteger = "init secondVar 2";
		xInteger = new XInteger("secondVar", 2);
	}

	@Test
	public void testInitializeVariableXString() {
		Init.initializeVariable(expressionXString);
		assert(XString.xStrings.get("firstVar") instanceof XString);
		assert(XString.xStrings.get("firstVar").getName().equals(xString.getName()));
		assert(XString.xStrings.get("firstVar").getValue().equals(xString.getValue()));
	}

	@Test
	public void testInitializeVariableXInteger() {
		Init.initializeVariable(expressionXInteger);
		assert(XInteger.xIntegers.get("secondVar") instanceof XInteger);
		assert(XInteger.xIntegers.get("secondVar").getName().equals(xInteger.getName()));
		assert(XInteger.xIntegers.get("secondVar").getValue() == xInteger.getValue());
	}

	@After
	public void destroy() {
		XString.xStrings.clear();
		XInteger.xIntegers.clear();
	}
}
