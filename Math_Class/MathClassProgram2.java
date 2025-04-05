package Math_Class;

public class MathClassProgram2 {

	public static void main(String[] args) {
		int a = 10;
		int b = -100;
		int c = 209;
		
		int d = Math.addExact(b, c);
		System.out.println(d);
		
		int e = Math.abs(b);
		System.out.println(e);
		
		double f = Math.random();
		System.out.println(f);
		
		int g = Math.subtractExact(d, a);
		System.out.println(g);
		
		int h = Math.min(d, b);
		System.out.println(h);
		
		int i = Math.max(a, b);
		System.out.println(i);

	}

}
