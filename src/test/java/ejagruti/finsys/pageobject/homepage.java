package ejagruti.finsys.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class homepage 
{
	public homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    @FindBy(how=How.XPATH,using="//div[.='Financial Analysis']")
    public WebElement Financial_Analysis;
    
    @FindBy(how=How.XPATH,using="//a[@title='Manage Company']")
   	public WebElement Manage_Company;
    
    @FindBy(how=How.XPATH,using="//a[.='LOGOUT']")
    public WebElement logout;
    
    
	
	/*public WebElement IsObjectExists(String xPath)
	{
	   WebElement obj=config.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xPath)));
	  
	   return obj;
     
	}*/
	
	
	/*public String ObjectGetAttributeValue(String xPath,String AttributeName)
	{
		try
		{
		WebElement obj=IsObjectExists(xPath);
		
		return obj.getAttribute(AttributeName);
		
		
		}
		catch(Exception ex)
	    {
		
		throw new WebDriverException();
	    }
		}
		*/

}
