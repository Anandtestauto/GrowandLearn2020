package steps;

import cucumber.api.java.en.Then;

public class DeleteLeadStep extends BaseClass {
	
	String text;
	
	@Then("Get the leadid")
	public void getTheLeadid() {
		String leadID = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
	}

	@Then("Click on Delete Button")
	public void clickOnDeleteButton() {
		driver.findElementByLinkText("Delete").click();
	}

	@Then("supply the leadid")
	public void supplyTheLeadid(String leadID) {
		driver.findElementByXPath("//input[@name='id']").sendKeys(leadID);
	}

	@Then("Get the message")
	public void getTheMessage() {
		text = driver.findElementByClassName("x-paging-info").getText();
	}

	@Then("confirm the message")
	public void confirmTheMessage() {
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
	}


}
