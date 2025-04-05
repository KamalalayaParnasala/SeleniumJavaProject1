package CSS_SeelctorsPrograms;

import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_SelectorsProgram1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.google.com");
		
		driver.close();
		

	}

}
