package listenerPackage;

import org.testng.IInvokedMethodListener;
import org.testng.IInvokedMethod;
import org.testng.ITestResult;

public class CustomListener1 implements IInvokedMethodListener {
	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		// Will be executed before every single method.
		System.out.println("beforeInvocation: " + testResult.getTestClass().getName() + " => "
				+ method.getTestMethod().getMethodName()); // getTestClass().getName() - to get the name of the class
															// for testResult.
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		// Will be executed after every single method.
		System.out.println("afterInvcoation: " + testResult.getTestClass().getName() + " => "
				+ method.getTestMethod().getMethodName()); // getTestMethod().getMethodName() - to get the name of the
															// method for method.
	}
}
