package DataProviderPrograms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderFacebookProgram {
	// in the below Object 10 - NO of set of values to be executed, no of times program need to execute
	//second array is for either number of columns or no. of parameters that we are taking
	// we need to take same no of parameters as in the object second arra, in the below method registration method too
	@DataProvider(name="data1")
	public Object[][] method1() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Object [][]d=new Object[10][4];
		
		FileInputStream fs = new FileInputStream("C:\\Users\\kamal\\Downloads\\Eclipse Oxygen\\SeleniumProject\\ExcelSheet\\New Microsoft Excel Worksheet.xlsx");
		Workbook wb = WorkbookFactory.create(fs);
		Thread.sleep(1000);
		
		
		String value1 = wb.getSheet("Registration").getRow(0).getCell(0).getStringCellValue();
		String value2 = wb.getSheet("Registration").getRow(0).getCell(1).getStringCellValue();
		String value3 = NumberToTextConverter.toText(wb.getSheet("Registration").getRow(0).getCell(2).getNumericCellValue());
		String value4 = NumberToTextConverter.toText(wb.getSheet("Registration").getRow(0).getCell(2).getNumericCellValue());
		Thread.sleep(1000);
					
		String value5 = wb.getSheet("Registration").getRow(1).getCell(0).getStringCellValue();
		String value6 = wb.getSheet("Registration").getRow(1).getCell(1).getStringCellValue();
		String value7 = NumberToTextConverter.toText(wb.getSheet("Registration").getRow(1).getCell(2).getNumericCellValue());
		String value8 = NumberToTextConverter.toText(wb.getSheet("Registration").getRow(1).getCell(3).getNumericCellValue());
		
		String value9 =  wb.getSheet("Registration").getRow(2).getCell(0).getStringCellValue();
		String value10 = wb.getSheet("Registration").getRow(2).getCell(1).getStringCellValue();
		String value11 = NumberToTextConverter.toText(wb.getSheet("Registration").getRow(2).getCell(2).getNumericCellValue());
		String value12 = NumberToTextConverter.toText(wb.getSheet("Registration").getRow(2).getCell(3).getNumericCellValue());
		
		String value13 = wb.getSheet("Registration").getRow(3).getCell(0).getStringCellValue();
		String value14 = wb.getSheet("Registration").getRow(3).getCell(1).getStringCellValue();
		String value15 = NumberToTextConverter.toText(wb.getSheet("Registration").getRow(3).getCell(2).getNumericCellValue());
		String value16 = NumberToTextConverter.toText(wb.getSheet("Registration").getRow(3).getCell(3).getNumericCellValue());
		
		String value17 = wb.getSheet("Registration").getRow(4).getCell(0).getStringCellValue();
		String value18 = wb.getSheet("Registration").getRow(4).getCell(1).getStringCellValue();
		String value19 = NumberToTextConverter.toText(wb.getSheet("Registration").getRow(4).getCell(2).getNumericCellValue());
		String value20 = NumberToTextConverter.toText(wb.getSheet("Registration").getRow(4).getCell(3).getNumericCellValue());
		
		String value21 = wb.getSheet("Registration").getRow(5).getCell(0).getStringCellValue();
		String value22 = wb.getSheet("Registration").getRow(5).getCell(1).getStringCellValue();
		String value23 = NumberToTextConverter.toText(wb.getSheet("Registration").getRow(5).getCell(2).getNumericCellValue());
		String value24 = NumberToTextConverter.toText(wb.getSheet("Registration").getRow(5).getCell(3).getNumericCellValue());
		
		String value25 = wb.getSheet("Registration").getRow(6).getCell(0).getStringCellValue();
		String value26 = wb.getSheet("Registration").getRow(6).getCell(1).getStringCellValue();
		String value27 = NumberToTextConverter.toText(wb.getSheet("Registration").getRow(6).getCell(2).getNumericCellValue());
		String value28 = NumberToTextConverter.toText(wb.getSheet("Registration").getRow(6).getCell(3).getNumericCellValue());
		
		String value29 = wb.getSheet("Registration").getRow(7).getCell(0).getStringCellValue();
		String value30 = wb.getSheet("Registration").getRow(7).getCell(1).getStringCellValue();
		String value31 = NumberToTextConverter.toText(wb.getSheet("Registration").getRow(7).getCell(2).getNumericCellValue());
		String value32 = NumberToTextConverter.toText(wb.getSheet("Registration").getRow(7).getCell(3).getNumericCellValue());
		
		String value33 = wb.getSheet("Registration").getRow(8).getCell(0).getStringCellValue();
		String value34 = wb.getSheet("Registration").getRow(8).getCell(1).getStringCellValue();
		String value35 = NumberToTextConverter.toText(wb.getSheet("Registration").getRow(8).getCell(2).getNumericCellValue());
		String value36 = NumberToTextConverter.toText(wb.getSheet("Registration").getRow(8).getCell(3).getNumericCellValue());
		
		String value37 = wb.getSheet("Registration").getRow(9).getCell(0).getStringCellValue();
		String value38 = wb.getSheet("Registration").getRow(9).getCell(1).getStringCellValue();
		String value39 = NumberToTextConverter.toText(wb.getSheet("Registration").getRow(9).getCell(2).getNumericCellValue());
		String value40 = NumberToTextConverter.toText(wb.getSheet("Registration").getRow(9).getCell(3).getNumericCellValue());
		
				
		d[0][0]="value1";
		d[0][1]="value2";
		d[0][2]="value3";
		d[0][3]="value4";
		
		d[1][0]="value5";
		d[1][1]="value6";
		d[1][2]="value7";
		d[1][3]="value8";
		
		d[2][0]="value9";
		d[2][1]="value10";
		d[2][2]="value11";
		d[2][3]="value12";
		
		d[3][0]="value13";
		d[3][1]="value14";
		d[3][2]="value15";
		d[3][3]="value16";
		
		d[4][0]="value17";
		d[4][1]="value18";
		d[4][2]="value19";
		d[4][3]="value20";
		
		d[5][0]="value21";
		d[5][1]="value22";
		d[5][2]="value23";
		d[5][3]="value24";
		
		d[6][0]="value25";
		d[6][1]="value26";
		d[6][2]="value27";
		d[6][3]="value28";
		
		d[7][0]="value29";
		d[7][1]="value30";
		d[7][2]="value31";
		d[7][3]="value32";
		
		d[8][0]="value33";
		d[8][1]="value34";
		d[8][2]="value35";
		d[8][3]="value36";
		
		d[9][0]="value37";
		d[9][1]="value38";
		d[9][2]="value39";
		d[9][3]="value40";
						
		return d;
		
	}

	@Test(dataProvider="data1")
	public void registration(String FN, String LN, String UN, String PWD) throws InterruptedException
	{
	
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		
		//first name field
		WebElement e1=driver.findElement(By.name("firstname"));
		e1.sendKeys(FN);
		Thread.sleep(1000);
		
		//last name field
		WebElement e2=driver.findElement(By.name("lastname"));
		e2.sendKeys(LN);
		Thread.sleep(1000);
		
		//mobile number field
		WebElement mobileno=driver.findElement(By.xpath("(//input[@class=\"inputtext _58mg _5dba _2ph-\"])[5]"));
		mobileno.sendKeys(UN);
		Thread.sleep(1000);
		
		//new password field
		WebElement password = driver.findElement(By.xpath("(//input[@class=\"inputtext _58mg _5dba _2ph-\"])[7]"));
		password.sendKeys(PWD);
		Thread.sleep(1000);
		
		//signup button
		WebElement e7=driver.findElement(By.name("websubmit"));
		e7.click();
		Thread.sleep(1000);
		
		driver.close();

	}

}
