package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook2 {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		driver.manage().window().maximize();
		
		//first name field
		WebElement e1=driver.findElement(By.name("firstname"));
		e1.sendKeys("Laya Kamala");
		
		//last name field
		WebElement e2=driver.findElement(By.name("lastname"));
		e2.sendKeys("Parnasala");
		
		//Birth Year
		WebElement e5 = driver.findElement(By.id("year"));
		Select s1 = new Select(e5);
		s1.selectByValue("2000");
		
		//Gender
		WebElement e6=driver.findElement(By.xpath("(//input[@class='_8esa'])[1]"));
		e6.click();
		
		//email
		WebElement e3=driver.findElement(By.name("reg_email__"));
		e3.sendKeys("pkamalalaya@gmail.com");
		
		//passwprd
		WebElement e4=driver.findElement(By.name("reg_passwd__"));
		e4.sendKeys("laya0112#");
		Thread.sleep(6000);
					
		/*//select your pronoun
		////select[@id="preferred_pronoun"]
		WebElement e8=driver.findElement(By.xpath("(//select[@id=\"preferred_pronoun\"]"));
		e8.click();
		Select s2 = new Select(e8);
		s2.selectByIndex(0);*/
		
		//signup button
		WebElement e7=driver.findElement(By.name("websubmit"));
		e7.click();
	}
 
}
//Do a Registartion on Facebook Except, dropdown, date and checkbox 
//Assingment 149

