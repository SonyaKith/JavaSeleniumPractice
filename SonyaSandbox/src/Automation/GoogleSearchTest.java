package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchTest {

	public static void main(String[] args) {
		
		// Create Firefox driver to drive the browser
		WebDriver driver = new FirefoxDriver();
		
		// Open Google homepage
		driver.get("http://www.google.com");
		
		// Find search field and search for atlas moth
		driver.findElement(By.id("lst-ib")).sendKeys("atlas moth");
		
		// Click on the search button
		driver.findElement(By.id("sfdiv")).click();
		
		// Find search button and click on it
		driver.findElement(By.linkText("5 Awesome Facts About the Atlas Moth | Mental Floss")).click();
		//driver.findElement(By.linkText(".//*[@id='lst-ib']")).click();
		//driver.findElement(By.xpath("//a[text()='Wikipedia']")).click();

	}

}
