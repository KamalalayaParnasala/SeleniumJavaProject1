package AssertPrograms;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertProgram3 {
	@Test()
	public void testcase1()
	{
		Assert.assertEquals(false, true);
	}

}

//true, true - pass
//false, false - test case will pass
//false, true or true, false - test case will fail