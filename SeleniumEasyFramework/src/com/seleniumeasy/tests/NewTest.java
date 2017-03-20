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
	/*
	@Test
	public void f1()
	{
		
		   
		 
		  
		  SimpleFormDemoPage simpleFormDemoPage=new SimpleFormDemoPage(driver);
		  simpleFormDemoPage.showMessage();
		  String message=simpleFormDemoPage.verifyMessage();
		  Assert.assertEquals(message,"sandip","Wrong message");
	}
	*/
  @Test
  public void f() {
	  
	  
	  SimpleFormDemoPage simpleFormDemoPage=new SimpleFormDemoPage(driver);
	  simpleFormDemoPage.showMessage();
	  String message=simpleFormDemoPage.verifyMessage();
	  Assert.assertEquals(message,"sandip","Wrong message");
  }
  
  @Test
  public void totaltest()
  {
	  SimpleFormDemoPage simpleFormDemoPage=new SimpleFormDemoPage(driver);
	  int text1=12,text2=15;
	  String message=simpleFormDemoPage.getTotal(text1, text2);
	  int total=text1+text2;
	  Assert.assertEquals(message, total+"","Did Not Match");
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
		 	 basicPage.clicksimpleFormDemoButton();
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
