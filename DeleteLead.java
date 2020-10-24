package w2.d1;

import java.sql.DriverManager;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

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
		
		Thread.sleep(3000);

		driver.findElementByXPath("//button[@class='x-btn-text' and @id='ext-gen334']").click();
		
		Thread.sleep(8000);

		WebElement Gridfirst = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");

		String Gridfirstname = Gridfirst.getText();
		
		System.out.println("The lead id is"+Gridfirstname);
		
		Gridfirst.click();
		
		Thread.sleep(5000);

		driver.findElementByClassName("subMenuButtonDangerous").click();
		
		Thread.sleep(3000);

		driver.findElementByLinkText("Find Leads").click();
		
		Thread.sleep(3000);

		driver.findElementByXPath("//div[@id='x-form-el-ext-gen246']/input").sendKeys(Gridfirstname);

		Thread.sleep(2000);
		
		driver.findElementByXPath("//button[@class='x-btn-text' and @id='ext-gen334']").click();
		
		Thread.sleep(5000);
		
		WebElement GridText = driver.findElementByXPath("//div[text()='No records to display']");
		
		String text = GridText.getText();
		
		if(text.contentEquals("No records to display")) {
			System.out.println("Record delete is success");
		}
		else {
			System.out.println("Record delete is not success");
		}
		
		driver.close();
		
	}

}
