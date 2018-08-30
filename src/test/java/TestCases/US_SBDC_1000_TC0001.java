package TestCases;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ejagruti.finsys.config.config;
import ejagruti.finsys.modules.LaunchApp;
import ejagruti.finsys.modules.createcompanymodule;
import ejagruti.finsys.modules.loginmodule;
public class US_SBDC_1000_TC0001 
{
	
	@Test
	@Parameters({"BrowserName","URL","USERNAME","PASSWORD","WEBdriverPATH"})
	public void Execute(String BrowserName,String Url,String username,String Password,String WebDriverExePath)
	{
		system.out.println("just to test");
		LaunchApp.LaunchApplication(BrowserName, Url, WebDriverExePath);
		loginmodule lp=new loginmodule(config.driver);
		lp.EnterValidUserName(username);
		lp.EnterValidPassword(Password);
		lp.ClickLoginButton();
		createcompanymodule cmpmodule = new createcompanymodule(config.driver);
		//homepage hp = new homepage(config.driver);
		boolean logoutstatus=cmpmodule.IslogoutExist();
		if(logoutstatus==true)
		{
			System.out.println("pass");
		}
		else 
			System.out.println("failed");
		
		
		/*
		hp.IsObjectExists("//*[@onclick='TerminateSession()']");
		String val=hp.ObjectGetAttributeValue("//a[.='LOGOUT']", "innerText");
	 	System.out.println(val);
	 	if(val.equalsIgnoreCase("LOGOUT"))
	 	{
	 		
	 		 System.out.println("Test Case 1 is passed");
	 	}
	 */
		/*WebElement el= hp.IsObjectExists("//a[.='LOGOUT']");

	 	
	 	if(el!=null)
	 	{
	 		
	 		 System.out.println("Test Case 1 is passed");
	 	}
		}
	 	catch(Exception ex)
	 	{
	 		System.out.println("Test Case 1 is Failed.Exception: "+ex.getMessage());
	 	}*/
		
		
	}
/*
   public static void main(String args[])
	{
		US_SBDC_1000_TC0001 tc1=new US_SBDC_1000_TC0001();
		tc1.Execute("ff", "http://localhost:90/finsys", "dummyfm", "passw0rd", "");

	}
*/

}
