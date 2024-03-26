package javapackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Alert1 {
	public static void main(String[] args) throws   Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alerts");
		
		//Alert handling
		Thread.sleep(2000);
		driver.findElement(By.id("confirmButton")).click();
		
		//verify alettext
		String alertext= driver.switchTo().alert().getText();
		String expalert="Do you want confirm action?";
		Assert.assertEquals(alertext, expalert);
		System.out.println("Alet text verified");
		
		//Accept alert
		Thread.sleep(2000);
		driver.findElement(By.id("confirmButton")).click();
		driver.switchTo().alert().accept();
		System.out.println("Accepted alert");
		
		//Dismiss alert
		Thread.sleep(2000);
		//driver.findElement(By.id("confirmButton")).click();
		driver.switchTo().alert().dismiss();
		System.out.println("Accepted alert");
		

	}//Error will get resolved soon during test g parctice

}
