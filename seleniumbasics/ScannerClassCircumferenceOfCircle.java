package seleniumbasics;

import java.util.Scanner;	

public class ScannerClassCircumferenceOfCircle {

	public static void main(String[] args) {
		
        Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter the Value of r");
		float r = s1.nextFloat();
		
				
		float C = 2*3.14f*r;
		
		System.out.println("Circumference of Circle is : " + C);
	}

}
