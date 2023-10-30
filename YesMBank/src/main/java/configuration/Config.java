package configuration;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Config 
{
	public static String getPropVal(String propName) 
	{
	FileReader input=null;
	try
	{
		input = new FileReader("C:\\Users\\ashwi\\eclipse-workspace\\YesMBank\\src\\main\\java\\configuration\\Config.properties");
	}
	catch (FileNotFoundException e){
		e.printStackTrace();
	}


	Properties p =new Properties();
	
	try {
		p.load(input);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println(p.getProperty("username"));
	//no need of sysout just to practice
	return p.getProperty(propName);
	
}
}