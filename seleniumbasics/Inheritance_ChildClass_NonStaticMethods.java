package seleniumbasics;

class Inheritance_ParentClass_NonStaticMethods{
	
	 void login() 
	{
		 System.out.println("login");
	}
	 void logout()
	{
		 System.out.println("logout");
	}
	 void sensitiveinfo()
	{
		 System.out.println("sensitiveinfo");
		
	}
}

public class Inheritance_ChildClass_NonStaticMethods extends Inheritance_ParentClass_NonStaticMethods
{

	public static void main(String[] args) 
	{
		Inheritance_ChildClass_NonStaticMethods c1 = new Inheritance_ChildClass_NonStaticMethods();
		
		c1.login();
		c1.testcase1();
		c1.logout();
		
		
		c1.login();
		c1.testcase2();
		c1.logout();
		
				
		c1.login();
		c1.testcase3();
		c1.logout();
		
	}
		 void testcase1()
	{
		System.out.println("testcase1");
	}
	 void testcase2()
	{
		System.out.println("testcase2");
	}
	 void testcase3()
	{
		System.out.println("testcase3");
	}

}
