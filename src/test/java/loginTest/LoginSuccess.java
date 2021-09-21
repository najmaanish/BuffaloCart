package loginTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import utils.StringOperations;

public class LoginSuccess extends LoginTestBase {
@Test
public void loginSuccess()
{
	LoginPage lp=new LoginPage(driver);
	lp.enterUserName("admin");
	lp.enterPassword("123456");
	lp.clickSignIn();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Codecarrots"));
}
}
