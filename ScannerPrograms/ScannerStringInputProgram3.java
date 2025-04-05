package ScannerPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerStringInputProgram3 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		String a[]=new String[4];
		//System.out.println("Enter Values for indexing-->");
		
		for (int i=0; i<a.length; i++)
		{
			System.out.println("Enter values for indexing-->"+i);
			a[i]=s1.next();
		}
		
		System.out.println("String values are -->" +Arrays.toString(a));
	}

}
