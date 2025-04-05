package seleniumbasics;

import java.util.Scanner;

public class ScannerClassPerimeterOfRectangle {

	public static void main(String[] args) {
Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter the Value of l");
		long l = s1.nextLong();
		
		System.out.println("Enter the Value of w");
		long w = s1.nextLong();
		
		long P = 2 * (l+w);
		
		System.out.println("Area of Rectangle is: " + P);
	}

}
