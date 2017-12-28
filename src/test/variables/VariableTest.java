package test.variables;

import org.junit.Test;

import main.variables.Variable;
import main.variables.Variables;

public class VariableTest extends Variable {

	Variable var;

	public VariableTest() {
		super("var1", "some text");
	}

	@Test
	public void testVariableNameCorrect1() {
		assert(Variable.isValidVariableName("Bruh") == true);
		assert(Variable.isValidVariableName("bruh2") == true);
		assert(Variable.isValidVariableName("Bruh552") == true);
	}

	@Test
	public void testVariableNameWrong() {
		assert(Variable.isValidVariableName("Bru+h") == false);
		assert(Variable.isValidVariableName("1Bruh") == false);
		assert(Variable.isValidVariableName("bru+h1") == false);
		assert(Variable.isValidVariableName("bruh$") == false);
		assert(Variable.isValidVariableName("Br5uh") == false);
		assert(Variable.isValidVariableName("Br5uh8") == false);
	}

	@Test
	public void testRecognizeVariableTypeXString() {
		assert(Variable.recognize("\"bla bla\"") == Variables.XString);
	}

	@Test
	public void testRecognizeVariableTypeXInteger() {
		assert(Variable.recognize("123") == Variables.XInteger);
	}

	@Test
	public void testStringCorrectValue(){
		assert(Variable.isValidStringValue("\"lol pe\""));
		assert(Variable.isValidStringValue("\'lol pe\'"));
	}

	@Test
	public void testStringWrongValue(){
		assert(Variable.isValidStringValue("\"lol pe\'") == false);
		assert(Variable.isValidStringValue("\'lol pe\"") == false);
		assert(Variable.isValidStringValue("lol pe\"") == false);
		assert(Variable.isValidStringValue("\"lol pe") == false);
		assert(Variable.isValidStringValue("\'lol pe") == false);
		assert(Variable.isValidStringValue("lol pe\'") == false);
	}

	@Test
	public void testIntegerCorrectValue(){
		assert(Variable.isValidIntegerValue("123"));
		assert(Variable.isValidIntegerValue("-123"));
	}
}
