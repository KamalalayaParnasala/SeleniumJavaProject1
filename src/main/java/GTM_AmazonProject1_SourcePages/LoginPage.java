package GTM_AmazonProject1_SourcePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	//Step1
	//AccountandLists
	@FindBy(xpath="//span[@class=\"nav-line-2 \"]")
	WebElement AccountandLists;
	
	//signin
	@FindBy(xpath="//*[@id=\"nav-flyout-ya-signin\"]/a/span")
	WebElement signin;
	
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
	public void hoveroverAccountandLists(WebDriver driver)
	{
		Actions a1 = new Actions(driver);
		a1.moveToElement(AccountandLists).perform();
		
	}
	
	public void click_on_signin(WebDriver driver)
	{
		Actions a2 = new Actions(driver);
		a2.moveToElement(signin).perform();
		signin.click();
	}
	
	//step 2
	public void un()
		{
			username.sendKeys("pkamalalaya@gmail.com");
		}
			
	public void click_on_continue() 
		{
			continuebutton.click();
		}
			
	public void pwd()
		{
			password.sendKeys("abcd1234");
		}
			
	public void click_on_signin2()
		{
			signin2.click();
		}
	
	//step3
		public LoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

}

//correct password is "abcd1234"