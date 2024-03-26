package javapackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Poopuphandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");

		Thread.sleep(2000);
		driver.findElement(By.id("tabButton")).click();

		//Get the total no of tab windows
		Set<String> allwindowsid = driver.getWindowHandles();
		System.out.println(allwindowsid);
		Iterator<String>abc=allwindowsid.iterator();
		String win1=abc.next();
		String win2=abc.next();
		
		//Print the titles of parents windows
		driver.switchTo().window(win1);
		System.out.println("Parents window id: " +win1);//get alphanumericals id of parents windows
		System.out.println(driver.getTitle());
		
		//get current url of child tab
		Thread.sleep(2000);
		driver.switchTo().window(win2);
		System.out.println("Child windows ID:"+win2);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.quit()
;
		System.out.println("Windows id has been handled");
		
	}

}
