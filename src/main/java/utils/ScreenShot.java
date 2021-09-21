package utils;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	

	public static void generateScreenShot(WebDriver driver,String fileName)
	
	{
		Date date=new Date();
		String currentDate_Time=date.toString().replace(":", "_").replace(" ","_")+".png";
		String targetPath="C:\\Users\\USER\\eclipse-workspace\\BuffaloCart\\target\\ScreenShots";
		fileName =targetPath+"\\"+fileName+"_"+currentDate_Time;
		System.out.println(fileName);
		TakesScreenshot scrnShot= ((TakesScreenshot) driver);
		File srcFile=scrnShot.getScreenshotAs(OutputType.FILE);
		File destFile=new File(fileName);
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
