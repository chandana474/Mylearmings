package SeleniumLearnings.NewApplication;

import java.io.IOException;
import SeleniumLearnings.NewApplication.Homepage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class firsttest extends BaseClass {

	
	@Test
	public void login() throws IOException
	
	{
		//Initialize desired browser
		driver=initDriver();
		//Get Required URL
		getenvironment();
		
		//Create Homepage Object
		Homepage page1= new Homepage(driver);
		
		//Send values to Facebook username field
		page1.getusername().sendKeys("chandanag29@gmail.com");
		//Send values to facebook password field
		page1.getpassword().sendKeys("5512207712");
		//Click on Login push button
		page1.getLogin().submit();
		
		
		
	}
}

