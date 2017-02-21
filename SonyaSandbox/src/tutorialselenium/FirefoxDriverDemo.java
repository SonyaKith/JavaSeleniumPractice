package tutorialselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "S:\\Sonya\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String baseURL = "http://www.google.com";
		
		driver.get(baseURL);
		
	}

}
