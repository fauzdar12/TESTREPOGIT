package javapackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;////h2[@class='_8eso']
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion1 {
	@Test
	public void testcase1() throws Exception {
		String expectedresult="Facebook helps you connect and share with the people in your life.";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		Thread .sleep(2000);
		String actualtext =driver.findElement(By.xpath("//h2[contains(text(),'life.')]")).getText();
		
		
		//equal assertion
		Assert.assertEquals(expectedresult, actualtext);
		System.out.println("Assertequal has been passed");
		
		//false assertion
		Assert.assertFalse(driver.findElement(By.xpath("//h2[contains(text(),'life.')]")).isSelected());
		System.out.println("Assertion not verified");
		
		//True asssertion
		Assert.assertTrue(driver.findElement(By.xpath("//h2[contains(text(),'life.')]")).isDisplayed());
		System.out.println("Assertion verified by true condition");
	}

}
