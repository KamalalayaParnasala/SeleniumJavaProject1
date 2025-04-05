package seleniumbasics;

import java.util.Arrays;

public class Reverseanarray4 {

	public static void main(String[] args) {
		int a[]= new int[3];
		a[0]=12;
		a[1]=132;
		a[2]=123;
		
		System.out.println(Arrays.toString(a));
		
		int b[]=new int[3];
		for (int i=0, j=2; i<a.length; i++, j--)
		{
			b[j]=a[i];
		}
		
		System.out.println(Arrays.toString(b));
		
		
	}

}
