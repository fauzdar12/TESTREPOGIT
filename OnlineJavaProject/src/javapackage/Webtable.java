package javapackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		//List webelemnts
		List<WebElement>allcompanies=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[4]/td[1]/a"));
		System.out.println(allcompanies.size() + " All companies list");
		

		List<WebElement>currentprice=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println(currentprice.size() + " Current pricelist");
		
		String expcompany="Kenvi Jewels";
		
		for(int i=0;i<allcompanies.size();i++) {
			
			if(allcompanies.get(i).getText().equalsIgnoreCase(expcompany));
			System.out.println(allcompanies.get(i).getText()+ " " + currentprice.get(i).getText());
			allcompanies.get(i).click();
			break;
				
		}
	}

}
