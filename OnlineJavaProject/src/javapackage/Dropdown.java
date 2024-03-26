package javapackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abccd@gmail.com");  self parcticed
//		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("ggsajshjah");
		Thread .sleep(2000);
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
		Thread.sleep(2000);

		
		//Different ways to deal with dropwon data
		///1st way
		List<WebElement>birthmonth=driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println("Total no of dropdownlist: " + birthmonth.size());
		birthmonth.get(8).click();
		
		//2nd ways
		WebElement bm=driver.findElement(By.xpath("//select[@id='month']"));
		Select month=new Select(bm);
		Thread.sleep(2000);
		month.selectByValue("3");//march
		Thread.sleep(2000);
		month.selectByVisibleText("Apr");
		Thread.sleep(2000);
		month.selectByIndex(0);
		System.out.println(month.getFirstSelectedOption().getText());//Jan - current selected value
		
		//3rd ways
		List<WebElement>dropdown=month.getOptions();
		for(int i=0;i<dropdown.size();i++) {
			if(dropdown.get(i).getText().equalsIgnoreCase("Sep")) {
				dropdown.get(i).click();
			}
		}
		//4th way
		bm.sendKeys("Dec");
		
		//5th ways
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Sep");
		
		
	}

}
