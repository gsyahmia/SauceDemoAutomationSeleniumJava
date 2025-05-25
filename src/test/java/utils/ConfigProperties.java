package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigProperties {

	public static Properties property;
	private static String configPath = "Configuration/configsetting.properties";
	
	public static void initializePropertyFile() {
		property = new Properties();
		try {
			InputStream initstm = new FileInputStream(configPath);
			property.load(initstm);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
