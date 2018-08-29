package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ejagruti.finsys.config.config;
import ejagruti.finsys.modules.LaunchApp;
import ejagruti.finsys.modules.createcompanymodule;
import ejagruti.finsys.modules.loginmodule;
import ejagruti.finsys.pageobject.companymanage;
import ejagruti.finsys.pageobject.homepage;
import ejagruti.finsys.pageobject.loginpage;

public class US_SBDC_1001_TC0003 
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
			System.out.println("TC3");
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
	//------------------------------UpdateCompany------------------------------------------------------
		@Test
		@Parameters({"CompanyName"})
		void CreateCompany(String company_Name) throws InterruptedException
		{
			System.out.println("he");
			createcompanymodule cmpmodule = new createcompanymodule(config.driver);
			//homepage hp=new homepage(config.driver);
	    Boolean validate=cmpmodule.IsManageCompany();
	    if(validate.equals(true))
	    {
		System.out.println("we are on track");
		}
	    else
	    {
	    	System.out.println("missed path");
	    }
		//Thread.sleep(2000);
		cmpmodule.ClickManageCompany();
		
		config.driver.switchTo().frame(0);
		Thread.sleep(2000);
		
	
		
		//config.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//config.driver.findElement(By.xpath("(//span[@class='datagrid-row-expander datagrid-row-expand'])[1]")).click();
		cmpmodule.companyExpander();
		//config.driver.findElement(By.xpath("//input[@name='name']")).clear();
		cmpmodule.companyEdit();
		cmpmodule.EnterCompanyName2(company_Name);
		
		
	/*	cm.CompanyTypeDropDown(company_type);
		
		cm.EnterPanDetails(pan_details);
		
		cm.EnterEmail(email_id);

		cm.EnterTinDetails(tin_details);

		cm.EnterCountryDropDown(country);

		cm.EnterStateDropDown(state);
		
		cm.EnterCityDropDown(city);*/
		
		cmpmodule.SaveCompany();
		System.out.println(company_Name);
		/*
		Thread.sleep(10000);
		String getname=config.driver.findElement(By.xpath("(//div[@class='datagrid-cell datagrid-cell-c1-name'])[2]")).getText();
		

		if(getname.equalsIgnoreCase(company_Name))
		{
		System.out.println("yes, i am on top "+getname);
		}
		else
			System.out.println("m somewhere else");
		*/
		}
		
		public static void main(String args[]) throws InterruptedException
		{

			US_SBDC_1001_TC0003 tc3=new US_SBDC_1001_TC0003();
			tc3.Execute("ff", "http://localhost:90/finsys", "dummyfm", "passw0rd", "");
		tc3.CreateCompany("jaisadguru");
		}
}
