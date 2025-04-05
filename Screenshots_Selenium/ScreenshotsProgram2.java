package Screenshots_Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.TakesScreenshot;

public class ScreenshotsProgram2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.navigate().refresh();
		driver.navigate().refresh();
		Thread.sleep(1000);
		WebElement s2 = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		s2.sendKeys("Shoes");
		Thread.sleep(1000);
		WebElement s3 = driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]"));
		s3.sendKeys(Keys.ENTER);
		
		TakesScreenshot ts = driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\kamal\\Downloads\\Eclipse Oxygen\\SeleniumProject\\screenshotsource\\one.png");
		FileHandler.copy(source, destination);
		driver.close();

	}

}
