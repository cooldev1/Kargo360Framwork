package com_st_pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import com_st_TestBase.TestBase;
import com_st_util.TestUitl;

public class ratecreationpage extends TestBase {

	public ratecreationpage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//select[@formcontrolname='rate_card_name']")
	@CacheLookup
	WebElement Rate_Card_Name;
	
	@FindBy(xpath="//select[@formcontrolname='origin']")
	@CacheLookup
	WebElement Origin_Level;
	
	@FindBy(xpath="//div[@class='col-md-2 ng-star-inserted']//child::div//child::input[1]")
	@CacheLookup
	WebElement Origin;
		
	@FindBy(xpath="//select[@formcontrolname='destination']")
	@CacheLookup
	WebElement Destination_Level;
	
	@FindBy(xpath="//form[@class=\"form-horizontal form_master gernal_agent ng-invalid ng-dirty ng-touched\"]//child::div[5]//child::input")
	@CacheLookup
	WebElement Destination;
	
	@FindBy(xpath="//form[@class='form-horizontal form_master gernal_agent ng-invalid ng-dirty ng-touched'][1]//child::div[6]//child::input")
	@CacheLookup
	WebElement Currency;
	
	@FindBy(xpath="//select[@formcontrolname='rating_basis']")
	@CacheLookup
	WebElement Rating_Basis;
	
//-------valid from date	
	@FindBy(xpath="//input[@formcontrolname='from']")
	@CacheLookup
	WebElement Valid_From;
	
	@FindBy(xpath="//div[@class='bs-datepicker-head']//child::button[4]")
	@CacheLookup
	WebElement clickOnNext_From;
	
	@FindBy(xpath="//div[@class='bs-datepicker-body']//child::table//child::tbody//child::tr[3]//child::td[3]")
	@CacheLookup
	WebElement clickOnDate_From;

//-------valid To date
	
	@FindBy(xpath="//input[@formcontrolname='to']")
	@CacheLookup
	WebElement Valid_To;
	
	@FindBy(xpath="//div[@class='bs-datepicker-head']//child::button[4]")
	@CacheLookup
	WebElement clickOnNext_To;
	
	@FindBy(xpath="//div[@class='bs-datepicker-body']//child::table//child::tbody//child::tr[3]//child::td[3]")
	@CacheLookup
	WebElement clickOnDate_To;
	
	@FindBy(xpath="//select[@formcontrolname='status']")
	@CacheLookup
	WebElement Select_Status;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement Contr_Ref;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement Rate_Type;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement UOM;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement Agent_Comm;

	@FindBy(xpath="")
	@CacheLookup
	WebElement Max_Discount;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement ULD_Rate;

	@FindBy(xpath="")
	@CacheLookup
	WebElement Heavy_Applicable;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement All_In_Rate;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement TACT_Rate;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement Is_Prime;
	
	
//-----------------Rate Base-----------------------	
	@FindBy(xpath="//table[@id='DataTables_Table_0']//child::tbody//child::tr[1]//child::td[1]//select")
	@CacheLookup
	WebElement Type;
	
	@FindBy(xpath="//table[@id='DataTables_Table_0']//child::tbody//child::tr[1]//child::td[2]//input")
	@CacheLookup
	WebElement Weight;
	
	@FindBy(xpath="//table[@id='DataTables_Table_0']//child::tbody//child::tr[1]//child::td[3]//input")
	@CacheLookup
	WebElement Charge_Rate;
	
	//-------------------
	@FindBy(xpath="//table[@id='DataTables_Table_0']//child::tbody//child::tr[2]//child::td[1]//select")
	@CacheLookup
	WebElement Type2;
	
	@FindBy(xpath="//table[@id='DataTables_Table_0']//child::tbody//child::tr[2]//child::td[2]//input")
	@CacheLookup
	WebElement Weight2;
	
	@FindBy(xpath="//table[@id='DataTables_Table_0']//child::tbody//child::tr[2]//child::td[3]//input")
	@CacheLookup
	WebElement Charge_Rate2;

	//-------------------
		@FindBy(xpath="//table[@id='DataTables_Table_0']//child::tbody//child::tr[3]//child::td[1]//select")
		@CacheLookup
		WebElement Type3;
		
		@FindBy(xpath="//table[@id='DataTables_Table_0']//child::tbody//child::tr[3]//child::td[2]//input")
		@CacheLookup
		WebElement Weight3;
		
