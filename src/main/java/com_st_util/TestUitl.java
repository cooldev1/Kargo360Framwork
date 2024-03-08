package com_st_util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hslf.model.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com_st_TestBase.TestBase;

public class TestUitl extends TestBase{

	public TestUitl() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static long PAGE_LOAD_TIMEOUT =20;
	public static int IMPLICIT_WAIT = 10;
	
	public void switchToFrame() {
		driver.switchTo().frame("mainpanel");
	}

	public void hardwait(int sec) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(sec);
	}

	
	public static String TESTDATA_SHEET_PATH = "C:\\Users\\devendra.singh1\\eclipse-workspace\\Spicetag_FrameWork\\src\\main\\java\\com_st_testdata\\RateCreation sheet.xlsx";
	static Workbook book;
	static org.apache.poi.ss.usermodel.Sheet sheet;
	//static Sheet sheet;
	
	
	public static Object[][] getTestData(String sheetName) throws org.apache.poi.openxml4j.exceptions.InvalidFormatException {
		FileInputStream file = null;
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		}  catch (IOException e) {
			e.printStackTrace();
		}
		
		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
				// System.out.println(data[i][k]);
			}
		}
		return data;
	}
	
	public static void takeScreenshotAtEndofTest() throws IOException{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir+"/Screenshots/"+ System.currentTimeMillis( )+ ".png"));
	}
	
}
