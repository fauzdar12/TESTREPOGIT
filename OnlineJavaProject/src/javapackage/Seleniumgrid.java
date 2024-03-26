package javapackage;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Seleniumgrid {
	@DataProvider(parallel = true)
	public Object[][] senddata(){
		Object arr[][]=new Object[2][2];
		arr[0][0]="Email_1";
		arr[0][1]="chrome";
		
		arr[1][0]="Email_2";
		arr[1][1]="chrome";
		
		return arr;
		
	}
	@Test(dataProvider="senddata")
	public void login(String username,String browsername) throws Exception {
		DesiredCapabilities cap=null;
		if(browsername.equalsIgnoreCase("chrome")) {
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.ANY);
			
			RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
			driver.get("https://www.facebook.com/");
			driver.findElement(By.id("email")).sendKeys(username);
			
		}
	}
	

}
