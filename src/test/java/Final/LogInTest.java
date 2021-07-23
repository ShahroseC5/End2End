package Final;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.SignIn;
import pageObjects.WHomepage;
import resources.base;

public class LogInTest extends base{
public WebDriver driver;

	
@BeforeTest()
public void initialize () throws IOException {
	driver= intializeDriver();
	driver.get(prop.getProperty("url"));


}

@Test(dataProvider="getData")

public void Loginpage(String username, String password)throws IOException {
	
	driver.get(prop.getProperty("url"));
	SignIn si= new SignIn(driver);
	si.Account().click();
	si.SignIn().click();
	si.Email().sendKeys(username);
	si.Password().sendKeys(password);
	si.SignInButton().click();
	}


@DataProvider ()
public Object[][] getData(){
	
	Object[][] data= new Object[2][2];
	data[0][0] = "restricteduser@test.com";
	data[0][1]= "1234557";
	
	data [1][0]="nonrestricted@test.com";
	data [1][1]= "1223424221313";
	
	return data;
	
			
	
}
@AfterTest
public void teardown() {
	
	driver.close();
}
}
	
	
	
	

