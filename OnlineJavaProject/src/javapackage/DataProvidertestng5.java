package javapackage;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidertestng5 {
	WebDriver driver;

	@BeforeClass
	public void setEnvi() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		Thread .sleep(2000);
	}
	@DataProvider
	public Object[][] dataset() throws Exception{

		//Specify the location of properties file
		File src3=new File("C:\\Users\\lenovo\\eclipse-workspace\\OnlineJavaProject\\Repository\\testdata.properties");
		FileInputStream fis3=new FileInputStream(src3);

		//Create properties class
		Properties pro3=new Properties();
		pro3.load(fis3);
		
		Object arr[][]=new Object[3][2];

		arr[0][0]=pro3.getProperty("Testdata1");
		arr[0][1]=pro3.getProperty("Testdata2");
		
		arr[1][0]="Testdata2";
		arr[1][1]="Testdata2";
		
		arr[2][0]="Testdata3";
		arr[2][1]="Testdata3";
						
	 return arr;

	}
	@Test(dataProvider="dataset")
	public void enterdata(String username,String password) throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.id("email")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).clear();
		
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys(password);
		Thread.sleep(2000);
		
		
	}

}
