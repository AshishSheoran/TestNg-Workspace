package testClasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestNG_Grouping {

	@BeforeClass(alwaysRun=true)
	public void beforeClass() {
		System.out.println("Before Class");
	}
	
	@Test(groups = {"cars", "suv"})
	public void testBMWX6() {
		System.out.println("Running test - BMW X6");
	}
	
	@Test(groups = {"cars", "sedan"})
	public void testAudiA6() {
		System.out.println("Running test - Audi A6");
	}
	
	@Test(groups = {"bikes"})
	public void testNinga() {
		System.out.println("Running test - Kawasaki Ninja");
	}
	
	@Test(groups = {"bikes"})
	public void testHondaCBR() {
		System.out.println("Running test - Honda CBR");
	}
	
	@AfterClass(alwaysRun=true)
	public void afterClass() {
		System.out.println("After Class");
	}

}
