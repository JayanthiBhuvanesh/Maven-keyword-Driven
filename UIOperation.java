package com.selenium.automation.keyword;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class UIOperation {
	WebDriver driver;
	
	public UIOperation(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void perform(Properties p, String Operation, String ObjectName, String ObjectType, String Value) throws Exception
	{
		switch(Operation.toUpperCase())
		{
		case "GOTOURL":
			driver.get(p.getProperty("url"));
			break;
		case "TYPEUNAME":
			driver.findElement(this.getObject(p, ObjectName, ObjectType)).sendKeys(Value);
			break;
		case "TYPEPWD":
			driver.findElement(this.getObject(p, ObjectName, ObjectType)).sendKeys(Value);
			break;
		case "CLICK" :
			driver.findElement(this.getObject(p, ObjectName, ObjectType)).click();
			break;				
		
		}
		
	}
	private By getObject(Properties p, String ObjectName, String ObjectType) throws Exception
	{
		if(ObjectType.equals("NAME"))
		{
			return By.name(p.getProperty(ObjectName));
		}
		else if (ObjectType.equals("ID"))
		{
			return By.id(p.getProperty(ObjectName));
		}
		else
		{
			 throw new Exception("Wrong object type");
		}
	}
	
	

}
