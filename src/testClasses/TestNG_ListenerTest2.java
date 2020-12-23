package testClasses;

import org.testng.annotations.Test;

//Commented when using the ISuiteListener OR CustomListener3
//import listenerPackage.CustomListener2;    
//import org.testng.annotations.Listeners;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

//@Listeners(CustomListener2.class)
public class TestNG_ListenerTest2 {

	@BeforeClass
	public void beforeClass() {
		System.out.println("TestNG_ListenerTest2 -> Code in before class!");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("TestNG_ListenerTest2 -> Code in after class!");
	}

	@Test
	public void testMethod1() {
		System.out.println("TestNG_ListenerTest2 -> Code in testMethod1!");
		Assert.assertTrue(true);
	}

	@Test
	public void testMethod2() {
		System.out.println("TestNG_ListenerTest2 -> Code in testMethod2!");
		Assert.assertTrue(false);
	}

	@Test(dependsOnMethods = "testMethod2")
	public void testMethod3() {
		System.out.println("Code in TestMethod3");
	}

}
