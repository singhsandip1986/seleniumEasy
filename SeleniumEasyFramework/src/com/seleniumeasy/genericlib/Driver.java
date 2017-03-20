package com.seleniumeasy.genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Driver {
public static WebDriver driver;;
public static WebDriver getDriver()
{
	if(Constants.browser.equals("firefox"))
	{
		driver=new FirefoxDriver();
		System.setProperty("webdriver.gecko,driver", "C:\\Users\\supsan\\Downloads\\geckodriver-v0.14.0-win32\\geckodriver.exe");
	}
	else if(Constants.browser.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\supsan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if(Constants.browser.equals("ie"))
	{
		System.setProperty("webdriver.ie.driver", "C:\\Users\\supsan\\Downloads\\IEDriverServer_Win32_3.3.0\\IEDriverServer.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		driver=new InternetExplorerDriver();
	}
	return driver;
}
}
