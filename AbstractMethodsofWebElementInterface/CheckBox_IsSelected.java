package AbstractMethodsofWebElementInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox_IsSelected {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/kamal/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		WebElement e1=	driver.findElement(By.xpath("//input[@type=\"checkbox\"][2]"));
		//e1.click();
		Thread.sleep(2000);
		boolean b1 = e1.isSelected();
		System.out.println(b1);
		driver.close();

	}

}
//file:///C:/Users/kamal/Downloads/learningHTML1.html

//WAP on clicking on checkbox and making sure whether it is selected or not by using isSelected method