package Pages;

import org.openqa.selenium.chrome.ChromeDriver;

import Base.ProjectSpecificMthods;

public class CreateLeadPage extends ProjectSpecificMthods  {
	
	
	    public CreateLeadPage(ChromeDriver driver) {
			
			this.driver=driver;
	    }
 
	    
	    public CreateLeadPage enterCompanyName(String companyName) {
	    	driver.findElementById("createLeadForm_companyName").sendKeys(companyName);
	    	return this;
	    }
	    
	    public CreateLeadPage enterFirstName(String firstName) {
	    	driver.findElementById("createLeadForm_firstName").sendKeys(firstName);
	    	return this;
	    }
	    
	    public CreateLeadPage enterLastName(String lastName) {
	    	driver.findElementById("createLeadForm_lastName").sendKeys(lastName);
	    	return this;
	    }
	    
	    
	    public ViewLeadPage clickSubmit() {
	    	 driver.findElementByName("submitButton").click();
	    	return new ViewLeadPage(driver);
	    }
	   
	    
}
