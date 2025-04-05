package keywords;

import java.util.Scanner;

public class SwitchCaseProgram3 {

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter the number of the day-->");
		int daynumber = s1.nextInt();
		
		String dayname;
		switch(daynumber)
		{
		case 1:
			dayname = "Monday";
			System.out.println("Monday");
			break;
			
		case 2:
			dayname = "Tuesday";
			System.out.println("Tuesday");
			break;
		case 3:
			dayname = "Tuesday";
			System.out.println("Tuesday");
			break;
			
		case 4:
			dayname = "Wednesday";
			System.out.println("Wednesday");
			break;
		case 5:
			dayname = "Thursday";
			System.out.println("Thursday");
			break;
		case 6:
			dayname = "Friday";
			System.out.println("Friday");
			break;
		
		}
		
	}

}
