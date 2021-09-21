package loginTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.DriverFactory;

public class LoginTestBase {
	WebDriver driver;
	@BeforeMethod
	public void loadUrl()
	{
		driver= DriverFactory.getDriver("FireFox");
		driver=DriverFactory.setImplicitwait(10, driver);
		driver.get("https://erp.buffalocart.com/login");
	}
	@AfterMethod
	public void appQuit()
	{
	 driver.quit();	
	}
	}
	

