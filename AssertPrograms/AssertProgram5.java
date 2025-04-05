package AssertPrograms;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertProgram5 {
	
	@Test()
	public void testcase1()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		Assert.assertEquals(driver.getTitle(), "Google");
		driver.close();
	}

}


//Assert - String actual,  string expected