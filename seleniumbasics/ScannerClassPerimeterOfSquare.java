package seleniumbasics;

import java.util.Scanner;

public class ScannerClassPerimeterOfSquare {

	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter the Value of side1");
		long side1 = s1.nextLong();
		
	
		long P = 4*side1;
		
		System.out.println("Perimeter of Square is: " + P);
	}

}
