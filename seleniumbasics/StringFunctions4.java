package seleniumbasics;

public class StringFunctions4 {

	public static void main(String[] args) {
		String input = "Kamala Laya";
		
	    boolean b1 = input.equals("Kamala");
		System.out.println(b1);
		
		boolean b2 = input.equals("Kamala Laya");
		System.out.println(b2);
		
		boolean b3 = input.equals("kamala laya");
		System.out.println(b3);
		
		boolean b4 = input.equalsIgnoreCase("kamala laya");
		System.out.println(b4);
		
		System.out.println(input.matches(".........."));
		
		boolean b5 = input.matches("...........");
		System.out.println(b5);
		
		boolean b6 = input.matches("(.*)y");
		System.out.println(b6);
		
		boolean b7 = input.matches("K(.*)");
		System.out.println(b7);
		
		System.out.println(input.matches("K(.*.)a"));
		
		boolean b8 = input.matches("(.* la *.)");
		System.out.println(b8);
		
		String s1 = "Monica Sharma Rai";
		
		System.out.println(s1.matches("(.*)Sharma(.*)"));
		
		boolean b9 = input.contains("Laya");
		System.out.println(b9);
		
		boolean b10 = input.contains("Rama");
		System.out.println(b10);
		
		
	}

}
