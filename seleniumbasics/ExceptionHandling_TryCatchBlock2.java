package seleniumbasics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling_TryCatchBlock2 {

	public static void main(String[] args) {
		
		try
		{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the size of the array -->" );
		int rollno[]=new int [s1.nextInt()];
		}
		catch (NegativeArraySizeException n)
		{
			
			Scanner s1 = new Scanner(System.in);
			System.out.println("Enter the size of the array as positive number only" );
			int rollno[]=new int [s1.nextInt()];
			
		}
		
		catch (InputMismatchException n1)
		{
			Scanner s1 = new Scanner(System.in);
			System.out.println("Enter the size of the array in number format only" );
			int rollno[]=new int [s1.nextInt()];
			
			
		}
		
		
	}

}
