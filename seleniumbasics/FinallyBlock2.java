package seleniumbasics;

public class FinallyBlock2 {

	public static void main(String[] args) {
		try
		{
			int a = 1/1;
			System.out.println(a);
		
		}
		catch (ArithmeticException a1)
		{
			System.out.println("Handled the Exception");
		}
		finally
		{
			System.out.println("Closing the Connection with Database");
		}

	}

}
