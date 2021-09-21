package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class UserPage {
	@FindBy(xpath = ("//ul[@class='nav nav-tabs']/li[2]"))
	public WebElement newUserBtn;

	@FindBy(xpath = "//input[@class='form-control input-sm']")
	public WebElement searchBox;

	@FindBy(xpath = "//a[@class='text-info']")
	public WebElement userName;

	@FindBy(xpath = "//a[@title='Edit']/i")
	public WebElement editIcon;

	@FindBy(xpath = "//a[@title='Click to Delete ']")
	public WebElement deleteIcon;

	// Delete page Icon
	@FindBy(xpath = "//button[@name='submit']")
	public WebElement deleteConfirmBtn;

	@FindBy(xpath = "//table[@id='DataTables']/tbody/tr/td")
	WebElement deletedRecordText;

	public UserPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void navigateToNewUserPage() {
		newUserBtn.click();
	}

	public void searchNewUser(String name) {
		// WebDriver driver;
		searchBox.sendKeys(name);
		System.out.println(name);

	}

	public void navigateToUpdateUserDetails() {
		userName.click();
	}

	public void navigateToUserEditDetailsPage() {
		editIcon.click();
	}

	public void deleteUser() {
		deleteIcon.click();
	}

	public void confirmDeleteUser() {
		deleteConfirmBtn.click();
	}

	public void verifyUserDeletedSuccessfully() {
		String actual = deletedRecordText.getText();
		String expected = "No matching records found";
		if (actual.equalsIgnoreCase(expected)) {
			System.out.println("User Deleted Successfully");
		} else
			System.out.println("User Deletion failed");

	}

	public void verifyUserCreatedSuccessfully(String expected) {
		String actual = userName.getText();
		System.out.println("actual   " + actual);
		Assert.assertEquals(actual, expected);
		
}
}