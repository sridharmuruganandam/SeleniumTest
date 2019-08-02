package Test;

import org.testng.annotations.Test;

import Pages.Login;
import utility.BrowserFactory;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

public class demoAut {
	WebDriver driver;
	
  @Test
  public void flogin() {
	  
	  driver = BrowserFactory.browser("chrome", "http://demoaut.com/");
	  
	  Login log = new Login(driver);
	  
	  log.loginfun("tutorail", "tutorail");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  
  }

}
