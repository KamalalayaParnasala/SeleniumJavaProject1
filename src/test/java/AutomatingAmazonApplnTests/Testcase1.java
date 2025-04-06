package AutomatingAmazonApplnTests;

import org.testng.annotations.Test;

import AmazonPages.AmazonHomePage;
import AmazonPages.AmazonLoginPage;

public class Testcase1 extends LaunchandQuit
{

	@Test()
	
	public void login_search_wishlist_cart()
	{
		AmazonHomePage Amzhomepage = new AmazonHomePage(driver);
		Amzhomepage.hoveroverAccountandLists(driver);
		Amzhomepage.clickonsignin(driver);
		
		AmazonLoginPage AmzloginPage = new AmazonLoginPage(driver);
		AmzloginPage.un();
		AmzloginPage.click_on_continue();
		AmzloginPage.pwd();
		AmzloginPage.click_on_signin2();
		
		Amzhomepage.search();
	}
}

//we need below source pages for this scenario
//Homepage
//loginpage
//Search Results page
//Product Page
//Wishlist Page
//Cart page
