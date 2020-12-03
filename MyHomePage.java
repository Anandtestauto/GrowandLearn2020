package Pages;

import org.openqa.selenium.chrome.ChromeDriver;

import Base.ProjectSpecificMthods;

public class MyHomePage extends ProjectSpecificMthods {
	
	
	public MyHomePage(ChromeDriver driver) {
		
		this.driver=driver;
    }
	
	
	   public MyLeadsPage clickLeads() {
			driver.findElementByLinkText("Leads").click();
			
			return new MyLeadsPage(driver);
	   }

}
