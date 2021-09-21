package helperTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;
import utils.DriverFactory;
import utils.AppWait;
import utils.ScreenShot;

public class BuffaloCartBasicFlows {
	
	public WebDriver loadUrlAndLogin(WebDriver driver)
	{
		driver= DriverFactory.getDriver("Chrome");
		driver=DriverFactory.setImplicitwait(10, driver);
		driver.get("https://erp.buffalocart.com/login");
		LoginPage lp=new LoginPage(driver);
		lp.enterUserName("admin");
		lp.enterPassword("123456");
		lp.clickSignIn();
		return driver=AppWait.setImplicitwait(10, driver);
	}
	public void openLink(String linkName,WebDriver driver) {
		String xpath = "//span[text()='"+linkName+"']";
		driver.findElement(By.xpath(xpath)).click();
	}
	
	
}
