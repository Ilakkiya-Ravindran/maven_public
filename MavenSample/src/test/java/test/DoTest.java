package test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DoTest {
	@Test
	public void m1()
	{
        System.out.println("Test Passed:m1()");
    }
	
	@Test
	public void m2()
	{
        System.out.println("Test Passed:m2()");
    }
			
	@BeforeMethod
	public void m3()
	{
		//SoftAssert st=new SoftAssert();
		//st.assertTrue(false);
		Assert.assertTrue(false);
        System.out.println("Test Passed:Before Method");
    }
	
	@BeforeClass
	public void m4()
	{
        System.out.println("Before Class");
    }
	
	@AfterMethod
	public void m5()
	{
        System.out.println("Test Passed:After Method");
    }
	
	@AfterClass
	public void m6()
	{
        System.out.println("Test Passed:After Class");
    }
}
