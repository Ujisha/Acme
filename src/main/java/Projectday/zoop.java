package Projectday;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class zoop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.zoomcar.com/chennai");
		
		driver.findElementByLinkText("Start your wonderful journey").click();
		driver.findElementByXPath("//div[contains(text(),'Thuraipakkam')]").click();
		driver.findElementByXPath("//button[contains(text(),'Next')]").click();
		
		Date date = new Date(); // Get the current date
		DateFormat sdf = new SimpleDateFormat("dd"); //Get only the date (and not month, year, time etc)
		String today = sdf.format(date); // Get today's date
		int tomorrow = Integer.parseInt(today)+1; // Convert to integer and add 1 to it
		System.out.println(tomorrow); // Print tomorrow's date
		
		driver.findElementByXPath("//div[contains(text(),'"+tomorrow+"')]").click();
		driver.findElementByXPath("//button[contains(text(),'Next')]").click();
		driver.findElementByXPath("//button[contains(text(),'Done')]").click();
		
		int noOfCarsAvailable = driver.findElementsByXPath("//button[contains(text(),'BOOK NOW')]").size();
		System.out.println("No of cars Available: "+noOfCarsAvailable);
		
		List<WebElement> elements = driver.findElementsByXPath("//sup[contains(text(),'₹')]/..");
		Set<Integer> price = new HashSet<Integer>();
		
		for (WebElement element : elements) {
			String price1 = element.getText();
			String removingUnwantedChars = price1.replaceAll(",","").replaceAll("₹", "").replaceAll(" ", "");
			System.out.println("removingComma "+removingUnwantedChars);
			int temp =Integer.parseInt(removingUnwantedChars); 
			price.add(temp);
		}
		
		System.out.println("All Prices: "+price);
		
		int maxPrice = Collections.max(price);
		System.out.println("Highest Price: "+maxPrice);
		String priceWithComma = NumberFormat.getIntegerInstance().format(maxPrice);
		System.out.println("After adding comma: "+priceWithComma);
		
		driver.findElementByXPath("//div[contains(text(),'"+priceWithComma+"')]/following-sibling::button").click();
		                      
		


	}

}
