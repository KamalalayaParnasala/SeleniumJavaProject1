package ArraysPractice;

import java.util.Arrays;

public class Anagram3 {

	public static void main(String[] args) {
		String a = "Tea";
		String b = "Eat";
		
		char a1[]=a.toCharArray();
		char a2[]=b.toCharArray();
		
		System.out.println(a1);
		System.out.println(a2);
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		if(Arrays.equals(a1, a2))
		{
			System.out.println("Anagram");
		}
			
		else
		{
			System.out.println("Not Anagram");
		}

	}

}
