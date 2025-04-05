package DateandTimePrograms;

import java.util.Date;

public class DateandTimeProgram2 {

	public static void main(String[] args) {
		//epoch time
		Date d1 = new Date();
		System.out.println(d1.getTime());
		
		//print date in regular format
		Date d2 = new Date(d1.getTime());
		System.out.println(d2);
		
		//to retrieve date, time using string functions
		String date1 = d2.toString();
		System.out.println(date1);
		
		//to retrieve date separately
		String date = date1.substring(8, 10);
		System.out.println(date);
		
		//to retrieve month
		String month = date1.substring(4, 7);
		System.out.println(month);
		
		//to retieve year
		String year = date1.substring(date1.length()-1);
		System.out.println(year);
		
		//to retrieve time
		String time = date1.substring(11,19);
		System.out.println(time);
		
		//to retrieve dat
		String day = date1.substring(0, 3);
		System.out.println(day);
		
		//to print date in regular format
		String date3 = day.concat(",").concat(date).concat("/").concat(month).concat("/").concat(year).concat(",").concat(time);
		System.out.println(date3);
		
		
		
		
		

	}

}
