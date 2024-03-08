package com_st_pages_test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import com_st_TestBase.TestBase;
import com_st_pages.homepage;
import com_st_pages.loginpage;
import com_st_pages.ratecreationpage;
import com_st_pages.ratelistpage;
import com_st_util.CustomerListener;
import com_st_util.TestUitl;

@Listeners(CustomerListener.class)
public class ratecreationtest extends TestBase {

	public ratecreationtest() throws IOException {
		super();
	}
	
		loginpage LoginPage;
		homepage HomePage;
		TestUitl testutil;
		ratelistpage ratepagelist;
		ratecreationpage ratelinecreationpage;
		
		String SheetName ="RateCreation";
		
		@BeforeMethod
		public void setup() throws IOException, InterruptedException {
			initialization();
			LoginPage = new loginpage();
			ratepagelist = new ratelistpage();
			testutil = new TestUitl();
			ratepagelist = new ratelistpage();
			HomePage = LoginPage.login(prop.getProperty("username"), prop.getProperty("password"));
			System.out.println("Login successfully");
			testutil.hardwait(2000);
			HomePage.colorchange();
			ratepagelist = HomePage.clicOnRateLineLink();
			testutil.hardwait(2000);
			ratelinecreationpage = ratepagelist.clickoncreatebtn();
			
		}

		
		@DataProvider
		public Object[][] getratelineTestData() throws InvalidFormatException{
			Object data[][] = TestUitl.getTestData(SheetName);
			return data;
		}
		

	@Test(priority =1, dataProvider="getratelineTestData")		
			public void Country_To_Country_RateLine_Creation(String Rate_Card_Name_val,String Origin_Level_val,String org_val,String Destination_Level_val, 
					String Destination_val,String Currency_val,String Rating_Basis_val,String Select_Status_val,String Type_val,String Weight_val,String Charge_Rate_val,String Type2_val, 
					String Weight2_val,String Charge_Rate2_val,String Type3_val,String Weight3_val,String Charge_Rate3_val,String Type4_val,String Weight4_val,String Charge_Rate4_val, 
					String Remark_val) throws IOException, InterruptedException {

			ratelinecreationpage.CountryToCountry_RateLine_fun(Rate_Card_Name_val, Origin_Level_val, org_val, Destination_Level_val, 
					Destination_val, Currency_val, Rating_Basis_val, Select_Status_val, Type_val, Weight_val, Charge_Rate_val, Type2_val, 
					Weight2_val, Charge_Rate2_val, Type3_val, Weight3_val, Charge_Rate3_val, Type4_val, Weight4_val, Charge_Rate4_val, 
					Remark_val);			
			
}
	
//	@Test(priority=2)
//	public void fail() {
//		Assert.assertTrue(false);
//	}
//	
//	@Test(priority=2)
//	public void fail2() {
//		Assert.assertEquals(false, true);
//	}
//	
//	
//
//		
//		@AfterMethod
//		public void browserclosed() {
//			driver.close();
//		}

	}
	