package SeleniumLearnings.NewApplication;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class BaseClass  {

	
	public WebDriver driver;
	
	
	
	public WebDriver  initDriver() throws IOException
	
	{
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\MSN\\git\\Mylearmings\\NewApplication\\src\\main\\java\\SeleniumLearnings\\NewApplication\\Data.properties");
		prop.load(fis);
		
		
		
	 	prop.getProperty("browser");
		String browsername = prop.getProperty("browser");
		
		if(browsername.equals("chrome"))
		{
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\MSN\\git\\Mylearmings\\NewApplication\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
			 driver=new ChromeDriver();
		}
		
		else
		
		
		{

			
			System.out.println("This browser is not given");
          }
		
		return driver;
	}
	
	
	
	public void getenvironment() throws IOException
	
	{
		
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\MSN\\git\\Mylearmings\\NewApplication\\src\\main\\java\\SeleniumLearnings\\NewApplication\\Data.properties");
		prop.load(fis);
		
		
		
		String Envname = prop.getProperty("Environment");
		
		if(Envname.equals("QA"))
		
		{
			
			driver.get("https://facebook.com");
		}
			
		else  
			
		{
			System.out.println("you have not specified correct Environment required");
		}
	}
	
	
}
