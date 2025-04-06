package AmazonPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLoginPage {
	
	WebDriver driver;
	//step1
	//username
		@FindBy(id="ap_email")
		WebElement username;
		
		//continue
		@FindBy(id="continue")
		WebElement continuebutton;
		
		//password
		@FindBy(name="password")
		WebElement password;
		
		//signin
		@FindBy(xpath="//span[@id=\"auth-signin-button\"]")
		WebElement signin2;
		
		//step 2
		public void un()
		{
			username.sendKeys("sesha_kiran@yahoo.com");
		}
		
		public void click_on_continue() 
		{
			continuebutton.click();
		}
		
		public void pwd()
		{
			password.sendKeys("@dim@ty@m2021");
		}
		
		public void click_on_signin2()
		{
			signin2.click();
		}

		//step 3
		
		public AmazonLoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
}
