package Test;

import org.testng.annotations.Test;

import Pages.Login2;
import Pages.Registrationform;
import utility.BrowserFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

public class DemoAut_Pagefactorymodel {
	
	WebDriver driver;
	
  @Test
  public void flogin() {
	  
	  driver = BrowserFactory.browser("chrome", "http://demoaut.com/");
	  
	  
	  
	  Login2 log = PageFactory.initElements(driver, Login2.class);
	  
	  log.loginfun("Username", "Password");
	  
	  Registrationform Reg = PageFactory.initElements(driver, Registrationform.class);
	  
	  Reg.Registration("Sridhar","M","7845108224","sridhar2606@gmail.com","43 Ramasamy street","KK Nagar","Chennai","TN","12345","FIJI","sridhar2606@gmail.com","anbesivam@1","anbesivam@1");
	  
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
  }

}
