package TestNGPackage2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LaunchQuit {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void launch()
	{
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	
	}
	
		
	@AfterTest
	public void quit()
	{
		driver.quit();
	}
	
}
