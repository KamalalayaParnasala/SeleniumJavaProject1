package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchAmazon_Namelocator {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.navigate().refresh();
		driver.navigate().refresh();
		Thread.sleep(3000);
		WebElement s2 = driver.findElement(By.name("field-keywords"));
		s2.sendKeys("Shoes");
		Thread.sleep(3000);
		WebElement s3 = driver.findElement(By.id("nav-search-submit-button"));
		s3.sendKeys(Keys.ENTER);
		//s3.click();
		
		driver.close();
	}

}

/*Launch Amazon search shoes        
Launch Amazon search shoes ---->Press enter button        
Launch Amazon search shoes ---->Click on search button.  */