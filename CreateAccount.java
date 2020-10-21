package w2.d2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Accounts").click();
		driver.findElementByLinkText("Create Account").click();
		driver.findElementById("accountName").sendKeys("Debit Limited Account11");
		driver.findElementByName("description").sendKeys("Selenium Automation Tester");
		driver.findElementById("groupNameLocal").sendKeys("tester4");
		driver.findElementById("officeSiteName").sendKeys("TESTLEAF");
		driver.findElementById("annualRevenue").sendKeys("100");
		
		WebElement ind = driver.findElementByName("industryEnumId"); 
		Select dp1=new Select(ind);
		dp1.selectByVisibleText("Computer Software");
		
		WebElement oship = driver.findElementByName("ownershipEnumId");
		Select dp2=new Select(oship);
		dp2.selectByVisibleText("S-Corporation");
		
		WebElement source = driver.findElementById("dataSourceId");
		Select dp3=new Select(source);
		dp3.selectByValue("LEAD_EMPLOYEE");
		
		WebElement mcid = driver.findElementById("marketingCampaignId");
		Select dp4=new Select(mcid);
		dp4.selectByIndex(5);
		
		
		WebElement state= driver.findElementById("generalStateProvinceGeoId");
		Select dp5=new Select(state);
		dp5.selectByValue("TX");
		
		driver.findElementByClassName("smallSubmit").click();
		
		
		

	}

}
