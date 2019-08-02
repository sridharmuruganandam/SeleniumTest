package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class Login2 {
	
	
	//pagefactory model
	
	WebDriver driver;
	
	@CacheLookup
	
	@FindBy(how =How.NAME, using = "userName")
	
	WebElement username;
	
	
	@CacheLookup
	@FindBy(how = How.NAME , using = "password")
	WebElement password;
	
	
	@CacheLookup
	@FindBy(how = How.NAME, using ="login")
	WebElement login;
	
	//By username = By.name("userName");
	//By password = By.name("password");
	//By login = By.name("login");
	
	public Login2(WebDriver driver)
	
	{
		
		this.driver = driver;
	}
	
	
	

	public void loginfun (String uname, String pass)
	{
		
		username.sendKeys(uname);
		password.sendKeys(pass);
		login.click();
		
	}

}

