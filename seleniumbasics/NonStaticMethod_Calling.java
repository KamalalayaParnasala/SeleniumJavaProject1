package seleniumbasics;

public class NonStaticMethod_Calling {
	
	

	public static void main(String[] args) {
		
		NonStaticMethod_Calling n1 = new NonStaticMethod_Calling();

		n1.add();
		n1.subtract();
		n1.Multiply();
		n1.Division();
		
	}

	void add ()
	
	{
		int a = 10;
		int b= 20;
		
		int c = a + b;
		System.out.println("Addition of a+b is : " + c);
	}
	
	void subtract ()

	{
		int a = 100;
		int b= 20;
		
		int c = a - b;
		System.out.println("Subtraction of a-b is : " + c);
	}
	
void Multiply()

	{
		int a = 10;
		int b= 20;
		
		int c = a * b;
		System.out.println("Multiplication of a*b is : " + c);
	}

void Division()

{
	int a = 100;
	int b= 20;
	
	int c = a / b;
	System.out.println("Division of a/b is : " + c);
}

}