		@FindBy(xpath="//table[@id='DataTables_Table_0']//child::tbody//child::tr[3]//child::td[3]//input")
		@CacheLookup
		WebElement Charge_Rate3;

		//-------------------
		@FindBy(xpath="//table[@id='DataTables_Table_0']//child::tbody//child::tr[4]//child::td[1]//select")
		@CacheLookup
		WebElement Type4;
				
		@FindBy(xpath="//table[@id='DataTables_Table_0']//child::tbody//child::tr[4]//child::td[2]//input")
		@CacheLookup
		WebElement Weight4;
				
		@FindBy(xpath="//table[@id='DataTables_Table_0']//child::tbody//child::tr[4]//child::td[3]//input")
		@CacheLookup
		WebElement Charge_Rate4;

		
		
	@FindBy(xpath="")
	@CacheLookup
	WebElement Cost;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement Based;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement Actionbtn;
	
	@FindBy(xpath="//button[contains(text(),'Add')]")
	@CacheLookup
	WebElement addbtn;
	
//---------------Parameter-------------------------	
	//----Flight Carrier
	@FindBy(xpath="")
	@CacheLookup
	WebElement Flight_Carrier;

	@FindBy(xpath="")
	@CacheLookup
	WebElement Flight_Carrier_popup;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement Flight_Carrier_Exclude;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement Flight_Carrier_include;

//----Issuing Carrier
		@FindBy(xpath="")
		@CacheLookup
		WebElement Issuing_Carrier;

		@FindBy(xpath="")
		@CacheLookup
		WebElement Issuing_Carrier_popup;
		
		@FindBy(xpath="")
		@CacheLookup
		WebElement Issuing_Carrier_Exclude;
		
		@FindBy(xpath="")
		@CacheLookup
		WebElement Issuing_Carrier_include;

//-----Transit Station
				@FindBy(xpath="")
				@CacheLookup
				WebElement Transit_Station;

				@FindBy(xpath="")
				@CacheLookup
				WebElement Transit_Station_popup;
				
				@FindBy(xpath="")
				@CacheLookup
				WebElement Transit_Station_Exclude;
				
				@FindBy(xpath="")
				@CacheLookup
				WebElement Transit_Station_include;

//-----Origin Station
				@FindBy(xpath="")
				@CacheLookup
				WebElement Origin_Station;

				@FindBy(xpath="")
				@CacheLookup
				WebElement Origin_Station_popup;
				
				@FindBy(xpath="")
				@CacheLookup
				WebElement Origin_Station_Exclude;
				
				@FindBy(xpath="")
				@CacheLookup
				WebElement Origin_Station_include;

//-----Destination Station
				@FindBy(xpath="")
				@CacheLookup
				WebElement Destination_Station;

				@FindBy(xpath="")
				@CacheLookup
				WebElement Destination_Station_popup;
				
				@FindBy(xpath="")
				@CacheLookup
				WebElement Destination_Station_Exclude;
				
				@FindBy(xpath="")
				@CacheLookup
				WebElement Destination_Station_include;

//-----Agent Code
				@FindBy(xpath="")
				@CacheLookup
				WebElement Agent_Code;

				@FindBy(xpath="")
				@CacheLookup
				WebElement Agent_Code_popup;
				
				@FindBy(xpath="")
				@CacheLookup
				WebElement Agent_Code_Exclude;
				
				@FindBy(xpath="")
				@CacheLookup
				WebElement Agent_Code_include;

//-----Central Agent Code
				@FindBy(xpath="")
				@CacheLookup
				WebElement Central_Agent_Code;

				@FindBy(xpath="")
				@CacheLookup
				WebElement Central_Agent_Code_popup;
				
				@FindBy(xpath="")
				@CacheLookup
				WebElement Central_Agent_Code_Exclude;
				
				@FindBy(xpath="")
				@CacheLookup
				WebElement Central_Agent_Code_include;

//-----Shipper Code
				@FindBy(xpath="")
				@CacheLookup
				WebElement Shipper_Code;

				@FindBy(xpath="")
				@CacheLookup
				WebElement Shipper_Code_popup;
				
				@FindBy(xpath="")
				@CacheLookup
				WebElement Shipper_Code_Exclude;
				
				@FindBy(xpath="")
				@CacheLookup
				WebElement Shipper_Code_include;

//-----IATA Comm Code
				@FindBy(xpath="")
				@CacheLookup
				WebElement IATA_Comm_Code;

