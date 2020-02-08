package testcases;

import org.testng.annotations.Test;

import pages.Login;
import seleniumBase.ProjectSpecificMethods;

public class TC001_LoginPage extends ProjectSpecificMethods{
	@Test
	public void runLogin() throws InterruptedException {
		new Login().enterusername().enterpassword().clickLogin().verifytitle();
	}
	
   
    
}
