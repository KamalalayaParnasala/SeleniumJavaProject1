package Inheritance_Java;

class student10
{
	student10()
	{
		System.out.println("Constructor10");
	}
}
class student20 extends student10
{
	student20()
	{
		System.out.println("Constructor20");
	}
}
class student30 extends student20
{
	student30 ()
	{
		System.out.println("Constructor30");
	}
}

public class SuperCalling_Constructor1_Class4 extends student30  {
	
	
	SuperCalling_Constructor1_Class4()
	{
		
	}
	public static void main(String[] args) {
		
		new SuperCalling_Constructor1_Class4();
		
	}
}

//WAP on constructor chaining method
