package DataProviderPrograms;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FacebookProgram2 {

	
		
		     
			 @DataProvider(name="data1")
			   public  Object[][] Registrationdata() throws EncryptedDocumentException, IOException
			   {
			    	Object[][] d=new Object[10][4];
			    	
			    	
			    	FileInputStream fs=new FileInputStream("C:\\Users\\siree\\eclipse-workspace\\Automation\\SeleniumJavaProject\\ExcelSheet\\Scenario5.xlsx");
				      Workbook wb= WorkbookFactory.create(fs);
				      //Row1
						 String value1= wb.getSheet("Sheet").getRow(0).getCell(0).getStringCellValue();
						 String value2= wb.getSheet("Sheet").getRow(0).getCell(1).getStringCellValue();
						 
						String value3= NumberToTextConverter.toText(wb.getSheet("Sheet").getRow(0).getCell(2).getNumericCellValue());
						 String value4= wb.getSheet("Sheet").getRow(0).getCell(3).getStringCellValue();
						//Row2
						 String value5= wb.getSheet("Sheet").getRow(1).getCell(0).getStringCellValue();
						 String value6= wb.getSheet("Sheet").getRow(1).getCell(1).getStringCellValue();
						  String value7= NumberToTextConverter.toText(wb.getSheet("Sheet").getRow(1).getCell(2).getNumericCellValue());
						 String value8= wb.getSheet("Sheet").getRow(1).getCell(3).getStringCellValue();
			           //Row3
						 String value9= wb.getSheet("Sheet").getRow(2).getCell(0).getStringCellValue();
						 String value10= wb.getSheet("Sheet").getRow(2).getCell(1).getStringCellValue();
						String value11= NumberToTextConverter.toText(wb.getSheet("Sheet").getRow(2).getCell(2).getNumericCellValue());
						 String value12= wb.getSheet("Sheet").getRow(2).getCell(3).getStringCellValue();
						 //Row4
						 String value13= wb.getSheet("Sheet").getRow(3).getCell(0).getStringCellValue();
						 String value14= wb.getSheet("Sheet").getRow(3).getCell(1).getStringCellValue();
						String value15= NumberToTextConverter.toText(wb.getSheet("Sheet").getRow(3).getCell(2).getNumericCellValue());
						 String value16= wb.getSheet("Sheet").getRow(3).getCell(3).getStringCellValue();
						 //Row5
						 String value17= wb.getSheet("Sheet").getRow(4).getCell(0).getStringCellValue();
						 String value18= wb.getSheet("Sheet").getRow(4).getCell(1).getStringCellValue();
						String value19= NumberToTextConverter.toText(wb.getSheet("Sheet").getRow(4).getCell(2).getNumericCellValue());
						 String value20= wb.getSheet("Sheet").getRow(4).getCell(3).getStringCellValue();
						 //Row6
						 String value21= wb.getSheet("Sheet").getRow(5).getCell(0).getStringCellValue();
						 String value22= wb.getSheet("Sheet").getRow(5).getCell(1).getStringCellValue();
						String value23= NumberToTextConverter.toText(wb.getSheet("Sheet").getRow(5).getCell(2).getNumericCellValue());
						 String value24= wb.getSheet("Sheet").getRow(5).getCell(3).getStringCellValue();
						 //Row7
						 String value25= wb.getSheet("Sheet").getRow(6).getCell(0).getStringCellValue();
						 String value26= wb.getSheet("Sheet").getRow(6).getCell(1).getStringCellValue();
						String value27= NumberToTextConverter.toText(wb.getSheet("Sheet").getRow(6).getCell(2).getNumericCellValue());
						 String value28= wb.getSheet("Sheet").getRow(6).getCell(3).getStringCellValue();
						 //Row8
						 String value29= wb.getSheet("Sheet").getRow(7).getCell(0).getStringCellValue();
						 String value30= wb.getSheet("Sheet").getRow(7).getCell(1).getStringCellValue();
						String value31= NumberToTextConverter.toText(wb.getSheet("Sheet").getRow(7).getCell(2).getNumericCellValue());
						 String value32= wb.getSheet("Sheet").getRow(7).getCell(3).getStringCellValue();
						 //Row9
						 String value33= wb.getSheet("Sheet").getRow(8).getCell(0).getStringCellValue();
						 String value34= wb.getSheet("Sheet").getRow(8).getCell(1).getStringCellValue();
						String value35= NumberToTextConverter.toText(wb.getSheet("Sheet").getRow(8).getCell(2).getNumericCellValue());
						 String value36= wb.getSheet("Sheet").getRow(8).getCell(3).getStringCellValue();
						 //Row10
						 String value37= wb.getSheet("Sheet").getRow(9).getCell(0).getStringCellValue();
						 String value38= wb.getSheet("Sheet").getRow(9).getCell(1).getStringCellValue();
						String value39= NumberToTextConverter.toText(wb.getSheet("Sheet").getRow(9).getCell(2).getNumericCellValue());
						 String value40= wb.getSheet("Sheet").getRow(9).getCell(3).getStringCellValue();  
			         d[0][0]=value1;
			 		d[0][1]=value2;
			 		d[0][2]=value3;
			 		d[0][3]=value4;
			 		
			 		d[1][0]=value5;
			 		d[1][1]=value6;
			 		d[1][2]=value7;
			 		d[1][3]=value8;
			 		
			 	   d[2][0]=value9;
				   d[2][1]=value10;
				 		d[2][2]=value11;
				 		d[2][3]=value12;
				 		d[3][0]=value13;
				 		d[3][1]=value14;
				 		d[3][2]=value15;
				 		d[3][3]=value16;
				 
				 		d[4][0]=value17;
				 		d[4][1]=value18;
				 		d[4][2]=value19;
				 		d[4][3]=value20;
				 		
				 		d[5][0]=value21;
				 		d[5][1]=value22;
				 		d[5][2]=value23;
				 		d[5][3]=value24;
				 		
				 		d[6][0]=value25;
				 		d[6][1]=value26;
				 		d[6][2]=value27;
				 		d[6][3]=value28;
				 	
				 		d[7][0]=value29;
				 		d[7][1]=value30;
				 		d[7][2]=value31;
				 		d[7][3]=value32;
				 		
				 		d[8][0]=value33;
				 		d[8][1]=value34;
				 		d[8][2]=value35;
				 		d[8][3]=value36;
				 	
				 		d[9][0]=value37;
				 		d[9][1]=value38;
				 		d[9][2]=value39;
				 		d[9][3]=value40;  
				 		
				return d;
			    	
			   }
				@Test(dataProvider="data1")
				public void Registartion(String FN, String LN, String MN, String PWD)
				{
					ChromeDriver driver=new ChromeDriver();
					driver.get("https://www.facebook.com/r.php?entry_point=login");
					driver.manage().window().maximize();
					WebElement e1=driver.findElement(By.xpath("(//input[@name='firstname'])"));
					e1.sendKeys(FN);
					WebElement e2=driver.findElement(By.xpath("(//input[@name='lastname'])"));
					e2.sendKeys(LN);
					WebElement e3=driver.findElement(By.xpath("(//input[@name='reg_email__'])"));
					e3.sendKeys(MN);
					WebElement e4=driver.findElement(By.xpath("(//input[@name='reg_passwd__'])"));
					e4.sendKeys(PWD);
					WebElement e5=driver.findElement(By.xpath("(//select[@id='month'])"));
					Select s1=new Select(e5);
					s1.selectByVisibleText("Jun");
					WebElement e6=driver.findElement(By.xpath("(//select[@id='day'])"));
					Select s2=new Select(e6);
					s2.selectByVisibleText("2");
					WebElement e7=driver.findElement(By.xpath("(//select[@id='year'])"));
					Select s3=new Select(e7);
					s3.selectByVisibleText("2000");
				    WebElement e8=driver.findElement(By.xpath("((//input[@class='_8esa'])[1])"));
					e8.click();
					
					
				}
			
	

}
