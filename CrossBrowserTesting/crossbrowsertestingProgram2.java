package CrossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossbrowsertestingProgram2 {
	WebDriver driver;
	
	@Parameters("browser")
	@Test()
	public void launchbrowser(String nameofbrowser)
	{
		if(nameofbrowser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		
		if(nameofbrowser.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		if(nameofbrowser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
	}
}
//we need to convert to testng xml before adding parameter concept. 
//Otherwise we cannot see class in the converted testng xml file
// if we add driver.quit() method it will close the launched browsers.
//we need to run xml, not this test for output, crossbrowsertesting2.xml