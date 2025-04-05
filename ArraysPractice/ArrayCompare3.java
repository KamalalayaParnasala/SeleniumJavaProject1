package ArraysPractice;

import java.util.Arrays;

public class ArrayCompare3 {

	public static void main(String[] args) {
		int rollno[] = new int[4];
		rollno[0]= 10;
		rollno[1]= 20;
		rollno[2]= 30;
		rollno[3]= 40;
		
		
		
		int rollno1[] = new int[4];
		rollno1[0]= 10;
		rollno1[1]= 20;
		rollno1[2]= 30;
		rollno1[3]= 50;
		
		Arrays.compare(rollno, rollno1);
		
		System.out.println(Arrays.toString(rollno));
		System.out.println(Arrays.toString(rollno1));
		
		if(Arrays.equals(rollno, rollno1))
			
		{
			System.out.println("Arrays are same");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}
		

	}

}
