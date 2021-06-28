package studyTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotation_2 
{
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("start test execution");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Initialize selenium for class 2");
	}
	
	@Test
	public void test3()
	{
		System.out.println("Inside test 3");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("destroy selenium for class 2");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("stop test execution");
	}
	
}
