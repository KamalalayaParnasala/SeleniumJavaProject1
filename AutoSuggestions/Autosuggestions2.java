package AutoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestions2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.google.com");
		
		WebElement e1 = driver.findElement(By.cssSelector("#APjFqb"));	
		e1.sendKeys("India");
		Thread.sleep(2000);
		
		
		List <WebElement> e2= driver.findElements(By.xpath("//div[@class=\"OBMEnb\"]/ul/li"));
		int noofautosuggestions = e2.size();
		System.out.println(noofautosuggestions);
		e2.get(1).click();
		Thread.sleep(4000);
		driver.close();
		

	}

}
