package javapackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openapplication {

	public static void main(String[] args) throws InterruptedException {
		//setting the property of chrome browser and passing chrome driver path
	System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	
	//Launching chrome browser instance
	
	WebDriver driver=new ChromeDriver();
	//Open url using get() method
	driver.get("https://www.facebook.com/");
	
	//maximize the windows
	Thread.sleep(2000);
	driver.manage().window().maximize();
	
	
	//Delete all cookies
	Thread.sleep(2000);
	driver.manage().deleteAllCookies();
	
	//Oopen url using Navigate winndows
	Thread.sleep(2000);
	driver.navigate().to("https://www.google.com/");
	
	//Refresh the page
	Thread.sleep(2000);
	driver.navigate().refresh();
	
	//Navigate back
	Thread.sleep(2000);
	driver.navigate().back();
	
	//Navigate to forward
	Thread.sleep(2000);
	driver.navigate().forward();
	
	///Fetch the current url
	Thread.sleep(2000);
	System.out.println(driver.getCurrentUrl());
	
	//Get title of the web page
	driver.navigate().back();
	System.out.println(driver.getTitle());
	
	//Close th windows
	driver.close();
	
	}

}
