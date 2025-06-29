package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

	public MyAccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//h2[normalize-space()='My Account']")// MyAccount Page heading
	WebElement msgMyAccountHeading;
	
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']")//added in step6
	WebElement lnkLogout;
	
	
	public boolean isMyAccountPageExists()
	{
		try 
		{
			return (msgMyAccountHeading.isDisplayed());
		}
		catch(Exception e) 
		{
			return false;
		}
	}
	 
	public void clickLogout() 
	{
		lnkLogout.click();
	}
	
	
	
	
	
}
