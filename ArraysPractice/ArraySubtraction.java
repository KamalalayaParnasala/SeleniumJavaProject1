package ArraysPractice;

import java.util.Arrays;

public class ArraySubtraction {

	public static void main(String[] args) {
		int rollno[] = new int[4];
		rollno[0]= 10;
		rollno[1]= 20;
		rollno[2]= 30;
		rollno[3]= 40;
		System.out.println(Arrays.toString(rollno));
		int sub = 0;
		
		for(int i=0; i<rollno.length; i++)
		{
			sub=sub-rollno[i];
		}

		System.out.println(sub);
		
	}

}
program not correct
