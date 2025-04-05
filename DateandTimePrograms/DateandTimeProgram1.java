package DateandTimePrograms;

import java.util.Date;

public class DateandTimeProgram1 {

	public static void main(String[] args) {
		
		//returns epoch time - this need to be converted to human time.
		Date d1 = new Date();
		System.out.println(d1.getTime());
		
		
		Date d2 = new Date(d1.getTime());
		System.out.println(d2);
		
		String date1= d2.toString();
		String month = date1.substring(4, 7);
		System.out.println(month);
		String date = date1.substring(8, 10);
		System.out.println(date);
		String year = date1.substring(date1.length()-4);
		System.out.println(year);
		String time = date1.substring(11, 19);
		System.out.println(time);
		
		String date2 = date.concat(month).concat(year).concat(time);
		System.out.println(date2);
		String date3 = date.concat("/").concat(month).concat("/").concat(year).concat(",").concat(time);
		System.out.println(date3);
		
		
		
	}

}
