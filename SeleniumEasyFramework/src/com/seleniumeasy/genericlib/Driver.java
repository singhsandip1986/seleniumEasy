package com.seleniumeasy.genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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
	
	return driver;
}
}
