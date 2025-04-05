package AutoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Autosuggestions3 {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.navigate().refresh();
		driver.navigate().refresh();
		Thread.sleep(1000);
		//Search shoes
		WebElement s2 = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		s2.sendKeys("Shoes");
		Thread.sleep(3000);
		
		List<WebElement> s3 = driver.findElements(By.xpath("//div[@class=\"two-pane-results-container\"]/div/div"));
		int count = s3.size();
		System.out.println(count);
		
		s3.get(count-2).click();
		Thread.sleep(5000);
		
		driver.close();
		////div[@id="sac-suggestion-row-1"]/div/div
	}

}

//what does this count-2 retrieves? indexing or length?

