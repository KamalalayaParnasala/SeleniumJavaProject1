package DataProviderPrograms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExcelProgram1 {
	
	
	
	
	
	@DataProvider(name="data1")
	public Object[][] method1() throws EncryptedDocumentException, IOException

	{


		Object[][]d= new Object[5][1];
		
		
		FileInputStream fs = new FileInputStream("C:\\Users\\kamal\\Downloads\\Eclipse Oxygen\\SeleniumProject\\ExcelSheet\\KamalaDDT.xlsx");
		Workbook wb = WorkbookFactory.create(fs);
		String value1 = wb.getSheet("login").getRow(0).getCell(0).getStringCellValue();
		String value2 = wb.getSheet("login").getRow(1).getCell(0).getStringCellValue();
		String value3 = wb.getSheet("login").getRow(2).getCell(0).getStringCellValue();
		String value4 = wb.getSheet("login").getRow(3).getCell(0).getStringCellValue();
		String value5 = wb.getSheet("login").getRow(4).getCell(0).getStringCellValue();
		
		d[0][0]=value1;
		d[1][0]=value2;
		d[2][0]=value3;
		d[3][0]=value4;
		d[4][0]=value5;
		return d;
		
		
		
	}

	@Test(dataProvider="data1")
	public void GoogleSearch(String input) throws InterruptedException
	{
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	WebElement e1 = driver.findElement(By.id("APjFqb"));
	e1.sendKeys(input +Keys.ENTER);
	Thread.sleep(2000);
	driver.close();
	}

}
