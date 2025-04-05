package ArraysPractice;

import java.util.Arrays;

public class ArrayAvg4 {

	public static void main(String[] args) {
		int rollno[] = new int[4];
		rollno[0]= 10;
		rollno[1]= 20;
		rollno[2]= 30;
		rollno[3]= 40;
		System.out.println(Arrays.toString(rollno));
		int sum = 0;
		
		for(int i=0; i<rollno.length; i++)
		{
			sum=sum+rollno[i];
		}

		System.out.println(sum);
		int avg = sum/4;
		System.out.println(avg);
	}

}
