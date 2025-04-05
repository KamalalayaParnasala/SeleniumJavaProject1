package ArraysPractice;

import java.util.Arrays;

public class ArrayCopyProgram6 {

	public static void main(String[] args) {
		int a[]=new int[4];
		
		a[0]=120;
		a[1]=140;
		a[2]=130;
		a[3]=160;
		
		System.out.println("Array a is -->" +Arrays.toString(a));
		
		int b[]=new int[4];
		
		for(int i=0; i<a.length; i++)
		{
			b[i]=a[i];
		}
		
		System.out.println("Array b is -->" +Arrays.toString(a));

	}

}
//WAP on copying one array to another array
