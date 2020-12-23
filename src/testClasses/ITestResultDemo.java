package testClasses;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class ITestResultDemo {
	@Test
	public void testMethod1() {
		System.out.println("Running: testMethod1");
		Assert.assertTrue(false);
	}

	@Test
	public void testMethod2() {
		System.out.println("Running: testMethod2");
		Assert.assertTrue(false);
	}

	@AfterMethod
	public void afterMethod(ITestResult testResult) { // ITestResult is used to access the methods and the things done
														// inside method.

		if (testResult.getStatus() == ITestResult.FAILURE) {
			System.out.println("Failed: " + testResult.getMethod().getMethodName()); // Will allow us to get the name of
																						// the method.
		}
		if (testResult.getStatus() == ITestResult.SUCCESS) {
			System.out.println("Success: " + testResult.getName()); // getName() is similar to getMethodName(), used to
																	// get the method name.
		}

	}

}