				@FindBy(xpath="")
				@CacheLookup
				WebElement IATA_Comm_Code_popup;
				
				@FindBy(xpath="")
				@CacheLookup
				WebElement IATA_Comm_Code_Exclude;
				
				@FindBy(xpath="")
				@CacheLookup
				WebElement IATA_Comm_Code_include;

//-----Product Type
				@FindBy(xpath="")
				@CacheLookup
				WebElement Product_Type;

				@FindBy(xpath="")
				@CacheLookup
				WebElement Product_Type_popup;
				
				@FindBy(xpath="")
				@CacheLookup
				WebElement Product_Type_Exclude;
				
				@FindBy(xpath="")
				@CacheLookup
				WebElement Product_Type_include;

//-----SPL Handling Code
				@FindBy(xpath="")
				@CacheLookup
				WebElement SPL_Handling_Code;

				@FindBy(xpath="")
				@CacheLookup
				WebElement SPL_Handling_Code_popup;
				
				@FindBy(xpath="")
				@CacheLookup
				WebElement SPL_Handling_Code_Exclude;
				
				@FindBy(xpath="")
				@CacheLookup
				WebElement SPL_Handling_Code_include;

//-----Equipment Type
				@FindBy(xpath="")
				@CacheLookup
				WebElement Equipment_Type;

				@FindBy(xpath="")
				@CacheLookup
				WebElement Equipment_Type_popup;
				
				@FindBy(xpath="")
				@CacheLookup
				WebElement Equipment_Type_Exclude;
				
				@FindBy(xpath="")
				@CacheLookup
				WebElement Equipment_Type_include;

//-----From To
				@FindBy(xpath="")
				@CacheLookup
				WebElement From;

				@FindBy(xpath="")
				@CacheLookup
				WebElement To;
				
				@FindBy(xpath="")
				@CacheLookup
				WebElement From_Exclude;
				
				@FindBy(xpath="")
				@CacheLookup
				WebElement From_include;
				
//-----Proration & SPA MArkup
				@FindBy(xpath="")
				@CacheLookup
				WebElement Proration;
				
				@FindBy(xpath="")
				@CacheLookup
				WebElement SPA_MArkup;
				
//-------DAys
			//----Mon
				@FindBy(xpath="")
				@CacheLookup
				WebElement Mon;
				
				@FindBy(xpath="")
				@CacheLookup
				WebElement Mon_Exclude;
				
				@FindBy(xpath="")
				@CacheLookup
				WebElement Mon_Include;
								
			//----Tue
				@FindBy(xpath="")
				@CacheLookup
				WebElement Tue;
				
				@FindBy(xpath="")
				@CacheLookup
				WebElement Tue_Exclude;
				
				@FindBy(xpath="")
				@CacheLookup
				WebElement Tue_Include;
			
		//----Wed
				@FindBy(xpath="")
				@CacheLookup
				WebElement Wed;
				
				@FindBy(xpath="")
				@CacheLookup
				WebElement Wed_Exclude;
				
				@FindBy(xpath="")
				@CacheLookup
				WebElement Wed_Include;	
				
		//----Thu
				@FindBy(xpath="")
				@CacheLookup
				WebElement Thu;
				
				@FindBy(xpath="")
				@CacheLookup
				WebElement Thu_Exclude;
				
				@FindBy(xpath="")
				@CacheLookup
				WebElement Thu_Include;
				
		//----Fri
				@FindBy(xpath="")
				@CacheLookup
				WebElement Fri;
				
				@FindBy(xpath="")
				@CacheLookup
				WebElement Fri_Exclude;
				
				@FindBy(xpath="")
				@CacheLookup
				WebElement Fri_Include;
				
		//----Sat
				@FindBy(xpath="")
				@CacheLookup
				WebElement Sat;
				
				@FindBy(xpath="")
				@CacheLookup
				WebElement Sat_Exclude;
				
				@FindBy(xpath="")
				@CacheLookup
				WebElement Sat_Include;

		//----Sun
				@FindBy(xpath="")
				@CacheLookup
				WebElement Sun;
				
				@FindBy(xpath="")
				@CacheLookup
				WebElement Sun_Exclude;
				
				@FindBy(xpath="")
				@CacheLookup
				WebElement Sun_Include;		
				
//-----------------Parameter (Cost)-----------
				
				@FindBy(xpath="")
				@CacheLookup
				WebElement Vendor_Code;	
				
