package GTM_AmazonProject1_TestPages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class LauchandQuitAmazonPage {
	
WebDriver driver;
	
	@BeforeTest()
	
	public void launch()
	
	{
		
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com");
	driver.navigate().refresh();
	driver.navigate().refresh();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	}
	
	@AfterTest()
	public void quit() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.quit();
	}

}
