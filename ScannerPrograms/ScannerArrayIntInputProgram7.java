package ScannerPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerArrayIntInputProgram7 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		int a[]=new int[4];
		
		for (int i=0; i<a.length; i++)
		{
			System.out.println("Enter values for indexing -->"+i);
			a[i]=s1.nextInt();
		}
		System.out.println("Values in array-->" +Arrays.toString(a));
	}

}
