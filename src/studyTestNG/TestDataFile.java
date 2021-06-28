package studyTestNG;

import org.testng.annotations.DataProvider;

public class TestDataFile
{
	@DataProvider(name = "data")
	public static Object[][] testdata()
	{
		Object[][] obj=new Object[3][4];
		obj[0][0]="Rahul";
		obj[0][1]="singh";
		obj[0][2]="rs@yahoo.com";
		obj[0][3]="11";
		
		obj[1][0]="diganta";
		obj[1][1]="behera";
		obj[1][2]="db@yahoo.com";
		obj[1][3]="12";
		
		obj[2][0]="sarthak";
		obj[2][1]="behera";
		obj[2][2]="sb@yahoo.com";
		obj[2][3]="13";
		
		return obj;
}
}
