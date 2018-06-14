package SeleniumLearnings.NewApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage

{

	
	WebDriver driver;
	
	//Constructor for thsi class
	public Homepage(WebDriver driver) {
		
		this.driver=driver;
	// TODO Auto-generated constructor stub
}

	
	
	
	By Username = By.id("email");
	By Password = By.id("pass");
	By Login = By.xpath("//input[@type='submit']");
	
	
//****************Method to find Facebook UserName Text Field******************
	
	public WebElement getusername()
	{
		return	driver.findElement(Username);
	}
	
//****************Method to find Facebook Password Text Field******************
	
    public WebElement getpassword()
	{
		return	driver.findElement(Password);
	}
	
    
 //****************Method to find Facebook Login push button********************
    
    public WebElement getLogin()
    {
    	return driver.findElement(Login);
    }

	
	
}
