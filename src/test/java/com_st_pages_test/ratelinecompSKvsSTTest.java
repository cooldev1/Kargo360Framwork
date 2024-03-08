package com_st_pages_test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com_st_TestBase.TestBase;
import com_st_pages.homepage;
import com_st_pages.loginpage;
import com_st_pages.ratecreationpage;
import com_st_pages.ratelinecompSKvsST;
import com_st_pages.ratelistpage;
import com_st_util.TestUitl;

public class ratelinecompSKvsSTTest extends TestBase{

	public ratelinecompSKvsSTTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	loginpage LoginPage;
	homepage HomePage;
	TestUitl testutil;
	ratelinecompSKvsST RatelinecompSKvsST;
	ratecreationpage ratelinecreationpage;
	
	String SheetName ="RateLineSkST";
	
	@BeforeMethod
	public void setup() throws IOException, InterruptedException {
		initialization();
		LoginPage = new loginpage();
		HomePage = LoginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		System.out.println("Login successfully");
		testutil.hardwait(2000);
		HomePage.colorchange();
		RatelinecompSKvsST = new ratelinecompSKvsST();
		testutil = new TestUitl();
			
	}

	
	@DataProvider
	public Object[][] getratelineTestData() throws InvalidFormatException{
		Object data[][] = TestUitl.getTestData(SheetName);
		return data;
	}
	

@Test(priority =1, dataProvider="getratelineTestData")		
		public void Open_AWBST(String STAWB) {
		RatelinecompSKvsST.STAWB_Open(STAWB);
	
				
}


}
