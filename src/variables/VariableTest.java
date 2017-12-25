package variables;

import org.junit.Test;
import org.junit.Before;

public class VariableTest {

	Variable var;

	@Before
	public void init(){
		var = new Variable("var", "some text");
	}

	@Test
	public void testVariableNameConstructor(){
		assert(var.name.equals("var"));
	}

	@Test
	public void testVariableValueConstructor(){
		assert(var.value.equals("some text"));
	}

	@Test
	public void testVariableNameCorrect1() {
		assert(Variable.isValidVariableName("Bruh") == true);
	}

	@Test
	public void testVariableNameCorrect2() {
		assert(Variable.isValidVariableName("bruh2") == true);
	}

	@Test
	public void testVariableNameCorrect3() {
		assert(Variable.isValidVariableName("Bruh552") == true);
	}

	@Test
	public void testVariableNameWrong1() {
		assert(Variable.isValidVariableName("Bru+h") == false);
	}

	@Test
	public void testVariableNameWrong2() {
		assert(Variable.isValidVariableName("1Bruh") == false);
	}

	@Test
	public void testVariableNameWrong3() {
		assert(Variable.isValidVariableName("bru+h1") == false);
	}

	@Test
	public void testVariableNameWrong4() {
		assert(Variable.isValidVariableName("bruh$") == false);
	}

	@Test
	public void testVariableNameWrong5() {
		assert(Variable.isValidVariableName("Br5uh") == false);
	}

	@Test
	public void testVariableNameWrong6() {
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
	public void testStringCorrectValue1(){
		assert(Variable.isValidStringValue("\"lol pe\""));
	}

	@Test
	public void testStringCorrectValue2(){
		assert(Variable.isValidStringValue("\'lol pe\'"));
	}

	@Test
	public void testStringWrongValue1(){
		assert(Variable.isValidStringValue("\"lol pe\'") == false);
	}

	@Test
	public void testStringWrongValue2(){
		assert(Variable.isValidStringValue("\'lol pe\"") == false);
	}

	@Test
	public void testStringWrongValue3(){
		assert(Variable.isValidStringValue("lol pe\"") == false);
	}

	@Test
	public void testStringWrongValue4(){
		assert(Variable.isValidStringValue("\"lol pe") == false);
	}

	@Test
	public void testStringWrongValue5(){
		assert(Variable.isValidStringValue("\'lol pe") == false);
	}

	@Test
	public void testStringWrongValue6(){
		assert(Variable.isValidStringValue("lol pe\'") == false);
	}

	@Test
	public void testIntegerCorrectValue1(){
		assert(Variable.isValidIntegerValue("123"));
	}

	@Test
	public void testIntegerCorrectValue2(){
		assert(Variable.isValidIntegerValue("-123"));
	}
}
