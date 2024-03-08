package com_st_pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com_st_TestBase.TestBase;

public class A2ANewOrder_Page extends TestBase{
	
	public A2ANewOrder_Page() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	


@FindBy(xpath="//input[@name='destination']")
@CacheLookup
WebElement Des;



@FindBy(xpath="//input[@name='commodity_code']")
@CacheLookup
WebElement Com;

@FindBy(xpath="//input[@name='shipperCode']")
@CacheLookup
WebElement ship;


@FindBy(xpath="//input[@name='consigneeCode']")
@CacheLookup
WebElement Con;


@FindBy(xpath="//input[@name='customer']")
@CacheLookup
WebElement cus;


@FindBy(xpath="//input[@name='total_pieces']")
@CacheLookup
WebElement Pic;


@FindBy(xpath="//input[@name='gross_weight']")
@CacheLookup
WebElement Gross_w;

@FindBy(xpath="//span[@title=\"Add New Dimension\"]")
@CacheLookup
WebElement Demission_open;

@FindBy(xpath="//table[@class='table deminsion-table']//child::tbody//child::tr[1]//child::td[2]//input")
@CacheLookup
WebElement Length;

@FindBy(xpath="//table[@class='table deminsion-table']//child::tbody//child::tr[1]//child::td[3]//input")
@CacheLookup
WebElement Width;

@FindBy(xpath="//table[@class='table deminsion-table']//child::tbody//child::tr[1]//child::td[4]//input")
@CacheLookup
WebElement Height;


@FindBy(xpath="//button[contains(text(),'Calculate')]")
@CacheLookup
WebElement calculate_btn;

@FindBy(xpath="//button[contains(text(),'Calculate')]/following-sibling::button")
@CacheLookup
WebElement calculate_savebtn;

//To Shipper Invoice 

@FindBy(xpath="//input[@name='invoice_number']")
@CacheLookup
WebElement Shipper_invoic;

//To Shipper Invoice
@FindBy(xpath="//input[@name='dv_for_carriage']")
@CacheLookup
WebElement DV_carraige;

//select Truck in route1
@FindBy(xpath="//table[@class='table datatable-basic dataTable datatable-scroll no-footer']//child::tbody//child::tr[1]//child::td[1]//child::select")
@CacheLookup
WebElement Truck_one;

//Select Route1 Destination
@FindBy(xpath="//table[@class='table datatable-basic dataTable datatable-scroll no-footer']//child::tbody//child::tr[1]//child::td[3]//input")
@CacheLookup
WebElement des_route1;

//To Click the Datepicker in Route From Date
@FindBy(xpath="//table[@class='table datatable-basic dataTable datatable-scroll no-footer']//child::tbody//child::tr[1]//child::td[6]//input")
@CacheLookup
WebElement Datepicker_route1 ;

//Select Truck Code
@FindBy(xpath="//table[@class='table datatable-basic dataTable datatable-scroll no-footer']//child::tbody//child::tr[1]//child::td[7]//select")
@CacheLookup
WebElement Truck1_code;

//To Add New route button
@FindBy(xpath="//button[@title='Add New Route']")
@CacheLookup
WebElement Newroute_btn;

//select flight in route
@FindBy(xpath="//table[@class='table datatable-basic dataTable datatable-scroll no-footer']//child::tbody//child::tr[1]//child::td[1]//child//select")
@CacheLookup
WebElement Flight;

//Select Route 2 Destination
@FindBy(xpath="//table[@class='table datatable-basic dataTable datatable-scroll no-footer']//child::tbody//child::tr[1]//child::td[2]//child::select")
@CacheLookup
WebElement route2_Des;

//To Click the Datepicker Route2 From Date
@FindBy(xpath="//table[@class='table datatable-basic dataTable datatable-scroll no-footer']//child::tbody//child::tr[1]//child::td[6]//child::input")
@CacheLookup
WebElement Datepicker_route2;

//To click on date calander in route date
@FindBy(xpath="//table[@class='days weeks']//child::td")
@CacheLookup
WebElement clickon_datecalander;

//Select Flight Code route2
@FindBy(xpath="//table[@class='table datatable-basic dataTable datatable-scroll no-footer']//child::tbody//child::tr[1]//child::td[7]//child::select")
WebElement Flightcode_route2;

//Select AWB Status route2
@FindBy(xpath="//table[@class='table datatable-basic dataTable datatable-scroll no-footer']//child::tbody//child::tr[1]//child::td[9]//child::select")
WebElement AWB_Status;


//select Truck in route3
@FindBy(xpath="//table[@class='table datatable-basic dataTable datatable-scroll no-footer']//child::tbody//child::tr[3]//child::td[1]//child::select")
@CacheLookup
WebElement Truck_route3;

//Select Route3 Destination
@FindBy(xpath="//table[@class='table datatable-basic dataTable datatable-scroll no-footer']//child::tbody//child::tr[3]//child::td[3]//child::input")
@CacheLookup
WebElement des_route3;

//To Click the Datepicker in Route3 From Date
@FindBy(xpath="//table[@class='table datatable-basic dataTable datatable-scroll no-footer']//child::tbody//child::tr[3]//child::td[6]//child::input")
@CacheLookup
WebElement datepicker_route3;

//Select Truck Code route3
@FindBy(xpath="//table[@class='table datatable-basic dataTable datatable-scroll no-footer']//child::tbody//child::tr[3]//child::td[7]//child::select")
@CacheLookup
WebElement truckcode_route3;


//To Execute Booking
@FindBy(xpath="//input[@formcontrolname='awb_number']")
WebElement awb;

//To Execute Booking
@FindBy(xpath="//*[@title='Execute']")
WebElement awbexe;


//To Accept Booking
@FindBy(xpath="//input[@name='accept_piece']")
WebElement acpt_pic;

//To Accept Weight
@FindBy(xpath="//input[@name='accept_weight']")
WebElement acpt_w;

//To Accept Weight
@FindBy(xpath="//*[@title='Accept']")
WebElement awbacpt;




//To Save Booking
@FindBy(xpath="//*[contains(text(),'Save Booking ')]")
WebElement save_btn;


//To refresh Booking
@FindBy(xpath="//*[@title='Refresh']")
WebElement ref_btn;

//----New Order
		@FindBy(xpath="//a[@href='/create-booking']")
		WebElement New_Order;
//---- Orders 
		@FindBy(id="parent_1")
		WebElement Orders;
//------delete route
		@FindBy(xpath="//table[@class='table datatable-basic dataTable datatable-scroll no-footer']//child::tbody//child::tr[1]//child::td[10]//child::select")
		WebElement del_btn;
		
	
//Actions
	
