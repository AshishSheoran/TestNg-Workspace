package testClasses;

//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_DataProvider {

//	@DataProvider(name = "Inputs") // The attribute @DataProvider is used to declare that the function below is a
//									// "dataprovider".
//	public Object[][] getData() {
//		return new Object[][] { { "bmw", "m3" }, { "audi", "a6" }, { "benz", "c300" } };
//	}

	@Test(dataProvider = "Inputs", dataProviderClass = TestData.class) // The parameter passed to @Test as
																		// "dataProvider" will
																		// let the method know from where we are getting
																		// the data.
																		// And the parameter "dataProviderClass" will
																		// give the location of the class which stores
																		// the data provider.
	public void testMethod(String input1, String input2) {
		System.out.println("Input1: " + input1);
		System.out.println("Input2: " + input2);
	}
}
