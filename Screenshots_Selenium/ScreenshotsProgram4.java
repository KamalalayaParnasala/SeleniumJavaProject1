package Screenshots_Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.TakesScreenshot;

public class ScreenshotsProgram4 {

	public static void main(String[] args) throws InterruptedException, IOException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.navigate().refresh();
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		WebElement s2 = driver.findElement(By.xpath("//select[@class=\"nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown\"]"));
		Select s1 = new Select(s2);
		s1.selectByIndex(5);
		Thread.sleep(1000);
		//WebElement s3 = driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]"));
		//s3.sendKeys(Keys.ENTER);
		
		TakesScreenshot ts = driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\kamal\\Downloads\\Eclipse Oxygen\\SeleniumProject\\screenshotsource\\three "+ Math.random() +".png");
		FileHandler.copy(source, destination);
		driver.close();
		

	}

}
