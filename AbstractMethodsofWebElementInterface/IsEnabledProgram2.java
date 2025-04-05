package AbstractMethodsofWebElementInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledProgram2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement e1=	driver.findElement(By.cssSelector("textarea.gLFyf"));
		
		boolean b1=e1.isEnabled();
		
		if (b1==true)
		{
			e1.sendKeys("SRK" + Keys.ENTER);
			
		}
		
		Thread.sleep(2000);
		//System.out.println(b3);
		driver.close();
	}
	
	}


