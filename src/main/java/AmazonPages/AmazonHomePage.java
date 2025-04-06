package AmazonPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage {

	
	WebDriver driver;
	//AccountandLists
	@FindBy(xpath="//span[@class=\"nav-line-2 \"]")
	WebElement AccountandLists;
	
	//signin
	@FindBy(xpath="//*[@id=\"nav-flyout-ya-signin\"]/a/span")
	WebElement signin;
	
	//searchbox
	@FindBy(id="twotabsearchtextbox")
	WebElement searchbox;
	
	//step2
	public void hoveroverAccountandLists(WebDriver driver)
	{
		Actions a1 = new Actions(driver);
		a1.moveToElement(AccountandLists).perform();
	}
	
	public void clickonsignin(WebDriver driver)
	{
		Actions a2 = new Actions(driver);
		a2.moveToElement(signin).perform();
		signin.click();
	}
	
	public void search()
	{
		searchbox.sendKeys("Shoes");
		driver.navigate().refresh();
		driver.navigate().refresh();
	}
	
	
	
	//step 3
	public AmazonHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
