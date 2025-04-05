package seleniumbasics;

import java.util.Scanner;

public class ScannerClassAreaOfSquare {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter the Value of a");
		long side1 = s1.nextLong();
		
		System.out.println("Enter the Value of a");
		long side2 = s1.nextLong();
		
		long A = side1*side2;
		
		System.out.println("Area of Square is: " + A);
	}

}
