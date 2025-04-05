package seleniumbasics;

public class IfNegativeCondition {

	public static void main(String[] args)	{
		
		int i = 20;
		String name = "Kamala Laya";
		int age = 20;
		int age2 = 40;
		boolean answer = false;
		
		if(i>20) {
			
			System.out.println("This will not execute1");
		}
		
		if (age<20 || age2> 40) {
			
		System.out.println("This will not execute2");
		
	}
		if (answer !=false) {
			
			System.out.println("This will not execute3");
		}
	
		int b = 5;
        int c = 10;
        if (b > 10 && c < 5) {
           
        	System.out.println("b > 10 && c < 5: This won't execute");
		
       }
        
        System.out.println("This will Print");
}
}
