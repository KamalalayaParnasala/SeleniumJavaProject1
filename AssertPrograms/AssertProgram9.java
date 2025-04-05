package AssertPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertProgram9 {
	
	@Test()
	public void searchshoe() throws InterruptedException
	{

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.navigate().refresh();
		driver.navigate().refresh();
		Thread.sleep(1000);
		WebElement s2 = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		s2.sendKeys("Shoes" +Keys.ENTER);
		Thread.sleep(1000);
		
		WebElement findfirstshoe = driver.findElement(By.xpath("(//div[@class=\"a-section aok-relative s-image-tall-aspect\"])[1]"));
		findfirstshoe.click();
		
		WebElement Addtocart = driver.findElement(By.xpath("//span[@id=\"submit.add-to-cart\"]"));
		Addtocart.click();
		
		WebElement AddedtoCart = driver.findElement(By.xpath("//h1[@class=\"a-size-medium-plus a-color-base sw-atc-text a-text-bold\"]"));
		Assert.assertEquals(AddedtoCart.getText(), "Added to cart", "Sorry did not match");
		System.out.println("Assert class is success");
		driver.close();
		}
}

//WAP using hard assert(Assert class string string string), by using getText()method. found autosuggestions, found first shoe and then added to cart
//by using getText() method, asserted whether it is working fine or not