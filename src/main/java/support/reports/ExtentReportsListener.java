package support.reports;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExtentReportsListener implements ITestListener {

	private static String getTestMethodName(ITestResult iTestResult) {
		return iTestResult.getMethod().getConstructorOrMethod().getName();
	}

	//Before starting all tests, below method runs.
	public void onStart(ITestContext iTestContext) {
	}

	//After ending all tests, below method runs.
	public void onFinish(ITestContext iTestContext) {
		//Do tear down operations for extentreports reporting!
		try {
			ExtentManager.getExtent().flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void onTestStart(ITestResult iTestResult) {
		//Start operation for extentreports.
		String description = iTestResult.getMethod().getDescription();

		try {
			ExtentManager.startTest(description, description);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void onTestSuccess(ITestResult iTestResult) {
		//Extentreports log operation for passed tests.
		ExtentManager.getTest().pass("Test passed");
	}

	public void onTestFailure(ITestResult iTestResult) {
		ExtentTest test = ExtentManager.getTest();
		test.fail("Test Failed: " + iTestResult.getThrowable().getMessage());

		// Add Stacktrace
		if (iTestResult.getThrowable() != null) test.log(Status.INFO, iTestResult.getThrowable());
	}

	public void onTestSkipped(ITestResult iTestResult) {
		//Extentreports log operation for skipped tests.
		ExtentTest test = ExtentManager.getTest();
		test.log(Status.SKIP, "Test Skipped");
		test.skip("Test Skipped: " + iTestResult.getThrowable().getMessage());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
		//TODO: add implementation
	}
}
