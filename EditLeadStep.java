package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EditLeadStep extends BaseClass{
	
	@Then("click on Find Leads")
	public void clickOnFindLeads() {
		driver.findElementByLinkText("Find Leads").click();
	}

	@When("click on phno tab")
	public void clickOnPhnoTab() {
		driver.findElementByXPath("//span[text()='Phone']").click();
	}

	@Then("Enter phno as (.*)")
	public void enterPhnoAsPhno(String PHNO) {
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys(PHNO);
	}

	@When("Click on FindLeads BUTTON")
	public void clickOnFindLeadsBUTTON() throws InterruptedException {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(4000);
	}

	@Then("click on First Element")
	public void clickOnFirstElement() {
		
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
	}

	@When("Click on Edit Button")
	public void clickOnEditButton() {
		driver.findElementByLinkText("Edit").click();
		
	}
	
	@Then("Enter company name as (.*)")
	public void enterCompanyName(String Company) {
		driver.findElementById("updateLeadForm_companyName").sendKeys(Company);
		
	}
	
	

	@When("Click on Submit button")
	public void clickOnSubmitButton() {
	
		driver.findElementByName("submitButton").click();
	}

	@Then("get the title")
	public void getTheTitle() {
		 String title4 = driver.getTitle();
		   System.out.println(title4);
	}


}
