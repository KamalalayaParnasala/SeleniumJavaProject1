package CallingStatements;

class SuperCallingStatement_Class3
{
	SuperCallingStatement_Class3()
	{
		SuperCallingStatement_Class3();
		{
			System.out.println("I am Constructor 3");
	}
}

	private void SuperCallingStatement_Class3() {
		// TODO Auto-generated method stub
		
	}
}

class SuperCallingStatement_Class2 extends SuperCallingStatement_Class3
{
	SuperCallingStatement_Class2()
	{
		super();
		System.out.println("I am Constructor 2");
}
}
public class SuperCallingStatement_Class1 extends SuperCallingStatement_Class2
{
	SuperCallingStatement_Class1()
	{
		super();
		System.out.println("I am Constructor 1");
}
	public static void main(String[] args) {
		
		new SuperCallingStatement_Class1();
		

	}

	//we dont need to write super calling statement all the time, it will be present in all the constructors implicitly.
}
//WAP for Super Calling statement