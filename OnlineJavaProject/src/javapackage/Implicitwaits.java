package javapackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwaits {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		//Implicit waits
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("How Stuff Works");
	
	//Handling Autosuggestion
	List<WebElement>allsuggestion=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		for(int i=0;i<allsuggestion.size();i++) {
			String  expresult="How stuff works quiz";
			if(allsuggestion.get(i).getText().equalsIgnoreCase(expresult)) {
				allsuggestion.get(i).click();
				break;
			}
		}

	}

}
