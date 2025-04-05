package seleniumbasics;

import java.util.Arrays;

public class ReverseanArray2 {

	public static void main(String[] args) {
		int no[]=new int[5];
		no[0] = 12;
		no[1] = 22;
		no[2] = 42;
		no[3] = 121;
		no[4] = 1234;
				
		System.out.println(Arrays.toString(no));
		
		int no2[] = new int[5];
		
		for (int i=0, k=4; i<no.length; i++, k--)
		{
			no2[k] = no[i];
			
		}
		
		System.out.println(Arrays.toString(no2));
	}

}
