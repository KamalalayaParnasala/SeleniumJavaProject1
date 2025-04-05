package TesuitePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LaunchandQuit2 {
	
	WebDriver driver;
	
	@BeforeTest()
	public void Launch()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}
	
	@AfterTest()
	public void quit()
	{
		driver.quit();
	}

}
