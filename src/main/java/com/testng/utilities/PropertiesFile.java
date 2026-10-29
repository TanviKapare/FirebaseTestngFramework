package com.testng.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {

	FileInputStream fileinput;
	String value;
	
	public String getProperties(String key)
	{
		//1.File path
		String filepath ="properties\\application.properties";
		
		//2.Create a fileinput stream
		try {
				fileinput = new FileInputStream(filepath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//3.Create Properties file object and load that object with file input 
		Properties prop = new Properties();
		try {
			prop.load(fileinput);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 value= (String)prop.get(key);
		return value;
	}
}
