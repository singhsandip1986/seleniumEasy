package com.seleniumeasy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.seleniumeasy.genericlib.WebdriverCommonLib;

public class HomePage {
	@FindBy(id="btn_basic_example")
	private WebElement StartPracticingButton;
	WebDriver driver;
	WebdriverCommonLib driverLib=new WebdriverCommonLib();
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickStartPracticingButton()
	{
		driverLib.moveToElement(StartPracticingButton);
		StartPracticingButton.click();
	}

}
