package ExceptionPrograms;

public class Exception1 {

	public static void main(String[] args) {
		
		try {
		int a = 1/0;
		System.out.println(a);
		}
		catch(java.lang.ArithmeticException b)
		{
			System.out.println("Exception handled");
		}
	}

}
//WAP on exception handling in java