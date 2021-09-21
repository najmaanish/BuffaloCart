package loginTest;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataProvider.DataProviders;
import pages.LoginPage;
import utils.DriverFactory;

public class LoginMultipleUsers extends LoginTestBase {
	@Test(dataProvider="DP1",dataProviderClass=DataProviders.class)
	public void loginSuccess(String userName,String password)
	{
		LoginPage lp=new LoginPage(driver);
		lp.enterUserName(userName);
		lp.enterPassword(password);
		lp.clickSignIn();
		DriverFactory.setImplicitwait(10, driver);
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Codecarrots"));
}
	
}