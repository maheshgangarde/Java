package com.RW.Excel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataXLAS {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet1=workbook.createSheet("sheet1");
		Row R0= sheet1.createRow(0);
		Cell C0=R0.createCell(0);
		C0.setCellValue("CustomerID");
		Date Systime= new Date();
		String CurrentTime=Systime.toString().replace(" ", "_").replace(":","_");
		
		FileOutputStream FOS= new FileOutputStream("C:\\Users\\maheshg\\Desktop\\mahii\\selenium\\Selenium projects\\RWExcelFile\\src\\com\\test\\Data\\"+ CurrentTime +".xlsx");
		workbook.write(FOS);
		FOS.close();
		workbook.close();
	
		System.out.println("Excel Has been created");
		

	}

}
