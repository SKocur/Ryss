package test.functions;

import org.junit.Test;

import main.functions.Init;
import main.variables.Variable;

import org.junit.Before;
import org.junit.After;

public class InitTest {

	private String expressionXString;
	private Variable xString;

	private String expressionXInteger;
	private Variable xInteger;

	@Before
	public void init() {
		expressionXString = "init firstVar \"Hello World\"";
		xString = new Variable("firstVar", "\"Hello World\"");

		expressionXInteger = "init secondVar 2";
		xInteger = new Variable("secondVar", 2);
	}

	@Test
	public void testInitializeVariableXString() {
		Init.initializeVariable(expressionXString);
		assert(((Variable) Variable.xVariables.get("firstVar")).getName().equals(xString.getName()));
		assert(((Variable) Variable.xVariables.get("firstVar")).getValue().equals(xString.getValue()));
	}

	@Test
	public void testInitializeVariableXInteger() {
		Init.initializeVariable(expressionXInteger);
		assert(((Variable) Variable.xVariables.get("secondVar")).getName().equals(xInteger.getName()));

		//TODO: Assertion error (something went wrong) :/
		assert(((Variable) Variable.xVariables.get("secondVar")).getValue() == (Integer) xInteger.getValue());
	}

	@Test
	public void testCreatedVariable() {
		Init.initializeVariable(expressionXString);
		Init.initializeVariable(expressionXInteger);
		assert(Init.isNameAvailable("firstVar") == false);
		assert(Init.isNameAvailable("secondVar") == false);
		assert(Init.isNameAvailable("thirdVar") == true);
	}

	@After
	public void destroy() {
		Variable.xVariables.clear();
	}
}
