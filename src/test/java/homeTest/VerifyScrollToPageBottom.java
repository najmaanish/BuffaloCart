package homeTest;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.HomePage;

public class VerifyScrollToPageBottom extends HomePageBaseTest {
	@Test
	public void scrollToPageBottom()
	{
		HomePage hp=new HomePage(driver);
		hp.scrollToElement(driver);
		System.out.println("Verified");
		
	}

}
