package javapackage;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selfexcelpractice {

	public static void main(String[] args) throws Exception {

		File  src=new File("C:\\Users\\lenovo\\Documents\\Book1.xlsx");
		FileInputStream fis=new FileInputStream(src);

		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheet("Sheet1");
		System.out.println(sh.getSheetName());
		System.out.println(sh.getRow(0).getCell(1).getStringCellValue());
		System.out.println("Total number of cells : " + sh.getRow(0).getPhysicalNumberOfCells());
		System.out.println("Total number of rows : " + sh.getPhysicalNumberOfRows());
		System.out.println("Integer number printed " +(int)sh.getRow(1).getCell(1).getNumericCellValue());//not using casting it can be in float.

		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys(sh.getRow(0).getCell(0).getStringCellValue());

	}

}
