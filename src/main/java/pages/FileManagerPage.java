package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utils.SystemActions;
import utils.StringOperations;

public class FileManagerPage {
	
	@FindBy(xpath="//a[@class='text-muted']")
	public WebElement pageHeading;
	
	@FindBy(xpath="//div[@title='New folder']")
	public WebElement createNewFolderIcon;
	
	@FindBy(xpath="//input[@title='Incremental search is only from the current view.']")
	public WebElement searchbox;
	@FindBy(xpath="//div[@class='elfinder-cwd-filename ui-draggable-handle ui-state-hover']")
	public WebElement nameInputfield;
	
	public FileManagerPage(WebDriver driver){
		PageFactory.initElements(driver,this);
}
	public void verifyFileManagerPageHeading(String expectedHeading)
	{
		String actualHeading=pageHeading.getText();
		Assert.assertEquals(actualHeading, expectedHeading,"Failed");
		//System.out.println("Verified");
	}
	
	public void createNewFolder()
	{
		createNewFolderIcon.click();
		/*String folderName="NajmaFolder"+StringOperations.randomIntegerGenertae(3);
		nameInputfield.sendKeys(folderName);
		System.out.println(folderName);*/
		searchbox.sendKeys(Keys.ENTER);
	}
	public void searchFolder() {
		searchbox.sendKeys("New Folder");
		searchbox.sendKeys(Keys.ENTER);
	}
}