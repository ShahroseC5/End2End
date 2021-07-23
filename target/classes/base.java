package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class base {
	public Properties prop;
    public WebDriver driver;
	public WebDriver intializeDriver() throws IOException {
	
		
		prop = new Properties();
	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/resources/data.properties");	
	
	prop.load(fis);
	//String browserName = System.getProperty("browser"); //for headless
	String browserName =prop.getProperty("browser");
	
	if(browserName .contains("chrome")) {
		
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/java/resources/chromedriver-2");
		
		if(browserName .contains("headless")) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		
		
		driver = new ChromeDriver(options);
		}
		else {
			driver =new ChromeDriver();
			
			
		}
		}
	
	
	else if(browserName.contains("FireFox")) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/java/resources/geckodriver");
		driver = new FirefoxDriver();
		
		
		
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	

	}
	
	
	public String getScreenshots(String testMethodName, WebDriver driver) throws IOException {
		String screenName= testMethodName +".png";
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try
		{
		FileHandler.copy(src, new File(System.getProperty("user.dir")+"/target/Screenshots/"+screenName+""));
		}
		
		
		catch(IOException e)
		{
		System.out.println(e.getMessage());
		}
		return screenName;
		
		
		
		
	}
	
}
