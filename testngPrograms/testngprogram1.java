package testngPrograms;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testngprogram1 {
	
@Test
	
	public void name() throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String e1 = driver.getTitle();
		System.out.println(e1);
		String e2 = driver.getWindowHandle();
		System.out.println("GetWindowHandle -->" +e2);
		Set<String> s1 = driver.getWindowHandles();
		System.out.println("GetWindowHandles -->" +s1);
		Thread.sleep(3000);
		driver.close();
		//driver.quit();
	}

	@Test
	 public void testcase2()
	 {
		System.out.println("Kamala");
	 }

}
