package testClasses;

import org.testng.annotations.DataProvider;

public class TestData {

	@DataProvider(name = "Inputs") // The attribute @DataProvider is used to declare that the function below is a "data provider".
	public Object[][] getData() {
		return new Object[][] { { "bmw", "m3" }, { "audi", "a6" }, { "benz", "c300" } };
	}

}
