package Pages;

import org.openqa.selenium.chrome.ChromeDriver;

import Base.ProjectSpecificMthods;

public class MyLeadsPage extends ProjectSpecificMthods {
	
	

	public MyLeadsPage(ChromeDriver driver) {
		
		this.driver=driver;
    }
	
	
	
	public CreateLeadPage clickCreateLead() {
    	driver.findElementByLinkText("Create Lead").click();
    	return new CreateLeadPage(driver);
    }
	
	
	public FindLeadsPage clickFindLeads() {
		driver.findElementByLinkText("Find Leads").click();
		return new FindLeadsPage(driver);
	}

}
