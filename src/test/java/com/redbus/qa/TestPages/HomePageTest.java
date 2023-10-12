package com.redbus.qa.TestPages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.redbus.qa.Base.Baseclass;
import com.redbusdemo.qa.pages.HomePage;

public class HomePageTest extends Baseclass {
	HomePage hp;
	@BeforeMethod
public void OpenApp()
{
	openBrowser();
	hp=new HomePage(driver);
	
}
@AfterMethod
public void CloseApp()
{
	driver.quit();
}
@Test
public void myaccountlink() throws InterruptedException
{
	hp.myaccount();
	Thread.sleep(1000);
	hp.login();
	Thread.sleep(1000);
}
}
