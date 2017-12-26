package variables;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class XStringTest {
	XString xString;

	@Before
	public void init(){
		xString = new XString("firstVar", "Supp");
	}

	@Test
	public void testName(){
		assert(xString.getName().equals("firstVar"));
	}

	@Test
	public void testValue(){
		assert(xString.getValue().equals("Supp"));
	}
}
