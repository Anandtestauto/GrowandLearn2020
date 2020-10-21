package w2.d2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchAppli {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		//WebDriverManager.chromedriver().setup();
		
		WebDriverManager.firefoxdriver().setup();
		
		//ChromeDriver driver = new ChromeDriver();
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);

		driver.close();
		
	}
}
