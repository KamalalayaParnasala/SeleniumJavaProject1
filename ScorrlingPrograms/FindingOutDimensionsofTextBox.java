package ScorrlingPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingOutDimensionsofTextBox {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.navigate().refresh();
		driver.navigate().refresh();
		
		WebElement e1 = driver.findElement(By.cssSelector(".gLFyf"));
		Dimension d1 = e1.getSize();
		int x = d1.getWidth();
		int y = d1.getHeight();
		System.out.println(x);
		System.out.println(y);
		driver.close();
		

	}

}
