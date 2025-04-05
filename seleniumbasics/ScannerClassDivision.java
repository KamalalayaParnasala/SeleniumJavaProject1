package seleniumbasics;

import java.util.Scanner;

public class ScannerClassDivision {

	public static void main(String[] args) {
		
		Scanner S1=new Scanner(System.in);
		System.out.println("Enter value for a");
		short a = S1.nextShort();
		System.out.println("Enter value for b");
		short b = S1.nextShort();
		int c = a/b;
		
		System.out.println("Division Value is:"+ " "+ c);

	}

}
