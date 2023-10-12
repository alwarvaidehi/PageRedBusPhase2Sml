package com.redbusdemo.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.redbus.qa.Base.Baseclass;
 


public class EmailPage extends Baseclass{
	
	
	@FindBy(xpath="//input[@id='searchTicketTIN']")
	WebElement ticketnumber;
	@FindBy(xpath="(//input[@id='searchTicketMobileno'])")
	WebElement mobilenumber;
	@FindBy(xpath="(//input[@id='ticketSearch'])")
	WebElement subm;
	
	public EmailPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	//public void gettitle()
	//{
		//String title=driver.getTitle();
		//System.out.println(title);
		
//	}
	public void RegisterTicket() throws InterruptedException
	{
		Thread.sleep(1000);
		
		
		ticketnumber.sendKeys("12345678");
		Thread.sleep(1000);
		mobilenumber.clear();
		mobilenumber.sendKeys("11111111111");
		subm.click();
	}
}
