package javapackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://paytm.com/");
		Thread.sleep(2000);
		
		 driver.findElement(By.xpath("//div[@class='_2blcs']/div/span")).click();
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//img[@alt='close Modal']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@target='_blank']")).click();
		 
		 
		 //find out total number  of frames
		 int allframes=driver.findElements(By.tagName("iframe")).size();
		 System.out.println("total frames is:" + allframes);
		 
		 //go inside each frame and check if the element is present
		 for(int i=0;i<allframes;i++) {
			 driver.switchTo().frame(i);
		 }
		 

	}

}
