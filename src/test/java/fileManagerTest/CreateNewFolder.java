package fileManagerTest;

import org.testng.annotations.Test;

import helperTest.BuffaloCartBasicFlows;
import pages.FileManagerPage;
import pages.HomePage;

public class CreateNewFolder  extends FileManagerBaseTest{
	@Test
	public void createNewFolder()
	{
		FileManagerPage fmp = new FileManagerPage(driver);
		fmp.verifyFileManagerPageHeading("File Manager");
		fmp.createNewFolder();
		
	}

}
