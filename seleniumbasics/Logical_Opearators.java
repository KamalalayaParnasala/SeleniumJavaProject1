package seleniumbasics;

public class Logical_Opearators {

	public static void main(String[] args) {
		
		int c1=100;
		int c2=200;
		int age = 20;
		String Gender = "M";
		
		if (c1<c2  && c2==c1)
		{
			
			System.out.println("And Operator");
		}
		
		else {
			System.out.println("AND");
			
		}
		
		if (c1<c2  || c2==c1)
		{
			System.out.println("OR Operator");
		}
		
		if (!(c1<c2  && c2==c1))
		{
			System.out.println("AND WITH NOT Operator");
		}
		
		if (!(c1<c2  || c2==c1))
		{
			System.out.println("OR WITH NOT Operator");
		}

		else {
			System.out.println("OR WITH NOT Operator became True");
		}
	
		if ( age == 20 && Gender == "F")
		{
			System.out.println("Person can Vote");
		}
		
		else
		{
		
			System.out.println("Person cannot Vote");
			
		}
	}
	

}
