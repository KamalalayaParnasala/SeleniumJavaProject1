package seleniumbasics;

public class AssertProgram2 {

	public static void main(String[] args) {
		 int age = 20; 

		
	        if (age >= 18) 
	        {
	            System.out.println("Person can Vote");
	            System.out.println("assert age >= 18 : Voting age verification Passed");
	        } 
	        else 
	        {
	            System.out.println("Person cannot Vote");
	           System.out.println ( "assert age < 18 : + Non-voting age verification failed");
	        }

	}

}
