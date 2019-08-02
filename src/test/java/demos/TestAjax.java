package demos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class TestAjax {

WebDriver driver;
  @Test
  public void f() {
  
  WebDriverWait waiting = new WebDriverWait(driver,30);
  WebElement container = driver.findElement(By.xpath("//*[@class='demo-container size-narrow']"));
  
  By Containertwo = By.xpath("//*[@class='demo-container size-narrow']");
  waiting.until(ExpectedConditions.presenceOfElementLocated(Containertwo));
  
  
  WebElement Emptydate = driver.findElement(By.xpath("//*[@class='RadAjaxPanel']//descendant::span"));
  String TextBeforeAjaxcall = Emptydate.getText().trim();
  System.out.println(TextBeforeAjaxcall);
  
  
  
  }
  @BeforeTest
  public void beforeTest() {
  
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_c2d.02.11\\Downloads\\geckodriver-v0.24.0-win64\\chromedriver.exe");
  driver = new ChromeDriver();
 String Ajax ="https://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality/explicit-show-hide/defaultcs.aspx";
 driver.get(Ajax);
  
  
  }

  @AfterTest
  public void afterTest() {
  
  
  }

}
