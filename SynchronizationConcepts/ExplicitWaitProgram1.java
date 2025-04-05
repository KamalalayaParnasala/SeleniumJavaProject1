package SynchronizationConcepts;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWaitProgram1 {
	
	
	
	@Test()
	public void explicitwait() throws IOException
	{
	
	EdgeDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com/");
	driver.navigate().refresh();
	driver.navigate().refresh();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.titleContains("Amazon"));
			
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
	
	TakesScreenshot ts = driver;
	File source =  ts.getScreenshotAs(OutputType.FILE);
	File destination = new File ("C:\\Users\\kamal\\Downloads\\Eclipse Oxygen\\SeleniumProject\\screenshotsource\\two.png");
	FileHandler.copy(source, destination);
	
	/*
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.titleContains("Amazon"));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.titleIs("Amazon"));
	*/
	
	wait.until(ExpectedConditions.urlContains("amazon"));
	wait.until(ExpectedConditions.urlToBe("https://www.amazon.com"));
	wait.until(ExpectedConditions.urlMatches(null));
	wait.until(ExpectedConditions.alertIsPresent());
	//here we need to handle java script popup by switch to.alert();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("xpath")));
	driver.close();
	
	}

}

//taking screenshots using explicit wait
//Explicit wait conditions are case sensitive
//manish shared a blog regarding conditions of explicit wait chk that once