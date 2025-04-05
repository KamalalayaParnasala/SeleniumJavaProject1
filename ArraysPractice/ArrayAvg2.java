package ArraysPractice;

import java.util.Arrays;

public class ArrayAvg2 {

	public static void main(String[] args) {
		int a[]=new int[3];
		a[0]=10;
		a[1]=102;
		a[2]=1044;
		System.out.println(Arrays.toString(a));
		
		int sum = 0;
		for (int i=0; i<a.length; i++)
		{
		sum=sum+a[i];
		}

		System.out.println(sum);
		int avg = sum/4;
		System.out.println(avg);
	}

}
