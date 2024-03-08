package com_st_util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exceldataforA2Asingle {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		 File excelfile =new File( "C:\\Users\\devendra.singh1\\eclipse-workspace\\Spicetag_FrameWorkV1\\src\\main\\java\\com_st_testdata\\A2ABookingSingleRoute.xlsx");
		 FileInputStream fis = new FileInputStream(excelfile);
		 XSSFWorkbook workbook = new XSSFWorkbook(fis);
		 XSSFSheet sheet = workbook.getSheet("A2ABookingSingleRoute");
		 int noofRows = sheet.getPhysicalNumberOfRows();
		 int noofColumns = sheet.getRow(0).getLastCellNum();
		 
		 String[][] data = new String[noofRows-1][noofColumns];
		 for(int i = 1;i<noofRows;i++){
			 for(int j=0 ; j < noofColumns;j++)
			 {
				 DataFormatter df = new DataFormatter();
				 data[i][j] = df.formatCellValue(sheet.getRow(i).getCell(j));
			 }	 
		 }
		 
		System.out.println(Arrays.toString(data));
	  }


	}


