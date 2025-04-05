package handlingPopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GroTechMinds_FileUploadPopup_FileUploadProgram {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		
		
		WebElement firstnamefield = driver.findElement(By.xpath("(//input[@class=\"form-control\"])[1]"));
		firstnamefield.sendKeys("Kamalalaya");
		
		WebElement lastnamefield = driver.findElement(By.xpath("(//input[@class=\"form-control\"])[2]"));
		lastnamefield.sendKeys("Kamalalaya");
		
		WebElement Emailfield = driver.findElement(By.xpath("(//input[@class=\"form-control\"])[3]"));
		Emailfield.sendKeys("kamalalayaparnasala@gmail.com");
		
		WebElement passwordfield = driver.findElement(By.xpath("(//input[@class=\"form-control\"])[4]"));
		passwordfield.sendKeys("abc123");
						
		WebElement genderradiobutton = driver.findElement(By.xpath("(//input[@id=\"Female\"])"));
		genderradiobutton.click();
		
		WebElement selectaskilldropdown = driver.findElement(By.xpath("//select[@id=\"Skills\"]"));
		selectaskilldropdown.click();
		Select s1 = new Select(selectaskilldropdown);
		s1.selectByIndex(1);
		
		WebElement selectseleniumdropdown = driver.findElement(By.xpath("//select[@id=\"Skills\"]"));
		selectseleniumdropdown.click();
		Select s4 = new Select(selectseleniumdropdown);
		s1.selectByIndex(1);
					
		WebElement selectacountrydropdown = driver.findElement(By.xpath("//select[@id=\"Country\"]"));
		selectacountrydropdown.click();
		Select s2 = new Select(selectacountrydropdown);
		Thread.sleep(1000);
		s2.selectByValue("India");
		
		WebElement presentaddresstextbox = driver.findElement(By.xpath("//textarea[@id=\"Present-Address\"]"));
		presentaddresstextbox.sendKeys("abc, 123, theje, teset");
		
		WebElement permanantaddresstextbox = driver.findElement(By.xpath("//textarea[@id=\"Permanent-Address\"]"));
		permanantaddresstextbox.sendKeys("abc, 123, theje, teset");
		
		WebElement pincodefield = driver.findElement(By.xpath("(//input[@class=\"form-control\"])[5]"));
		pincodefield.sendKeys("abc123");
		Thread.sleep(1000);
		
		/*WebElement closepopup = driver.findElement(By.xpath("(//input[@id=\"Female\"])"));
		closepopup.click();*/
		
		
		WebElement selectareligiondropdown = driver.findElement(By.xpath("//select[@id=\"Relegion\"]"));
		selectareligiondropdown.click();
		Select s3 = new Select(selectareligiondropdown);
		s3.selectByIndex(1);
		
		
		
						
		WebElement fileupload = driver.findElement(By.xpath("//input[@id=\"file\"]"));
		fileupload.sendKeys("C:\\Users\\kamal\\OneDrive\\Documents\\Excel shortcuts.xlsx");
		Thread.sleep(2000);
		
		WebElement relocatecheckbox = driver.findElement(By.xpath("//input[@id=\"relocate\"]"));
		relocatecheckbox.click();
		Thread.sleep(2000);
		
		
		WebElement submitbutton = driver.findElement(By.className("btn btn-primary"));
		submitbutton.click();
		
		driver.close();

	}

}

//To upload files, locate the file element, copy paste the file location and then "\\" add double forward slash, give filename with extention in the double quotes.
//first name - (//input[@class="form-control"])[1]
//lastname - (//input[@class="form-control"])[2]
//Email - (//input[@class="form-control"])[3]
//Password - (//input[@class="form-control"])[4]
//pincode - (//input[@class="form-control"])[5]
//gender - female - (//input[@id="Female"])
//present address - //textarea[@id="Present-Address"]
//permanent address - //textarea[@id="Permanent-Address"]
//pincode - //input[@id="Pincode"]
//relocate - //input[@id="relocate"]
//submit - //button[@class="btn btn-primary"]
//File - //input[@id="file"]
//Select a Skill - //select[@id="Skills"]
//Select a Country - //select[@id="Country"]
//Select a region - //select[@id="Relegion"]
//select selenium - //select[@id="technicalskills"]
//grotechminds popup - ////div[@id="chat-bot-message-close"]