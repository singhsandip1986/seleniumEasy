package com.seleniumeasy.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.seleniumeasy.genericlib.WebdriverCommonLib;

public class CheckBoxDemoPage {
	WebDriver driver;
	WebdriverCommonLib driverLib=new WebdriverCommonLib();
	public CheckBoxDemoPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="isAgeSelected")
	private WebElement ageCheckBox;
	
	@FindBy(id="txtAge")
	private WebElement ageLabel;
	
	@FindBy(id="check1")
	private WebElement checkBoxButton;
	
	@FindBy(xpath="//input[contains(text(),'Option')]")
	private List<WebElement> checkBoxList;
	
	
	
	
	
	
	public String checkCheckBox()
	{
		if(!ageCheckBox.isSelected())
		{
			ageCheckBox.click();
		}
		
		String label=ageLabel.getText();
		return label;
		
	}
	
	public String checkAll()
	{
		for(int i=0;i<checkBoxList.size();i++)
		{
			checkBoxList.get(i).click();
		}
			driverLib.moveToElement(checkBoxButton);
			driverLib.ImlicitWait(10);
		return checkBoxButton.getAttribute("value");
	}

}
