package com.selenium.automation.keyword;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	@SuppressWarnings({ "rawtypes", "resource" })
	public XSSFSheet readsheet(String Filepath, String Filename, String Sheetname) throws IOException
	{
		System.out.println("I am Opening excel");
		File f = new File(Filepath+"\\"+Filename);
		FileInputStream fs = new FileInputStream(f);
		Workbook wb = null;
		wb = new XSSFWorkbook(fs);
		System.out.println("I Opened Excel");
		XSSFSheet s = (XSSFSheet) wb.getSheet(Sheetname);
		System.out.println("I Opened sheet");
		return s;		
	}

}
