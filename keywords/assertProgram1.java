package keywords;

public class assertProgram1 {

	public static void main(String[] args) {
		 int age = 8;
		 assert age>=18:"Person must be 18 or older to be ale to vote";
		 if (age>=18)
		 {
			 System.out.println("Person can vote");
		 }
		 else
		 {
			 System.out.println("Person cannot vote");
		 }
		

	}

}
