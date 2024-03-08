package com_st_pages_test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com_st_TestBase.TestBase;
import com_st_pages.A2ANewOrder_Page;
import com_st_pages.homepage;
import com_st_pages.loginpage;
import com_st_pages.ratelistpage;
import com_st_util.TestUitl;

public class A2ANeworder_pageTest extends TestBase {

	public A2ANeworder_pageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	 loginpage LoginPage;
	 homepage HomePage;
	 TestUitl testutil;
	 A2ANewOrder_Page a2aneworder_page;
	 String SheetName ="A2ABookingSingleRoute";
	 
	@BeforeMethod
	public void setup() throws IOException, InterruptedException {
		initialization();
		LoginPage = new loginpage();
		HomePage = new homepage();
		a2aneworder_page = new A2ANewOrder_Page();
		testutil = new TestUitl();
		HomePage = LoginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		System.out.println("Login successfully");
		testutil.hardwait(1000);
		HomePage.colorchange();
	}

	
//	@Test(priority =1)
//	public void OpenNewOrder() throws InterruptedException, IOException {
//		System.out.println("new order booking page click start");
//		testutil.hardwait(1000);
//		HomePage.clickOnNewOrder();		
//	}

//	@Test(priority =2)
//	public void verifyNewOrderPage() throws InterruptedException, IOException {
//		testutil.hardwait(2000);
//		HomePage.clickOnNewOrder();
//		String d2dneworder_pageurl = a2aneworder_page.varifyneworderpageurl();
//		Assert.assertEquals(d2dneworder_pageurl, "https://qa.thespicetag.com/create-booking","New Order Page not Open");
//	}

//	@DataProvider
//	public Object[][] A2ASingleRouteTestData() throws InvalidFormatException{
//		Object data[][] = TestUitl.getTestData(SheetName);
//		System.out.println(data);
//		return data;
//	}

	

	@Test(priority =3)
	public void Createbooking() throws InterruptedException, IOException {
		testutil.hardwait(2000);
	//	HomePage.clickOnNewOrder();
	


		////		public void booking_Creation(String org1,String des1,String com1,String shipper1, 
////				String cons1,String pics1,String gross1) throws IOException, InterruptedException {		
//		  
		
		
		String Filepath = "C:\\Users\\devendra.singh1\\eclipse-workspace\\Spicetag_FrameWorkV1\\src\\main\\java\\com_st_testdata\\Selenium Excel file.xlsx";
		//FileInputStream fis= new FileInputStream(Filepath);
		XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream((new File(Filepath))));
		int lastRowNum = wb.getSheetAt(0).getLastRowNum();
		System.out.println(wb.getSheetName(0));
		
		System.out.println("last row count:-"+lastRowNum);
		
		for(int i =1; i <lastRowNum; i++ )
		{
		System.out.println("count of i:- "+i);
		String awbno =          wb.getSheetAt(0).getRow(i).getCell(0).getStringCellValue();
		System.out.println(awbno);
 
		a2aneworder_page.awbaexe(awbno);
		
	
		
		//	a2aneworder_page.Createbooking(des1, com1, shipper1, cons1, pics1, gross1);
			
		//	a2aneworder_page.savebooking();
			
		
		//	//	Org1 =Org;
//		String des1 =          wb.getSheetAt(0).getRow(i).getCell(1).getStringCellValue();
//		String com1 =          wb.getSheetAt(0).getRow(i).getCell(2).getStringCellValue();
//		String shippercode1 =  wb.getSheetAt(0).getRow(1).getCell(3).getStringCellValue();
//		String consigneecode1 =wb.getSheetAt(0).getRow(1).getCell(4).getStringCellValue();
////		int pieces1 =       (int) wb.getSheetAt(0).getRow(i).getCell(5).getNumericCellValue();
////		double G_weight1 =     wb.getSheetAt(0).getRow(i).getCell(6).getNumericCellValue();
//		String pieces1 =      wb.getSheetAt(0).getRow(i).getCell(5).getStringCellValue();
//	    String G_weight1 =    wb.getSheetAt(0).getRow(i).getCell(6).getStringCellValue();
		
	//    a2aneworder_page.Createbooking(Org1, des1, com1, shippercode1, consigneecode1, pieces1, G_weight1);
	    
		
//		System.out.println("data is-"+Org1);
//		System.out.println("data is-"+des1);
//		System.out.println("data is-"+com1);
//		System.out.println("data is-"+shippercode1);
//		System.out.println("data is-"+consigneecode1);
//		System.out.println("data is-"+pieces1);
//		System.out.println("data is-"+G_weight1);
//				
//		
		}
	}
		
}	
//}	
//	@AfterMethod
//	public void tearDown() 
//	{
//		driver.quit();
//	}



