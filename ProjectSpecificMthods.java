package Base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;


import io.github.bonigarcia.wdm.WebDriverManager;
import util.ReadExcelEDP;

public class ProjectSpecificMthods {
	
	
	public ChromeDriver driver;
	public String excelFilename;
	
	@BeforeMethod
	public void statApp() { 
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	
	
	@AfterMethod
	public void stopApp() {
		
		driver.close();
	}

	@DataProvider(name = "fetchData")
	public String[][] sendData() throws IOException {

		return ReadExcelEDP.readexcelData(excelFilename);

	}
	
	
}
