package ExcelData;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLeadEDP extends BaseClassEDP {
	
	@BeforeTest
	public void setFile() {
		excelFilename="CreateLead";
	}

	@Test(dataProvider = "fetchData")
	public void runCreateLead(String cname, String fname, String lname) {

		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(cname);
		driver.findElementById("createLeadForm_firstName").sendKeys(fname);
		driver.findElementById("createLeadForm_lastName").sendKeys(lname);
		driver.findElementByName("submitButton").click();

	}



}
