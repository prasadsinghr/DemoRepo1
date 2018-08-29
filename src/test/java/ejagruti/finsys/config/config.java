package ejagruti.finsys.config;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
public class config 
{
	public static WebDriver driver=null;
	public static WebDriverWait wait=null;

	private String getParameterValue_child(String parametername) throws IOException
	{
		InputStream input = null;
		Properties prop = new Properties();
		input = getClass().getClassLoader().getResourceAsStream("Parameters.properties");
    	//System.out.println(input);
		//load a properties file
		prop.load(input);
		String ParameterValue=prop.getProperty(parametername);
		System.out.println(ParameterValue);
		return ParameterValue;

	}
	public static String getParameterValue(String parametername) throws IOException
	{
			
		config pf=new config();
		return pf.getParameterValue_child(parametername);
	}




}