				@FindBy(xpath="")
				@CacheLookup
				WebElement Vendor_Code_Exclude;	
				
				@FindBy(xpath="")
				@CacheLookup
				WebElement Vendor_Code_Include;	
				
//----------Remark---------
				@FindBy(xpath="//textarea[@formcontrolname='remarks']")
				@CacheLookup
				WebElement Remark;
				
//-----------Submit button------
				@FindBy(xpath="//button[@type='submit']")
				@CacheLookup
				WebElement Submit_btn;
				



//--Actions---------------
				
		TestUitl testutil;
		
		
		                                                 
		public void CountryToCountry_RateLine_fun(String Rate_Card_Name_val, String Origin_Level_val, String origen_val, 
				String Destination_Level_val,String Destination_val, String Currency_val,String Rating_Basis_val, String Select_Status_val,
				String Type_val, String Weight_val,String Charge_Rate_val, String Type2_val,String Weight2_val,
				String Charge_Rate2_val,String Type3_val,String Weight3_val,String Charge_Rate3_val,String Type4_val,String Weight4_val,
				String Charge_Rate4_val, String Remark_val) throws IOException, InterruptedException {
			 
		//---Rate Card Name-----	
			testutil = new TestUitl();
			testutil.hardwait(1000);
			Select select = new Select(Rate_Card_Name);
			 select.selectByVisibleText(Rate_Card_Name_val);	 
		//-----Origin Level----	 
			testutil.hardwait(1000);
			 Select selectorg = new Select(Origin_Level);
			 selectorg.selectByVisibleText(Origin_Level_val);
	  //-----Origin--
			testutil.hardwait(1000);
			Origin.sendKeys(origen_val,Keys.ARROW_DOWN,Keys.ENTER);
	//---Destination level-----
			testutil.hardwait(1000);
			 Select selectdellav = new Select(Destination_Level);
			 selectdellav.selectByVisibleText(Destination_Level_val);
	//---Destination-----
			testutil.hardwait(1000);
			Destination.sendKeys(Destination_val,Keys.ARROW_DOWN,Keys.ENTER);
	//---Currency--------	
			testutil.hardwait(1000);
			Currency.sendKeys(Currency_val,Keys.ARROW_DOWN,Keys.ENTER);
//---Rating_Basis

			testutil.hardwait(1000);
			Select selectrat = new Select(Rating_Basis);
			selectrat.selectByVisibleText(Rating_Basis_val);
//--Valid_From
			testutil.hardwait(1000);
			Valid_From.click();	
			//testutil.hardwait(1000);
			//clickOnNext_From.click();
			testutil.hardwait(1000);
			clickOnDate_From.click();		
		
//--Valid_To
			testutil.hardwait(1000);
			Valid_To.click();	
			testutil.hardwait(1000);
			clickOnNext_To.click();
			testutil.hardwait(1000);
			clickOnDate_To.click();
		
//-----Select Status  

		testutil.hardwait(1000);
		Select selectstatus = new Select(Select_Status);
		selectstatus.selectByVisibleText(Select_Status_val);
	
//---Type	
			 testutil.hardwait(1000);
			 Select selecttyp = new Select(Type);
			 selecttyp.selectByVisibleText(Type_val);
			 Weight.sendKeys(Weight_val);
			 Charge_Rate.sendKeys(Charge_Rate_val);
			 addbtn.click();			 
			 
			 testutil.hardwait(1000);
			 Select select2 = new Select(Type2);
			 select2.selectByVisibleText(Type2_val);
			 Weight2.sendKeys(Weight2_val);
			 Charge_Rate2.sendKeys(Charge_Rate2_val);
			 addbtn.click();
			 
			 testutil.hardwait(1000);
			 Select select3 = new Select(Type3);
			 select3.selectByVisibleText(Type3_val);
			 Weight3.sendKeys(Weight3_val);
			 Charge_Rate3.sendKeys(Charge_Rate3_val);
			 addbtn.click();
			 
			 
			 
			 testutil.hardwait(1000);
			 Select select4 = new Select(Type4);
			 select4.selectByVisibleText(Type4_val);
			 Weight4.sendKeys(Weight4_val);
			 Charge_Rate4.sendKeys(Charge_Rate4_val);
			
//-----Remarks 
				testutil = new TestUitl();
				testutil.hardwait(1000);
				Remark.sendKeys(Remark_val);
				
//-----Submit_btn				
				testutil.hardwait(1000);
				Submit_btn.click();
				}
		


}
