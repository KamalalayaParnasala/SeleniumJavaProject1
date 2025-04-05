package seleniumbasics;

import java.util.Arrays;

public class ReverseanARray3 {

	public static void main(String[] args) {
		int rollno[]=new int[4];
		rollno[0]= 223;
		rollno[1]= 2354;
		rollno[2]= 2433;
		rollno[3]= 2783;
		
		System.out.println(Arrays.toString(rollno));
		
		int rollno1[]=new int[4];
		for(int i=0, j=3; i<rollno.length; i++, j--)
		{
			 rollno1[j] = rollno[i];
		}
		
		System.out.println(Arrays.toString(rollno1));
	}

}
