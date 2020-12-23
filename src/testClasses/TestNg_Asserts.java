package testClasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import appcode.SomeClassToTest;


public class TestNg_Asserts {
  @Test
  public void testSum() {
	  SomeClassToTest obj = new SomeClassToTest();
	  int result = obj.sumNumbers(1, 2);
	  System.out.println("Running Test => testSum");
	  Assert.assertEquals(result, 3);
  }
  
  @Test
  public void testStrings() {
	  System.out.println("Running Test -> testStrings");
	  String expectedString = "Hello World";
	  SomeClassToTest obj = new SomeClassToTest();
	  String result = obj.addStrings("Hello", "World");
	  Assert.assertEquals(result, expectedString);
  }
  
  
  @Test
  public void testArrays() {
	  System.out.println("Running Test -> testArrays");
	  int[] expectedArray = {1, 2, 3};
	  SomeClassToTest obj = new SomeClassToTest();
	  int[] result = obj.getArray();
	  Assert.assertEquals(result, expectedArray);
  }
  
}
