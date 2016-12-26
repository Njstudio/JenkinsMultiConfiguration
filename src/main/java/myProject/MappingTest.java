package myProject;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class MappingTest {
	Properties properties; 
	public MappingTest(String FilePath) {

		try {
			FileInputStream Locator = new FileInputStream(FilePath);
			properties = new Properties();
			properties.load(Locator);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public String getData(String ElementName) throws Exception {
		// Read value using the logical name as Key
		String data = System.getProperty("ElementName");
				//String data=	properties.getProperty(ElementName);
		return data;
	}
}