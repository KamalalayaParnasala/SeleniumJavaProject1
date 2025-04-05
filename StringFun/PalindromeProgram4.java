package StringFun;

public class PalindromeProgram4 {

	public static void main(String[] args) {
		String input="mom";
		String output = "";
		System.out.println(input);
		
		for (int i = input.length()-1; i>=0; i--)
		{
			char c1 = input.charAt(i);
			output = output+c1;
		}
		System.out.println(output);
		
		if (output.equals(input))
		{
			System.out.println("It is a Palindrome");
		}
		else
		{
			System.out.println("It is not a Palindrome");
		}
	}

}
