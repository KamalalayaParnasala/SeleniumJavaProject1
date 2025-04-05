package seleniumbasics;

public class ReverseAString {

	public static void main(String[] args) {
		
		String input = "Kamala";
		String output = "";
		
		for (int i = input.length()-1; i>=0; i--)
		{
			char c1 = input.charAt(i);
			output = output+c1;
			
			
		}
		
		System.out.println(output);
	}

}
