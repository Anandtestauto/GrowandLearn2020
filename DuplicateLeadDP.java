package W5.D2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLeadDP extends BaseClassDP {

	@Test(dataProvider ="fetchData" )
	public  void runDuplicateLead(String phno) throws InterruptedException {
		
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys(phno);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.findElementByLinkText("Duplicate Lead").click();
		driver.findElementByName("submitButton").click();
		
}
	@DataProvider(name="fetchData")
	public String[][] sendData() {
		
		String[][] data=new String[2][1];
		
		data[0][0]="9";
		
		
		data[1][0]="9";
		
		
		return data;
		
	}
	
	
}






