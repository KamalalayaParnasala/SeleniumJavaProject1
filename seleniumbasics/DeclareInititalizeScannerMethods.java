package seleniumbasics;

import java.util.Scanner;

public class DeclareInititalizeScannerMethods {

	public static void main(String[] args) {
		Scanner S1 = new Scanner(System.in);
		System.out.println("Enter Value for a -->");
		int a = S1.nextInt();
		
		
		Scanner S2 = new Scanner(System.in);
		System.out.println("Enter Value for b -->");
		String b = S2.nextLine();
		//System.out.println(" a -->" +a);
		//System.out.println(" b -->" +b);
		
		Scanner S3 = new Scanner(System.in);
		System.out.println("Enter Value for c -->");
		String c = S3.next();
		
		Scanner S4 = new Scanner(System.in);
		System.out.println("Enter Value for d -->");
		Boolean d = S3.nextBoolean();
		
		Scanner S5 = new Scanner(System.in);
		System.out.println("Enter Value for e -->");
		float e = S3.nextFloat();
		
		Scanner S6 = new Scanner(System.in);
		System.out.println("Enter Value for f-->");
		double f = S3.nextDouble();
		
		Scanner S7 = new Scanner(System.in);
		System.out.println("Enter Value for g-->");
		byte g = S7.nextByte();
		
		Scanner S8 = new Scanner(System.in);
		System.out.println("Enter Value for h-->");
		short h = S8.nextShort();
		
		Scanner S9 = new Scanner(System.in);
		System.out.println("Enter Value for k-->");
		long k = S9.nextLong();
		
		System.out.println("Enter Value for a-->" +a);
		System.out.println("Enter Value for b-->" +b);
		System.out.println("Enter Value for c-->" +c);
		System.out.println("Enter Value for d-->" +d);
		System.out.println("Enter Value for e-->" +e);
		System.out.println("Enter Value for f-->" +f);
		System.out.println("Enter Value for g-->" +g);
		System.out.println("Enter Value for h-->" +h);
		System.out.println("Enter Value for k-->" +k);
		
		
		S1.close();
		S2.close();
		S3.close();
		S4.close();
		S5.close();
		S6.close();
		S7.close();
		S8.close();
		S9.close();
		
	}

}
