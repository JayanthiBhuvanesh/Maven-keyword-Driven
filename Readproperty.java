package com.selenium.automation.keyword;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Readproperty {

	Properties p = new Properties();
	
	public Properties getObject() throws IOException
	{
		FileInputStream fi = new FileInputStream("C:\\Users\\Jayanthi Sharma\\workspace-old\\keyword\\src\\test\\java\\com\\selenium\\automation\\keyword\\credentials.properties");
		p.load(fi);
		return p;
	}
}
