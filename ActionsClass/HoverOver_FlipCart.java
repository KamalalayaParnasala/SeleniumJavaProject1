package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOver_FlipCart {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.navigate().refresh();
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		//to close the popup
		WebElement e1 = driver.findElement(By.xpath("//span[@class=\"_30XB9F\"]"));
		e1.click();
		
		//to click on Fashion tab
		Thread.sleep(3000);
		Actions a1 = new Actions(driver);
		WebElement e2 = driver.findElement(By.xpath("(//span[@class = \"_1XjE3T\"])[3]"));
		a1.moveToElement(e2).click().build().perform();
		
		//to go to Men's shirts
		Thread.sleep(3000);
		Actions a2 = new Actions(driver);
		WebElement e3 = driver.findElement(By.xpath("//a[@class=\"_3490ry\"]"));
		a1.moveToElement(e3).click().build().perform();
		
		driver.close();
		
		
		
	}

}
//Men's top wear //a[@class="_1BJVlg _11MZbx"]

		// Men's T shirts//a[@class="_3490ry"]