package seleniumbasics;

import java.util.Arrays;

public class ArrayProgram4_equalsto {

	public static void main(String[] args) {
		
		int rollnumber[]=new int[4];
		rollnumber[0] = 12;
		rollnumber[1] = 15;
		rollnumber[2] = 112;
		rollnumber[3] = 142;
		
		int rollnumber1[]=new int[4];
		rollnumber1[0] = 12;
		rollnumber1[1] = 15;
		rollnumber1[2] = 112;
		rollnumber1[3] = 142;
		
		System.out.println(Arrays.equals(rollnumber,rollnumber1));
		
		int rollnumber2[]=new int[4];
		rollnumber2[0] = 12;
		rollnumber2[1] = 15;
		rollnumber2[2] = 112;
		rollnumber2[3] = 142;
		
		int rollnumber3[]=new int[4];
		rollnumber3[0] = 12;
		rollnumber3[1] = 1543;
		rollnumber3[2] = 112;
		rollnumber3[3] = 142;
		
		System.out.println(Arrays.equals(rollnumber2,rollnumber3));
		
	}

}
