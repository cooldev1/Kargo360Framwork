package com_st_pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com_st_TestBase.TestBase;

public class loginpage extends TestBase {

	public loginpage() throws IOException {
		super();
		PageFactory.initElements(driver,this);
	}

	//Page Factory - OR:
	
		@FindBy(xpath="//input[@formcontrolname='name']")
		WebElement username;
		
		@FindBy(xpath="//input[@formcontrolname='password']")
		WebElement pass;
		
		@FindBy(xpath="//button[@type='submit']")
		WebElement loginbtn;
			
		@FindBy(xpath="//img[@src='assets/img/login_page_logo.webp']")
		WebElement spicetaglogo;
		
		
		
		

	//Actions
		
		public String validateloginPageurl() {
			return driver.getCurrentUrl();
		}

		public boolean validatelogo() {
			return spicetaglogo.isDisplayed();
		}
		
		public homepage login(String un, String pwd) throws IOException {
			username.sendKeys(un);
			pass.sendKeys(pwd);
			loginbtn.click();	
			return new homepage();
		
		}		
}
