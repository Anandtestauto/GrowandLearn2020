package ExcelData;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassEDP {

	public ChromeDriver driver;
	public String excelFilename;
	
	@Parameters({"Username","Password"})
	@BeforeMethod
	public void Login(String Username,String Password) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys(Username);
		driver.findElementById("password").sendKeys(Password);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
	}

    @AfterMethod
	public void closeBrowser()
	{
		driver.close();
    }
    
    
    

	@DataProvider(name = "fetchData")
	public String[][] sendData() throws IOException {

		return ReadExcelEDP.readexcelData(excelFilename);

	}

}
