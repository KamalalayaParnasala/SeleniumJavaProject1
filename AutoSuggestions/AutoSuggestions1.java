package AutoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoSuggestions1 {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement e1=	driver.findElement(By.name("q"));
		e1.sendKeys("Modi");
		Thread.sleep(4000);
		List<WebElement> e2=	driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int noofautosuggestion=	e2.size();
		System.out.println(noofautosuggestion);
		e2.get(1).click();
	}

}

//Clicking on the first element in the autosuggestions list 
