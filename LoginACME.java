package w2.d2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginACME {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		WebDriverManager.chromedriver().setup();
		
	
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://acme-test.uipath.com/login");
		
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		
		driver.findElementById("password").sendKeys("leaf@12");

		driver.findElementByXPath("/html/body/div/div[2]/div/div/div/form/button").click();
		
		String title = driver.getTitle();
		
		System.out.println("The title of the page is"+title);
		
		driver.findElementByXPath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[2]/a").click();
		
		try {
			driver.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
