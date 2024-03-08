package com_st_util;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com_st_TestBase.TestBase;

public class CustomerListener extends TestBase implements ITestListener {

	
	public CustomerListener() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public void onTestStart(ITestResult result) {
		 
		 System.out.println("New Test Started" +result.getName());
		 
		 }
		 
		 public void onTestSuccess(ITestResult result) {
		 
		 System.out.println("Test Successfully Finished" +result.getName());
		 
		 }
		 
		 public void onTestFailure(ITestResult result) {
			 System.out.println("Test Failed" +result.getName());
		
				try {
					TestUitl.takeScreenshotAtEndofTest();
				} catch (IOException e) {
					e.printStackTrace();
				}
		 }


		public void onTestSkipped(ITestResult result) {
		 
		 System.out.println("Test Skipped" +result.getName());
		 
		 }
		 
		 public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		 
		 System.out.println("Test Failed but within success percentage" +result.getName());
		 
		 }
		 
		 public void onStart(ITestResult result) {
		 
		 
		 System.out.println("This is onStart method" +result.getName());
		 
		 }
		 
		 public void onFinish(ITestResult result) {
			 
			 System.out.println("This is onStart method" +result.getName());
		 
		 }

		@Override
		public void onFinish(ITestContext arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onStart(ITestContext arg0) {
			// TODO Auto-generated method stub
			
		}

}
