package GTM_AmazonProject1_SourcePages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
		WebDriver driver;
		//AccountandLists
		@FindBy(xpath="//span[@class=\"nav-line-2 \"]")
		WebElement AccountandLists;
		
		//start here
		@FindBy(xpath="//a[@class=\"nav-a\"]")
		WebElement starthere;
	
		//step2
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
		
		public void hoveroverAccountandLists(WebDriver driver)
		{
			Actions a1 = new Actions(driver);
			a1.moveToElement(AccountandLists).perform();
		}
		
		public void clickon_starthere()
		{
			starthere.click();
		}
		
		//step 3
		public HomePage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

}
