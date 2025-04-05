package seleniumbasics;

public class AssertProgram {

	public static void main(String[] args) {
		
		int age = 100;
		
		assert age>=18 : "Voter must be 18 or older to vote";
		
		if (age>18)
		{
			System.out.println("Person can Vote");
			
		}
		
		else
		{
			System.out.println("Person cannot Vote");
			assert age>=18 : "Voter must be 18 or older to vote";
		}
		
		
	}

}
