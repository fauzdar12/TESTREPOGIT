package javapackage;

import org.testng.Assert;
import org.testng.annotations.Test;



   public class Assertion2 {
	@Test
	public void testcase2() {
		String actualtext="ab";
		String expectresult="ab";
		int a=10;
		int b=20;
		Assert.assertEquals(actualtext,expectresult,"Actual and expect are not matching");
		System.out.println("Actual and expect are passed");
		
		//Assertion false, Execution will stop here
		//Further line of code will not execute
		
		Assert.assertTrue(a>b,"A is greatrer than b ");
		System.out.println("A is less than b");
		Assert.assertFalse(a>b,"A is greater than b");
		System.out.println("A is Less than B");
	}
	@Test
	public void testcase3() {
		System.out.println("Hello testcase method()");
	}
}
