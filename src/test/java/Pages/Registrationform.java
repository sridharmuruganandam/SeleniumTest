package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Registrationform {
	
	WebDriver driver;

	public Registrationform(WebDriver driver)
	
	{
		this.driver = driver;
	}

	
//Page factoryModel
	
	//Objects
	//Thread.sleep(1000);
	
	@FindBy(how=How.LINK_TEXT , using = "registration form")  WebElement regformlink;
	@FindBy(how=How.NAME , using = "firstName")  WebElement FirstName;
	@FindBy(how=How.NAME , using = "lastName")  WebElement LastName;
	@FindBy(how=How.NAME , using = "phone")  WebElement Phone;
	@FindBy(how=How.NAME , using = "userName")  WebElement Email;
	@FindBy(how=How.NAME , using = "address1")  WebElement AddressLine1;
	@FindBy(how=How.NAME , using = "address2")  WebElement AddressLine2;
	@FindBy(how=How.NAME , using = "city")  WebElement City;
	@FindBy(how=How.NAME , using = "state")  WebElement State;
	@FindBy(how=How.NAME , using = "postalCode")  WebElement Pocode;
	
	@FindBy(how=How.NAME , using = "country")  WebElement Country;
	
	@FindBy(how=How.NAME , using = "email")  WebElement UserName;
	@FindBy(how=How.NAME , using = "password")  WebElement Password;
	@FindBy(how=How.NAME , using = "confirmPassword")  WebElement ConfirmPassword;
	@FindBy(how=How.NAME , using = "register")  WebElement Submit;

	
	
	//Function
	
	public void Registration(String firstName,String lastName,String phone,String userName,String address1,String address2,String city,String state,String postalCode,String country,String email,String password,String confirmPassword)
	{
		
		
		
		FirstName.sendKeys(firstName);
		LastName.sendKeys(lastName);
		Phone.sendKeys(phone);
		Email.sendKeys(userName);
		AddressLine1.sendKeys(address1);
		AddressLine2.sendKeys(address2);
		City.sendKeys(city);
		Pocode.sendKeys(postalCode);
		Country.sendKeys(country);
		UserName.sendKeys(email);
		Password.sendKeys(password);
		ConfirmPassword.sendKeys(confirmPassword);
		Submit.click();


	}
	
	
		
	
}
