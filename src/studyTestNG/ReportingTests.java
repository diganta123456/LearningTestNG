package studyTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReportingTests {

	@Test
	public void login()
	{
		System.out.println("log IN");
	}
	
	@Test
	public void logout()
	{
		Assert.assertEquals("Test", "Test1");
	}
}
