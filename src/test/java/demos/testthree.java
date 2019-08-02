package demos;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class testthree {
	WebDriver driver;
	String act = "abc";
 
	@Test
  public void fun() throws InterruptedException, AWTException {
		
		driver.findElement(By.name("userName")).sendKeys("lalitha");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.name("Login")).click();
		Thread.sleep(10000);
		driver.manage().window().maximize();
		WebElement prod = 	driver.findElement(By.name("products"));
		driver.findElement(By.name("products")).click();
		//driver.findElement(By.name("products")).sendKeys("bag");
		//Assert.assertEquals(act, driver.getTitle());
		
		Actions n = new Actions(driver);
		
		n.clickAndHold(prod);
		
		
		//sendKeys(prod, "bag")
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_B);
		r.keyRelease(KeyEvent.VK_B);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_G);
		r.keyRelease(KeyEvent.VK_G);
	
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
	  
	  driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	  
	  
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
