package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UpdateUserProfilePage {
	
	@FindBy (xpath="//div[@class='pull-right']/span/a")
	public WebElement updateBtn;
	
	@FindBy (xpath="//input[@name='employment_id']")
	public WebElement empId;
	
	@FindBy(xpath="//input[@name='joining_date']")
	public WebElement joiningDate;
	
	@FindBy(xpath="//select[@name='gender']")
	public WebElement gender;
	
	@FindBy (xpath="//input[@name='date_of_birth']")
	public WebElement dob;
	
	@FindBy (xpath="//select[@name='maratial_status']")
	public WebElement maritalStatus;
	
	@FindBy(xpath="//input[@name='father_name']")
	public WebElement fatherName;
	
	@FindBy(xpath="//input[@name='mother_name']")
	public WebElement motherName;
	
	@FindBy(xpath="//button[text()='Update']")
	public WebElement editPageUpdatebtn;
	
	public UpdateUserProfilePage(WebDriver driver){
		PageFactory.initElements(driver,this);
}
	public void navigateToUpdatePage()
	{
		updateBtn.click();
	}
	public void updateEmpId(String EmpId)
	{
		empId.sendKeys(EmpId);
	}
	public void updateJoiningDate()
	{
		joiningDate.sendKeys("2021-01-01");
	}
	public void updateGender(String genderNmae)
	{
		Select genderDropDown= new Select(gender);
		genderDropDown.selectByVisibleText(genderNmae);
	}
	public void updateDOB()
	{
		dob.sendKeys("1995-01-01");
	}
	public void updateMaritalStatus(String status)
	{
		Select maritalStatusDropDown= new Select(maritalStatus);
		maritalStatusDropDown.selectByVisibleText(status);
	}
	public void updateFatherName(String fName)
	{
		fatherName.sendKeys(fName);
	}
	public void updateMotherName(String mName)
	{
		motherName.sendKeys(mName);
	}
	public void saveEdits()
	{
		editPageUpdatebtn.click();
	}
}
