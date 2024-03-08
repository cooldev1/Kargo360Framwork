package com_st_pages_test;

import static org.junit.Assert.assertArrayEquals;
import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com_st_TestBase.TestBase;
import com_st_pages.homepage;
import com_st_pages.loginpage;

public class LoginPageTest extends TestBase{

	public LoginPageTest() throws IOException {
		super();
		
	}

	 loginpage LoginPage;
	 homepage HomePage;
	
	@BeforeMethod
	public void setup() throws IOException {
		System.out.println("initialization methods start");
		initialization();
		LoginPage = new loginpage();
	//	System.out.println("initialization methods is working fine");
	}
	
	
	@Test(priority =1)
	public void loginPageURLvalidation() throws IOException {
		String loginpageurl = LoginPage.validateloginPageurl();
		Assert.assertEquals(loginpageurl, "https://qaspicexpress.kargo360tech.com/login");
	}
	
	@Test(priority=2)
	public void logingpageImgLogoTest() throws IOException {
	 boolean flag =	LoginPage.validatelogo();
	 Assert.assertTrue(flag);
	}
	
	

	@Test(priority=3)
	public void Wrong_user_name() throws IOException, InterruptedException {
		
		HomePage = 	LoginPage.login("Dev", prop.getProperty("password"));
		Thread.sleep(2000);
		
		String Dashboardurl = "https://qaspicexpress.kargo360tech.com/login";
		Assert.assertEquals(Dashboardurl, driver.getCurrentUrl());
	}

	@Test(priority=4)
	public void Wrong_Password() throws IOException, InterruptedException {
		
		HomePage = 	LoginPage.login(prop.getProperty("username") ,"Dev");
		Thread.sleep(2000);
		
		String Dashboardurl = "https://qaspicexpress.kargo360tech.com/login";
		Assert.assertEquals(Dashboardurl, driver.getCurrentUrl());
	}
	
	@Test(priority=5)
	public void Wrong_usr_Password() throws IOException, InterruptedException {
		
		HomePage = 	LoginPage.login("user" ,"pass");
		Thread.sleep(2000);
		
		String Dashboardurl = "https://qaspicexpress.kargo360tech.com/login";
		Assert.assertEquals(Dashboardurl, driver.getCurrentUrl());
	}
	
	@Test(priority=6)
	public void loginSpicetag() throws IOException, InterruptedException {
		HomePage = 	LoginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(2000);
		
		String Dashboardurl = "https://qaspicexpress.kargo360tech.com/dashboard";
		Assert.assertEquals(Dashboardurl, driver.getCurrentUrl());
	}
	
	@AfterMethod
	public void tearDown() 
	{
		driver.quit();
	}

	
	
}
