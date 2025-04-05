package TestNGPackage2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrderofPriorityProgram2 {
	
	
	@BeforeMethod
	public void BM()
	{
		System.out.println("before method");
}
	
	@Test
	public void login1()
	{
		System.out.println("Test1");
}
	@AfterMethod
	public void AM()
	{
		System.out.println("after method");
}
	
	
	
	
	@Test
	public void login2()
	{
		System.out.println("Test2");
}
	

}
