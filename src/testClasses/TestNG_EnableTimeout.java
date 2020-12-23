package testClasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestNG_EnableTimeout {

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class!");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class!");
	}

	@Test(enabled = false) // The ENABLED attribute decides either to run the testMetod or not
							// OR we use this attribute to skip the test method.
	public void testMethod1() {
		System.out.println("TestMethod1");
	}

	@Test(timeOut = 100) // The TIMEOUT attribute decides the time span for which the method will be
							// allowed to RUN. If it exceeds the time limit, the method will be failed.
	public void testMethod2() throws InterruptedException {
		System.out.println("TestMethod2");
		Thread.sleep(100);
	}

}
