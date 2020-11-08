package w4.d2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public final class MergeLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();

		driver.findElementById("username").sendKeys("demosalesmanager");

		driver.findElementById("password").sendKeys("crmsfa");

		driver.findElementByClassName("decorativeSubmit").click();
		

		driver.findElementByLinkText("CRM/SFA").click();
		

		driver.findElementByLinkText("Leads").click();
		
		
		driver.findElementByLinkText("Merge Leads").click();
		
		driver.findElementByXPath("//img[@alt='Lookup']").click();
		
		Set<String> windowHandles1 = driver.getWindowHandles();
		
		List<String>  listwind1=new ArrayList<String>(windowHandles1);
		
		String fromw = listwind1.get(1);
		
		driver.switchTo().window(fromw);
		
		driver.findElementByXPath("//input[@name='id']").sendKeys("10036");
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		Thread.sleep(2000);
		
		String leadid1 = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();

		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		
		driver.switchTo().window(listwind1.get(0));
		
		// second window look up
		
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		
		Set<String> windowHandles2 = driver.getWindowHandles();
		
		List<String>  listwind2=new ArrayList<String>(windowHandles2);
		
		String tow = listwind2.get(1);
		
		driver.switchTo().window(tow);
		
		driver.findElementByXPath("//input[@name='id']").sendKeys("10124");
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		Thread.sleep(2000);
		
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		
		driver.switchTo().window(listwind1.get(0));
		
		driver.findElementByXPath("//a[text()='Merge']").click();
		
		driver.switchTo().alert().accept();
		
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//input[@name='id']").sendKeys(leadid1);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		String text = driver.findElementByClassName("x-paging-info").getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
		driver.close();
		
		
		
		
		
		
		
	}

}
