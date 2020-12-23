package testClasses;

import org.testng.annotations.Test;

// Below two lines commented while using ISuiteListener. or CustomListener3
//import listenerPackage.CustomListener1;
//import org.testng.annotations.Listeners;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

//@Listeners(CustomListener1.class)
public class TestNG_ListenerTest1 {

	@BeforeClass
	public void beforeClass() {
		System.out.println("TestNG_ListenerTest1 -> Code in before class!");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("TestNG_ListenerTest1 -> Code in after class!");
	}

	@Test
	public void testMethod1() {
		System.out.println("TestNG_ListenerTest1 -> Code in testMethod1!");
		Assert.assertTrue(true);
	}

	@Test
	public void testMethod2() {
		System.out.println("TestNG_ListenerTest1 -> Code in testMethod2!");
		Assert.assertTrue(false);
	}

}
