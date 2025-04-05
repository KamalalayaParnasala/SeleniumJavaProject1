package handlingPopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_JavaScript_PopupDismiss {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/kamal/Downloads/learningHTML1.html");
		driver.switchTo().alert().dismiss();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement e1 = driver.findElement(By.id("1"));
		e1.sendKeys("Kamala");
		Thread.sleep(2000);
		
		driver.close();
	}

}

//it is always advisbale to use alert.accept when there is only one option
//when there is two options given like agree, disagree. then we can use dismiss if we dont want to accept.