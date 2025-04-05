package Screenshots_Selenium;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.TakesScreenshot;

public class ScreenshotsProgram5 {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		
		ScreenshotsProgram5 s4 = new ScreenshotsProgram5();
		System.out.println(s4.getClass());
		
		
		//WebElement s3 = driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]"));
		//s3.sendKeys(Keys.ENTER);
		
		Date d1 = new Date();
		System.out.println(d1.getTime());
		
		
		Date d2 = new Date(d1.getTime());
		System.out.println(d2);
		
		String date1= d2.toString();
		String month = date1.substring(4, 7);
		System.out.println(month);
		String date = date1.substring(8, 10);
		System.out.println(date);
		String year = date1.substring(date1.length()-4);
		System.out.println(year);
		String time = date1.substring(11, 19);
		System.out.println(time);
		
		String date2 = date.concat(month).concat(year).concat(time);
		System.out.println(date2);
		String date3 = date.concat("-").concat(month).concat("-").concat(year).concat(time);
		System.out.println(date3);
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.navigate().refresh();
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		
		WebElement s2 = driver.findElement(By.xpath("//select[@class=\"nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown\"]"));
		Select s1 = new Select(s2);
		s1.selectByIndex(9);
		Thread.sleep(1000);
		
		TakesScreenshot ts = driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		//File destination = new File("C:\\Users\\kamal\\Downloads\\Eclipse Oxygen\\SeleniumProject\\screenshotsource.\\Kamala "+Math.random()+".png");
		File destination = new File("C:\\Users\\kamal\\Downloads\\Eclipse Oxygen\\SeleniumProject\\screenshotsource.\\Kamala "+date3+" .png");
		FileHandler.copy(source, destination);
		
		driver.close();
		
		
		
		
	}

}
// if we are taking screenshots with classname and object class method, screenshots are being overriden.
//we can call object class methods - by creating object of class, with the help of its reference variable
//we can call object class methods. By using that classname.objectclassmethod, we can take screenshots.


//File destination = new File("C:\\Users\\kamal\\Downloads\\Eclipse Oxygen\\SeleniumProject\\screenshotsource.\\Kamala "+ new ScreenshotsProgram5().getClass()+".png");
