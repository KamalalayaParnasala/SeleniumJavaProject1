package AssertPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertProgram7 {
	
	@Test()
	public void amazonlogin() throws InterruptedException
	{
	
	EdgeDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com/");
	driver.navigate().refresh();
	driver.navigate().refresh();
	Thread.sleep(1000);
	//hoverover on sign in
	WebElement e1 = driver.findElement(By.xpath("//span[@class=\"nav-line-2 \"]"));
	e1.click();
	
	//username
	WebElement e2 = driver.findElement(By.id("ap_email"));
	e2.sendKeys("sesha_kiran@yahoo.com");
	
	
	WebElement e3 = driver.findElement(By.id("continue"));
	e3.click();
	
	//password
	WebElement e4 = driver.findElement(By.name("password"));
	e4.sendKeys("@dim@ty@m2021");
	
	WebElement e5 = driver.findElement(By.id("signInSubmit"));
	e5.click();
	
	Assert.assertEquals(driver.getTitle(), "Amazon.com. Spend less. Smile more.", "Sorry, login is not successful");
	driver.close();
	}

}
