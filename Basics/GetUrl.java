package Basics;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrl {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String e1 = driver.getTitle();
		System.out.println(e1);
		String e2 = driver.getWindowHandle();
		System.out.println("GetWindowHandle -->" +e2);
		Set<String> s1 = driver.getWindowHandles();
		System.out.println("GetWindowHandles -->" +s1);
		Thread.sleep(3000);
		driver.close();
		//driver.quit();
		
		
	}
;
}

/*WAP for launching a browser and open url.
use method:
Get
GetWindowHandle
GetWindowHandles
Quit
close*/