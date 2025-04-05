package testngPrograms;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrderofExecutionProgram1 {

			
		
		@Test
		
		public void testcase1()
		{
			System.out.println("1");
	}
		@BeforeTest
		public void testcase2()
		{
			System.out.println("2");
	}
		@BeforeSuite
		public void testcase3()
		{
			System.out.println("3");
	}
		@BeforeClass
		public void testcase4()
		{
			System.out.println("4");
	}
		
		@AfterSuite
		public void testcase5()
		{
			System.out.println("5");
	}
		@BeforeMethod
		public void testcase6()
		{
			System.out.println("6");
	}
		@AfterMethod
		public void testcase7()
		{
			System.out.println("7");
	}
		@AfterTest
		public void testcase8()
		{
			System.out.println("8");
	}
		@AfterClass
		public void testcase9()
		{
			System.out.println("9");
	}
		
	

}
