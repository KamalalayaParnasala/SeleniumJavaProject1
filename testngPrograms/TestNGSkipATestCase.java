package testngPrograms;

import org.testng.annotations.Test;

public class TestNGSkipATestCase {

	@Test(priority=1)
	public void login()
	{
		throw new NullPointerException();
	}
	
	@Test(priority=2, dependsOnMethods="login")
	public void logout()
	{
		
	}
}
