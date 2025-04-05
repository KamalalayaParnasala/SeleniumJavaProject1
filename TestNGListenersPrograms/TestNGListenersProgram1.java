package TestNGListenersPrograms;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TestNGListenersProgram1 implements ITestListener {

	static ChromeDriver driver;
	@Override
	public void onTestStart(ITestResult result) {
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		ITestListener.super.onTestSuccess(result);
		Reporter.log("Test case is Pass");
		TakesScreenshot ts1 =driver;
		File source1 = ts1.getScreenshotAs(OutputType.FILE);
		File destination1= new File("C:\\Users\\kamal\\Downloads\\Eclipse Oxygen\\SeleniumProject\\screenshotsource.\\kamalaLaya" +Math.random() +".png");
		try {
			FileHandler.copy(source1, destination1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {
		ITestListener.super.onTestFailure(result);
		Reporter.log("Test case is failed");
		TakesScreenshot ts =driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination= new File("C:\\Users\\kamal\\Downloads\\Eclipse Oxygen\\SeleniumProject\\screenshotsource.\\kamalalaya" +Math.random() +".png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	}

	
//Base code for ITestNGListeners, parent class, extends to Testcase1
//Screenshot is taking for failed scenario, when I copy pasted, it is not working for passed scenario. chk tomorrow


