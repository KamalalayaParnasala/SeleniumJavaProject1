package WebDriverUPcasting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverUpcastingProgram1 {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		if (1==1)
		{
		
		driver = new ChromeDriver();
		
		}
		
		if (1==1)
		{
			driver = new FirefoxDriver();
		}
		
		if (1==1)
		{
			driver= new EdgeDriver();
		}
		
		}
			
}
//purposefully taken main method even with TestNG, to make it easy
// As main method is static the global variable should also be static