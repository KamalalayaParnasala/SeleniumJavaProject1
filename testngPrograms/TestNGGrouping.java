package testngPrograms;

import org.testng.annotations.Test;

public class TestNGGrouping {
	
	@Test(groups=("Smoke"))
	public void testcase1()
	{
		
	}

	@Test(groups={"Smoke","Regression"})
	public void testcase2()
	{
		
	}
	@Test(groups={"Smoke","System"})
	public void testcase3()
	{
		
	}
	@Test(groups=("Smoke"))
	public void testcase4()
	{
		
		
	}
	
}
//it seems when we are assigning a test case to different groups, we need to use curly braces.
//when we are assigning a test case to a single group regular brackets are working fine, now throwing any errors.

