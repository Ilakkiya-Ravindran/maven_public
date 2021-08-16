package test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Do {
	//priority-1 0 1 234 
	@Test(enabled=false)
	public void m1()
	{
		 System.out.println("This is running");	
	}
	
	
	
	@Test(dependsOnMethods="m2",alwaysRun=true)
	public void m3()
	{
		
        System.out.println("Depending on method m2");
    }
	
	@Test
	public void m2()
	{
		//SoftAssert st=new SoftAssert();
		//st.assertTrue(false);
		
		//int a=3;
		//Assert.assertFalse(true);
		System.out.println("Test Passed:m2");
    }
	
	/*@Test(groups="bonding")
	public void m4()
	{
		
        System.out.println("Test Passed:DO");
    }
	
	@Test(description="this is the method we can perform anything")
	public void m5()
	{
		
        System.out.println("Method with description");
    }
	
	
	
	/*@BeforeMethod
	public void m6()
	{
		SoftAssert st=new SoftAssert();
		st.assertTrue(false);
		
        System.out.println("Test Passed:Before Method");
    }
	
	@BeforeTest
	public void m7()
	{
        System.out.println("Test Passed:Before Test");
    }*/
}

