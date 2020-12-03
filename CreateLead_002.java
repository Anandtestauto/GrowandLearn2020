package TestCase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.ProjectSpecificMthods;
import Pages.LoginPage;

public class CreateLead_002 extends ProjectSpecificMthods {
	
	
	@BeforeTest
	public void setFile() {
		excelFilename="CreateLead";
	}

	@Test(dataProvider = "fetchData")
	public void  runCreateLead(String fname,String lname,String cname ) {
		
		new LoginPage(driver)
		.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.enterFirstName(fname)
		.enterLastName(lname)
		.enterCompanyName(cname)
		.clickSubmit()
		.verifyViewLead();
		
		
	}

	
} 
