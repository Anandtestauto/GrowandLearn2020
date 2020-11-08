package w4.d2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		// implicit wait will apply to all steps below the wait is mentioned and if element loaded 
		//in 5 sec it will pass the values and proceed
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementById("username123").sendKeys("demosalesmanager");
		
		driver.findElementById("password").sendKeys("crmsfa");
	
		
		
		
		
		
		
		

	}

}
