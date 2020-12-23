package testClasses;

import org.testng.annotations.Test;
import appcode.SomeClassToTest;
import org.testng.asserts.SoftAssert;

public class TestNg_SoftAsserts {
	@Test
	  public void testSum() {
		SoftAssert sa = new SoftAssert();
			
		  System.out.println("Running Test => testSum");
		  SomeClassToTest obj = new SomeClassToTest();
		  int result = obj.sumNumbers(1, 2);
		  sa.assertEquals(result, 2);
		  System.out.println("\n Line after 1st assert");
		  sa.assertEquals(result, 3);
		  System.out.println("\n Line after 2nd assert");
		 sa.assertAll();
	  }
}
