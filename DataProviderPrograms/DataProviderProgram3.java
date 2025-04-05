package DataProviderPrograms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderProgram3 {
	
	@DataProvider(name="data1")
	public Object[][] method1() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Object [][]d=new Object[10][4];
		
		
		
		
		
		
		
				
		d[0][0]="Kamala";
		d[0][1]="Laya";
		d[0][2]="6547893215";
		d[0][3]="value4";
		
		d[1][0]="Kiran";
		d[1][1]="kumar";
		d[1][2]="9874563210";
		d[1][3]="value8";
		
		d[2][0]="Vaishnavi";
		d[2][1]="venkata";
		d[2][2]="1236547896";
		d[2][3]="value12";
		
		d[3][0]="Krishna";
		d[3][1]="Narasimha";
		d[3][2]="1236547896";
		d[3][3]="value16";
		
		d[4][0]="Saketh";
		d[4][1]="rama";
		d[4][2]="2564789632";
		d[4][3]="value20";
		
		d[5][0]="Ramana";
		d[5][1]="adimatyam";
		d[5][2]="5478963210";
		d[5][3]="value24";
		
		d[6][0]="venu";
		d[6][1]="gopal";
		d[6][2]="4789651230";
		d[6][3]="value28";
		
		d[7][0]="Hari";
		d[7][1]="venkat";
		d[7][2]="7894561230";
		d[7][3]="value32";
		
		d[8][0]="vamsi";
		d[8][1]="krishna";
		d[8][2]="9874556512";
		d[8][3]="value36";
		
		d[9][0]="Sita";
		d[9][1]="  ";
		d[9][2]="  ";
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
