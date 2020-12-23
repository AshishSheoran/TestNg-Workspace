package testClasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class TestNG_TestParameters {

	@BeforeClass
	@Parameters({ "browser", "platform" }) // The "@Parameters" attribute is used to use the parameters provided by the
											// xml file, and to use them inside the class, we need to provide the class
											// with the parameters in form of String.
	public void setUp(String browser, String platform) {
		System.out.println("TestNG_TestParameters -> SetUp");
		System.out.println("1. Browser value from the xml file: " + browser);
		System.out.println("2. Platform value from the xml file: " + platform);
	}

	@Test
	@Parameters({ "response" })
	public void testMethod(String response) throws InterruptedException {
		String[] stringArray = response.split(",");
		System.out.println("TestNG_TestParameters -> testMethod");
		System.out.println("Response from the xml file: " + response);
		System.out.println("stringArray[0] from the xml file: " + stringArray[0]);
		System.out.println("stringArray[1] from the xml file: " + stringArray[1]);
	}

}
