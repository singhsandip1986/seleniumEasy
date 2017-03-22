package com.seleniumeasy.tests;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

import com.seleniumeasy.genericlib.Constants;
import com.seleniumeasy.genericlib.Driver;
import com.seleniumeasy.genericlib.WebdriverCommonLib;
import com.seleniumeasy.pages.BasicPage;
import com.seleniumeasy.pages.HomePage;
import com.seleniumeasy.pages.SelectDropDownpage;

public class SelectListTest {
	HomePage homePage;
	BasicPage basicPage;
	WebDriver driver;
	SelectDropDownpage dropDownPage;
	WebdriverCommonLib lib;
  @Test
  public void f() throws InterruptedException {
	
	 
	 
	 List<WebElement> selectedValue=dropDownPage.selectList("Sunday");
	 for(int i=0;i<selectedValue.size();i++)
	 {
		 System.out.println(selectedValue.get(i).getText());
	 }
	 List<WebElement> selectedValueMulti= dropDownPage.selectMultList("Florida");
	 selectedValueMulti=dropDownPage.selectMultList("Ohio");
	 for(int i=0;i<selectedValueMulti.size();i++)
	 {
		 System.out.println(selectedValueMulti.get(i).getText());
	 }
	 
	  
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
 lib=new WebdriverCommonLib();
	  
	  driver.get(Constants.url);
	  lib.maximise();
	   homePage=new HomePage(driver);
	   basicPage=new BasicPage(driver);
	    dropDownPage=new SelectDropDownpage(driver);
	   lib.ImlicitWait(10);

		  homePage.clickStartPracticingButton();
		  lib.ImlicitWait(10);
		 
	  
	   
	   basicPage.selectDropdownList();
	   
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
	  driver=Driver.getDriver();
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
