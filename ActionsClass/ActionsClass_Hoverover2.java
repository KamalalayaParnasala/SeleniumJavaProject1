package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass_Hoverover2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.navigate().refresh();
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		Actions a1= new Actions(driver);
		WebElement e1 = driver.findElement(By.xpath("//span[@class=\"nav-line-2 \"]"));
		a1.moveToElement(e1).build().perform();
		e1.click();
		
		WebElement e2 = driver.findElement(By.xpath("//input[@id=\"ap_email\"]"));
		e2.sendKeys("sesha_kiran@yahoo.com");
		
		WebElement e3 = driver.findElement(By.xpath("//input[@id=\"continue\"]"));
		e3.click();
		
		WebElement e4 = driver.findElement(By.xpath("//input[@id=\"ap_password\"]"));
		e4.sendKeys("");
		
		WebElement e5 = driver.findElement(By.xpath("//input[@class=\"a-button-input\"]"));
		e5.click();
	}

}
