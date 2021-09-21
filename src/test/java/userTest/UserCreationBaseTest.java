package userTest;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import helperTest.BuffaloCartBasicFlows;
import pages.NewUserPage;
import pages.UserPage;
import utils.ScreenShot;

public class UserCreationBaseTest {
	WebDriver driver;
	String userName;
	@BeforeMethod
	public void userCreation()
	{
		BuffaloCartBasicFlows bf=new BuffaloCartBasicFlows();
		driver=bf.loadUrlAndLogin(driver);
		bf.openLink("User", driver);
		UserPage up=new UserPage(driver);
		up.navigateToNewUserPage();
		NewUserPage newUser= new NewUserPage(driver);
		String name=newUser.enterFullName("First User");
		System.out.println("Expected  "+name);
		newUser.enterEmploymentId();
		newUser.enterUserName("User");
		newUser.enterPassword();
		newUser.enterConfirmPassword();
		newUser.enterEmailId();
		newUser.enterLocality("Malayalam (India)");
		newUser.enterLanguage();
		newUser.enterPhoneNumber();
		newUser.enterMobileNumber();
		newUser.enterSkypeId();
		newUser.chooseImage("C:\\Users\\USER\\Desktop\\sample.png");
		newUser.selectUserType("Staff");
		newUser.selectUserDirection("LTR");
		newUser.selectUserDesignation();
		newUser.selectPermissionType();
		newUser.createUser();
		userName=name;
}
	@AfterMethod
	public void appQuit(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
			
		{
			ScreenShot.generateScreenShot(driver, result.getName());
		}
if(result.getStatus()==ITestResult.SUCCESS)
			
		{
			ScreenShot.generateScreenShot(driver, result.getName());
		}
	 driver.quit();	
	}

}
