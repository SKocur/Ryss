package test.functions;

import org.junit.Test;

import main.exceptions.InvalidVariableNameException;
import main.functions.Add;
import main.variables.Variable;

import org.junit.Before;
import org.junit.After;

public class AddTest {

	@Before
	public void init() {
		Variable xInteger = new Variable("firstVar", 1);
		Variable.xVariables.put(xInteger.getName(), xInteger);
		xInteger = new Variable("secondVar", -1);
		Variable.xVariables.put(xInteger.getName(), xInteger);
	}

	@Test
	public void testAddPositiveVariableToPositiveNumber(){
		Add add = new Add();

		try {
			add.calculate(((Variable) Variable.xVariables.get("firstVar")).getName(), 2);
		} catch (InvalidVariableNameException e) {
			System.out.println(e.toString());
		}

		assert((Integer) ((Variable) Variable.xVariables.get("firstVar")).getValue() == 3);
	}

	@Test
	public void testAddPositiveVariableToNegativeNumber(){
		Add add = new Add();

		try {
			add.calculate(((Variable) Variable.xVariables.get("firstVar")).getName(), -1);
		} catch (InvalidVariableNameException e) {
			System.out.println(e.toString());
		}

		assert((Integer) ((Variable) Variable.xVariables.get("firstVar")).getValue() == 0);
	}

	@Test
	public void testAddNegativeVariableToPositiveNumber(){
		Add add = new Add();

		try {
			add.calculate(((Variable) Variable.xVariables.get("secondVar")).getName(), 2);
		} catch (InvalidVariableNameException e) {
			System.out.println(e.toString());
		}

		assert((Integer) ((Variable) Variable.xVariables.get("secondVar")).getValue() == 1);
	}

	@Test
	public void testAddNegativeVariableToNegativeNumber(){
		Add add = new Add();

		try {
			add.calculate(((Variable) Variable.xVariables.get("secondVar")).getName(), -2);
		} catch (InvalidVariableNameException e) {
			System.out.println(e.toString());
		}

		assert((Integer) ((Variable) Variable.xVariables.get("secondVar")).getValue() == -3);
	}

	@Test
	public void testAddPositiveVariableToNegativeVariable(){
		Add add = new Add();

		try {
			add.calculate(((Variable) Variable.xVariables.get("firstVar")).getName(), ((Variable) Variable.xVariables.get("secondVar")).getName());
		} catch (InvalidVariableNameException e) {
			System.out.println(e.toString());
		}

		assert((Integer) ((Variable) Variable.xVariables.get("firstVar")).getValue() == 0);
	}

	@After
	public void destroy(){
		Variable.xVariables.clear();
	}
}
