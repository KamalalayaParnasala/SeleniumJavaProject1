package handlingPopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_JavaScriptPopup {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/kamal/Downloads/learningHTML1.html");
		driver.switchTo().alert().accept();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement e1 = driver.findElement(By.id("1"));
		e1.sendKeys("Kamala");
		Thread.sleep(2000);
		
		driver.close();

	}

}
