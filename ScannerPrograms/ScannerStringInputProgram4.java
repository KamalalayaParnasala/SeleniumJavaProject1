package ScannerPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerStringInputProgram4 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		String input[]= new String[3];
		
		for(int i=0; i<input.length; i++)
		{
			System.out.println("Enter String for indexing -->" +i);
			input[i]= s1.next();
			
		}
		System.out.println("String array is -->" +Arrays.toString(input));
	}

}
