package studyTestNG;

import org.testng.annotations.Test;

public class TestNGPriority 
{
	
	  @Test (priority = 1)
	  public void login() 
	  { 
		  System.out.println("Log IN"); 
		  
		  }
	  
	  @Test(dependsOnMethods = {"login"},priority = 4) 
	  public void logOut() 
	  { 
		  System.out.println("Log Out"); 
	}
	  
			
	@Test(dependsOnMethods = {"login"},priority = 2)
	public void Navigate() 
	{
		System.out.println("Navigate to new window"); 
	}
	
	@Test(dependsOnMethods = {"login","Navigate"},priority = 3)
	public void addToCart()
	{
		System.out.println("add to cart");
	}
			 
	 
}