	public String varifyneworderpageurl() {
		
		return driver.getCurrentUrl();
	}
	

//	public void awbaccept(String awb) throws FileNotFoundException, IOException, InterruptedException {
//	
//		awbexc.sendKeys(awb);
//	}
//	

	public void Createbooking(String des1,String com1,String shipper1,String cons1,String pics1,String gross1) throws FileNotFoundException, IOException, InterruptedException {
	
//	//To Enter the org in top of the page
//	driver.findElement(By.xpath("//*[@formcontrolname='station_code']")).click();
//	driver.findElement(By.xpath("//*[@formcontrolname='station_code']")).sendKeys(org1);
//	
//	Thread.sleep(1000);
//	driver.findElement(By.xpath("//*[@formcontrolname='station_code']")).sendKeys(Keys.ENTER);
//	Thread.sleep(1000);
//	Actions action = new Actions(driver);
//	action.moveToElement(Orders).build().perform();//click on order
//	New_Order.click(); // click on New order
//	Thread.sleep(1000);
			
		//Destination code
		Des.click();
		Des.sendKeys(des1);
		Thread.sleep(1000);
		Des.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		//Thread.sleep(1000);

		//commodity code:-		
		Com.click();
		Com.sendKeys(com1);
		Thread.sleep(1000);
		Com.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		//Thread.sleep(1000);
		
		// Shipper Code Enter:-
		
		ship.click();
		ship.sendKeys(shipper1);
		Thread.sleep(1000);
		ship.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		//Thread.sleep(1000);

		//Consignee Code Enter:-
		
		Con.click();
		Con.sendKeys(cons1);
		Thread.sleep(1000);
		Con.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		//Thread.sleep(1000);

//		//TO Customer Code Enter:-
//		cus.click();
//		cus.sendKeys(customercode);
//		Thread.sleep(2000);
//		cus.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
//		Thread.sleep(2000);

		//To Enter Pieces:-
		

		Pic.sendKeys(pics1);
		//Thread.sleep(1000);

		//TO Enter Gross Weight:-
		Gross_w.sendKeys(gross1);
		//Thread.sleep(1000);
		
		//Gross Weight Window Open
//		Demission_open.click();
//		Thread.sleep(4000);

//		Length.sendKeys(dLength); //Length
//		Width.sendKeys(dWidth); //Width
//		Height.sendKeys(dHeight); //Height

//		calculate_btn.sendKeys(Keys.ENTER); //To Calculate weight
//		 Thread.sleep(2000);
//		 
//		 calculate_savebtn.sendKeys(Keys.ENTER); // To save weight
//		 Thread.sleep(2000);
	
		//To Shipper Invoice 
//		 Shipper_invoic.sendKeys("INv1234");
		 
		 //To DV for Carriage
//		 DV_carraige.sendKeys("100");
	
	
	
	
	
//	public void truck1_creation() throws InterruptedException {
//		
//		//select Truck in route1
//		Select select = new Select(Truck_one);
//		 select.selectByVisibleText("Truck");
//		 Thread.sleep(2000);
//		 
//		//Select Route1 Destination
//		 des_route1.sendKeys(Org);
//		 Thread.sleep(2000);
//		 des_route1.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
//		 Thread.sleep(2000);
//		 
//      //To Get Today Date
//		  	DateFormat formatdate = new SimpleDateFormat("dd/MM/YYYY");
//		  	Date SystemDate = new Date();
//			String Dateofsystem = formatdate.format(SystemDate);	
//			System.out.println(Dateofsystem);
//			String arr[]=Dateofsystem.split("/");
//			String days = arr[0];		
//			int s = (int) Integer.parseInt(days);
//			String day=String.valueOf(s); 
//			System.out.println("This is the current day for today date"+ s);
//		  
//			//To Click the Datepicker in Route From Date
//		  JavascriptExecutor js =(JavascriptExecutor)driver;
//		  WebElement datepicker = Datepicker_route1;
//		  js.executeScript("arguments[0].click()", datepicker);
//		  
////To click the date in route date
//		  
//		  List<WebElement> alldaate = driver.findElements(By.xpath("//table[@class='days weeks']//child::td"));
//		  for(WebElement ele:alldaate) 
//		  {
//			  String dt = ele.getText();
//			  System.out.println(dt);
//			  if(dt.equals(day))
//			  {
//				  System.out.println("inside of if condiction "+day+"calender day:-" + dt);
//				  
//				  ele.click();
//				  break;
//			  }
//		  }
//
//		//Select Track Code
//		    
//	  	   Thread.sleep(3000);
//	  	   Truck1_code.sendKeys(Keys.ENTER, Keys.ARROW_DOWN, Keys.ARROW_DOWN,Keys.ENTER);
//	  	   Thread.sleep(2000);

	//----delet fisr route
	//	del_btn.click();
	   //To Add New route button---
	 // 	 Newroute_btn.sendKeys(Keys.ENTER);
//	}
// flight1_creation(String des) throws InterruptedException {
	  	 
			//select flight in route
			 Select select1 = new Select(Flight);
			 select1.selectByVisibleText("Flight");                
			 Thread.sleep(1000);

			 //Select Route2 Destination
			 route2_Des.sendKeys(des1);
			 Thread.sleep(2000);
			 route2_Des.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			 Thread.sleep(2000);

			//To Get Today Date
			  	DateFormat formatdate1 = new SimpleDateFormat("dd/MM/YYYY");
				Date SystemDate1 = new Date();
				String Dateofsystem1 = formatdate1.format(SystemDate1);	
				System.out.println(Dateofsystem1);
				String arr1[]=Dateofsystem1.split("/");
				String days1 = arr1[0];	
				int s1 = (int) Integer.parseInt(days1);
				String day1=String.valueOf(s1); 
				System.out.println("This is the current day for today date"+day1);
			  
				//To Click the Datepicker in Route From Date
			  JavascriptExecutor js1 =(JavascriptExecutor)driver;
			  WebElement datepicker1 =Datepicker_route2;
			  js1.executeScript("arguments[0].click()", datepicker1);
			  
	//To click the date in route date
			  
			  List<WebElement> alldaate1 = driver.findElements(By.xpath("//table[@class='days weeks']//child::td"));
			  for(WebElement ele1:alldaate1) 
			  {
				  String dt1 = ele1.getText();
				 // System.out.println(dt1);
				  if(dt1.equals(day1))
				  {
					  ele1.click();
					  break;
				  }
			  }
			  
			//Select Flight Code
			    
		  	 Thread.sleep(1000);
		  	 Flightcode_route2.sendKeys(Keys.ENTER,Keys.ARROW_DOWN,Keys.ARROW_DOWN, Keys.ENTER);	   
		  	 Thread.sleep(1000);
		  	
		  	//Select AWB Status
			    
		  	 Thread.sleep(1000);
		  	AWB_Status.sendKeys(Keys.ENTER,Keys.ARROW_DOWN,Keys.ARROW_DOWN, Keys.ENTER);	   
		  	 Thread.sleep(1000);
		  	 
//		  	@FindBy(xpath="//*[contains(text(),'Save Booking ')]")
//			WebElement savebooking;
		  	 
//		  	 //Add new route3 
//		  	Newroute_btn.sendKeys(Keys.ENTER);
//		  	Thread.sleep(1000);
		 	
		  	
//		  	public void savebooking() {
//		  		save_btn.click();
//			}	  	 
//	
		
	//	ref_btn.click();
		
	//	driver.quit();


//		
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		js.executeScript("arguments[0].click();", ref_btn);
//		Thread.sleep(2000);
//		
//		WebElement clickonsave = driver.findElement(By.xpath("//button[@title='Save Booking']"));
//		JavascriptExecutor executor = (JavascriptExecutor) driver;
//	    executor.executeScript("arguments[0].click", clickonsave);
//		
	    // driver.findElement(By.xpath("//button[@title='Save Booking']")).click();
		//save_btn.click();
	}



