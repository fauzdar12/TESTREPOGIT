package javapackage;


import java.io.File;
import java.io.IOException;

import javax.naming.spi.DirStateFactory.Result;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class TakescreenshotsTestng {
	WebDriver driver;
	
	public void capturescreenshots(ITestResult result) throws Exception {
		
		//ITResult will provide us the test case execution status and test name
		if(ITestResult.FAILURE == result.getStatus()) {
			//Create of ScreenshotAS() Reference and type casting
			TakesScreenshot ts=(TakesScreenshot)driver;
			
			//Use getScereenShotAs(to capture the screen i file format
			//getScreeenShotAs()method return type =file
			File sourcefile=ts.getScreenshotAs(OutputType.FILE);
			
			//copy the file to specific location
			File destfolder=new File("./screenshots/"+ result.getName()+".png");
			FileUtils.copyFile(sourcefile, destfolder);
			System.out.println(result.getName()+"method()Screenshotcapture");
		}
		
	}

}
