package test;

import org.testng.annotations.Test;

public class group1 {
	@Test()
	public  void m1()
	{
	System.out.println("m1");

		}
	
	@Test(groups="Smoke")
	public  void m2()
	{
	System.out.println("m2");

		}
	
	@Test(invocationCount=4)
	public  void m3() throws InterruptedException
	{ 
		Thread.sleep(1000);
	System.out.println("m3");

		}
	
	@Test(groups="Smoke")
	public  void m4()
	{
	System.out.println("m4");

		}


	}

