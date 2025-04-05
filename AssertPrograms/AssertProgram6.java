package AssertPrograms;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertProgram6 {

	@Test()
	public void testcase1()
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		Assert.assertEquals(driver.getTitle(), "Kamala", "Title mismatch");
		driver.manage().window().maximize();
		driver.close();
	}
}
