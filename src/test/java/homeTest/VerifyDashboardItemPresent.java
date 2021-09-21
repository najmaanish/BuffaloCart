package homeTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataProvider.DataProviders;
import loginTest.LoginTestBase;
import pages.HomePage;

public class VerifyDashboardItemPresent extends HomePageBaseTest{
	
	@Test(dataProvider="DP",dataProviderClass=DataProviders.class)
	public void verifyDashbordLinkPresent(String dbItem)
	{
		HomePage hp=new HomePage(driver);
		hp.verifyDashboardItemPresent(dbItem);
		
	}	
}

