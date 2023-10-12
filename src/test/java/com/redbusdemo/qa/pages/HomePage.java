package com.redbusdemo.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.redbus.qa.Base.Baseclass;

public class HomePage extends Baseclass {
	//this code will find the element using xpath locator and store it in
	//webelement object myaccount
	 
	@FindBy(xpath=("(//div[@class='rb_main_secondary_item  link'])[2]"))
	WebElement myaccount;
	@FindBy(xpath=("//li[@id='smsandemail_ticket']"))
	WebElement email;
	
	//creating construct of current class to initalize the elements
	//every page class have a construct initaling the elements
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void myaccount()
	{
		myaccount.click();
	}
	public void login()
	{
		email.click();
	}
	

}
