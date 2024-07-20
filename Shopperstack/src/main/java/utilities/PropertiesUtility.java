package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * IT IS AN UTILITY METHOD TO READ THE DATA FROM 
 * 								PROPERTIES FILE DYNAMICALLY
 */

public class PropertiesUtility {
	
	public String readProperty(String key) throws IOException
	{
		//get the object of properties file
		FileInputStream fis=new FileInputStream
				("./testdata/commondata.properties");
		//create an object for properties class
		Properties prob=new Properties();
		//load the file
		prob.load(fis);
		//read the data
		String data = prob.getProperty(key);
		return data;
		}

}
