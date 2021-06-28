package studyTestNG;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class LoginTest 
{
	@Test
	public void loginviaEmail()
	{
		System.out.println("Login Via Email");
		try {
			Assert.assertEquals("diganta", "diganta1");
		} catch (Throwable e) {
			System.out.println(e);
		}
		
		System.out.println("After Assert Condition");
		//Assert.assertEquals(1, 1);
		//Assert.assertTrue(4>1);
		Assert.assertFalse(1>4);
	}
	
	@Test
	public void loginviaFacebook()
	{
		System.out.println("Login Via Facebook");
		throw new SkipException("facebook functionality is not supported");
	}
	
	@Test
	public void loginviaTwitter()
	{
		System.out.println("Login Via Twitter");
		//throw new SkipException("twitter functionality is not supported");
	}
}

