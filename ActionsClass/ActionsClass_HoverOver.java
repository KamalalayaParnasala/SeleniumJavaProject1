package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionsClass_HoverOver {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.navigate().refresh();
		driver.navigate().refresh();
		Thread.sleep(3000);
		WebElement e1 = driver.findElement(By.xpath("//span[@class=\"nav-line-2 \"]"));
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

//WAP on amazon, hoverover on Accounts, click on sign in, enter username, password and sign in.
