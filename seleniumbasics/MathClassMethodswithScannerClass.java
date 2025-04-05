package seleniumbasics;

import java.util.Scanner;

public class MathClassMethodswithScannerClass {

	public static void main(String[] args) {
	
		Scanner S1 = new Scanner(System.in);
		System.out.println("Enter Value of a -->");
		int a = S1.nextInt();

		System.out.println("Enter Value of b -->" );
		int b = S1.nextInt();
		
		int add = Math.addExact(a, b);
		System.out.println("Addition value of d & c are  -->" +add);
				
		Scanner S2 = new Scanner(System.in);
		System.out.println("Enter Value of c -->");
		int c = S2.nextInt();
		
		System.out.println("Enter Value of d -->" );
		int d = S2.nextInt();
		
		int sub = Math.subtractExact(d, c);
		System.out.println("Subtraction value of d & c are  -->" +sub);
		
		Scanner S3 = new Scanner(System.in);
		System.out.println("Enter Value of e -->" );
		float e = S3.nextFloat();
		
		System.out.println("Enter Value of f -->" );
		float f = S3.nextFloat();
		float max  = Math.max(e, f);
		System.out.println("Max value of e and f are  -->" +max);
		
		System.out.println("Enter Value of g -->");
		float g = S3.nextFloat();
		float absg = Math.abs(g);
		System.out.println("Absolute value of g is -->" +absg);
		
		System.out.println("Enter Value of h -->");
		double h = S3.nextDouble();
		
		System.out.println("Enter Value of k -->");
		double k = S3.nextDouble();
			
		double min = Math.min(h, k);
		System.out.println("Minimum value out of h & k are -->" +min);
		
		
		S1.close();
		S2.close();
		S3.close();
		
	}

}
