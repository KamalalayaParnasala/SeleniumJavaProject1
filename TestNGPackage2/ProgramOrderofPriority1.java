package TestNGPackage2;

import org.testng.annotations.Test;

public class ProgramOrderofPriority1 {

	
	@Test(priority=3)
	public void login()
	{
		System.out.println("1");
}
	@Test(priority=4)
	public void logout()
	{
		System.out.println("2");
}
	@Test(priority=2)
	public void registration()
	{
		System.out.println("3");
}
	@Test(priority=1)
	public void amount()
	{
		System.out.println("4");
}
}
