package CrossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTestingProgram1 {
	WebDriver driver;
	@Parameters("browser")
	@Test()
	public void launchbrowser(String nameofbrowser)
	{
		if (nameofbrowser.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		
		if (nameofbrowser.equals("edge"))
		{
			driver = new EdgeDriver();
		}
		if (nameofbrowser.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		
		driver.quit();
	}

}
//cross browser testing
//we need to run xml file. Then only it will execute
