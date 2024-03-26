package javapackage;

import org.testng.annotations.Test;

public class Testng4 {
	@Test(priority=-10)
	public void a() {
		System.out.println("A executed");
	}
	@Test(priority=0)
	public void b() {
		System.out.println("B executed");
	}
	@Test(invocationCount =2 ,priority=3 ,enabled=true & false)
	public void d() {
		System.out.println("D executed");
	}
	@Test(priority=1)
	public void e() {
		System.out.println("E executed");
	}
}


