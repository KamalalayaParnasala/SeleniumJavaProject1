package StringFun;

public class ReverseAString2 {

	public static void main(String[] args) {
		String input = "Laya";
		String output = "";
		
		System.out.println(input);
		for (int i = input.length()-1; i>=0; i--)
		{
			char c1 = input.charAt(i);
			output = output+c1;
		}
		System.out.println(output);
	}

}
