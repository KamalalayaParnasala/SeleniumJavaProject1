package ScorrlingPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class ScrollingProgram2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.navigate().refresh();
		driver.navigate().refresh();
		Thread.sleep(1000);

		WebElement e1 = driver.findElement(By.linkText("About Amazon"));
		Point p1 = e1.getLocation();
		int x =p1.getX();
		int y = p1.getY();
		int y1= y-180;
		JavascriptExecutor js = driver;
		js.executeScript("window.scrollBy(0,"+y1+")");
		Thread.sleep(5000);
		e1.click();
		driver.close();
		
		
		
	}

}
