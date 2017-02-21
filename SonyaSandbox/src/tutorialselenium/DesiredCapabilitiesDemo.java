package tutorialselenium;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesDemo {

	public static void main(String[] args) {
		
		WebDriver driver;
		DesiredCapabilities caps = DesiredCapabilities.firefox();
		
		caps.setBrowserName("firefox");
		caps.setPlatform(Platform.WINDOWS);
		
		driver = new FirefoxDriver(caps);
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
	}

}
