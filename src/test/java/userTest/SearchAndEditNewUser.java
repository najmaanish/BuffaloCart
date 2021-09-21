package userTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.NewUserPage;
import pages.UserPage;

public class SearchAndEditNewUser extends UserCreationBaseTest {
	@Test
	public void searchAndEditUser()
	{
		UserPage up=new UserPage(driver);
		up.searchNewUser(userName);
		up.navigateToUserEditDetailsPage();
		NewUserPage nup= new NewUserPage(driver);
		nup.enterEmailId();
		nup.enterLocality("Turkmen (Turkmenistan)");
		nup.enterPhoneNumber();
		nup.chooseImage("C:\\Users\\USER\\Desktop\\sample2.jpg");
		nup.updateUserDetails(driver);
		String actual1= driver.getCurrentUrl();
		String expected1= "https://erp.buffalocart.com/admin/user/user_list";
		Assert.assertEquals(actual1, expected1);
	}

}
