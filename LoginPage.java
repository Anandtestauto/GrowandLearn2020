package Pages;

import org.openqa.selenium.chrome.ChromeDriver;

import Base.ProjectSpecificMthods;

public class LoginPage extends ProjectSpecificMthods  {
	
	
	 public LoginPage(ChromeDriver driver) {
			
			this.driver=driver;
	    }
	
	public LoginPage enterUsername() {
		driver.findElementById("username").sendKeys("demosalesmanager");
		
		return this;
	}
	
	
	public LoginPage enterPassword() {
		driver.findElementById("password").sendKeys("crmsfa");
		return this;
	}
	
	
	public HomePage clickLoginButton() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new HomePage(driver);
	}

}
