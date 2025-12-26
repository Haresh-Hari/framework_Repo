package testBase;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class MyListener extends TestListenerAdapter {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult tr) {
		// TODO Auto-generated method stub
		super.onTestSuccess(tr);
	}

	@Override
	public void onTestFailure(ITestResult tr) {
		// TODO Auto-generated method stub
		super.onTestFailure(tr);
	}

	@Override
	public void onTestSkipped(ITestResult tr) {
		// TODO Auto-generated method stub
		super.onTestSkipped(tr);
	}
	

}
