package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utils.SystemActions;
import utils.AppWait;
import utils.StringOperations;
public class NewUserPage {
	@FindBy(xpath="//input[@name='fullname']")
	public WebElement fullName;
	
	@FindBy(xpath="//input[@id='check_employment_id']")
	public WebElement employmentId;
	
	@FindBy(xpath="//input[@id='check_username']")
	public WebElement userName;
	
	@FindBy (xpath="//span[@class='fileinput-new']")
	public WebElement chooseImageBtn
	;
	@FindBy(xpath="//input[@id='new_password']")
	public WebElement password;
	
	@FindBy(xpath="//input[@name='confirm_password']")
	public WebElement confirmPassword;
	
	@FindBy(xpath="//input[@name='email']")
	public WebElement email;
	
	@FindBy(xpath="//select[@name='locale']")
	public WebElement locality;
	
	@FindBy(xpath="//span[@class='select2-search select2-search--dropdown']/input")
	public WebElement localityInputBox;
	
	@FindBy(xpath="//select[@name='language']")
	public WebElement language;
	
	@FindBy(xpath="//span[@class='select2-search select2-search--dropdown']")
	WebElement languageInputBox;
	
	@FindBy(xpath="//input[@name='phone']")
	public WebElement phoneNumber;
	
	@FindBy(xpath="//input[@name='mobile']")
	public WebElement mobileNumber;
	
	@FindBy(xpath="//input[@name='skype']")
	public WebElement skypeId;
	
	@FindBy(xpath="//select[@id='user_type']")
	public WebElement userType;
	
	@FindBy(xpath="//select[@name='direction']")
	public WebElement direction;
	
	@FindBy(xpath="//select[@class='form-control select_box department select2-hidden-accessible']")
	public WebElement userDesignation;
	
	@FindBy(xpath="//input[@class='select2-search__field']")
	public WebElement userDesignationInputBox;
	
	@FindBy(xpath="//label[@class='needsclick']/input[@value='everyone']")
	public WebElement permissionRadioOption1;
	
	@FindBy(xpath="//button[text()='Create User']")
	public WebElement createUserBtn;
	
	@FindBy(xpath="//button[text()='Update User']")
	public WebElement updateUserBtn;
	
	public NewUserPage(WebDriver driver){
		PageFactory.initElements(driver,this);
}
	public String enterFullName(String name)
	{
		String firstName=name.concat(StringOperations.randomStringGenerate(3));
		fullName.sendKeys(firstName);
		System.out.println(firstName);
		return firstName;
	}
	public void enterEmploymentId()
	{
		employmentId.sendKeys(StringOperations.randomIntegerGenertae(4));
	}
	public void enterUserName(String uName)
	{
		userName.sendKeys(uName+StringOperations.randomStringGenerate(3));
	}
	public void enterPassword()
	{
		password.sendKeys("123456");
	}
	public void enterConfirmPassword()
	{
		confirmPassword.sendKeys("123456");
	}
	public void enterEmailId()
	{
		email.clear();
		email.sendKeys(StringOperations.randomStringGenerate(4)+"@gamil.com");
	}
	public void enterLocality(String localityName)
	{
		Select localityDropDown=new Select(locality);
		localityDropDown.selectByVisibleText(localityName);
		//locality.click();
		//localityInputBox.sendKeys(localityName);
	}
	public void enterLanguage()
	{
		Select langDropDown=new Select(language);
		langDropDown.selectByVisibleText("English");
		//language.click();
		//languageInputBox.sendKeys("English");
	}
	public void enterPhoneNumber()
	{
		phoneNumber.sendKeys(StringOperations.randomIntegerGenertae(5));	
	}
	public void enterMobileNumber()
	{
		mobileNumber.sendKeys(StringOperations.randomIntegerGenertae(10));	
	}
	public void enterSkypeId()
	{
		skypeId.sendKeys("Skype"+StringOperations.randomIntegerGenertae(10));	
	}
	public void chooseImage(String imagePath)
	{
		chooseImageBtn.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SystemActions.stringCopyPaste(imagePath);
	}
	public void selectUserType(String userTypeOption) 
	{
		Select userTypeDropDown=new Select(userType);
		userTypeDropDown.selectByVisibleText(userTypeOption);
	}
	public void selectUserDirection(String directionOption) 
	{
		Select directionDropDown=new Select(direction);
		directionDropDown.selectByVisibleText(directionOption);
	}
	public void selectUserDesignation()
	{
		Select designationDropDown= new Select(userDesignation);
		designationDropDown.selectByVisibleText("Manager");
	}
	public void selectPermissionType()
	{
		permissionRadioOption1.click();
	}
	public void createUser()
	{
		createUserBtn.click();
	}
	
	public void updateUserDetails(WebDriver driver)
	{
		updateUserBtn.click();
		AppWait.setImplicitwait(30, driver);
		
	}
}
