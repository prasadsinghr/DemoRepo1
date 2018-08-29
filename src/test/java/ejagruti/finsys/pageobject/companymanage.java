package ejagruti.finsys.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import ejagruti.finsys.config.config;

public class companymanage 
{
	public companymanage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	@FindBy(how=How.XPATH,using="//span[@class='l-btn-text' and contains(text(),'New')]")
	public WebElement new_company;

    @FindBy(how=How.XPATH,using="//input[@class='easyui-validatebox validatebox-text validatebox-invalid']")
    public WebElement  company_Name;
   
    @FindBy(how=How.XPATH,using="//select[@id='companytype']")
    public WebElement company_type;
 
       
   @FindBy(how=How.XPATH,using="//input[@name='pan']")
    public WebElement pan_details;
    
    @FindBy(how=How.XPATH,using="//input[@name='email']")
    public WebElement email_id;
  
    @FindBy(how=How.XPATH,using="//input[@name='tin']")
    public WebElement tin_details;

    @FindBy(how=How.XPATH,using="//select[@id='countryid']")
    public WebElement country;

   @FindBy(how=How.XPATH,using="//select[@id='stateidlist']")
    public WebElement state;
    
    @FindBy(how=How.XPATH,using="//select[@id='citylist']")
    public WebElement city;
  
    @FindBy(how=How.XPATH,using="//span[@class='l-btn-text' and contains(text(),'Save')]")
    public WebElement save;
    
@FindBy(how=How.XPATH,using="(//div[@class='datagrid-cell datagrid-cell-c1-name'])[2]")
public WebElement lastcreated;
    
    //-------------TC3------------
    
    @FindBy(how=How.XPATH,using="//input[@name='name']")
    public WebElement  company_Name2;
	
    @FindBy(how=How.XPATH,using="(//span[@class='datagrid-row-expander datagrid-row-expand'])[1]")
    public WebElement  companyExpander;
    
    @FindBy(how=How.XPATH,using="//input[@class='easyui-validatebox validatebox-text']")
    public WebElement  companyEdit;
	
		 

}


