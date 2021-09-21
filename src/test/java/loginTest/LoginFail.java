package loginTest;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginFail extends LoginTestBase {
	@Test
	public void loginFail()
	{
		LoginPage lp=new LoginPage(driver);
		lp.enterUserName("admin1");
		lp.enterPassword("123456");
		lp.clickSignIn();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Assert.assertFalse(driver.getTitle().equalsIgnoreCase("Codecarrots"));
	}

}
