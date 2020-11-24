package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLeadStep extends BaseClass  {
	
	


	@When("click on CRM\\/SFA link")
	public void clickonCRM_SFAlink() {
		driver.findElementByLinkText("CRM/SFA").click();
	}

	@Then("My Home page should be displayed")
	public void myHomepagedisplayed() {
		String title2 = driver.getTitle();
		   System.out.println(title2);
	}

	@When("click on Lead page")
	public void clickonLeadpage() {
		
		driver.findElementByLinkText("Leads").click();
	}

	@Then("create lead page should be displayed")
	public void createLeadpage() {
		driver.findElementByLinkText("Create Lead").click();
	}

	@And("Enter company name (.*)")
	public void enterCompanyname(String Cname) {
		driver.findElementById("createLeadForm_companyName").sendKeys(Cname);
		
	}

	@Given("Enter first name as (.*)")
	public void enterfirstname(String Fname) {
		driver.findElementById("createLeadForm_firstName").sendKeys(Fname);
		
	}

	@Given("Enter Last name as (.*)")
	public void enterLastname(String Lname) {
		driver.findElementById("createLeadForm_lastName").sendKeys(Lname);
		
	}

	@When("click on submit button")
	public void clickonsubmitbutton() {
		
		driver.findElementByName("submitButton").click();
	}

	@Then("Created Lead page should be displayed")
	public void createdLeadpage() {
	   String title = driver.getTitle();
	   System.out.println(title);
	}

	


}
