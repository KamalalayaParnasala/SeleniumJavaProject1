package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CutPaste {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/kamal/Downloads/learningHTML1.html");
		
		WebElement e1 = driver.findElement(By.id("1"));
		e1.sendKeys("manish");
		Thread.sleep(1000);
		e1.sendKeys(Keys.CONTROL +"a");
		Thread.sleep(1000);
		e1.sendKeys(Keys.CONTROL +"X");
		Thread.sleep(1000);
		WebElement e2 = driver.findElement(By.id("2"));
		e2.sendKeys(Keys.CONTROL+"V");
		Thread.sleep(1000);
		driver.close();

	}

}
//WAP on Cut and Paste