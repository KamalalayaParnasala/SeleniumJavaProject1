package ArraysPractice;

import java.util.Arrays;

public class Arrays_Comparision2 {

	public static void main(String[] args) {
		
				int a []=new int[4];
				a[0]=10;
				a[1]=20;
				a[2]=30;
				a[3]=40;
				
				System.out.println(Arrays.toString(a));
				
				int b []=new int[4];
				b[0]=10;
				b[1]=20;
				b[2]=30;
				b[3]=50;
				
				System.out.println(Arrays.toString(b));
				
				int result = Arrays.compare(a, b);
				if (result == 0)
				{
					System.out.println("Arrays are equal");
				}
				
				else
				{
					System.out.println("Arrays are not equal");
				}
			}

		

	}


