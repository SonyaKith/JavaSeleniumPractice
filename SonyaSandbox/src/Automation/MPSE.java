package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MPSE {

	public static void main(String[] args) {

		/*
		 * id - fastest name classname xpath linktext partial link text tagname
		 * css selector
		 * 
		 */

		/*
		 *
		 * MPSE LOGIN
		 * 
		 */

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.get("http://registration-stst.dhs.mn.gov/dhs-self-service/login");
		driver.findElement(By.id("userid")).sendKeys("sonya");
		driver.findElement(By.id("password")).sendKeys("Adelina02");
		driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div[1]/div/form/div[1]/div[2]/div[4]/button"))
				.click();
		System.out.println("Completed page: MPSE LOGIN");

		/*
		 * 
		 * PROVIDER PROFILES
		 * 
		 */

		driver.findElement(By.xpath(".//*[@id='command']/div[3]/a")).click();
		System.out.println("Completed page: PROVIDER PROFILES");

		/*
		 * 
		 * PROFILE TYPE
		 * 
		 */

		driver.findElement(By.xpath(".//*[@id='radios-1']")).click();
		driver.findElement(By.xpath(".//*[@id='saveAndContinueBtn']")).click();
		System.out.println("Completed page: PROFILE TYPE");

		/*
		 * 
		 * ORGANIZATION INFORMATION
		 * 
		 */

		driver.findElement(By.id("fein")).sendKeys("996520012");
		driver.findElement(By.id("legalName")).sendKeys("Fairview");
		WebElement entityType_dropdown = driver.findElement(By.id("entityType"));
		Select entityType = new Select(entityType_dropdown);
		entityType.selectByVisibleText("Non-Profit");
		driver.findElement(By.xpath(".//*[@id='saveAndContinueBtn']")).click();
		System.out.println("Completed page: ORGANIZATION INFORMATION");

		/*
		 * 
		 * FACILITY LOCATION & FACILITY LOCATION NAME/PHYSICAL ADDRESS
		 * 
		 */

		driver.findElement(By.xpath(".//*[@id='addFacilityLocationBtn']")).click();
		driver.findElement(By.id("practiceName")).sendKeys("Fairview Southdale");
		driver.findElement(By.id("referenceName")).sendKeys("FV SD");
		driver.findElement(By.id("phoneNumber")).sendKeys("6514314146");
		driver.findElement(By.id("eftVendorNumber")).sendKeys("1000552566520");
		driver.findElement(By.id("minnesotaTaxId")).sendKeys("5222256");
		driver.findElement(By.id("addressLine1")).sendKeys("1000 France Ave S");
		WebElement add2type_dropdown = driver.findElement(By.id("addressLine2Type"));
		Select add2type = new Select(add2type_dropdown);
		add2type.selectByVisibleText("Unit");
		driver.findElement(By.id("addressLine2")).sendKeys("100");
		driver.findElement(By.id("city")).sendKeys("Edina");
		WebElement state_dropdown = driver.findElement(By.id("state"));
		Select state = new Select(state_dropdown);
		state.selectByVisibleText("Minnesota");
		driver.findElement(By.id("zipCode")).sendKeys("55419");
		WebElement county_dropdown = driver.findElement(By.id("county"));
		Select county = new Select(county_dropdown);
		county.selectByVisibleText("Hennepin");
		driver.findElement(By.xpath(".//*[@id='saveAndContinueBtn']")).click();
		System.out.println("Completed page: FACILITY LOCATION & FACILITY LOCATION NAME/PHYSICAL ADDRESS");

		/*
		 * 
		 * ORGANIZATION MAILING ADDRESS & SELECT ADDRESS AS
		 * 
		 */

		driver.findElement(By.xpath(".//*[@id='addMailingAddressBtn']")).click();
		driver.findElement(By.id("attention")).sendKeys("Claims Dept");
		driver.findElement(By.id("addressLine1")).sendKeys("1000 France Ave S");
		WebElement add2type_dd = driver.findElement(By.id("addressLine2Type"));
		Select add2type_ma = new Select(add2type_dd);
		add2type_ma.selectByVisibleText("Unit");
		driver.findElement(By.id("addressLine2")).sendKeys("100");
		driver.findElement(By.id("city")).sendKeys("Edina");
		WebElement state_dd = driver.findElement(By.id("state"));
		Select state_ma = new Select(state_dd);
		state_ma.selectByVisibleText("Minnesota");
		driver.findElement(By.id("zipCode")).sendKeys("55419");
		driver.findElement(By.xpath(".//*[@id='saveAndContinueBtn']")).click();
		driver.findElement(By.id("reimbursementIndicator_0")).click();
		driver.findElement(By.xpath(".//*[@id='saveAndContinueBtn']")).click();
		System.out.println("Completed page: ORGANIZATION MAILING ADDRESS");

		/*
		 * 
		 * SERVICES & SERVICE DATES
		 * 
		 */

		driver.findElement(By.xpath(".//*[@id='addServiceBtn']")).click();
		driver.findElement(By.xpath(".//*[@id='NON_INDIVIDUALSID']")).click();
		driver.findElement(By.xpath(".//*[@id='HOSPITALSID']")).click();
		driver.findElement(By.xpath(".//*[@id='SPECIAL_HOSPITALID']")).click();
		driver.findElement(By.id("npi")).sendKeys("1528206364");
		driver.findElement(By.id("startDate")).sendKeys("02012017");
		driver.findElement(By.xpath(".//*[@id='saveAndContinueBtn']")).click();
		driver.findElement(By.xpath(".//*[@id='continueBtn']")).click();
		System.out.println("Completed page: SERVICES & SERVICE DATES");

		/*
		 * 
		 * SERVICE INFORMATION
		 * 
		 */

		driver.findElement(By.id("hospitalMedicareNumber")).sendKeys("9900255668855");
		driver.findElement(By.xpath(".//*[@id='radioYes']")).click();
		driver.findElement(By.id("bedCountEffectiveDate")).sendKeys("02/01/2017");
		driver.findElement(By.xpath("html/body/div[1]/div/div/div[3]/div[1]")).click();
		System.out.println("Completed page: SERVICE INFORMATION");

		/*
		 * 
		 * SECONDARY SERVICES
		 * 
		 */

		driver.findElement(By.xpath(".//*[@id='secondaryServicesListFormBean']/div[4]/div/div[1]/a")).click();

		// submit
		
		

	}

}
