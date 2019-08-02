package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
	//Page object model
	
	WebDriver driver;
	
	By username = By.name("userName");
	By password = By.name("password");
	By login = By.name("login");
	
	public Login(WebDriver driver)
	
	{
		
		this.driver = driver;
	}
	
	
	

	public void loginfun (String uname, String pass)
	{
		
		driver.findElement(username).sendKeys(uname);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(login).click();
		
	}

}

