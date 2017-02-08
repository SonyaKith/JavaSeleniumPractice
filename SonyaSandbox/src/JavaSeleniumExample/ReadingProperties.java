package JavaSeleniumExample;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

	public static void main(String[] args) throws IOException {
		
		String path = "H:\\git\\JavaPractice\\SonyaSandbox\\src\\JavaSeleniumExample\\test.properties"; // Need double slash for Windows path

		Properties prop = new Properties();
		FileInputStream fs = new FileInputStream(path);
		
		prop.load(fs);
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("course"));

	}

}
