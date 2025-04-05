package ArraysPractice;

import java.util.Arrays;

public class Anagram7 {

	public static void main(String[] args) {
		String s1 = "heart";
		String s2 = "eartha";
		
		char a [] = s1.toCharArray();
		char b[] = s2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		if (Arrays.equals(a, b))
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}
	}

}
