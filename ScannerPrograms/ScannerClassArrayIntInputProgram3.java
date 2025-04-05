package ScannerPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerClassArrayIntInputProgram3 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		int input[]=new int[4];
		
		 for (int i=0; i<=input.length-1; i++)
		{
			System.out.println("Enter number for indexing-->" +i);
			input [i]=s1.nextInt();
		}
		 System.out.println(Arrays.toString(input));

	}

	
}
//Write a Program to take the array input 
//from Scanner class and the array  is string array"
