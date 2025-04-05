package seleniumbasics;

public class MethodOverloading_Static {

	public static void main(String[] args) {
		
		add(10, 100);
		add(100, 200);
		MethodOverloading_Static name = new MethodOverloading_Static();
		name.add("Kamala", "Laya");
		
		MethodOverloading_Static decimal = new MethodOverloading_Static();
		decimal.add(21.0f, 512.2f);
	
	}

	public static void add(int a,int b) {
		
		int c = a+b;
		System.out.println(c);
	}
	
	public static void add(int b,int a) 
	{
		
		int c = b+a;
		System.out.println(c);
	}
	
	public void add(String a, String b) {
		System.out.println("name is :"   + a + " " + b);
	}
	
	public void add (float c, float d) {
		float e = c+d;
		System.out.println("Decimal values are: " + e);
	}
}

