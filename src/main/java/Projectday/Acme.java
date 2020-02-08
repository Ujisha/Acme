package Projectday;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Acme {

	public static void main(String[] args) throws InterruptedException {
		
//Launch the chrome browser
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		ChromeDriver driver =new ChromeDriver();
		
// get the url				
		driver.get("https://acme-test.uipath.com/account/login");		
		
// To maximize the browser window
		driver.manage().window().maximize();		
		
// Enter the valid email to login	
		
	driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com",Keys.TAB);
		
// Enter the valid password to login	
		
	driver.findElementById("password").sendKeys("leaf@12");
		
// Click Login
	
	driver.findElementById("buttonLogin").click();
	
	Thread.sleep(2000);
//Mouse over on Vendors
	WebElement evendor = driver.findElementByXPath("(//button[@class='btn btn-default btn-lg'])[4]");
	
	Actions builder =new Actions(driver);
	builder.moveToElement(evendor).pause(2000).click(driver.findElementByXPath("//a[text()='Search for Vendor']"))
	.perform();
	
//Enter the Vendor Name(Blue Lagoon)
	driver.findElementById("vendorName").sendKeys("Blue Lagoon");
	
// Click on Search
	
	driver.findElementById("buttonSearch").click();
	
//Find the country name based on vendor
	
			String text = driver.findElementByXPath("(//td)[5]").getText();
			
			if (text.contains("France")) {
				System.out.println(text);
			}
			else {
				System.out.println("Please check");
			}
//Click Logout	
			driver.findElementByXPath("//a[text()='Log Out']").click();
			
	//close
			driver.close();
			
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
