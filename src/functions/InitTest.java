package functions;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import variables.XInteger;
import variables.XString;

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
	public void testInitializeVariable1() {
		Init.initializeVariable(expressionXString);
		assert(XString.xStrings.get("firstVar") instanceof XString);
	}

	@Test
	public void testInitializeVariable2() {
		Init.initializeVariable(expressionXString);
		assert(XString.xStrings.get("firstVar").getName().equals(xString.getName()));
	}

	@Test
	public void testInitializeVariable3() {
		Init.initializeVariable(expressionXString);
		assert(XString.xStrings.get("firstVar").getValue().equals(xString.getValue()));
	}

	@Test
	public void testInitializeVariable4() {
		Init.initializeVariable(expressionXInteger);
		assert(XInteger.xIntegers.get("secondVar") instanceof XInteger);
	}

	@Test
	public void testInitializeVariable5() {
		Init.initializeVariable(expressionXInteger);
		assert(XInteger.xIntegers.get("secondVar").getName().equals(xInteger.getName()));
	}

	@Test
	public void testInitializeVariable6() {
		Init.initializeVariable(expressionXInteger);
		assert(XInteger.xIntegers.get("secondVar").getValue() == xInteger.getValue());
	}

	@After
	public void destroy() {
		XString.xStrings.clear();
		XInteger.xIntegers.clear();
	}
}
