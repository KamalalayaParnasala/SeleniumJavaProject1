package ScannerPrograms;

import java.util.Scanner;

public class ScannerArrayinputProgram2 {

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		String input[]=new String[6];
		
		for(int i=1; i<input.length; i++)
		{
			System.out.println("Enter values for indexing-->" +i);
			input[i] = s1.next();
		}
		

	}

}
