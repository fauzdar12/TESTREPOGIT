package javapackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explixitwait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//Enter username 
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcd@gmail.com");
		
		//fetch the input box attributes value
		System.out.println(driver.findElement(By.xpath("//input[@id='email']")).getAttribute("value"));
		
		//get heights of input box
		System.out.println(driver.findElement(By.xpath("//input[@id='email']")).getSize().getHeight());
		
		//Get width of input box
		System.out.println(driver.findElement(By.xpath("//input[@id='email']")).getSize().getWidth());
		
		//Use explicitwaits to check if password field is visible  
		WebDriverWait wt=new WebDriverWait(driver, 30);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass"))).sendKeys("abcd12544");
		

	}

}
