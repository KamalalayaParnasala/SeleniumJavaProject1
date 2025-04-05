package handlingPopups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingMultipleWindows_GetWindowHandlesProgram2 {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
				
		WebElement registerbutton=driver.findElement(By.xpath("//a[@class=\"nI-gNb-lg-rg__register\"]"));
		registerbutton.click();
		
		WebElement googlebutton = driver.findElement(By.xpath("//span[@class=\"google-text\"]"));
		googlebutton.click();
		Thread.sleep(1000);
		
		Set<String> pcid = driver.getWindowHandles();
		Iterator<String> i1 = pcid.iterator();
		String parentid =i1.next();
		String childid=i1.next();
		System.out.println(parentid);
		System.out.println(childid);
		
		driver.switchTo().window(childid);
		driver.quit();

	}

}
