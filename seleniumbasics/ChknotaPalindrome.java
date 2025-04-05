package seleniumbasics;

public class ChknotaPalindrome {

	public static void main(String[] args) {
		String input = "Kamala";
		String output = "";
		
		for (int i = input.length()-1; i>=0; i--)
			
		{
			
			char c1 = input.charAt(i);
			output = output+c1;
			
		}
		
		
		System.out.println("Input String is:" + input);
		System.out.println("Output String is:" + output);
		if (input.equals(output))
		{
			System.out.println("It is a Palindrome");
		}
		
		else
		{
			System.out.println(" It is not a Palindrome");
		}
	}

}
