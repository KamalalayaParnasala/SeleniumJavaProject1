package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonLoginDDT {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		FileInputStream fs = new FileInputStream("C:\\Users\\kamal\\Downloads\\Eclipse Oxygen\\SeleniumProject\\Excelsheet\\KamalaDDT.xlsx");
		Workbook wb = WorkbookFactory.create(fs);
		
		//short cut to username
		String username = wb.getSheet("login").getRow(1).getCell(0).getStringCellValue();
		System.out.println(username);
		
		//shortcut to retrieve password
		String pwd = wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		System.out.println(pwd);
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.navigate().refresh();
		driver.navigate().refresh();
		Thread.sleep(1000);
		//hoverover on sign in
		WebElement e1 = driver.findElement(By.xpath("//span[@class=\"nav-line-2 \"]"));
		e1.click();
		
		//username
		WebElement e2 = driver.findElement(By.id("ap_email"));
		e2.sendKeys(username);
		
		
		WebElement e3 = driver.findElement(By.id("continue"));
		e3.click();
		
		//password
		WebElement e4 = driver.findElement(By.name("password"));
		e4.sendKeys(pwd);
		
		WebElement e5 = driver.findElement(By.id("signInSubmit"));
		e5.click();
		
		driver.close();
	}

}
