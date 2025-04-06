package GTM_AmazonProject1_TestPages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import GTM_AmazonProject1_SourcePages.HomePage;
import GTM_AmazonProject1_SourcePages.LoginPage;
import GTM_AmazonProject1_SourcePages.RegistrationPage;
import UtilitiesPackage.Screenshots;

public class TestCase1 extends LauchandQuitAmazonPage
{

	
	/*//Registration scenario
	 @Test()
	 public void Registration() throws IOException, InterruptedException
	{
		HomePage homepage = new HomePage(driver);
		//homepage.hoveroverAccountandLists(driver);
		//homepage.clickon_starthere();
						
		//create New account and taking screenshot
		RegistrationPage register = new RegistrationPage(driver);
		register.customer_name();
		register.email_id();
		register.pwd();
		register.re_enterpassword();
		register.verify_email();
		Thread.sleep(25000);
		register.Create_Amazon_Account();
		
		Screenshots screenshot = new Screenshots();
		screenshot.TakeScreenshots(driver);
		screenshot.DateandTime();
	}*/
	
	//signin with correct email id and password
		@Test()
		public void correct_login() throws IOException
		{
		
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.hoveroverAccountandLists(driver);
		loginpage.click_on_signin(driver);
		loginpage.un();
		loginpage.click_on_continue();
		loginpage.pwd();
		loginpage.click_on_signin2();
		
		Screenshots screenshot = new Screenshots();
		screenshot.TakeScreenshots(driver);
		screenshot.DateandTime();
		}
		
		//signin with correct username and wrong password, changing the password to execute this scenario
		/*@Test()
		public void incorrect_login() throws IOException
		{
		LoginPage loginpage = new LoginPage(driver);
		loginpage.hoveroverAccountandLists(driver);
		loginpage.click_on_signin(driver);
		loginpage.un();
		loginpage.click_on_continue();
		loginpage.pwd();
		loginpage.click_on_signin2();
		
		Screenshots screenshot = new Screenshots();
		screenshot.TakeScreenshots(driver);
		screenshot.DateandTime();
		}*/
		
		
	}

//failed scenario is also passing as I have fingerprint setup in my laptop, need to recheck this one
//when we declared webdriver in the source page, we dont need to declare that again in test page
//include listeners and then take screenshot then finish this one
//Account successfully created - screenshot # Kamala Laya0.8735611525204816.png
//changing the email id for ease of use
//signing in with correct credentials - seeing unexpected captch, screenshot is taking that one
//how to encounter this scenario in real time? correct credentials screenshot # Kamala Laya0.6990273764818645.png