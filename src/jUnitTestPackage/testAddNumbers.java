package jUnitTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddNumbers {

	
	@Test
	public void test() {
		junitFunctions jUnit=new junitFunctions();
		int result=jUnit.AddNumbers(100, 200);
		assertEquals(300,result);
	}


}
