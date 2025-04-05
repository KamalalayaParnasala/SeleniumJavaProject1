package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Registration {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//username
		WebElement e1 = driver.findElement(By.name("email"));
		e1.sendKeys("pkamalalaya@gmail.com");
		
		//password
		WebElement e2 = driver.findElement(By.id("pass"));
		e2.sendKeys("laya0112#");
		
		//login button
		
		WebElement e3 = driver.findElement(By.xpath("//button[@class=\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\"]"));
		e3.click();
		Thread.sleep(5000);
		
		driver.close();
		
	}

}

//Assignment # 148
//Login to facebook using locators ID and name    

