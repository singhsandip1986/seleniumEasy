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
import com.seleniumeasy.pages.HomePage;
import com.seleniumeasy.pages.SimpleFormDemoPage;

public class NewTest {
	WebdriverCommonLib lib;
	WebDriver driver;
	HomePage homePage;
	BasicPage basicPage;
	@Test
	public void f1()
	{
		
		   
		 lib.ImlicitWait(10);

		  homePage.clickStartPracticingButton();
		  lib.ImlicitWait(10);
		  
		  try
		  {
		 	 basicPage.clicksimpleFormDemoButton();
		  }
		  catch(Exception e)
		  {
		 	 e.printStackTrace();
		  }
		  
		  SimpleFormDemoPage simpleFormDemoPage=new SimpleFormDemoPage(driver);
		  simpleFormDemoPage.showMessage();
		  String message=simpleFormDemoPage.verifyMessage();
		  Assert.assertEquals(message,"sandip singh","Wrong message");
	}
  @Test
  public void f() {
	  lib.ImlicitWait(10);

	  homePage.clickStartPracticingButton();
	  lib.ImlicitWait(10);
	  
	  try
	  {
	 	 basicPage.clicksimpleFormDemoButton();
	  }
	  catch(Exception e)
	  {
	 	 e.printStackTrace();
	  }
	  
	  SimpleFormDemoPage simpleFormDemoPage=new SimpleFormDemoPage(driver);
	  simpleFormDemoPage.showMessage();
	  String message=simpleFormDemoPage.verifyMessage();
	  Assert.assertEquals(message,"sandip singh","Wrong message");
  }
  @BeforeMethod
  public void beforeMethod() {
	  lib=new WebdriverCommonLib();
	  driver=Driver.getDriver();
	  driver.get(Constants.url);
	  lib.maximise();
	   homePage=new HomePage(driver);
	   basicPage=new BasicPage(driver);
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite");
  }

}
