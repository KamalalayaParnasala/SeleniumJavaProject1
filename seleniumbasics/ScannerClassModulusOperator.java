package seleniumbasics;

import java.util.Scanner;

public class ScannerClassModulusOperator {

	public static void main(String[] args) {
		
		Scanner S1 = new Scanner(System.in);
		
		System.out.println("Enter the value of a");
		int a = S1.nextInt();
		
		System.out.println("Enter the value of b");
		int b = S1.nextInt();
		
		int c = a%b;
		System.out.println(" value of c is: " + c);
	}

}
