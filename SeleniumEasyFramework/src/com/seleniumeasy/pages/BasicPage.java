package com.seleniumeasy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.seleniumeasy.genericlib.WebdriverCommonLib;

public class BasicPage {
	WebDriver driver;
	public BasicPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(partialLinkText="Simple Form Demo")
	private WebElement simpleFormDemoButton;
	@FindBy(partialLinkText="Select Dropdown List")
	private WebElement selectDropdownListButton;
	@FindBy(partialLinkText="Check Box Demo")
	private WebElement checkBoxDemoButton;
	
	@FindBy(xpath="//a[text()='Radio Buttons Demo']")
	private WebElement radioButtonDemoButton;
	
	@FindBy(xpath="//a[text()='Select Dropdown List']")
	private WebElement SelectDropdownListButton;
	
	@FindBy(xpath="//a[text()='Javascript Alerts']")
	private WebElement javascriptAlertsButton;
	@FindBy(xpath="//a[text()='Window Popup Modal']")
	private WebElement windowPopupModalButton;
	
	@FindBy(xpath="//a[text()='Bootstrap Alerts']")
	private WebElement BootStrapAlertsButton;
	
	@FindBy(xpath="//a[text()='Bootstrap Modals']")
	private WebElement BootStrapModalsButton;
	WebdriverCommonLib driverLib=new WebdriverCommonLib();
	public void clicksimpleFormDemoButton()
	{
		
			driverLib.moveToElement(simpleFormDemoButton);
			simpleFormDemoButton.click();
		}
	
	public void clickCheckBoxDemoButton()
	{
		
			driverLib.moveToElement(checkBoxDemoButton);
			checkBoxDemoButton.click();
		}
		
	
	
	public void checkBoxDemoButton()
	{
		
			driverLib.moveToElement(checkBoxDemoButton);
			checkBoxDemoButton.click();
		
	}
	
	public void selectDropdownList()
	{
		selectDropdownListButton.click();
	}
	
	
	

}
