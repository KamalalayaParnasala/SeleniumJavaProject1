package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Shoes_xpath {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
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
		driver.close();
	}

}
