package com.selenium.automation.keyword;
import com.selenium.automation.keyword.*;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteTest {
	
	@Test
	public void testlogin() throws Exception 	
	{
		try
		{
		WebDriver driver = new ChromeDriver();
		ReadExcel re = new ReadExcel();
		Readproperty rp = new Readproperty();
		UIOperation ui = new UIOperation(driver);
		
		XSSFSheet testcasesheet = (XSSFSheet) re.readsheet("C:\\Users\\Jayanthi Sharma\\workspace-old\\keyword\\src\\test\\java\\com\\selenium\\automation\\keyword", "keyword.xlsx", "keyword");
		
		int rowcount = testcasesheet.getLastRowNum()-testcasesheet.getFirstRowNum();
		System.out.println(rowcount);
		for(int i=2; i<=rowcount;i++)
		{
			Row row = testcasesheet.getRow(i);
			
	/*		if(row.getCell(0).toString().length()==0)
			{
				 System.out.println("New Testcase->"+row.getCell(0).toString() +" Started");
				
			}
			else
			{*/
				ui.perform(rp.getObject(),row.getCell(1).toString(), row.getCell(2).toString(),
		                row.getCell(3).toString(), row.getCell(4).toString());
		//	}
		}
		}
		catch(NullPointerException e)
		{
			System.out.println("Sorry");
		}
			
		
				
		
		
		
	}
	

}
