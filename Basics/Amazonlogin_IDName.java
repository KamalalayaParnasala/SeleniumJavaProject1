package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazonlogin_IDName {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
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
	}

}

//Login to amazon using locators ID and name   
//Assignment 147