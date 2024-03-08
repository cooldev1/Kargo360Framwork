package com_st_pages_test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com_st_TestBase.TestBase;
import com_st_pages.homepage;
import com_st_pages.loginpage;
import com_st_pages.ratecreationpage;
import com_st_pages.ratelistpage;
import com_st_util.TestUitl;

public class ratelistpagetest extends TestBase {

	public ratelistpagetest() throws IOException {
		super();
		
	}

	 loginpage LoginPage;
	 homepage HomePage;
	 TestUitl testutil;
	 ratelistpage ratepagelist;
	 ratecreationpage Ratecreationpage;
	 
	
	@BeforeMethod
	public void setup() throws IOException, InterruptedException {
		initialization();
		LoginPage = new loginpage();
		ratepagelist = new ratelistpage();
		testutil = new TestUitl();
		HomePage = LoginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		System.out.println("Login successfully");
		testutil.hardwait(2000);
		HomePage.colorchange();
	}
	
	@Test(priority =1)
	public void OpenRatelineCreationpage() throws IOException, InterruptedException {
		HomePage.clicOnRateLineLink();
		testutil.hardwait(2000);
		ratepagelist.clickoncreatebtn();	
		
	}
	
	
	@AfterMethod
	public void browserclosed() {
		driver.close();
	}


}
