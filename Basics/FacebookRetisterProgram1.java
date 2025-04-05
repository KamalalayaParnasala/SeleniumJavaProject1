package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class FacebookRetisterProgram1 {

	@Test()
	public void registration(String input) throws InterruptedException
	{
		
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		
		//first name field
		WebElement e1=driver.findElement(By.name("firstname"));
		e1.sendKeys(input);
		Thread.sleep(1000);
		
		//last name field
		WebElement e2=driver.findElement(By.name("lastname"));
		e2.sendKeys(input);
		Thread.sleep(1000);
		
		//mobile number field
		WebElement mobileno=driver.findElement(By.xpath("(//input[@class=\"inputtext _58mg _5dba _2ph-\"])[5]"));
		mobileno.sendKeys(input);
		Thread.sleep(1000);
		
		//new password field
		WebElement password = driver.findElement(By.xpath("(//input[@class=\"inputtext _58mg _5dba _2ph-\"])[7]"));
		password.sendKeys(input);
		Thread.sleep(1000);
		
		//signup button
		WebElement e7=driver.findElement(By.name("websubmit"));
		e7.click();
		Thread.sleep(1000);
		
		driver.close();

	}

}
