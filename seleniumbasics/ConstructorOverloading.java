package seleniumbasics;

public class ConstructorOverloading {

	public static void main(String[] args) {
		ConstructorOverloading c1 = new ConstructorOverloading();
		ConstructorOverloading c2 = new ConstructorOverloading(10,20);
		ConstructorOverloading c3 = new ConstructorOverloading("Kamala",'F');
		add ();
		add (100, 200);
		ConstructorOverloading name = new ConstructorOverloading ();
		name.add("Kamala", "Laya");
		
		ConstructorOverloading decimal = new ConstructorOverloading();
		decimal.add(21.0f, 512.2f);

	}

	public ConstructorOverloading() 
	{
		System.out.println("Kamala Laya");
	}
	
	ConstructorOverloading(int a, int b) 
	{
	
		int c = a+b;
		System.out.println("Addion value is c: " + c);
	}
	
	ConstructorOverloading(String name, char gender) 
	{
		
		System.out.println("Name is:" + name + "    " + " gender is :" + gender);
	}

	public static void add ()
	{
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("Addition Value of c is " + c);
	}
	
	public static void add (int a, int b)
	{
		int c = a+b;
		System.out.println("Addition Value of c is " + c);
	}

	public void add(String a, String b) {
		System.out.println("name is :"   + a + " " + b);
	}
	
	public void add (float c, float d) {
		float e = c+d;
		System.out.println("Decimal values are: " + e);
	}
}



