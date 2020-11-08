package w4.d2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		
		// frame by index

//		driver.get("http://www.leafground.com/pages/frame.html");
//		
//		driver.switchTo().frame(0);
//		
//		driver.findElementByXPath("//button[text()='Click Me']").click();
		
//		  // frame by id or name
//		driver.get("https://dev68594.service-now.com/");
//		
//		driver.switchTo().frame("gsft_main");
//		
//		driver.findElementById("user_name").sendKeys("admin");
//		
//		driver.findElementById("user_password").sendKeys("India@123");
		
		
		
		//nested frame
		
		
		driver.get("http://www.leafground.com/pages/frame.html");
		
		driver.switchTo().frame(1);
		
		driver.switchTo().frame(0);
		
		driver.findElementById("Click1").click();
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().defaultContent();
		
		driver.get("http://www.leafground.com/pages/frame.html");
		
		driver.switchTo().frame(0);
		
		driver.findElementByXPath("//button[text()='Click Me']").click();
		
		
		// count no of frames
		
		
//		int count=0;
//		
//		driver.switchTo().frame(index)

		
		
		
		
		
		
	}

}
