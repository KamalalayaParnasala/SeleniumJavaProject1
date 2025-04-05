package keywords;

public class assertProgram2 {

	public static void main(String[] args) {
		int age = 50;
		assert age>=18: "Person must be 18 or older to vote";
		if (age>=18)
			
		{
			System.out.println("Vote");
		}
		else
		{
			System.out.println("Cannot Vote");
		}
	}

}
