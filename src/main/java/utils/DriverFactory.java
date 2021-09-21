package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {
	public static WebDriver getDriver(String browserName)
	{ 
		WebDriver driver;
		switch (browserName.toLowerCase())
		{
			case "chrome" :
				System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
				driver =new ChromeDriver();
				break;
			case "firefox":
				System.setProperty("webdriver.gecko.driver","C:\\Driver\\geckodriver.exe");
				driver = new FirefoxDriver();
			case "ie":
				System.setProperty("webdriver.ie.driver","C:\\Driver\\IEDriverServer.exe");
				driver=new InternetExplorerDriver();
			default:
				System.setProperty("webdriver.edge.driver","C:\\Driver\\msedgedriver.exe");
				driver = new EdgeDriver();
		}
		return driver;
	}
	public static WebDriver setImplicitwait(int secs,WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

}
