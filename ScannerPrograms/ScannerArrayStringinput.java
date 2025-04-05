package ScannerPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerArrayStringinput {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		String input[] = new String[4];
		
		for (int i = 1; i<input.length; i++)
		{
			System.out.println("Enter values -->" +i);
			input[i]=s1.next();
			
			
		}
		 System.out.println(Arrays.toString(input));
				
	}

}
//Write a Program to take the array input 
//from Scanner class and the array  is string array"