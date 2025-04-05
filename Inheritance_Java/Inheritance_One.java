package Inheritance_Java;

public class Inheritance_One extends Inheritance_two

{
	public static void main(String[] args) {
		
		Inheritance_One i1 = new Inheritance_One();
		
		login();
		testcase1();
		logout();
		
		login();
		testcase2();
		logout();
		
		login();
		testcase3();
		logout();
		
		login();
		i1.sensitiveinfo();
		logout();
	
				
	}
	
	public static void testcase1()
	{
		System.out.println("testcase1");
	}

	public static void testcase2()
	
	{
		
		System.out.println("testcase2");
	}
	
	public static void testcase3() 
	{
		
		System.out.println("testcase3" );
	}
}

// calling parent class "two" methods inside the child class. Created object of child class, with the help of its reference variable, 
//accessed non static method of parent class.