package seleniumbasics;

public class GlobalLocal_FinalVariables {
	static double pi = 3.14;
	static int a = 30;
	static int b = 32;
	static int r = 10;
	static final int days = 31; // final global variable
	public static void main(String[] args) {
		
		//Area of a circle = pi*r*R
		add();
		add (10, 20);
		
		final int r = 15; // final local variable
		a = 25;
		System.out.println("r is -->" +r);
		System.out.println("Area of a Circle is -->" +pi*r*r);
		
	}
		public static void add() {
		int c = a+b;
	     r = 100;
		System.out.println("addition value of c is -->" +c);
		System.out.println("r is -->" +r);
		
	}
		public static void add (int a, int b) {
		int d = a+b;
		//days = 30;
		
		System.out.println("addition value of d -->" +d);
	}
}
