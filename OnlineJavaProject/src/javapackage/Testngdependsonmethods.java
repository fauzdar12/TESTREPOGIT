package javapackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testngdependsonmethods {
	
	@Test
	
	public void a() {
		Assert.assertTrue(3<12);
		System.out.println("A is passed");
	}
	@Test(dependsOnMethods = "a")
	public void b() {
		System.out.println("B is passed");
		
	}
	

}
