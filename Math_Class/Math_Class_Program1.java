package Math_Class;

public class Math_Class_Program1 {

	public static void main(String[] args) {
		int a = 10;
		int b = -100;
		int c = 300;
		
		int b1 = Math.abs(b);
		System.out.println("Absolute Value of b -->"   +b1);
		
		int add = Math.addExact(a, c);
		System.out.println("Addition value of a and c are  -->"   +add);
		
		int sub = Math.subtractExact(b, c);
		System.out.println("Addition value of a and c are  -->"   +sub);
		int sub1 = Math.abs(sub);
		System.out.println("Absolute Value of sub1 -->"   +sub1);
		
		double r = Math.random();
		System.out.println("Random value of r is  -->"   +r);
		
		int max = Math.max(c, a);
		System.out.println("Max number in a and c is  -->"   +max);
		
		int min = Math.min(c, a);
		System.out.println("Min number in a and c is  -->"   +min);
		
	}

}
