package Pages;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Base.ProjectSpecificMthods;


public class ViewLeadPage extends ProjectSpecificMthods {
 
    
	public ViewLeadPage(ChromeDriver driver) {
		
		this.driver=driver;
    	
    }
	
	public void verifyViewLead() {
		
		System.out.println("createLead verified successfully");
	}
	
	public EdtitLeadPage clickEditButton() {
		driver.findElementByLinkText("Edit").click();
		return new EdtitLeadPage(driver);
	}
	
}
