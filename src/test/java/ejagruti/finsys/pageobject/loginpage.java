package ejagruti.finsys.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class loginpage 
{
	public loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="//input[@class='textbox-text validatebox-text textbox-prompt']")
	public WebElement username;
	
    @FindBy(how=How.XPATH,using="//input[@placeholder='Password']")
    public WebElement password;
    
    @FindBy(how=How.XPATH,using="//*[@class='l-btn-left l-btn-icon-left']")
    public WebElement login;



}
