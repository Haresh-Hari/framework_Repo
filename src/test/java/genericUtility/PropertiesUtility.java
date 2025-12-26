package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtility {
	/**
	 * this is generic method to fetch data from properties file
	 * @param key
	 * @return
	 * @throws IOException
	 */
public String getDataFromProperties(String key) throws IOException {
	FileInputStream fis = new FileInputStream("C:\\Users\\Mohana\\Desktop\\TestData.properties");
	Properties prop = new Properties();
			prop.load(fis);
			String value = prop.getProperty(key);
	return value;
}
}
