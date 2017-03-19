package com.seleniumeasy.tests;

import org.openqa.selenium.WebDriver;

import com.seleniumeasy.genericlib.*;
import com.seleniumeasy.pages.BasicPage;
import com.seleniumeasy.pages.HomePage;
import com.seleniumeasy.pages.SimpleFormDemoPage;
public class SimpleFormTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 WebDriver driver;
 WebdriverCommonLib lib=new WebdriverCommonLib();
 driver=Driver.getDriver();
 driver.get(Constants.url);
 lib.maximise();
 HomePage homePage=new HomePage(driver);
 BasicPage basicPage=new BasicPage(driver);
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
 simpleFormDemoPage.verifyMessage();
	}

}
