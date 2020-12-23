package listenerPackage;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class CustomListener3 implements ISuiteListener {

	@Override
	public void onStart(ISuite suite) {
		// When <suite> tag in xml file starts
		System.out.println("onStart: Before suite starts!");
	}

	@Override
	public void onFinish(ISuite suite) {
		// When <suite> tag in xml file is completed.
		System.out.println("onFinish: After suite completes!");
	}
	
}
