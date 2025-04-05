package Facebook_sourcePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_LoginPage {
	
	WebDriver driver;
	
	//Step 1 - locate each element by using @FindBy
	
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="pass")
	WebElement password;
	
	@FindBy(xpath="//button")
	WebElement loginbutton;
	
	//step 2 - create methods for each component
	public void un()
	{
		username.sendKeys("pkamalalaya@gmail.com");
	}
	
	public void pwd()
	{
		password.sendKeys("Parnasala77#");
	}
	public void login()
	{
		loginbutton.click();
	}

	//step 3 . Initialize methods with PageFactory class inside the constructor
	
	public Facebook_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
