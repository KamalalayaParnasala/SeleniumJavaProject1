package ArraysPractice;

import java.util.Arrays;

public class ArrayAvg3 {

	public static void main(String[] args) {
		int b[]= new int[3];
		b[0]=78;
		b[1]=278;
		b[2]=748;
		System.out.println(Arrays.toString(b));
		
		int sum=0;
		for (int i=0; i<b.length; i++)
		{
			sum=sum+b[i];
		}
		System.out.println(sum);
		
		//int avg= sum/4;
		//System.out.println(avg);
		
				}

}
