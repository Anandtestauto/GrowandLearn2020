package w2.d2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
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
		
		WebElement CreateLead = driver.findElementByLinkText("Create Lead");
		CreateLead.click();
		
		WebElement companyname = driver.findElementById("createLeadForm_companyName");
		companyname.sendKeys("Testleaf");
		
		WebElement fname = driver.findElementById("createLeadForm_firstName");
		fname.sendKeys("Darwin");
		
		WebElement lname = driver.findElementById("createLeadForm_lastName");
		lname.sendKeys("test");
		
		WebElement dropdown = driver.findElementById("createLeadForm_dataSourceId");
		Select s=new Select(dropdown);
		s.selectByValue("LEAD_COLDCALL");
		
		
		WebElement dropdown1 = driver.findElementById("createLeadForm_marketingCampaignId");
		Select s1=new Select(dropdown1);
		s1.selectByVisibleText("Automobile");
		
		WebElement Clbutton = driver.findElementByClassName("smallSubmit");
		Clbutton.click();
		
		Thread.sleep(5000);
		
		driver.close();
		

	}

}
