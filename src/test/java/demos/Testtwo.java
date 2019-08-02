package demos;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Testtwo {
	WebDriver driver;
	String act = "abc";
 
	@Test
  public void fun() {
		
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
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
	  
	  //System.setProperty("webdriver.gecko.driver" , "C:\\Users\\Training_c2d.02.11\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	  
	   //driver = new FirefoxDriver();
	  
	  //driver.get("http://demoaut.com/");
	  
	  System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Training_c2d.02.11\\Downloads\\geckodriver-v0.24.0-win64\\chromedriver.exe");
	  
	   //driver = new FirefoxDriver();
	  
	  driver = new ChromeDriver();
	  
	  driver.get("http://demoaut.com/");
	  
	  
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("nn");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("nn");
  }

  @AfterTest
  public void afterTest() 
  
  {
	  System.out.println("nn");
	  
  }

}
