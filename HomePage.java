package Pages;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Base.ProjectSpecificMthods;

public class HomePage extends ProjectSpecificMthods {
	
	
	 public HomePage(ChromeDriver driver) {
			
			this.driver=driver;
	    }

	public MyHomePage clickCRMSFA() {
		driver.findElementByLinkText("CRM/SFA").click();
		
		return new MyHomePage(driver);
	}

}
