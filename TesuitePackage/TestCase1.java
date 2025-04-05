package TesuitePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase1 extends LaunchandQuit2
{

	@Test(retryAnalyzer=RetryLogic.class)
	public void testcase1() throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//driver.navigate().refresh();
		//driver.navigate().refresh();
		WebElement e1 = driver.findElement(By.xpath("APjFqb"));
		e1.sendKeys("India");
		Thread.sleep(2000);
		e1.sendKeys(Keys.ENTER);
		driver.close();
	}
}

//failed the testcase by giving wrong locator, originally it is linktext, I changed it to xpath