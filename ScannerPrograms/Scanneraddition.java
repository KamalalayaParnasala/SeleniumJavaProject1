package ScannerPrograms;

import java.util.Scanner;

public class Scanneraddition {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter input value for a-->: ");
		int a = s1.nextInt();
		System.out.println("Enter input value for b-->: ");
		int b = s1.nextInt();
		
		int c = a+b;
		System.out.println("Addition of a+b is -->: " +c);
		

	}

}
