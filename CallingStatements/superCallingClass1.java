package CallingStatements;

class superCallingClass3 {
	
	superCallingClass3()
	{
		System.out.println("I am constructor 3");
	}

class superCallingClass2 extends superCallingClass3{
	
	superCallingClass2()
	{
		System.out.println("I am constructor 2");
	}

public class superCallingClass1  extends superCallingClass2{
	
	superCallingClass1()
	{
		System.out.println("I am constructor 1");
	}
	

	public static void main(String[] args) {
		

	}

}
