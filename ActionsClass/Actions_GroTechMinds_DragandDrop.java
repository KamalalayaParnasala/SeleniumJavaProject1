package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_GroTechMinds_DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.navigate().refresh();
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		//drag and drop
		Actions a1 = new Actions(driver);
		WebElement e1 = driver.findElement(By.xpath("//div[@id=\"container-6\"]"));
		WebElement e2 = driver.findElement(By.xpath("//div[@id=\"div2\"]"));
		a1.dragAndDrop(e1, e2).perform();
		Thread.sleep(5000);
		
		//put it back
		Actions a2 = new Actions(driver);
		WebElement draggable = driver.findElement(By.xpath("//div[@id=\"container-6\"]"));
		WebElement droppable= driver.findElement(By.xpath("//div[@id=\"div2\"]"));
		a2.dragAndDrop(droppable, draggable).perform();
		
		driver.close();
	
	}

}
//Actions class - drag and drop and putting it back