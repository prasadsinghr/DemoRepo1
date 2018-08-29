package ejagruti.finsys.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestCaseListener implements ITestListener 
{

	public void onFinish(ITestContext TestcaseF) 
	{
		// TODO Auto-generated method stub
		System.out.println(TestcaseF.getName() +" Test Case Ends ");
	}

	public void onStart(ITestContext TestCaseS) 
	{
		// TODO Auto-generated method stub
		System.out.println(TestCaseS.getName()+" Test Case Starts ");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult FailButSuccess) 
	{
		// TODO Auto-generated method stub
		System.out.println(FailButSuccess.getName()+" onTestFailedButWithinSuccessPercentage ");
	}

	public void onTestFailure(ITestResult fail) 
	{
		// TODO Auto-generated method stub
		System.out.println(fail.getName()+" Test Step Failure ");
	}

	public void onTestSkipped(ITestResult skipped) 
	{
		// TODO Auto-generated method stub
		System.out.println(skipped.getName()+" on Test Step skipped ");
	}

	public void onTestStart(ITestResult start) 
	{
		// TODO Auto-generated method stub
		System.out.println( start.getName() +" Test step start ");
	}

	public void onTestSuccess(ITestResult success) 
	{
		// TODO Auto-generated method stub
		System.out.println(success.getName()+" Test Step success ");
	}

}
