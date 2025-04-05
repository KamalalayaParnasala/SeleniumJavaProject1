package Basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class LaunchingBrowser {

	public static void main(String[] args) {
		//ChromeDriver driver = new ChromeDriver();
		//EdgeDriver driver = new EdgeDriver();
		//SafariDriver driver = new SafariDriver();
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.close();
	}

}

/*WAP for launching  empty browser using :
Example:
ChromeDriver()
EdgeDriver()
FirefoxDriver()
SafariDriver()*/