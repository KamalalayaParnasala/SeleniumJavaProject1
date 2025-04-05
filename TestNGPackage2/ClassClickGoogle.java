package TestNGPackage2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ClassClickGoogle extends LaunchQuit{
	
	@Test
	public void clickgoogle()
	{
	WebElement e1 = 	driver.findElement(By.linkText("Gmail"));
	System.out.println("ClickedGoogle");
	}
	
}
