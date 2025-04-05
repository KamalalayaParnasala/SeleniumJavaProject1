package ArraysPractice;

import java.util.Arrays;

public class ArrayCopyProgram5 {

	public static void main(String[] args) {
		
		int rollno[]= new int[5];
		rollno[0] = 20;
		rollno[1] = 30;
		rollno[2] = 40;
		rollno[3] = 50;
		rollno[4] = 60;
		
		System.out.println(Arrays.toString(rollno));
		
		int rollno1[]=new int[5];
		for(int i=0; i<rollno.length; i++)
		{
			rollno1[i]=rollno[i];
		}
		{
			System.out.println(Arrays.toString(rollno1));
		}
		
	}

}
//WAP a program to copy one array from another array