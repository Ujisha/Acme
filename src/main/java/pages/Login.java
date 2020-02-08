package pages;

import org.openqa.selenium.Keys;

import seleniumBase.ProjectSpecificMethods;

public class Login extends ProjectSpecificMethods {
		
		
		public Login enterusername() {
			driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com",Keys.TAB);
		    return this;
		}

		
		public Login enterpassword() {
			driver.findElementById("password").sendKeys("leaf@12");
			return this;
		}

		public Dashboard clickLogin() {
			driver.findElementById("buttonLogin").click();
				return new Dashboard();
		}
			
		
		}
			
	


