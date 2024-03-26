package javapackage;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readingexcelfile {

	public static void main(String[] args) throws Exception {
		//specify the location of file
		File src=new File("C:\\Users\\lenovo\\Documents\\Book1.xlsx");
		
		//LoadFile
		FileInputStream fis=new FileInputStream(src);
		
		//Load workbook
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	  
	//Load worksheet
	XSSFSheet sh= wb.getSheet("Sheet1");
	
	//Print the load sheet name
	System.out.println(sh.getSheetName());
	
	//Print name from excelsheet numeric value
	System.out.println((int) sh.getRow(1).getCell(1).getNumericCellValue());//In that you can use floating number to also 
	//Print name of excellsheet in string value
	System.out.println(sh.getRow(1).getCell(0).getStringCellValue());
	
	//getTotal number of rows
	System.out.println("Total number of rows :" +sh.getPhysicalNumberOfRows());
	
	//GetTotal number of columns
	System.out.println("Total number of cells: "+ sh.getRow(1).getPhysicalNumberOfCells());
	
	//Real rime implkementation
	System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	
	//Enter username Using excel file
	String abc=sh.getRow(0).getCell(0).getStringCellValue();
	driver.findElement(By.id("email")).sendKeys(abc);

	}

}
