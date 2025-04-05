package AutoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestions_1mg {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.1mg.com/?wpsrc=Google+Organic+Search");
		driver.navigate().refresh();
		driver.navigate().refresh();
		
		//Searchbox
		WebElement e1 = driver.findElement(By.xpath("//input[@id=\"srchBarShwInfo\"]"));	
		e1.sendKeys("dolo");
		e1.click();
		Thread.sleep(2000);
		
		//autosuggestion drop down
		List <WebElement> e2= driver.findElements(By.xpath("//div[@class=\"styles_search-results-container__3OUHy\"]/ul/li"));
		int noofautosuggestions = e2.size();
		System.out.println(noofautosuggestions);
		e2.get(2).click();
		Thread.sleep(4000);
		driver.close();

	}

}
