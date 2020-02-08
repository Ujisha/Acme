package seleniumBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethods {
	public static ChromeDriver driver;
	//@Parameters({"url","username","password"})
	
	@BeforeMethod
	
	  public void login() {
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://acme-test.uipath.com/account/login");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			
		  
	  }

	  //@AfterMethod
	  //public void afterMethod() {
		//  driver.close();
	  //}



	
	  
	
}
