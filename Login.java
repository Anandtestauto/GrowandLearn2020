package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login extends BaseClass {
	
	
	
//	@Given("launch the chrome browser")
//	public void launchTheChromeBrowser() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		
//	   
//	}
//
//	@Given("Load application URL")
//	public void loadApplicationURL() {
//		driver.get("http://leaftaps.com/opentaps/");
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		
//	}

	@Given("Enter username as (.*)")
	public void enterUsernameAsDemosalesmanager(String uname) {
		driver.findElementById("username").sendKeys(uname);
	

	}

	@Given("Enter password as (.*)")
	public void enterPasswordAsCrmsfa(String Pass) {
		driver.findElementById("password").sendKeys(Pass);
		
 


	}

	@When("Click on Login button")
	public void onClickOnLoginButton() {
		driver.findElementByClassName("decorativeSubmit").click();

	}

	@Then("Homepage should be displayed")
	public void homepageShouldBeDisplayed() {

       System.out.println("Home page should be displayed");
	}

	
	@But("Error page should be displayed")
	public void errorPageDisplayed() {
		System.out.println("Error page should be displayed");
		driver.close();
	}

}
