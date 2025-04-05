package Screenshots_Selenium;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class ScreenshotProgram6 {

	public static void main(String[] args) throws IOException
	{
		
		
			
				Date d1=new Date();
									
				System.out.println(d1.getTime());	
				Date d2=new Date(d1.getTime());
				System.out.println(d2);
				String date1= d2.toString();
				//DATE/MONTH/YEAR
				String month=date1.substring(4, 7);
				System.out.println(month);
				String date=date1.substring(8, 10);
				System.out.println(date);
				String year=date1.substring(date1.length()-4);
				System.out.println(year);
				String time=date1.substring(11,19);
				System.out.println(time);
				String hour=date1.substring(11,13);
				System.out.println(hour);
				String min=date1.substring(14,16);
				System.out.println(min);
				String sec=date1.substring(17,19);
				System.out.println(sec);
				String date2=date.concat(month).concat(year).concat(time);
				System.out.println(date2);
				String date5=month.concat("-").concat(date).concat("-").concat(year).concat("T").concat(hour).concat("-").concat(min).concat("-").concat(sec);
				System.out.println(date5);
				 EdgeDriver driver=new EdgeDriver();
				driver.get("https://www.amazon.com");
				driver.manage().window().maximize();
				WebElement e1=driver.findElement(By.xpath("//select[@name='url']"));
				Select s1=new Select(e1);
				s1.selectByIndex(6);
				TakesScreenshot   ts= driver;
			     File source= ts.getScreenshotAs(OutputType.FILE);
			     File destination=new File("C:\\Users\\kamal\\Downloads\\Eclipse Oxygen\\SeleniumProject\\screenshotsource\\ "+ date5 +" .png"); 
			     FileHandler.copy(source, destination); 
			


			}
		
	}


