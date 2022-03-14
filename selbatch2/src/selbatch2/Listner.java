package selbatch2;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listner
 implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("testcase is started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("testcase is passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
System.out.println("testcase is failed");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("testcase is skipped");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
System.out.println("test suit started");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("test suit finish");
		
	}

}
