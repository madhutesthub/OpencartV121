package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) 
	{
		super(driver);
	}
	
	//LOccators
	@FindBy(xpath="//span[normalize-space()='My Account']")
	 WebElement lnkMyAccount;
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement lnkRegister;
	
	@FindBy(linkText="Login")											//login link adding in step no5.1
	WebElement linkLogin;
	
	//ActionMethods
	
	public void clickMyAccount() 
	{
		lnkMyAccount.click();
	}
	
	public void clickRegister() 
	{
		lnkRegister.click();
	}
	
	public void clickLogin() 
	{
		linkLogin.click();
	}
	
	
}
