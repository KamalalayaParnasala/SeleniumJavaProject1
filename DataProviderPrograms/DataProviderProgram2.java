package DataProviderPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderProgram2 {

	@DataProvider(name="data1")
	public Object[][] method1()
	{
		Object[][] d=new Object[5][1];
		d[0][0]="Shoes";
		d[1][0]="Modi";
		d[2][0]="SRK";
		d[3][0]="Salman";
		d[4][0]="Perfumes";
		return d;
	}
	
		
		@Test(dataProvider = "data1")
		public void testcase1(String input) throws InterruptedException
		
		{
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");	
			Thread.sleep(2000);
			WebElement e1 = driver.findElement(By.id("APjFqb"));
			e1.sendKeys(input +Keys.ENTER);
			Thread.sleep(2000);
			driver.close();
			
		}
	

}
