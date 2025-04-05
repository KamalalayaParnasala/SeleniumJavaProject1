package Inheritance_Java;

public class Class3 extends Class2

{

	public static void main(String[] args) {
		
		Class3 c1 = new  Class3();
		
		login();
		add();
		c1.logout();
		
		login();
		c1.sub();
		c1.logout();
		
		login();
		mul();
		c1.logout();
		
		c1.login();
		c1.sensitiveinfo();
		c1.logout();
		
	}
	
	static void add()
	{
		System.out.println("add");
		
	}
	
	void sub()
	{
		System.out.println("sub");
	}
}

//child class
//WAP on multi-level inheritance
//multi level inheritance