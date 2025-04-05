package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GroTechMindsFormRegistration {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registeration-form/");
		
		//firstname
		WebElement e1 = driver.findElement(By.id("firstName"));
		e1.sendKeys("Kamalalaya");
		
		//lastname
		WebElement e2 = driver.findElement(By.name("lastName"));
		e2.sendKeys("Parnasala");
		
		//email field
		WebElement e3 = driver.findElement(By.xpath("//input[@id=\"email\"]"));
		e3.sendKeys("pkamalalaya@gmail.com");
		
		//phone number
		WebElement e4 = driver.findElement(By.xpath("//input[@id=\"phone\"]"));
		e4.sendKeys("9723456789");
		
		//Gender
		WebElement e9 = driver.findElement(By.xpath("//select[@id=\"gender\"]"));
		Select s1 = new Select(e9);
		s1.selectByVisibleText("Female");
		//e9.click();
		
		//State/Union territory
		WebElement e10 = driver.findElement(By.xpath("//select[@name=\"state\"]"));
		Select s2 = new Select(e10);
		s2.selectByValue("andhraPradesh");
		//e10.click();
		
		//aadhar number
		WebElement e5 = driver.findElement(By.xpath("//input[@id=\"aadhaar\"]"));
		e5.sendKeys("0123456789");
		
		//pan number
		WebElement e6 = driver.findElement(By.xpath("//input[@name=\"pan\"]"));
		e6.sendKeys("ABCDE1234F");
		
		
		//checkbox
		WebElement e7 = driver.findElement(By.id("terms"));
		e7.click();
		////input[@id="terms"]
		
		//Register button
		WebElement e8 = driver.findElement(By.xpath("//button[@name\"Submit\"]"));
		e7.click();
		
		driver.close();

	}

}

//Questions to ask - do we need to click after select by visible text or select by value?
//why checkbox is not selecting? I have tried multiple xpaths, it is working when I find them, not working when I run the code, why?
//why I am seeing backward slashes even though I do not write them while writing xpath? do they cause any issue in the code while running?

