package seleniumbasics;

import java.util.Arrays;

public class ReverseanArray {

	public static void main(String[] args) {
		int rollno [] = new int[4];
		rollno[0] = 10;
		rollno[1] = 20;
		rollno[2] = 30;
		rollno[3] = 40;

		System.out.println(Arrays.toString(rollno));
		
		int rollno1[]=new int[4];
		
		for (int i = 0, j=3; i<rollno.length; i++, j--)
		{
			rollno1[j]=rollno[i];
		}
		
		System.out.println(Arrays.toString(rollno1));
	}

}
