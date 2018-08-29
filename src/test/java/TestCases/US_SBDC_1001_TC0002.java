package TestCases;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ejagruti.finsys.config.config;
import ejagruti.finsys.modules.LaunchApp;
import ejagruti.finsys.modules.createcompanymodule;
import ejagruti.finsys.modules.loginmodule;
public class US_SBDC_1001_TC0002 
{
	
//	homepage hp = new homepage(config.driver);
//------------------Login-------------------------------------
	@Test
	@Parameters({"BrowserName","URL","USERNAME","PASSWORD","WEBdriverPATH"})
	public void Execute(String BrowserName,String Url,String username,String Password,String WebDriverExePath) throws InterruptedException
	{
	
		try
		{
		LaunchApp.LaunchApplication(BrowserName, Url, WebDriverExePath);
		loginmodule lp=new loginmodule(config.driver);
		lp.EnterValidUserName(username);
		lp.EnterValidPassword(Password);
		lp.ClickLoginButton();
		
		/*Boolean logoutstatus=hp.IslogoutExist();
		if(logoutstatus==true)
			System.out.println("Yes,logout exist");
		else
			System.out.println("No,logout does not exist");*/
		
		}	
		catch(Exception ex)
		{
			System.out.println("FinancialAnaysis Error is :"+ex.getMessage());
		}
		
	}
//------------------------------manageCompany------------------------------------------------------
	@Test
	@Parameters({"CompanyName","CompanyType","PanDetails","EmailId","TinDetails","Country","State","City"})
	void CreateCompany(String company_Name,String company_type,String pan_details,String email_id, String tin_details,String country,String state,String city) throws InterruptedException
	{
	createcompanymodule cmpmodule = new createcompanymodule(config.driver);
	//homepage hp=new homepage(config.driver);
    Boolean validate=cmpmodule.IsManageCompany();
    if(validate.equals(true))
    {
	System.out.println("we are on track 2");
	}
	Thread.sleep(2000);
	cmpmodule.ClickManageCompany();
	config.driver.switchTo().frame(0);
	Thread.sleep(2000);
	cmpmodule.CreateNewCompany();
	cmpmodule.EnterCompanyName(company_Name);
	cmpmodule.CompanyTypeDropDown(company_type);
	cmpmodule.EnterPanDetails(pan_details);
	cmpmodule.EnterEmail(email_id);
	cmpmodule.EnterTinDetails(tin_details);
	cmpmodule.EnterCountryDropDown(country);
	Thread.sleep(1000);
	cmpmodule.EnterStateDropDown(state);
	Thread.sleep(1000);
	cmpmodule.EnterCityDropDown(city);
	
	cmpmodule.SaveCompany();
	System.out.println(company_Name);
	
	Thread.sleep(10000);
	//String getname=config.driver.findElement(By.xpath("(//div[@class='datagrid-cell datagrid-cell-c1-name'])[2]")).getText();
	String getname=cmpmodule.ValidateTop();

	if(getname.equalsIgnoreCase(company_Name))
	{
	System.out.println("yes, i am on top "+getname);
	}
	else
		System.out.println("m somewhere else");
	
	}
	/*public void ManageCompany()
	{
		try
		{
		Boolean FinancialAnalysisStatus=hp.IsFinancialAnalysis();
        if(FinancialAnalysisStatus==true)
        {   	
        	System.out.println("Pass");
       // hp.ClickFinancialAnalysis();
	    }
        else
        {
        	System.out.println("FinancialAnalysis doesnot exist");
        }
        Boolean ManageCompanyStatus=hp.IsManageCompany();
        if(ManageCompanyStatus==true)
        {   	
        	System.out.println("Pass");
        hp.ClickManageCompany();
	    }
        else
        {
        	System.out.println("ManageCompany doesnot exist");
        }
		}
		catch(Exception ex)
		{
			System.out.println("Manage Company error :" + ex.getMessage());
		}
	}*/
	
	
	
	
	//because of TESTNG we are commenting main()
	/*public static void main(String args[]) throws InterruptedException
	{
		US_SBDC_1001_TC0002 tc2=new US_SBDC_1001_TC0002();
		tc2.Execute("ff", "http://localhost:90/finsys", "dummyfm", "passw0rd", "");
	//tc2.ManageCompany();
	}*/
	
}
