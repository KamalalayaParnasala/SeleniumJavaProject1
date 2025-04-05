package Basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launchfacebook_IDName {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.close();
		

	}

}

//Login to facebook using locators ID and name       