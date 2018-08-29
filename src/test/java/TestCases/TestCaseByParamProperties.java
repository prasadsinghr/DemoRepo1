package TestCases;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ejagruti.finsys.config.config;
import ejagruti.finsys.modules.LaunchApp;
import ejagruti.finsys.modules.createcompanymodule;
import ejagruti.finsys.modules.loginmodule;

public class TestCaseByParamProperties 
{

	@Test
	public void Execute() throws IOException
	{
	
		System.out.println("TC1");
	
		LaunchApp.LaunchApplication(config.getParameterValue("BrowserName"),config.getParameterValue("URL"), config.getParameterValue("WebDriverExePath"));
		loginmodule lp=new loginmodule(config.driver);
		lp.EnterValidUserName(config.getParameterValue("USERNAME"));
		lp.EnterValidPassword(config.getParameterValue("PASSWORD"));
		lp.ClickLoginButton();
		createcompanymodule cmpmodule = new createcompanymodule(config.driver);
		boolean logoutstatus=cmpmodule.IslogoutExist();
		if(logoutstatus==true)
		{
			System.out.println("pass");
		}
		else 
			System.out.println("failed");
	}
	
}