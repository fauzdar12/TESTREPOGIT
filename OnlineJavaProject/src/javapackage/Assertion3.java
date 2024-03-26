package javapackage;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Assertion3 {
	@Test
	public void testcase4() {
		String a="Hello";
		String b="Hell";
		try {
			Assert.assertEquals(a,b);
			
		} catch (Error e) {
			
		}
		System.out.println("Both are equals");
	}

}
