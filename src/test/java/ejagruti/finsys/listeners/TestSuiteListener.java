package ejagruti.finsys.listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class TestSuiteListener implements ISuiteListener
{

	public void onFinish(ISuite arg4) 
	{
		// TODO Auto-generated method stub
		System.out.println("'"+arg4.getName()+"'" +" Test Suite Finish ");
	}

	public void onStart(ISuite arg2) 
	{
		// TODO Auto-generated method stub
		System.out.println(arg2.getName()+" Testsuite Starts ");
	}

}
