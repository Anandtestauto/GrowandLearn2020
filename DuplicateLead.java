package w2.d1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.findElementById("username").sendKeys("demosalesmanager");

		driver.findElementById("password").sendKeys("crmsfa");

		driver.findElementByClassName("decorativeSubmit").click();

		driver.findElementByLinkText("CRM/SFA").click();

		driver.findElementByLinkText("Leads").click();

		driver.findElementByLinkText("Find Leads").click();

		driver.findElementByXPath("//span[text()='Email']").click();

		driver.findElementByXPath("//input[@id='ext-gen282' and @name='emailAddress']").sendKeys("hema_77@gmail.com");

		driver.findElementByXPath("//button[@id='ext-gen334']").click();

		Thread.sleep(5000);

		WebElement capEmail = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");

		Thread.sleep(2000);
		String Emailtext = capEmail.getText();

		System.out.println("Captured email is" + Emailtext);

		capEmail.click();
		
		WebElement Orgfn = driver.findElementById("viewLead_firstName_sp");
		
		String Orgfn1 = Orgfn.getText();
		
		System.out.println("The original name= "+Orgfn1);
		
		Thread.sleep(3000);

		driver.findElementByXPath("//a[@class='subMenuButton']").click();

		Thread.sleep(3000);
		


		String title = driver.getTitle();

		if (title.contentEquals("Duplicate Lead | opentaps CRM")) {
			System.out.println("Right page");
		} else {
			System.out.println("Wrong page");
		}

		
		//
		driver.findElementByXPath("//input[@class='smallSubmit' and @name='submitButton']").click();
		
		
		



//		if (text.equals(Emailtext)) {
//
//			System.out.println("Duplicated lead first name is same as captured name");
//		} else {
//			System.out.println("Duplicated lead first name is not same as captured name");
//		}

		driver.close();

	}

}
