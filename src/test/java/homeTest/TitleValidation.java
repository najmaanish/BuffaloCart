package homeTest;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.HomePage;
import utils.ScreenShot;

public class TitleValidation extends HomePageBaseTest {
	
 @Test
 
 public void titleVerify()
 {
 HomePage hp= new HomePage(driver);
	String actual= hp.userLogged(driver);
	String expected="demo";
	Assert.assertEquals(actual, expected);
 }
	 
 
}
