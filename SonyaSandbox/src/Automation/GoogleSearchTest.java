package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchTest {

	public static void main(String[] args) {
		
		/*
		 * id - fastest
		 * name
		 * classname
		 * xpath
		 * linktext
		 * partial link text
		 * tagname
		 * css selector
		 * 
		 */
		
		// Create Firefox driver to drive the browser
		WebDriver driver = new FirefoxDriver();
		
		// Maximize the browser
		driver.manage().window().maximize();
		
		// Open Google homepage
		driver.get("http://www.google.com");
		
		// Find search field and search for atlas moth
		driver.findElement(By.id("lst-ib")).sendKeys("atlas moth");
		
		// Click on the search button
		driver.findElement(By.name("btnG")).click();
		
		//
		//driver.findElement(By.tagName("a")).click();
		driver.findElement(By.)(".//*[@id='rso']/div/div/div[2]/div/h3/a")).click();
	}

}
