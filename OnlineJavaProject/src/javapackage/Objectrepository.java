package javapackage;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Objectrepository {

	public static void main(String[] args) throws Exception  {
		
		//Specify the location of properties file
	File src1=new File("C:\\Users\\lenovo\\eclipse-workspace\\OnlineJavaProject\\Repository");
	
	File src2=new File("C:\\Users\\lenovo\\eclipse-workspace\\OnlineJavaProject\\Repository");

	File src3=new File("C:\\Users\\lenovo\\eclipse-workspace\\OnlineJavaProject\\Repository");

	
	//Create Fileinputstream class object to load the properties file
	FileInputStream fis1=new FileInputStream(src1);
	FileInputStream fis2= new FileInputStream(src2);
	FileInputStream fis3=new FileInputStream(src3);
	
	//Create the Properties class object to read the properties  file
	Properties pro1=new Properties();
	pro1.load(fis1);
	Properties pro2=new Properties();
	pro2.load(fis2);
	Properties pro3=new Properties();
	pro3.load(fis3);
	
	
	//setting the property of chrome browser and chromedriver path
	System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get(pro1.getProperty("URL"));
	
	
	//getproperty Method will accept key and return value of that key
	driver.findElement(By.xpath(pro2.getProperty("Email"))).sendKeys("Testdata1");
	driver.findElement(By.xpath(pro2.getProperty("Pass"))).sendKeys("Testdata2");
	Thread.sleep(2000);
	driver.close();
	}

}
