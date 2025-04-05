package seleniumbasics;

public class FinallyBlock {

	public static void main(String[] args) {
	 try {
		int a = 1/0;
	 }
	 catch (ArithmeticException a1)
	 {
		 System.out.println("Handled the Exception");
	}

	 finally 
	 {
		 System.out.println("Closing the connection with Database");
	 }
}
}

