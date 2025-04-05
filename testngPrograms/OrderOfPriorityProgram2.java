package testngPrograms;


import org.testng.annotations.Test;

public class OrderOfPriorityProgram2 {
	
	@Test
	public void login()
	{
		System.out.println("1");
}
	@Test
	public void logout()
	{
		System.out.println("2");
}
	@Test
	public void registration()
	{
		System.out.println("3");
}
	@Test
	public void amount()
	{
		System.out.println("4");
}

}
