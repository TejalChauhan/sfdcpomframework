package com.SalesForce.utility;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public class commonUtilities {
	
	public static String getApp_Property(String key)
	{
		File file = new File(Constants.PROPERTIES_APPPATH);
		FileInputStream fs = null;
		try {
			fs = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties ps = new Properties();
		try {
			ps.load(fs);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = ps.getProperty(key);
		return value;
		
	}
	
	public static void setClipboardData(String string) {
		
		StringSelection stringSelect = new StringSelection(string);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelect, null);
			
	}

}
