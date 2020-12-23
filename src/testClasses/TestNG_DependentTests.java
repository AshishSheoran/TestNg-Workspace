package testClasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

import appcode.SomeClassToTest;

public class TestNG_DependentTests {
	
	SomeClassToTest obj;

	@BeforeClass
	public void setUp() {
		obj = new SomeClassToTest();
		System.out.println("Before class!");
	}

	@AfterClass
	public void cleanUp() {
		System.out.println("After class!");
	}
	
	@Test(dependsOnMethods = { "testMethod2" })  // depends on testMethod2, so it will run only when testMehtod2 is passed
	public void testMethod1() {
		System.out.println("TestMethod1");
	}
	
	@Test
	public void testMethod2() {
		System.out.println("TestMethod2");
		int result = obj.sumNumbers(2, 3);
		Assert.assertEquals(result, 4);
	}
	
	@Test
	public void testMethod3() {
		System.out.println("TestMethod3");
	}
	
	@Test(dependsOnMethods = {"testMethod1"}, alwaysRun=true) //this method will always run because of the "alwaysRun=true" attribute
	public void testMethod4() {
		System.out.println("TestMethod4");
	}

}
