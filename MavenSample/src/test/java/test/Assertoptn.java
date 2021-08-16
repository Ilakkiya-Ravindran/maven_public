package test;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Assertoptn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Assert.assertEquals("good", "good");
		SoftAssert st=new SoftAssert();
		st.assertEquals("good", "bad");
		
		System.out.println("This is executing after asserting");
	}

}
