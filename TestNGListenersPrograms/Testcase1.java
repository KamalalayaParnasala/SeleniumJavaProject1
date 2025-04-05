package TestNGListenersPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(TestNGListenersProgram1.class)
public class Testcase1 extends TestNGListenersProgram1 {
	
	@Test()
	public void search() throws InterruptedException
	{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.navigate().refresh();
	driver.navigate().refresh();
	WebElement e1 = driver.findElement(By.id("APjFqb"));
	e1.sendKeys("Happy Holi");
	Thread.sleep(2000);
	e1.sendKeys(Keys.ENTER);
	driver.close();
	}

}

//to link listeners program to this class we need to add @Listeners annotation above the class
//in the brackets if the listeners are present in the same package we need to use classname.class
//if the listeners logic is coming from a different package, we need to write packagename.classname.class
//id="APjFqb"