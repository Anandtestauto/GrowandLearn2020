package Pages;

import org.openqa.selenium.chrome.ChromeDriver;

import Base.ProjectSpecificMthods;


public class FindLeadsPage extends ProjectSpecificMthods {
	
	public FindLeadsPage(ChromeDriver driver) {
    	this.driver=driver; 
	} 	
    	
	public FindLeadsPage clickonPhonetab() {
		driver.findElementByXPath("//span[text()='Phone']").click();
		return this;
		}
	
	public FindLeadsPage enterPhoneNumber(String phoneNumber) {
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys(phoneNumber);
		return this;
	}

	public FindLeadsPage clickFindLeads() throws InterruptedException {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		return this;
	}

	public ViewLeadPage clickonFirstLeadnGrid(){
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		return new ViewLeadPage(driver);
	} 

}
 

