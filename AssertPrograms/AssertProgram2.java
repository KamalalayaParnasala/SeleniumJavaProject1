package AssertPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertProgram2 {
	
	@Test()
	public void testcase1() throws InterruptedException
	{

	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	WebElement e1=	driver.findElement(By.cssSelector("textarea.gLFyf"));
	boolean b1 = e1.isEnabled();
	boolean b2 = e1.isDisplayed();
	//boolean b3 = e1.isSelected();
	
	if (b1 && b2)
	{
		e1.sendKeys("SRK" + Keys.ENTER);
		
	}
	
	Thread.sleep(2000);
	
	Assert.assertTrue(true);
	//System.out.println(b3);
	driver.close();
	}
}
//This Assert is hard assert, it will give you boolean answer that is in the brackets.
