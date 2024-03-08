package com_st_pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com_st_TestBase.TestBase;

public class ratelistpage extends TestBase{

	public ratelistpage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	

	//----create button xpath
	
	@FindBy(xpath="//button[@title='Create Rate Line']")
	@CacheLookup
	WebElement ratelinecrtbtn;
	
	@FindBy(xpath="//span[contains(text(),' Rate List ')]")
	@CacheLookup
	WebElement clickratelinetitle;
	
	//Action
	
	public ratecreationpage clickoncreatebtn() throws IOException, InterruptedException {
			
		clickratelinetitle.click();
		Thread.sleep(1000);
		ratelinecrtbtn.click();
		return new ratecreationpage();
	}


}
