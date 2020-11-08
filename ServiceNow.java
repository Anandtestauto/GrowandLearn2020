package w4.d2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		


		driver.get("https://dev68594.service-now.com/");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		
	    driver.switchTo().frame("gsft_main");
		
		driver.findElementByXPath("//input[@id='user_name']").sendKeys("admin");
		
		driver.findElementByXPath("//input[@id='user_password']").sendKeys("India@123");
		
		driver.findElementById("sysverb_login").click();
		
		driver.findElementById("filter").sendKeys("incident");
		
		//driver.findElementByXPath("//div[text()='All']").click();
		
		driver.findElementByXPath("//*[@id=\"b55b4ab0c0a80009007a9c0f03fb4da9\"]/div/div").click();
		
		//driver.findElementById("sysverb_new").click();
		
		driver.switchTo().frame("gsft_main");
		
		driver.findElementByXPath("//*[@id=\"sysverb_new\"]").click();
		
		driver.findElementById("sys_display.incident.caller_id").sendKeys("Allen Mahew");
		
		driver.findElementById("incident.short_description").sendKeys("Network issue");
		
		String incidentnumber = driver.findElementById("incident.number").getText();
		
		System.out.println("The incident number is"+incidentnumber);
		
		driver.findElementByClassName("for_action_button header  action_context btn btn-default").click();
		
		
		

		
		

	}

}
