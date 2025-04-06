package GTM_AmazonProject1_SourcePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	
	WebDriver driver;
	//step 1
	@FindBy(xpath="//input[@id=\"ap_customer_name\"]")
	WebElement customername;
	
	@FindBy(xpath="//input[@id=\"ap_email\"]")
	WebElement emailid;
	
	@FindBy(xpath="//input[@id=\"ap_password\"]")
	WebElement password;
	
	@FindBy(xpath="//input[@id=\"ap_password_check\"]")
	WebElement reenterpassword;
	
	@FindBy(xpath="//span[@id=\"auth-continue\"]")
	WebElement verifyemail;
	
	@FindBy(xpath="//input[@class=\"a-button-input\"]")
	WebElement CreateyourAmazonAccount;
	
	
	
	//step 2
	//customer name
	public void customer_name()
	{
		customername.sendKeys("Kamalalaya Parnasala");
	}
	
	//email id field
	public void email_id()
	{
		emailid.sendKeys("pkamalalaya@gmail.com");
	}
	
	//enter password
		public void pwd()
		{
			password.sendKeys("abcd1234");
		}
	
		//re-enter password
	public void re_enterpassword()
	{
		reenterpassword.sendKeys("abcd1234");
	}
	
	//click on verify email
	public void verify_email()
	{
		verifyemail.click();
	}
	
	//click on create your own amazon account
	public void Create_Amazon_Account()
	{
		CreateyourAmazonAccount.click();
	}
	
	
	
	
	
	
	
	
	//step3
	public RegistrationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
