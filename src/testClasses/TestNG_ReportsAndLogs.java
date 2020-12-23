package testClasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.junit.Assert;
import org.testng.Reporter;

public class TestNG_ReportsAndLogs {
	@BeforeClass
	public void beforeClass() {
		Reporter.log("TestNG_ReportsAndLogs -> This runs once before class.", true);
		// We use Reporter to print reports and we can use this print on the console as well, depending on the parameter ("true", "false").
	}

	@AfterClass
	public void afterClass() {
		Reporter.log("TestNG_ReportsAndLogs -> This runs once after class.", true);
	}
	
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("TestNG_ReportsAndLogs -> This runs before every method.", true);
	}

	@AfterMethod
	public void afterMethod() {
		Reporter.log("TestNG_ReportsAndLogs -> This runs after every method.", true);
	}

	@Test
	public void testMethod1() {
		Reporter.log("TestNG_ReportsAndLogs -> testMethod1", true);
	}
	
	@Test
	public void testMethod2() {
		Reporter.log("TestNG_ReportsAndLogs -> testMethod2", true);
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods = "testMethod2")
	public void testMethod3() {
		Reporter.log("TestNG_ReportsAndLogs -> testMethod3", true);
	}
}
