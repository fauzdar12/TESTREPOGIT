package javapackage;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTestmethod {
	@Test
	public void a() {
		System.out.println("A passed");
	}
	@Test(enabled=false)
	public void b() {
		System.out.println("B is passed");
	}
	@Test(invocationCount=2)
	public void c() {
		System.out.println("C is passed twot times");
		
	}
	@Test(invocationCount = 0)
	public void d() {
		System.out.println("D is passed");
	}
	//Correct way but not recommende
	@Test
	public void e() {
		System.out.println("E is skipped ");
		throw new SkipException("e is skipped");
	}
	

}
