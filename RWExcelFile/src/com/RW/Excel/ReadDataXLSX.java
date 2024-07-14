package com.RW.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataXLSX {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream FIS= new FileInputStream("C:\\Users\\maheshg\\Desktop\\mahii\\selenium\\Selenium projects\\RWExcelFile\\src\\com\\test\\Data\\Sun_May_26_21_39_45_IST_2024.xlsx");
		Workbook wb= WorkbookFactory.create(FIS);
		Sheet sheet0=wb.getSheetAt(0);
		Row row0= sheet0.getRow(0);
		Cell cell0= row0.getCell(0);
		System.out.println(cell0);
		
		

	}

}
