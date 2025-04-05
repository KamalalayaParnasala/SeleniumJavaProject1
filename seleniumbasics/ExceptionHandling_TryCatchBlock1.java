package seleniumbasics;

public class ExceptionHandling_TryCatchBlock1 {

	public static void main(String[] args) {
		try {
			
		
		int a = 1/0; //1/0 is infiniti, so throwing arithmatic exception.
		}
		catch ( java.lang.ArithmeticException n)
		{
			System.out.println("Handled the Exception");
		}
	}

}
