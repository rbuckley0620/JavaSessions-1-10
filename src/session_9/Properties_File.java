package session_9;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties_File {

	public static void main(String[] args) throws IOException   {
//File Import
	
	String path = "C:\\Users\\rbuck\\eclipse-workspace\\MyJavaProject\\src\\data\\abc.properties";
	File f = new File(path);
	FileInputStream fi = new FileInputStream(f);

	
// Properties File 
	Properties prop = new Properties();
	prop.load(fi);
	
	prop.get("address"); 
	System.out.println(prop.get("address"));
	System.out.println(prop.get("birthday"));

	}

}
