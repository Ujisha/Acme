package pages;

import org.openqa.selenium.Keys;

import seleniumBase.ProjectSpecificMethods;

public class Dashboard extends ProjectSpecificMethods {
	
		public Dashboard verifytitle () throws InterruptedException {
			Thread.sleep(3000);
			String text =driver.getTitle();
			System.out.println(text);
		
	     
	     //Pass
	     //System.out.println("Page title contains \"Dashboard\" ");
	    //	else
	     //Fail
	    //System.out.println("Page title doesn't contains \"Dashboard\" ");
		
        return this;
		
		}

}
