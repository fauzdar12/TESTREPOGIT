package javapackage;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Log4jlogging {

	public static void main(String[] args) {

		//Create logger instance
		Logger logger=Logger.getLogger("Log4jlogging");

		//configure log4j properties file
		PropertyConfigurator.configure("C:\\Users\\lenovo\\eclipse-workspace\\OnlineJavaProject\\log4j.properties");

		//Open browser instance
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		logger.info("chrome driver opened");

		//maximize the windows
		driver.manage().window().maximize();
		logger.info("Windows maximized");

		//Implicit waits
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		logger.info("Implicitly wait given");

		//open URL
		driver.get("https://www.facebook.com/");
		logger.info("url has opoened");

		try {
			driver.findElement(By.id("Emails")).isDisplayed();
			logger.info("web element is displayed");
		} catch (Exception e) {
			logger.info("Failurre -Msg is not displayed");
		}

	}

}
