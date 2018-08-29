package ejagruti.finsys.modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ejagruti.finsys.config.config;
import ejagruti.finsys.pageobject.loginpage;

public class loginmodule 
{

	public loginmodule(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	loginpage lgnpage=new loginpage(config.driver);
	public void EnterValidUserName(String user)
	{
		lgnpage.username.sendKeys(user);
		
	}
	
	public void EnterValidPassword(String pwd)
	{
		lgnpage.password.sendKeys(pwd);
	}
	
	public void ClickLoginButton()
	{
		lgnpage.login.click();
	}
	
	
	
}
