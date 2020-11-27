package testng.day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnTestNGAssertion { 
	
	
	
	@Test
	public void createLead() {
		
		
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		SoftAssert sa=new SoftAssert();
		
		// Hard assert and soft assert
		
		//Hard assert will stop execution for the remaining test cases
		
		// soft assert will throw exception but execute remaining need to use assetAll() method in last
		
		boolean enabled = driver.findElementByClassName("decorativeSubmit").isEnabled();
		
		
		//Assert.assertTrue(enabled);
		
		//Assert.assertFalse(enabled);
		
		sa.assertFalse(enabled);
		
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		//Assert.assertEquals(title, "Leaftaps - TestLeaf Automation Platform");
		
		sa.assertEquals(title, "Leaftaps - TestLeaf Automation Platform");
		
		
		sa.assertAll();
		
		
		
		
	}

}
