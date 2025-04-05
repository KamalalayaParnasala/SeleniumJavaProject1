package FAcebook_TestPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import Facebook_sourcePackage.Facebook_LoginPage;

public class Login_Facebook_Correct_Credentials {
	
	@Test()
	public void logintoFacebook()
	{
			
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/login.php/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	Facebook_LoginPage LoginPage = new Facebook_LoginPage(driver);
	LoginPage.un();
	LoginPage.pwd();
	LoginPage.login();
	
	
	}

}
