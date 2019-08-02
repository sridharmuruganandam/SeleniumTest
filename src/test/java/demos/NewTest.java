package demos;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
	String act = "abc";
 
	@Test
  public void f() {
		
		driver.findElement(By.name("userName")).sendKeys("ABC");
		driver.findElement(By.name("password")).sendKeys("ABC");
		driver.findElement(By.name("login")).click();
		Assert.assertEquals(act, driver.getTitle());
	  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
	  
	  
  }

  @BeforeClass
  
  public void beforeClass() {
	  
	  System.setProperty("webdriver.gecko.driver" , "C:\\Users\\Training_c2d.02.11\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	  
	   driver = new FirefoxDriver();
	  
	  driver.get("http://demoaut.com/");
  }

  @AfterClass
  public void afterClass() {
	  
  }

  @BeforeTest
  public void beforeTest() {
	  
  }

  @AfterTest
  public void afterTest() 
  
  {
	  
	  
  }

}
