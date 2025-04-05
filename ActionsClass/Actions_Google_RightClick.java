package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Google_RightClick {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		
		driver.navigate().refresh();
		driver.navigate().refresh();
		//WebElement e1 = driver.findElement(By.xpath("//button[text()='Stay signed out']"));
		//e1.click();
		Actions a1=new Actions(driver);
		WebElement email = driver.findElement(By.xpath("(//a[@class=\"gb_X\"])[1]"));
		Thread.sleep(5000);
		a1.moveToElement(email).contextClick().build().perform();
		Thread.sleep(5000);
		
		driver.close();
		
	}

}
