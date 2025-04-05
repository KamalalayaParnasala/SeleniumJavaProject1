package CrossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UpcastingtoWebDriverProgram2 {

	static WebDriver driver;
	public static void main(String[] args) {
		
		if (1==1)
		{
			driver=new ChromeDriver();
			
		}
		
		if (1!=2)
		{
			driver=new EdgeDriver();
			
		}
		
		if (1==1)
		{
			driver=new FirefoxDriver();
		}
		
		
	}
	
}
//launching all possible/given browsers