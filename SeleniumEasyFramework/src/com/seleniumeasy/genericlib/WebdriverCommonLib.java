package com.seleniumeasy.genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverCommonLib {
public void maximise()
{
	Driver.driver.manage().window().maximize();
}

public void ImlicitWait(long seconds)
{
	Driver.driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
}

public void moveToElement(WebElement element)
{
	Actions action=new Actions(Driver.driver);
	action.moveToElement(element);
	
}

public void waitForElement(String xpath)
{
	WebDriverWait wait=new WebDriverWait(Driver.driver,50);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
	
}

}
