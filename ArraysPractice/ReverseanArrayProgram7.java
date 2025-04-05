package ArraysPractice;

import java.util.Arrays;

public class ReverseanArrayProgram7 {

	public static void main(String[] args) {
		int a[]=new int[4];
		a[0]=10;
		a[1]=20;
		a[2]=40;
		a[3]=90;
		
		System.out.println("Array a-->" +Arrays.toString(a));
		
		int b[]=new int[4];
		for(int i=0, j=3; i<a.length; i++, j--)
		{
			b[j]=a[i];
		}
		System.out.println("Array b-->" +Arrays.toString(b));
	}

}
//WAP on Reversing an array