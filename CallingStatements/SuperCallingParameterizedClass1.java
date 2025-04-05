package CallingStatements;
class SuperCallingParameterizedClass4{
	
	SuperCallingParameterizedClass4(String Name)
	{
		System.out.println("I am Constructor 1");
	}
class SuperCallingParameterizedClass3 extends SuperCallingParameterizedClass4 {
	
	SuperCallingParameterizedClass3()
	{
	
		super("Kamala");
		System.out.println("I am Constructor 1");
	}


class SuperCallingParameterizedClass2 extends SuperCallingParameterizedClass3{
	
	SuperCallingParameterizedClass2()
	{
		
		System.out.println("I am Constructor 1");
	}

public class SuperCallingParameterizedClass1 extends SuperCallingParameterizedClass2 {
	
	SuperCallingParameterizedClass1()
	{
		System.out.println("I am Constructor 1");
	}

	public static void main(String[] args) {
		
	}

}
