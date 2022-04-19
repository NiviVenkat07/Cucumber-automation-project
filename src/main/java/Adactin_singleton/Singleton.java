package Adactin_singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Singleton {	
	
	public static Properties p;   // -----null 
	
  public String get_config_url() throws IOException {
	

	File f = new File ("C:\\Users\\Admin\\eclipse-workspace\\Cucumber_project\\Property.files\\Adactin.property_file");
	
	FileInputStream fis = new FileInputStream(f);
	
	    p = new Properties();
	
     	p.load(fis);
	
	String value = p.getProperty("url");
	
	return value;
	
	
	
	
	
	
	
	
	
  }	
	
}
