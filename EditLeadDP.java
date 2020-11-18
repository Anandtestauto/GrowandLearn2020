package W5.D2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeadDP extends BaseClassDP {

	@Test(dataProvider = "efetchData")
	public void runEditLead(String phno,String cname) throws InterruptedException  {
		
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys(phno);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.findElementByLinkText("Edit").click();
		driver.findElementById("updateLeadForm_companyName").sendKeys(cname);
		driver.findElementByName("submitButton").click();
		
}
	@DataProvider(name="efetchData")
	public String[][] sendData() {
		
		String[][] edata=new String[2][2];
		
		edata[0][0]="9";
		edata[0][1]="TCS";
		
		
		edata[1][0]="9";
		edata[1][1]="CTS"; 
		
		return edata;
		
	}
	
}






