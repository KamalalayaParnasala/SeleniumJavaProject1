package TesuitePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testcase2 extends LaunchandQuit2 {
	
	@Test()
	public void testcase2() throws InterruptedException
	{
		WebElement e2 = 	driver.findElement(By.linkText("mages"));
		Thread.sleep(2000);
		System.out.println("ClickedImages");
	}

}
//Failing the test case by giving wrong linktext attribute