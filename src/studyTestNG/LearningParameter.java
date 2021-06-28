package studyTestNG;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LearningParameter 
{
	@Parameters("email")
	@Test
	public void login(String email)
	{
		Reporter.log("log In",true);
		Reporter.log(email,true);
	}

}
