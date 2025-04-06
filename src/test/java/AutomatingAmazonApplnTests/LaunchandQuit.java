package AutomatingAmazonApplnTests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LaunchandQuit {
	
	WebDriver driver;
	
	@BeforeTest()
	
	public void launch()
	
	{
		
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
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