	public void savebooking() {
		save_btn.click();
		
	}

//	public void execute(String awbno) throws InterruptedException {
//		Thread.sleep(2000);
//		awbexc.click();
//		Thread.sleep(2000);
//		awbexc.sendKeys(awbno);
//		awbexc.sendKeys(Keys.ENTER);
//		Thread.sleep(1000);
//		awbexc.click();
//		
//	}

	public void awbaexe(String awbno) throws InterruptedException {
		
		//awb.click();
		awb.sendKeys(awbno);
		awb.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		//To get pic and weight from booking page
	//	String pic1 = Gross_w.getText();
		String pic1 = "2";
		System.out.println("get pices from booking page"+ pic1);
	//	String picw = Gross_w.getText();
		String picw = "20";
		System.out.println("get pices from booking page"+picw);
		
		
		awbexe.click();
		Thread.sleep(4000);
		
		acpt_pic.sendKeys(pic1);
		acpt_w.sendKeys(picw);
		awbacpt.click();
		
		Thread.sleep(2000);
//		ref_btn.click();
//		Thread.sleep(2000);
		
	}	

		
//	public void truck2_creation() throws InterruptedException {
//		  //select Truck in route3
//			Select select2 = new Select(Truck_route3);
//			 select2.selectByVisibleText("Truck");                
//			 Thread.sleep(2000);
//			 
//			//Select Route3 Destination
//			 des_route3.sendKeys(Deswh);
//			 Thread.sleep(4000);
//			 des_route3.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
//			 Thread.sleep(4000);
//		  	
//			//To Get Today Date
//	
//			 DateFormat formatdate2 = new SimpleDateFormat("dd/MM/YYYY");
//				Date SystemDate2 = new Date();
//				String Dateofsystem2 = formatdate2.format(SystemDate2);	
//				System.out.println(Dateofsystem2);
//				String arr2[]=Dateofsystem2.split("/");
//				String days2 = arr2[0];	
//				int s2 = (int) Integer.parseInt(days2);
//				String day2=String.valueOf(s2);
//				
//				System.out.println("This is the second truck day:- "+day2);
//			  
//		//To Click the Datepicker in Route From Date
//			  JavascriptExecutor js2 =(JavascriptExecutor)driver;
//			  WebElement datepicker2 = datepicker_route3;
//			  js2.executeScript("arguments[0].click()", datepicker2);
//			 // datepicker2.click();
//		Thread.sleep(1000);
//			  
//	//To click the date in route date
//			  
//			  List<WebElement> alldaate2 = driver.findElements(By.xpath("//table[@class='days weeks']//child::td"));
//			  for(WebElement ele2:alldaate2) 
//			  {
//				  String dt2 = ele2.getText();
//				 // System.out.println("secong truck :- "+dt2);
//				  if(dt2.equals(day2))
//				  {
//					  System.out.println("secong truck :- "+dt2);
//					  Thread.sleep(1000);
//					  //ele2.sendKeys(Keys.ENTER);
//					  ele2.click();
//					  break;
//				  }
//			  }
//	
//		  }

	

	}	

