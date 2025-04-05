package AssertPrograms;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertProgram13 {
	
	@Test()
	public void softassertprogram() throws InterruptedException
	{
	EdgeDriver driver = new EdgeDriver();
	
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
	
	SoftAssert s1 = new SoftAssert();
	s1.assertEquals(driver.getWindowHandles().size()>10, true, "Sorry, mismatch");
	s1.assertAll();
	Thread.sleep(1000);
	driver.manage().window().maximize();
	
	
	
	}

}
