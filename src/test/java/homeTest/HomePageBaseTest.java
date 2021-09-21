package homeTest;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import helperTest.BuffaloCartBasicFlows;
import pages.LoginPage;
import utils.DriverFactory;
import utils.ScreenShot;

public class HomePageBaseTest {
	WebDriver driver;
	@BeforeMethod
	//@Parameters({"browser"})
	public void navigateToHomePage()
	{
		BuffaloCartBasicFlows bf= new BuffaloCartBasicFlows();
		driver= bf.loadUrlAndLogin(driver);
	}
	@AfterMethod
	public void appQuit(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
			
		{
			ScreenShot.generateScreenShot(driver, result.getName());;
		}
	 driver.quit();	
	}

}
