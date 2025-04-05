package seleniumbasics;

import java.util.Scanner;

public class ScannerClassCircumferanceOfTriangle {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter Value of a");
		int a = s1.nextInt();
		
		
		System.out.println("Enter Value of b");
		int b = s1.nextInt();
	
		
		
		System.out.println("Enter Value of c");
		int c = s1.nextInt();
		
		
		
		
		int P = a+b+c; 
		System.out.println("Value of Perimeter of a Triangle is: " + P);

	}

}
