package SeleniumLearnings.NewApplication;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class firsttest extends BaseClass {

	
	@Test
	public void login() throws IOException
	
	{
		driver=initDriver();
		getenvironment();
		
	}
}

