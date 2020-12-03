package TestCase;

import org.testng.annotations.Test;

import Base.ProjectSpecificMthods;
import Pages.LoginPage;

public class LognLogout_TC_001 extends ProjectSpecificMthods {
	
	
	
	@Test
	public void loginLogout() {
	
	
	LoginPage lp=new LoginPage (driver);
			
			lp.enterUsername()
			  .enterPassword()
			  .clickLoginButton();
	
 
	}
	
}