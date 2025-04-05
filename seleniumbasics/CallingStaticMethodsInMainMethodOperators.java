package seleniumbasics;

public class CallingStaticMethodsInMainMethodOperators {

	public static void main(String[] args) {
		
		add();
		Sub();
		mul();
		division();
		modulus();
		

	}
    
	static void add() {
		int a = 10;
		int b = 20;
		int c = a+b;
		
		System.out.println(c);
		
	}
	
	static void Sub() {
		int a = 10;
		int b = 20;
		int c = a-b;
		
		System.out.println(c);
		
	}
	
	static void mul() {
		int a = 10;
		int b = 20;
		int c = a*b;
		
		System.out.println(c);
}
	
	public static void division() {
		double a = 10;
		double b = 20;
		double c = a/b;

		System.out.println(c);
	
}
	
	public static void modulus() {
		int a = 105;
		int b = 20;
		int c = a%b;

		System.out.println(c);
	
}
}

