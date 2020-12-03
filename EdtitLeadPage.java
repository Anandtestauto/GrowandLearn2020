package Pages;

import org.openqa.selenium.chrome.ChromeDriver;

import Base.ProjectSpecificMthods;



public class EdtitLeadPage extends ProjectSpecificMthods {
	
	
	 public EdtitLeadPage(ChromeDriver driver) {
			
			this.driver=driver;
	    }
	
	
	 public EdtitLeadPage enterUcompanyname(String companyName){
		  driver.findElementById("updateLeadForm_companyName").sendKeys(companyName);
		  return this;
		}
		
		public ViewLeadPage clickSubmitButtoninEL() {
			driver.findElementByName("submitButton").click();
			return new ViewLeadPage(driver);
		}
	 

}
