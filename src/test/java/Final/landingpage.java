package Final;







import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.WHomepage;
import resources.base;

public class landingpage  extends base {
public WebDriver driver;

	@BeforeTest()
	public void initialize () throws IOException {
		driver= intializeDriver();
		driver.get(prop.getProperty("url"));
	
	
	}
	
	@Test ()
public void Landingpage ()

{
	
	WHomepage hp= new WHomepage(driver);
	
	AssertJUnit.assertEquals(hp.headlink().getText(), "Free shipping with no order minimum required. Restrictions apply.");
	
	
	
}
	
	
	
	
	
	
@AfterTest()
public void teardown() {
	
	driver.close();
	
	
}
	
}
