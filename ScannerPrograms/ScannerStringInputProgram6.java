package ScannerPrograms;

import java.util.Scanner;

public class ScannerStringInputProgram6 {

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		String a[]=new String[3];
		
		for (int i=0; i<=s1.length; i++)
		{
			System.out.println("Enter String for indexing-->" );
			a[i]= s1.next();
		}
		
		System.out.println("Given Strings in Array format-->");
	}

}
