package com.utilities;

import java.awt.RenderingHints.Key;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesUtils {
	
	
	
	public static Properties prop=null;
	public static FileInputStream fis = null;
	
	public static String readproperty (String key) throws Exception {
		prop= new Properties();
		fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/config.properties");
		prop.load(fis);
		return prop.getProperty(key);
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println(readproperty("browser"));
		//System.out.println(System.getProperty("user.dir")+"/src/main/resources/config.properties");
	}

	

}
