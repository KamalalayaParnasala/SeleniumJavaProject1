package SynchronizationConcepts;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class ImplicitWait1
{
	WebDriver driver;
	@Test()
	public void lauchgoogle()
	{
		
	
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.close();

}
}
