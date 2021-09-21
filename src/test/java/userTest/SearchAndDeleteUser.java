package userTest;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.UserPage;

public class SearchAndDeleteUser extends UserCreationBaseTest {
	@Test
	public void searchAndDeleteUser()
	{
		UserPage up= new UserPage(driver);
		up.searchNewUser(userName);
		up.deleteUser();
		up.confirmDeleteUser();
		up.searchNewUser(userName);
		up.verifyUserDeletedSuccessfully();
	}

}
