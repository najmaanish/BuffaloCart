package userTest;

import org.testng.annotations.Test;

import pages.UserPage;
import pages.UpdateUserProfilePage;
import utils.StringOperations;

public class VerifySearchAndUpdateNewUser extends UserCreationBaseTest {
	@Test
	public void searchAndUpdateUser()
	{
		UserPage up=new UserPage(driver);
		up.searchNewUser(userName);
		up.navigateToUpdateUserDetails();
		UpdateUserProfilePage upp= new UpdateUserProfilePage(driver);
		upp.navigateToUpdatePage();
		upp.updateEmpId("EMP100"+StringOperations.randomIntegerGenertae(3));
		upp.updateDOB();
		upp.updateJoiningDate();
		upp.updateGender("Male");
		upp.updateMaritalStatus("Married");
		upp.updateFatherName("Father"+StringOperations.randomStringGenerate(4));
		upp.updateMotherName("Mother"+StringOperations.randomStringGenerate(4));
		upp.saveEdits();
		}

}
