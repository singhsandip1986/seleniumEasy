package com.seleniumeasy.tests;



import org.openqa.selenium.WebDriver;
import org.testng.Assert;
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
import com.seleniumeasy.pages.CheckBoxDemoPage;
import com.seleniumeasy.pages.HomePage;

public class CheckBoxTest {
	WebdriverCommonLib lib;
	WebDriver driver;
	HomePage homePage;
	BasicPage basicPage;
	CheckBoxDemoPage checkBoxDemoPage;
  @Test
  public void clickCheckBoxtest() {
	  String message=checkBoxDemoPage.checkCheckBox();
	  String expectedMessage="Success - Check box is checked";
	  Assert.assertEquals(message, expectedMessage,"Did not match");
  }
  @Test
  public void clickAllCheckBoxesTest()
  {
	  String buttonText=checkBoxDemoPage.checkAll();
	  Assert.assertEquals(buttonText, "Uncheck All","Wrong Message");
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  
		  lib=new WebdriverCommonLib();
		  
		  driver.get(Constants.url);
		  lib.maximise();
		   homePage=new HomePage(driver);
		   basicPage=new BasicPage(driver);
		   lib.ImlicitWait(10);

			  homePage.clickStartPracticingButton();
			  lib.ImlicitWait(10);
			  
			  try
			  {
				  checkBoxDemoPage=new CheckBoxDemoPage(driver);
			 	 basicPage.checkBoxDemoButton();
			  }
			  catch(Exception e)
			  {
			 	 e.printStackTrace();
			  }
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
	  driver.quit();
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
