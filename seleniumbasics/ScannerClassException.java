package seleniumbasics;

import java.util.Scanner;

public class ScannerClassException {

	public static void main(String[] args) {
		
		Scanner S1 = new Scanner(System.in);
		System.out.println("Enter Value for a -->");
		int a = S1.nextInt();
		System.out.print("Input Value of a is -->" +a);
		S1.close();
		
	}
}
 