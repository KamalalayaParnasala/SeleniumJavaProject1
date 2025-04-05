package TestNGPackage2;

import org.testng.annotations.Test;

public class InvocationCountProgram {
	
	
	@Test(invocationCount=10)
	public void login()
	{
		System.out.println("Kamala");
	}

	@Test(invocationCount=9,priority=2)//(enabled=false)
	public void logout()
	{
		System.out.println("Laya");
	}
	
	@Test(timeOut=1000)
	public void search()
	{
		System.out.println("Krishna");
	}
}
