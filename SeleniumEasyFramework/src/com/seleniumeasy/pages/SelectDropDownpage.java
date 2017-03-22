package com.seleniumeasy.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.seleniumeasy.genericlib.WebdriverCommonLib;

public class SelectDropDownpage {
	
	WebDriver driver;
	WebdriverCommonLib driverLib=new WebdriverCommonLib();
	public SelectDropDownpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="select-demo")
	public WebElement selectDemoList;
	
	@FindBy(id="multi-select")
	public WebElement statesList;
	public List selectList(String value)
	{
		List valuesSelected=driverLib.selectByValue(selectDemoList, value);
		return valuesSelected;
	}
	
	public List selectMultList(String value)
	{
		List valuesSelected=driverLib.selectByValue(statesList, value);
		return valuesSelected;
	}
	
	
	
	

}
