package test;

import java.io.IOException;

import org.testng.annotations.Test;

public class group2 {
@Test(enabled=false)
public  void m5()
{
System.out.println("m5");

	}

@Test(expectedExceptions=IOException.class)
public  void m6() throws IOException
{
	throw new IOException();


	}

@Test(groups="Smoke")
public  void m7()
{
System.out.println("m7");

	}

}
