package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ScreenShot;

public class LoginPage {
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(name="user_name")
	public WebElement userName;
	@FindBy(name="password")
	public WebElement password;
	@FindBy(xpath="//button[text()='Sign in ']")
	public WebElement signInBtn;
	public void enterUserName(String uname)
	{
		userName.sendKeys(uname);
	}
	public void enterPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void clickSignIn()
	{
		
		signInBtn.click();
	}
}
