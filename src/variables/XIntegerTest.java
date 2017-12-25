package variables;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class XIntegerTest {

	private XInteger xInteger;

	@Before
	public void init(){
		xInteger = new XInteger("firstVar", 4);
	}

	@Test
	public void testName(){
		assert(xInteger.getName().equals("firstVar"));
	}

	@Test
	public void testValue(){
		assert(xInteger.getValue() == 4);
	}
}
