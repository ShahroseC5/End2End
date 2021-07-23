package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import resources.base;

public class WHomepage extends base {

	public WebDriver driver;
	
	
	public WHomepage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	private By header =By.cssSelector("span[class='MultipleCTACard-title'] ");
	


	public WebElement headlink()
	{
		
		return driver.findElement(header);
		
		
	}
	
	
	
}
