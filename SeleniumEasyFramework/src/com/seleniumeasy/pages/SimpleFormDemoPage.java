package com.seleniumeasy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SimpleFormDemoPage {
	WebDriver driver;
	public SimpleFormDemoPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="user-message")
	private WebElement messageBox;
	@FindBy(xpath="//button[text()='Show Message']")
	private WebElement showMessageButton;
	@FindBy(id="display")
	private WebElement messageSpan;
	public void showMessage()
	{
		messageBox.sendKeys("sandip");
		showMessageButton.click();
	}
	
	public String verifyMessage()
			{
		PageFactory.initElements(driver, this);
		String message=messageSpan.getText();
		System.out.println("The Messsage is "+message);
		return message;
			}
	

}
