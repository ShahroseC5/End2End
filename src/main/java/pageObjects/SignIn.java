package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.base;

public class SignIn extends base {

	public WebDriver driver;
	
	public SignIn (WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	private By Account= By.cssSelector("button[id='hf-account-flyout']");

	private By SignIn= By.xpath("//div[contains(text(),'Sign In')]");

	private By Email = By.id("email");
private By Password = By.id("password");

private By signinbttn = By.cssSelector("button[data-automation-id='signin-submit-btn']");
	

public WebElement Account()
	{
		return driver.findElement(Account);
	
	}

public WebElement SignIn()
{
	return driver.findElement(SignIn);

}
	public WebElement Email()
	{
		return driver.findElement(Email);
	
	}
	public WebElement Password()
	{
		return driver.findElement(Password);
	
	}
	public WebElement SignInButton()
	{
		return driver.findElement(signinbttn);
	
	}
	
	
	
	
}

