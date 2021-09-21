package homeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;

public class VerifyUserLoggedIn extends HomePageBaseTest{
	@Test
	public void verifyUserName()
	{
	HomePage hp= new HomePage(driver);
	String actual= hp.userLogged(driver);
	String expected="demo";
	Assert.assertEquals(actual, expected);
	}
	
}
