package AssertPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class AssertProgram11 {
	
	@Test()
	public void assertingnoofelements() throws InterruptedException
	{
	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com/");
	driver.navigate().refresh();
	driver.navigate().refresh();
	Thread.sleep(1000);
	
	//Search shoes
		WebElement s2 = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		s2.sendKeys("Shoes");
		Thread.sleep(3000);
		
		List<WebElement> s3 = driver.findElements(By.xpath("//div[@class=\"two-pane-results-container\"]/div/div"));
		
		
		Assertion a1 = new Assertion();
		
		a1.assertEquals(s3.size()>100, true, "Sorry, validation failed");
	
	
	driver.close();
	}

}

//finding shoes autosuggestions, getting size, asserting whether the size is greater than 100, here assertion is false, true - making it false
