package seleniumbasics;

//inheritance with static methods
class Inheritance_ParentClass{
	
	public static void login() 
	{
		System.out.println("login");
	}
	public static void logout()
	{
		System.out.println("logout");
	}
	public static void sensitiveinfo()
	{
		System.out.println("sensitiveinfo");
	}
}

public class Inheritance_ChildClass extends Inheritance_ParentClass

{

	public static void main(String[] args) {
		
		login() ;
		testcase1();
		logout();
		
		login() ;
		testcase2();
		logout();
		
		login();
		testcase3();
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
		System.out.println("testcase3");
	}
}

//WAP on single level inheritance