package seleniumbasics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling_TryCatchBlock3 {

	public static void main(String[] args) {
		
		try {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the Size of the Array -->");
		int rollno[] = new int[s1.nextInt()];
		
		//NegativeArraySizeException
		}
		catch (NegativeArraySizeException n)
		{
			Scanner s1 = new Scanner(System.in);
			System.out.println("Enter the Size of the Array in positive numbers only starting from 1");
			int rollno[] = new int[s1.nextInt()];
			
		}
		
		catch (InputMismatchException n1)
		{
			Scanner s1 = new Scanner(System.in);
			System.out.println("Enter the Size of the Array in number format only");
			int rollno[] = new int[s1.nextInt()];
			
		}

	}

}
