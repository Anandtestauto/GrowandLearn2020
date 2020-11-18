package W5.D2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLeadDP extends BaseClassDP {

	@Test(dataProvider="fetchData")
	public void runCreateLead(String cname,String fname,String lname) {
		
		driver.findElementByLinkText("Create Lead12").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(cname);
		driver.findElementById("createLeadForm_firstName").sendKeys(fname);
		driver.findElementById("createLeadForm_lastName").sendKeys(lname);
		driver.findElementByName("submitButton").click();
		
}
	@DataProvider(name="fetchData")
	public String[][] sendData() {
		
		String[][] data=new String[2][3];
		
		data[0][0]="TestLeaf";
		data[0][1]="Gopi";
		data[0][2]="j";
		
		data[1][0]="TestLeaf";
		data[1][1]="Hari";
		data[1][2]="g";
		
		return data;
		
	}
	
}






