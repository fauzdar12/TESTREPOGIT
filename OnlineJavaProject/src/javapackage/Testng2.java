package javapackage;

import org.testng.annotations.Test;

public class Testng2 {//Sequencing pparameter exeution of testng(@Test(priority=1)
	@Test(priority=-10)
	public void a() {
		System.out.println("A executed");
	}
	@Test(priority=0)
	public void b() {
		System.out.println("B executed");
	}
	@Test()
	public void d() {
		System.out.println("D executed");
	}
	@Test(priority=1)
	public void e() {
		System.out.println("E executed");
	}
}
