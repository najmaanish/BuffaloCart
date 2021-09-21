package fileManagerTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import helperTest.BuffaloCartBasicFlows;
import pages.LoginPage;
import utils.DriverFactory;

public class FileManagerBaseTest {
	WebDriver driver;
	@BeforeMethod
	//@Parameters({"browser"})
	public void loadUrlAndLogin()
	{
		BuffaloCartBasicFlows bf= new BuffaloCartBasicFlows();
		driver=bf.loadUrlAndLogin(driver);
		bf.openLink("File Manager", driver);
		
	}
	@AfterMethod
	public void appQuit()
	{
	 driver.quit();	
	}

}
