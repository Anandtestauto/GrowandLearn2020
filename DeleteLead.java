package w2.d1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
		driver.findElementByXPath("//span[text()='Phone']").click();
		
		driver.findElementByXPath("//input[@id='ext-gen270' and @name='phoneNumber']").sendKeys("99");
		
		driver.findElementByTagName("//button[@class='x-btn-text' and @id='ext-gen334']").click();
		
		String edphone = driver.findElementByLinkText("12413").getText();
		
		driver.findElementByLinkText("12413").click();
		
		driver.findElementByClassName("subMenuButtonDangerous").click();
		
		driver.findElementByLinkText("Find Leads").click();
		
		driver.findElementByXPath("//div[@id='x-form-el-ext-gen246']/input").sendKeys(edphone);
		

		
		

	}

}
