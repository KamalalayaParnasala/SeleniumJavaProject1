package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LunchGoogle {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//driver.navigate().refresh();
		//driver.navigate().refresh();
		WebElement e1 = driver.findElement(By.id("APjFqb"));
		e1.sendKeys("India");
		Thread.sleep(2000);
		e1.sendKeys(Keys.ENTER);
		driver.close();
		
		
		}

}
//Launch Google----> search India----->enter button        
//Launch Amazon search shoes ---->Press enter button