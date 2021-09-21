package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.AppWait;
import utils.JSExecutor;

public class HomePage {
	public HomePage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//li[@class='dropdown user user-menu']/a/span")
	public WebElement userLoggedIn;
	
	@FindBy(xpath="//ul[@class=\"nav s-menu \"]/li/a/span")
	List <WebElement> dashboardItems;
	
	@FindBy(xpath="//h3[text()='Expense Report']")
	public WebElement expense;
	
	public String userLogged(WebDriver driver)
	{
		driver.manage().window().maximize();
		System.out.println(userLoggedIn.getText());
		return userLoggedIn.getText();
		
	}
	public void verifyDashboardItemPresent(String dbItem)
	{
		int flag=0;
		for(int i=1;i<dashboardItems.size();i++)
		{
			if(dashboardItems.get(i).getText().equalsIgnoreCase(dbItem))
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println(dbItem+" is Present in the dashboard list ");
		}
		else
			System.out.println(dbItem+" not Present in the dashboard list ");
			
	}
	public void openLink(String linkName,WebDriver driver) {
		String xpath = "//span[text()='"+linkName+"']";
		driver.findElement(By.xpath(xpath)).click();
	}
	public void scrollToElement(WebDriver driver)
	{
		JSExecutor.scrollToElement(driver, expense);
	}
}
