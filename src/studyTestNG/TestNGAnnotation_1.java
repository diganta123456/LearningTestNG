package studyTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotation_1 
{
	@BeforeClass
	public void beforClass()
	{
		System.out.println("selenium initialized");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("open the browser");
	}
	
	@Test
	public void test1()
	{
		System.out.println("Inside Test1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("inside Test 2");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("closing browser");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("destroy selenium");
	}
}
