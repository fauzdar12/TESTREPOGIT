package javapackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread .sleep(2000);
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
		Thread.sleep(2000);


		//1st way
		driver.findElement(By.xpath("//input[@value='1']")).click();//female will clicked.
		driver.findElement(By.xpath("//input[@value='2']")).click();//male will clicked.
		driver.findElement(By.xpath("//input[@value='-1']")).click();//custom  will clicked.

		//2nd ways
		List<WebElement> radios=driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("Total number of radios " + radios.size());
		System.out.println(radios.get(0).isSelected());
		System.out.println(radios.get(1).isEnabled());
		System.out.println(radios.get(2).isDisplayed());
		radios.get(1).click();//Male will be selected
		Thread.sleep(2000);
		System.out.println(radios.get(1).isEnabled());//Male will be selected



		//3rd ways
		List<WebElement>radios1=driver.findElements(By.xpath("//label[@class='_58mt']"));
		System.out.println("Total numbers of text radios" +radios1.size());
		String result="Female";
		for(int i=0;i<radios1.size();i++) {
			if(radios1.get(i).getText().equalsIgnoreCase(result)) {
				System.out.println(result + " clicked ");
				break;
			}
		}
	}

}
