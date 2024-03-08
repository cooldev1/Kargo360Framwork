package com_st_pages_test;

import java.io.IOException;

//import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com_st_TestBase.TestBase;
import com_st_pages.A2ANewOrder_Page;
import com_st_pages.homepage;
import com_st_pages.loginpage;
import com_st_pages.ratelistpage;
import com_st_util.TestUitl;

public class homepagetest extends TestBase{

	public homepagetest() throws IOException {
		super();
		
	}
	 loginpage LoginPage;
	 homepage HomePage;
	 TestUitl testutil;
	 ratelistpage ratelinepagelist;
	 A2ANewOrder_Page d2dneworder_page;
	 
	@BeforeMethod
	public void setup() throws IOException, InterruptedException {
		initialization();
		LoginPage = new loginpage();
		HomePage = new homepage();
		ratelinepagelist = new ratelistpage();
		testutil = new TestUitl();
		HomePage = LoginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		System.out.println("Login successfully");
		testutil.hardwait(1000);
	}
	
//	@Test(priority =1)
//	public void verifyHomePage() throws InterruptedException {
//		testutil.hardwait(1000);
//		//String Homepageurl = HomePage.varifyHomepageurl();
//		Assert.assertEquals(driver.getCurrentUrl(), "https://qaspicexpress.kargo360tech.com/dashboard","HomePage not Open");
//	}
	
	
//	@Test(priority=2)
//	public void OpenRatelistpage() throws IOException, InterruptedException {
//		HomePage.colorchange();
//		ratelinepagelist =	HomePage.clicOnRateLineLink();
//		testutil.hardwait(1000);		
//	}
	
	@Test(priority=3)
	public void Openbookingpage() throws IOException, InterruptedException {
		HomePage.colorchange();		
		testutil.hardwait(1000);
		HomePage.clickOnNewOrder();
		testutil.hardwait(1000);
	}
	
	
	
	
//	@AfterMethod
//	public void tearDown() 
//	{
//		driver.quit();
//	}

	
}
