package ejagruti.finsys.modules;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import ejagruti.finsys.config.config;
import ejagruti.finsys.pageobject.companymanage;
import ejagruti.finsys.pageobject.homepage;
public class createcompanymodule 
{
	public createcompanymodule(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	companymanage cmpmang = new companymanage(config.driver);
	//--------------------------------------------------
	homepage hmpage= new homepage(config.driver);
	public void ClickFinancialAnalysis()
	{
		hmpage.Financial_Analysis.click();
	}
	public void ClickManageCompany()
	{
		hmpage.Manage_Company.click();
	}
	public boolean IslogoutExist()
	{
		boolean logoustatus=hmpage.logout.isDisplayed();
		return logoustatus;
	}
	public boolean IsFinancialAnalysis()
	{
		Boolean FinancialAnalysisStatus=hmpage.Financial_Analysis.isDisplayed();
		return FinancialAnalysisStatus;
	}
	public boolean IsManageCompany() throws InterruptedException
	{
		Thread.sleep(2000);
		Boolean ManageCompanyStatus=hmpage.Manage_Company.isDisplayed();
		return ManageCompanyStatus;
	}
	//-------------------------------
	public void CreateNewCompany()
	{
		cmpmang.new_company.click();
	}
	public void EnterCompanyName(String Cname)
	{
		cmpmang.company_Name.sendKeys(Cname);
	}
	public void CompanyTypeDropDown(String CompanyTypeValue)
	 {
		Select sel=new Select(cmpmang.company_type);
		sel.selectByVisibleText(CompanyTypeValue);
    }
	public void EnterPanDetails(String pan)
	{
		cmpmang.pan_details.sendKeys(pan);
	}
	public void EnterEmail(String email)
	{
		cmpmang.email_id.sendKeys(email);
	}
	public void EnterTinDetails(String tin)
	{
		cmpmang.tin_details.sendKeys(tin);
	}
	public void EnterCountryDropDown(String CountryValue)
    {
	 Select sel=new Select(cmpmang.country);
	 sel.selectByVisibleText(CountryValue);
    }
	public void EnterStateDropDown(String StateValue)
    {
		System.out.println("state");
		Select sel=new Select(cmpmang.state);
		sel.selectByVisibleText(StateValue);
    }
	public void EnterCityDropDown(String CityValue)
    {
		System.out.println("city");
		Select sel=new Select(cmpmang.city);
		sel.selectByVisibleText(CityValue);
    }
	public void SaveCompany()
	{
		cmpmang.save.click();
	}
	public String ValidateTop()
	{
		
		String getname=cmpmang.lastcreated.getText();
		return getname;
	}
//----------------------------------TC3--------------------------
	
	public void EnterCompanyName2(String Cname)
	{
		cmpmang.company_Name2.sendKeys(Cname);
		System.out.println("Yes");
	
	}
	public void companyExpander()
	{
		System.out.println("alo");
		cmpmang.companyExpander.click();	
	}
	public void companyEdit()
	{
		cmpmang.companyEdit.clear();
	}
}
