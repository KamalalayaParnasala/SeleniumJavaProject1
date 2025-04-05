package TestNGPackage2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ClickGoogleImages extends LaunchQuit {
	
	@Test
	public void clickgoogle() throws InterruptedException
	{
	WebElement e2 = 	driver.findElement(By.linkText("Images"));
	Thread.sleep(2000);
	System.out.println("ClickedImages");
	}

}
