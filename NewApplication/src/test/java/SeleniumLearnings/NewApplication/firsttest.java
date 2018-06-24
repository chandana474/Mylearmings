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
		ReadingExcelData Rb= new ReadingExcelData();
		Object[][] arrayObject = Rb.getExcelData("C:\\Users\\chand\\git\\Mylearmings\\NewApplication\\TestData.xlsx", "sheet1", 3, 2);
		return arrayObject;
		
				
		
		
	}
}

