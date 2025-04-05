package ArraysPractice;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String a = "tea";
		String b = "eat";
		
		char[]a1= a.toCharArray();
		char[]a2= b.toCharArray();
		
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
		Arrays.sort(a1);
		Arrays.sort(a2);
	

	if (Arrays.equals(a1,a2))
	{
		System.out.println("Anagram");
	}
	else
	{
		System.out.println("Not Anagram");
	}
	}
	
}
