package ScannerPrograms;

import java.util.Scanner;

public class ScannerAddition2 {

	public static void main(String[] args) {
	
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter values for indexing-->");
		int input = s1.nextInt();
		
		System.out.println("Enter values for indexing-->");
		int input2 = s1.nextInt();
		
		int sum = input+input2;
		System.out.println(sum);
		
		
	}

}
