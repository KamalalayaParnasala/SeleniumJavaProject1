package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google_LinkTextlocator {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.navigate().refresh();
		driver.navigate().refresh();
		
		//Clicking Gmail with partialLinkText
		WebElement email = driver.findElement(By.partialLinkText("ail"));
		email.click();

		//Gmail with linkText
		//WebElement email = driver.findElement(By.linkText("Gmail"));
		//email.click();
		
		
		Thread.sleep(5000);
		
		driver.close();

	}

}

//Assignment # 152
//use Linked text locator and click on gmail in google.com
