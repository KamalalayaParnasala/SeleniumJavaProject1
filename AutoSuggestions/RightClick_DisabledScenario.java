package AutoSuggestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class RightClick_DisabledScenario {

	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		
		//url launch
		driver.get("https://www.onlinesbi.sbi");
		driver.navigate().refresh();
		//login button
		WebElement e1 = driver.findElement(By.cssSelector(".classicTxt"));
		e1.click();
		
		//continue to login button
		WebElement e2 = driver.findElement(By.xpath("//a[@class=\"login_button\"][1]"));
		e2.click();
		Thread.sleep(1000);
		
		//username
		WebElement e3 = driver.findElement(By.name("userName"));
		e3.sendKeys("Kamala");
		Thread.sleep(1000);
		
		//password
		WebElement e4 = driver.findElement(By.name("password"));
		e4.sendKeys("Laya");
		Thread.sleep(1000);
		
		driver.close();
		
		
	}

}

//WAP on SBI application to click on Continue to login button where Right click is disabled.
//cssSelector - .classname - //.classicTxt
//Fn key + F12 button(to press F12 button)