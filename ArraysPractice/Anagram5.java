package ArraysPractice;

import java.util.Arrays;

public class Anagram5 {

	public static void main(String[] args) {
		String s1 ="Hearta";
		String s2 = "Earth";
		
		char a[]= s1.toCharArray();
		char b[]= s2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		if (Arrays.equals(a, b))
		{
			System.out.println("Given String is an Anagram");
		}
		else
		{
			System.out.println("Given String is not an Anagram");
		}
		

	}

}
