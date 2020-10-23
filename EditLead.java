package w2.d2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		

		
		WebElement username = driver.findElementById("username");
		username.sendKeys("demosalesmanager");
		
		WebElement password = driver.findElementById("password");
		password.sendKeys("crmsfa");
		
		WebElement Login = driver.findElementByClassName("decorativeSubmit");
		Login.click();
		
		WebElement crmsfa = driver.findElementByLinkText("CRM/SFA");
		crmsfa.click();
		
		WebElement Leads = driver.findElementByLinkText("Leads");
		Leads.click();
		
		WebElement FindLeads = driver.findElementByLinkText("Find Leads");
		FindLeads.click();
		
		WebElement  flfname= driver.findElementByXPath("//div[@id='x-form-el-ext-gen248']/input");
		flfname.sendKeys("Darwin");
		
		WebElement  FindLeadsbtn= driver.findElementByXPath("//button[text()='Find Leads']");
		FindLeadsbtn.click();
		
		WebElement c = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		c.click();
		
		String title = driver.getTitle();
		System.out.println("The title of the page is ="+title);
		
		if(title.contains("View")) {
			System.out.println("Rights page");
		}
		else {
			System.out.println("Wrong page");
		}
		
		driver.findElementByLinkText("Edit").click();
		driver.findElementByName("companyName").sendKeys("Testleaf1");
		driver.findElementByClassName("smallSubmit").click();
		String edcom = driver.findElementById("viewLead_companyName_sp").getText();
		
		if(edcom.contains("Testleaf1")) {
			System.out.println("Updated");
		}
		else {
			System.out.println("Not Updated");
		}
		
		driver.close();
		
		

	}

}
