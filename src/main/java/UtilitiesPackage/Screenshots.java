package UtilitiesPackage;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots {
	
	static WebDriver driver;
	
	public static void DateandTime()
	{
		Date d1=new Date();
		System.out.println(d1.getTime());
		Date d2=new Date(d1.getTime());
	    System.out.println(d2);
		String date1=		d2.toString();
		//DATE/MONTH/YEAR
		String month=date1.substring(4, 7);
		//System.out.println(month);
		String date=date1.substring(8, 10);
		//System.out.println(date);
		String year=	date1.substring(date1.length()-4);
		//System.out.println(year);
		String date2=date.concat(month).concat(year);
		//System.out.println(date2);
		String date3=date.concat("/").concat(month).concat("/").concat(year);
		System.out.println(date3);
	}
	public static void TakeScreenshots(WebDriver driver) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\kamal\\Downloads\\Eclipse Oxygen\\MavenProject\\ScreenshotSourcePage\\Kamala Laya" + Math.random() + ".png");
		FileHandler.copy(source, destination); 
	}
		
}



