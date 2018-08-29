package ejagruti.finsys.modules;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import ejagruti.finsys.config.config;
public class LaunchApp
{
	public static void LaunchApplication(String BrowserName,String URL,String WebDriverExePath)
	{
		int timeout=20;
		try
		{
			if(BrowserName.equalsIgnoreCase("ff"))
			{
				config.driver=new FirefoxDriver();
			}
			if(BrowserName.equalsIgnoreCase("ch"))
			{
				System.setProperty("webdriver.chrome.driver",WebDriverExePath);
				config.driver=new ChromeDriver();
			}
			if(BrowserName.equalsIgnoreCase("ie"))
			{
				System.setProperty("webdriver.ie.driver",WebDriverExePath);
				config.driver=new InternetExplorerDriver();
			}
     		config.wait=new WebDriverWait(config.driver,timeout);
			config.driver.get(URL);
			config.driver.manage().timeouts().pageLoadTimeout(timeout, TimeUnit.SECONDS);
			config.driver.manage().window().maximize();
		}
      	catch(Exception ex)
	    {
  		throw new WebDriverException();
	    }
	}
}