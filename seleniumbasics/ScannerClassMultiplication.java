package seleniumbasics;

import java.util.Scanner;

public class ScannerClassMultiplication {

	public static void main(String[] args) {
		Scanner S1 = new Scanner(System.in);
		
		System.out.println("enter value for a");
		 int a =  S1.nextInt();
		 System.out.println("enter value for a");
		 int b =  S1.nextInt();
		 int c =  a*b;
		 
		 System.out.println("multiplication value is"+" " + c);
		 S1.close();
		
		
		

	}

}
