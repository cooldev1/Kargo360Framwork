package com_st_pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import com_st_TestBase.TestBase;

public class ratelinecompSKvsST extends TestBase{

	public ratelinecompSKvsST() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

// ST AWB Elements
	
	@FindBy(xpath="//input[@name='awb_number']")
	@CacheLookup
	WebElement STAWB_tbox;
	
	@FindBy(xpath="//button[@title='Search']")
	@CacheLookup
	WebElement STser_btn;
	
// SK AWB Elements
	
		@FindBy(xpath="//input[@id='ctl00_txtAWBGlobalNo']")
		@CacheLookup
		WebElement SKAWB_tbox;
		

	//Action
	
	public void STAWB_Open(String STawb)
	{
			
		STser_btn.sendKeys(STawb);
		STser_btn.click();
	
		
	}
	
	public void SKAWB_Open(String SKawb)
	{
			
		SKAWB_tbox.sendKeys(SKawb);
		SKAWB_tbox.click();
		
	}
}
