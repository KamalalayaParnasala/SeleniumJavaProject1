package CrossBrowserTesting;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class UpcastingtoWebDriver {

	 static WebDriver driver;
	public static void main(String[] args) {
		
		 
		 
		 if(1==1)
		 {
			 driver=new ChromeDriver(); 
		 }
		 if (1==2)
			 
		 {
			 driver=new EdgeDriver();
		 }
		 
		 if (1!=1)
		 {
			 driver=new FirefoxDriver();
		 }

		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
			
		 driver.quit();
	}

}
