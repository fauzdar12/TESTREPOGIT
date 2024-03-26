package javapackage;

import java.awt.Window;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javaascript1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https:www.facebook.com/");
		
		//javscriptexecutors
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("document.getElementById('email').value='abcd@gmail.com'");
		jse.executeScript("document.getElementById('pass').value='12548'");
		
		//windows scrolling up
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-400)");
		driver.close();
		
	}

}
