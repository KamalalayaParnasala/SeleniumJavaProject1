package ScorrlingPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class ScrollingProgram1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.navigate().refresh();
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		WebElement e1 = driver.findElement(By.linkText("About Amazon"));
		
		Point p1 = e1.getLocation();
		int x = p1.getX();
		int y = p1.getY();
		
	//JavascriptExecutor js = driver;
	
	/*for (int i=0; i<4; i++)
	{
		js.executeScript("window.scrollBy(0,500)");
	}
	*/
	//as we are not seeing About amazon (it is hidden below black header and chrome is controlled by automation driver, we need to reduce the y coordinate size to scroll little up.
		
	 int y1= y-180;
	JavascriptExecutor js = driver;
	js.executeScript("window.scrollBy(0,"+y1+")");
	Thread.sleep(2000);
	e1.click();
	
	
		System.out.println(x);
		System.out.println(y);
		
		driver.close();
	}

}

/*scroll down - give y value
scroll up - y value should be negative
scroll right - give x value
scroll left - x value should be negative*/

//we can use for loop with some x or y values to make the scroll for multiple times, 
//but it is always good practice to give +y+ or +x+ to fetch the correct coordinates
