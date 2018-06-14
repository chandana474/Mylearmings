package SeleniumLearnings.NewApplication;

import java.io.IOException;
import SeleniumLearnings.NewApplication.Homepage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class firsttest extends BaseClass {

	
	@Test(dataProvider="getData")
	public void login(String username,String password) throws IOException
	
	{
		//Initialize desired browser
		driver=initDriver();
		//Get Required URL
		getenvironment();
		
		//Create Homepage Object
		Homepage page1= new Homepage(driver);
		
		//Send values to Facebook username field
		page1.getusername().sendKeys(username);
		//Send values to facebook password field
		page1.getpassword().sendKeys(password);
		//Click on Login push button
		page1.getLogin().submit();
		
		
		
	}
	
	@DataProvider
	
	public Object[][] getData()
	{
		Object[][] data = new Object[1][1];
		data[0][0] = "chandanag29@gmail.com";
		data[0][1] = "5512207712";
		data[1][0] = "chandanageddam1@gmail.com";
		data[1][1] = "abcd";
		
		return data;
		
				
		
		
	}
}

