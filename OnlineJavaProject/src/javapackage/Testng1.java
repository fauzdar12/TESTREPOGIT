package javapackage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//* can be used for all  notations test

public class Testng1 {
	@Test
	public void a() {
		System.out.println("Hello a method");
	}
	@BeforeSuite
	public void b() {
		System.out.println("Hello b method");
	}
	@BeforeTest
	public void d() {
		System.out.println("Hello d method");
		
	}
	@BeforeClass
	public void e() {
		System.out.println("Hello e method");
	}
	@BeforeMethod
	public void f() {
		System.out.println("Hello f method");
	}
	@AfterTest
	public void g() {
		System.out.println("Hello g method");
	}
	@AfterMethod
	public void i() {
		System.out.println("Hello I method");
	}
//	@AfterSuite
//	public void j() {
//		System.out.println("Hello Suite method"); All Test case execute on basis of Alphanumeric disorders
//	}
	@Test
	public void a1() {
		System.out.println("Hello a1 method");
	}
	

}
