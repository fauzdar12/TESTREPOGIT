package javapackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Screenshotcapturetestng2 {
	TakescreenshotsTestng t1=new TakescreenshotsTestng();
	@Test
	public void dologin() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		t1.driver=new ChromeDriver();
		t1.driver.manage().window().maximize();
		t1.driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		t1.driver.get("https://www.facebook.com/");
		Thread .sleep(2000);
		t1.driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
		t1.driver.findElement(By.id("pass")).sendKeys("abcd@gmail.com");
		
		//passwrong id so that case will fail
		t1.driver.findElement(By.id("email_UN")).sendKeys("abcd@gmail.com");
		
	}
	@AfterMethod
	public void takescreenshot(ITestResult result) throws Exception {
		t1.capturescreenshots(result);
	}
	
}
