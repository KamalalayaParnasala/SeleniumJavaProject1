package keywords;

import java.util.Scanner;

public class SwitchCaseProgram1 {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the day of the week-->");
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
			dayname = "Wednesday";
			System.out.println("Wednesday");
			break;
		case 4:
			dayname = "Thursday";
			System.out.println("Thursday");
			break;
		case 5:
			dayname = "Friday";
			System.out.println("Friday");
			break;
		case 6:
			dayname = "Saturday";
			System.out.println("Saturday");
			break;
		case 7:
			dayname = "Sunday";
			System.out.println("Sunday");
			break;
			
		}
		
	}

}
