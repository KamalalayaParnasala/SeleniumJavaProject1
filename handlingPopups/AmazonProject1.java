package handlingPopups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonProject1 {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.navigate().refresh();
		driver.navigate().refresh();
		Thread.sleep(1000);
		//hoverover on sign in
		WebElement e1 = driver.findElement(By.xpath("//span[@class=\"nav-line-2 \"]"));
		e1.click();
		
		//username
		WebElement e2 = driver.findElement(By.id("ap_email"));
		e2.sendKeys("sesha_kiran@yahoo.com");
		
		
		WebElement e3 = driver.findElement(By.id("continue"));
		e3.click();
		
		//password
		WebElement e4 = driver.findElement(By.name("password"));
		e4.sendKeys("@dim@ty@m2021");
		
		WebElement e5 = driver.findElement(By.id("signInSubmit"));
		e5.click();
		
		WebElement e6 = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		e6.sendKeys("Shoes");
		Thread.sleep(1000);
		
		WebElement e7 = driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]"));
		e7.sendKeys(Keys.ENTER);

		WebElement secondshoe = driver.findElement(By.xpath("(//div[@class=\"a-section aok-relative s-image-tall-aspect\"])[2]"));
		secondshoe.click();
		
		Set<String> pcid = driver.getWindowHandles();
		System.out.println(pcid);
		
		Iterator<String>i1= pcid.iterator();
		String parentid = i1.next();
		String childid = i1.next();
		
		System.out.println(parentid);
		System.out.println(childid);
		
		driver.switchTo().window(childid);
		
		WebElement wishlist = driver.findElement(By.xpath("//input[@id=\"add-to-wishlist-button-submit\"]"));
		wishlist.click();
		
		Set<String> pcid2 = driver.getWindowHandles();
		//System.out.println(pcid2);
		Iterator<String> i2 = pcid2.iterator();
		String secondparentid =i2.next();
		String secondchildid = i2.next();
		
		driver.switchTo().window(childid);
		Thread.sleep(1000);
		
		WebElement viewyourlist = driver.findElement(By.xpath("//span[@id=\"huc-view-your-list-button\"]"));
		viewyourlist .click();
		
		WebElement addtocartbutton = driver.findElement(By.xpath("(//a[@class=\"a-button-text a-text-center\"])[1]"));
		addtocartbutton .click();
		
		WebElement gotocartbutton = driver.findElement(By.xpath("(//span[@class=\"a-button-inner\"])[1]"));
		gotocartbutton .click();
		
		//WebElement deselectall = driver.findElement(By.xpath("//a[@id=\"deselect-all\"]"));
		//deselectall .click();
		
		//WebElement clickfirstcheckbox = driver.findElement(By.xpath("(//i[@class=\"a-icon a-icon-checkbox\"])[1]"));
		//clickfirstcheckbox.click();
		
		WebElement proceedtobuy= driver.findElement(By.xpath("//input[@name=\"proceedToRetailCheckout\"]"));
		proceedtobuy.click();
		
		WebElement delivertothisaddress= driver.findElement(By.xpath("(//input[@class=\"a-button-input\"])[2]"));
		delivertothisaddress.click();
		
		//driver.close();
	
	}
	

}
//(//div[@class="a-section aok-relative s-image-tall-aspect"])[2]

//Add to wishlist xpath - //input[@id="add-to-wishlist-button-submit"]

//view your list - //span[@id="huc-view-your-list-button"]
//Add to cart - (//a[@class="a-button-text a-text-center"])[1]
//go to cart - (//span[@class="a-button-inner"])[1]
//deselect all - //a[@id="deselect-all"]
//proceedtobuy - //input[@name="proceedToRetailCheckout"]
//delivertothisaddress - (//input[@class="a-button-input"])[2]
