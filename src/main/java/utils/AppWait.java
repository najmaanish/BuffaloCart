package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class AppWait {
	WebDriver driver;
	public static WebDriver setImplicitwait(int secs,WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
}
