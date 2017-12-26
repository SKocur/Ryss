<<<<<<< HEAD
package functions;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import variables.XInteger;
import exceptions.InvalidVariableNameError;

public class AddTest {

	@Before
	public void init() {
		XInteger xInteger = new XInteger("firstVar", 1);
		XInteger.xIntegers.put(xInteger.getName(), xInteger);
		xInteger = new XInteger("secondVar", -1);
		XInteger.xIntegers.put(xInteger.getName(), xInteger);
	}

	@Test
	public void testAddPositiveVariableToPositiveNumber(){
		Add add = new Add();

		try{
			add.calculate(XInteger.xIntegers.get("firstVar").getName(), 2);
		} catch(InvalidVariableNameError e){
			System.out.println(e.toString());
		}

		assert(XInteger.xIntegers.get("firstVar").getValue() == 3);
	}

	@Test
	public void testAddPositiveVariableToNegativeNumber(){
		Add add = new Add();

		try{
			add.calculate(XInteger.xIntegers.get("firstVar").getName(), -1);
		} catch(InvalidVariableNameError e){
			System.out.println(e.toString());
		}

		assert(XInteger.xIntegers.get("firstVar").getValue() == 0);
	}

	@Test
	public void testAddNegativeVariableToPositiveNumber(){
		Add add = new Add();

		try{
			add.calculate(XInteger.xIntegers.get("secondVar").getName(), 2);
		} catch(InvalidVariableNameError e){
			System.out.println(e.toString());
		}

		assert(XInteger.xIntegers.get("secondVar").getValue() == 1);
	}

	@Test
	public void testAddNegativeVariableToNegativeNumber(){
		Add add = new Add();

		try{
			add.calculate(XInteger.xIntegers.get("secondVar").getName(), -2);
		} catch(InvalidVariableNameError e){
			System.out.println(e.toString());
		}

		assert(XInteger.xIntegers.get("secondVar").getValue() == -3);
	}

	@Test
	public void testAddPositiveVariableToNegativeVariable(){
		Add add = new Add();

		try{
			add.calculate(XInteger.xIntegers.get("firstVar").getName(), XInteger.xIntegers.get("secondVar").getName());
		} catch(InvalidVariableNameError e){
			System.out.println(e.toString());
		}

		assert(XInteger.xIntegers.get("firstVar").getValue() == 0);
	}

	@After
	public void destroy(){
		XInteger.xIntegers.clear();
	}
}
=======
package functions;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import variables.XInteger;
import exceptions.InvalidVariableNameError;

public class AddTest {

	@Before
	public void init() {
		XInteger xInteger = new XInteger("firstVar", 1);
		XInteger.xIntegers.put(xInteger.getName(), xInteger);
		xInteger = new XInteger("secondVar", -1);
		XInteger.xIntegers.put(xInteger.getName(), xInteger);
	}

	@Test
	public void testAddPositiveVariableToPositiveNumber(){
		Add add = new Add();

		try{
			add.calculate(XInteger.xIntegers.get("firstVar").getName(), 2);
		} catch(InvalidVariableNameError e){
			System.out.println(e.toString());
		}

		assert(XInteger.xIntegers.get("firstVar").getValue() == 3);
	}

	@Test
	public void testAddPositiveVariableToNegativeNumber(){
		Add add = new Add();

		try{
			add.calculate(XInteger.xIntegers.get("firstVar").getName(), -1);
		} catch(InvalidVariableNameError e){
			System.out.println(e.toString());
		}

		assert(XInteger.xIntegers.get("firstVar").getValue() == 0);
	}

	@Test
	public void testAddNegativeVariableToPositiveNumber(){
		Add add = new Add();

		try{
			add.calculate(XInteger.xIntegers.get("secondVar").getName(), 2);
		} catch(InvalidVariableNameError e){
			System.out.println(e.toString());
		}

		assert(XInteger.xIntegers.get("secondVar").getValue() == 1);
	}

	@Test
	public void testAddNegativeVariableToNegativeNumber(){
		Add add = new Add();

		try{
			add.calculate(XInteger.xIntegers.get("secondVar").getName(), -2);
		} catch(InvalidVariableNameError e){
			System.out.println(e.toString());
		}

		assert(XInteger.xIntegers.get("secondVar").getValue() == -3);
	}

	@Test
	public void testAddPositiveVariableToNegativeVariable(){
		Add add = new Add();

		try{
			add.calculate(XInteger.xIntegers.get("firstVar").getName(), XInteger.xIntegers.get("secondVar").getName());
		} catch(InvalidVariableNameError e){
			System.out.println(e.toString());
		}

		assert(XInteger.xIntegers.get("firstVar").getValue() == 0);
	}

	@After
	public void destroy(){
		XInteger.xIntegers.clear();
	}
}
>>>>>>> origin/master
