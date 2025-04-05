package StringFun;

public class PalindromeProgram3 {

	public static void main(String[] args) {
		String input = "moM";
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
			System.out.println("String is a Palindrome");
		}
		else
		{
			System.out.println("String is not a Palindrome");
		}

	}

}
//WAP to check whether the given string is palindrome