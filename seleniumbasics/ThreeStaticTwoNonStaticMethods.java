package seleniumbasics;

public class ThreeStaticTwoNonStaticMethods {
		
	public static void main(String[] args) {
		add(100, 100);
		subtract(200, 20);
		multiply();
		
		ThreeStaticTwoNonStaticMethods n1= new ThreeStaticTwoNonStaticMethods();
		n1.Division(2000, 200);
		n1.Name();
		
		}
	
	public static void add(int a, int b) {
		
		int c = a+b;
		System.out.println("Addition value of c is " +c);
	}
	
	public static void subtract(int a, int b) {
		
		int c = a-b;
		System.out.println("Subtraction value of c is " +c);
	}

	public static void multiply() {
		int a = 10;
		int b= 30;
		int c = a*b;
		System.out.println("Multiplication value of c is " +c);
	}
	
	public void Division(int a, int b) {
		
		int c = a/b;
		System.out.println("Division value of c is " +c);
	}
	
	public void Name() {
	
		String a = "Kamala";
		String b = "Laya";
		System.out.println("My name is Kamala Laya ");
	
}
}
