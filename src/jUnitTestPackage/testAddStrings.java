package jUnitTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStrings {

	@Test
	public void test() {
		junitFunctions jUnit=new junitFunctions();
		String result=jUnit.AddStrings("abc","def");
		assertEquals("abcdef",result);
	}

}
