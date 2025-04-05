package seleniumbasics;

import java.util.Scanner;

public class ScannerClassAreaOfRectangle {

	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter the Value of a");
		long l = s1.nextLong();
		
		System.out.println("Enter the Value of a");
		long w = s1.nextLong();
		
		long A = l*w;
		
		System.out.println("Area of Rectangle is: " + A);
		
		
		
		
	}

}
