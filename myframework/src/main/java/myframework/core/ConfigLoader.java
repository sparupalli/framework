package myframework.core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigLoader {

	private static Properties props = new Properties();
	
	public static Properties loadGlobalProperties() {		
		try {
			FileInputStream fis = new FileInputStream("framework.properties");			
			try {
				props.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		}
		return props;
		
	}
	
}
