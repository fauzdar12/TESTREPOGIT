package javapackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousesimulation2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.get("https://jqueryui.com/droppable/");
	    
	    //switch to frame
	    driver.switchTo().frame(0);
	    System.out.println("Switched to frame");
	    
	    WebElement drag=driver.findElement(By.id("draggable"));
	    WebElement drop=driver.findElement(By.id("droppable"));
	    Thread.sleep(2000);
	    Actions act= new Actions(driver);
	    act.dragAndDrop(drag, drop).build().perform();	    
	    
	    


	}

}
