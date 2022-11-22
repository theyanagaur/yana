package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		//fail("Not yet implemented");
		jUnitFunctions junitstring = new jUnitFunctions();
		String result= junitstring.addStrings("capstone","project");
		assertEquals ("capstoneproject",result);
	}

}
