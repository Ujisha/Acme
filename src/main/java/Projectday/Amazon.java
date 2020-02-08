package Projectday;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main (String[] args) throws InterruptedException {
		//Launch the chrome browser
		
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				
				ChromeDriver driver =new ChromeDriver();
				
		// get the url				
				driver.get("https://www.amazon.in");		
				
		// To maximize the browser window
				driver.manage().window().maximize();		
		//Type oneplus 7 pro mobile and click Search
				driver.findElementById("twotabsearchtextbox").sendKeys("oneplus 7 pro mobiles");
				driver.findElementByXPath("//input[@type='submit']").click();
	   // Print the price of the first resulting mobile
				
		String text = driver.findElementByXPath("//span[@class='a-price-whole']").getText();
		System.out.println(text);
		Thread.sleep(2000);
		
		driver.findElementByXPath("(//img[@class='s-image'])[1]").click();
		
		Set<String> allWindows = driver.getWindowHandles();
		for (String window : allWindows) {
			driver.switchTo().window(window);
		}
		
		System.out.println("No of customer rating: "+driver.findElementById("acrCustomerReviewText").getText());
		
		driver.findElementById("add-to-cart-button").click();
		driver.findElementByPartialLinkText("Proceed to Buy (1 item)").click();
		
		if((driver.getTitle()).equalsIgnoreCase("amazon sign in"))
		{
			System.out.println("Title Matches!");
		}else {
			System.out.println("Title Mismatches!");
		}
		
		driver.findElementById("continue").click();
		
		if((driver.findElementByXPath("//div[contains(text(),'Enter your email or mobile phone number')]").getText()).equalsIgnoreCase("Enter your email or mobile phone number")){
			System.out.println("Error message is displayed!");
		}else {
			System.out.println("Error message is not displayed!");
		}
		
	}


		
			
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				

	}


