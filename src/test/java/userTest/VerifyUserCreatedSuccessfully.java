package userTest;

import org.testng.annotations.Test;

import helperTest.BuffaloCartBasicFlows;
import pages.HomePage;
import pages.UserPage;

public class VerifyUserCreatedSuccessfully extends UserCreationBaseTest {
	@Test
	public void verifyUserCreation()
	{
		UserPage up=new UserPage(driver);
		up.searchNewUser(userName);
		up.verifyUserCreatedSuccessfully(userName);
	}
}
