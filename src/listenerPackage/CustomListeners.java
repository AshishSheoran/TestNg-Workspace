package listenerPackage;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class CustomListeners implements IInvokedMethodListener, ITestListener, ISuiteListener{
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
	
	@Override
	public void onTestStart(ITestResult result) {
		// On the start of test method.
		System.out.println("onTestStart -> Test Name: " + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// If the test is successful.
		System.out.println("onTestSuccess -> Test Name: " + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// If the test is failed.
		System.out.println("onTestFailure -> Test Name: " + result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// If the test is skipped.
		System.out.println("onTestSkipped -> Test Name: " + result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// If the test is failed with only few asserts getting wrong result.
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// If the test is failed because it's taking more time than expected.
	}

	@Override
	public void onStart(ITestContext context) {
		// At the start of <test> tag in xml file.
		System.out.println("onStart -> Test Tag Name: " + context.getName());
		ITestNGMethod methods[] = context.getAllTestMethods(); // to store all the test methods in method[] array.
		System.out.println("All the methods used inside this test:");
		for (ITestNGMethod method : methods) {
			System.out.println(method.getMethodName());
		}
	}

	@Override
	public void onFinish(ITestContext context) {
		// At the end of <test> tag in xml file.
		System.out.println("onFinish -> Test Tag Name: " + context.getName());
	}
	
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
