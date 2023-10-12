package com.redbus.qa.TestPages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.redbus.qa.Base.Baseclass;
import com.redbusdemo.qa.pages.EmailPage;
import com.redbusdemo.qa.pages.HomePage;

public class EmailPageTest extends Baseclass{
	
    HomePage hp;
    EmailPage ep;
    
    
    @BeforeMethod
    public void OpenApp()
    {
    	openBrowser();
    	hp=new HomePage(driver);
    	ep=new EmailPage(driver);
    	
    }
    @AfterMethod
    public void CloseApp()
    {
    	driver.quit();
    }
    @Test
    public void ticket() throws InterruptedException
    {
    	hp.myaccount();
    	Thread.sleep(1000);
    	hp.login();
    	Thread.sleep(5000);
    	ep.RegisterTicket();
    	Thread.sleep(1000);
    	
    }
   // @DataProvider(name="testdata")
    
    //	public Object[][]datasupplier() throws IOException
    	//{
    	//Object[] [] input=Xls_DataProvider.getTestData("sheet1");
    	//return input;
    //}
}
