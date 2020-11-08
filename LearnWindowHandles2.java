package w4.d2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowHandles2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Window.html");
		
		
		
//		driver.findElementByXPath("//button[text()='Open Multiple Windows']").click();
//		
//		Set<String> windowHandles1 = driver.getWindowHandles();
//		
//		for (String wind : windowHandles1) {
//			System.out.println(wind);
//		}
//		
//		List<String>  first=new ArrayList<String>(windowHandles1);
//		
//		int size = first.size();
//		
//		System.out.println("The number of Windows are "+size);
//		
//		String secondw = first.get(1);
//		
//		driver.switchTo().window(secondw);
//		
//		System.out.println(driver.getTitle());
//	   
//		driver.close();
//		
//		String thirdw = first.get(2);
//		
//		driver.switchTo().window(thirdw);
//		
//		System.out.println(driver.getTitle());
//		
//		driver.close();
		
		
		driver.findElementByXPath("//button[text()='Wait for 5 seconds']").click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> wlist=new ArrayList<String>(windowHandles);
		
		String firstw = wlist.get(1);
		
		driver.switchTo().window(firstw);
		
		System.out.println(driver.getTitle());
		
		String secondw = wlist.get(2);
		
		driver.switchTo().window(secondw);
		
		System.out.println(driver.getTitle());
		
		driver.quit();

	}

}
