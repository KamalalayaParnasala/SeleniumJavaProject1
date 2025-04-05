package keywords;

public class assertProgram3 {

	public static void main(String[] args) {
		int age = 100;
		
		assert age >=18: "Voter must be 18 or older";
		
		if (age<=18)
		{
			System.out.println("Person cannot vote");
		}
		else
		{
			System.out.println("Person can vote");
		}
		
		

	}

}
