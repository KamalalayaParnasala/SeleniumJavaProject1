package ArraysPractice;

import java.util.Arrays;

public class Anagram4 {

	public static void main(String[] args) {
		String input = "tea";
		String output = "eat";
		
		char a[]=input.toCharArray();
		char b[]=output.toCharArray();
		
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
//WAP to check whether the given string is an anagram