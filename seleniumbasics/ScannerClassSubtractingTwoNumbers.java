package seleniumbasics;

import java.util.Scanner;

public class ScannerClassSubtractingTwoNumbers {

	public static void main(String[] args) {
		Scanner s1= new Scanner (System.in);
		System.out.println("Enter Value for a");
		int a = s1.nextInt();
		System.out.println("Enter Value for b");
		int b = s1.nextInt();
		int c = a-b;
		System.out.println("Value is" + " "  +c);
		
		
	}

}
