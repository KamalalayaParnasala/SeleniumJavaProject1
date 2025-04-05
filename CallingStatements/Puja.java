package CallingStatements;

public class Puja {
	Puja()
	{
		this(12);
		System.out.println("5");
	}
	Puja(int a)
	{
		this("Kamala");
		System.out.println("4");
	}
	
	Puja(String name)
	{
		this(true);
		System.out.println("3");
	}
	
	Puja(boolean b)
	{
		this(3.14f);
		System.out.println("2");
	}
	
	
	Puja(float f)
	{
		System.out.println("1");
	}

	public static void main(String[] args) {
		new Puja();

	}

}
//WAP using this calling statement