package AssertPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class AssertProgram12 {
	
	@Test()
	public void autosuggestions() throws InterruptedException
	{
	EdgeDriver driver = new EdgeDriver();
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
	int count = s3.size();
	System.out.println(count);
	
	/*s3.get(count-2).click();
	Thread.sleep(5000);*/
	
	Assertion a1 = new Assertion();
	a1.assertEquals(count==10, true, "Working as expected");
			
	
	driver.close();
	}

}

//Finding shoe, autosuggestions, getting the size of autosuggestions, asserting using count
