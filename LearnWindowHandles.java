package w4.d2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		
		
//	driver.get("https://www.irctc.co.in/nget/train-search");
//		
//
//	driver.findElementByXPath("//button[text()='Sweet Alert']").click();
//		
//     Thread. sleep(3000);
		 


		
	driver.get("http://www.leafground.com/pages/Window.html");
		System.out.println(driver.getTitle());
		
   	String firstwindow = driver.getWindowHandle();	
	System.out.println(firstwindow);
		
		System.out.println(driver.getTitle());
		
	driver.findElementById("home").click();
		
		
		
		System.out.println("*******************************");
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		for (String windows : windowHandles) {
			
			System.out.println("EACH WINDOW REFE"+windows);
			
		}
	
        List<String> gotoconsecutive =new ArrayList<String>(windowHandles);
         
        String secondw = gotoconsecutive.get(1);
        
        driver.switchTo().window(secondw);
        
        System.out.println("the second window title is="+driver.getTitle());
		
		
	
        // driver.findElementByXPath("//img[@alt='Buttons']").click();
		
         System.out.println("*******************************");
         
         driver.findElementByXPath("//img[@alt='Buttons']").click();
         Set<String> windowHandles2 = driver.getWindowHandles();
         
 		for (String windows2 : windowHandles2) {
			
			System.out.println("EACH WINDOW REFE"+windows2);
			
		}
         
         List<String> gotoconsecutive1=new ArrayList<String>(windowHandles2);
         
         String thirdw = gotoconsecutive1.get(1);
         
         driver.switchTo().window(thirdw);
         
         System.out.println("the third window title is="+driver.getTitle());
		
		//driver.close();
		
          driver.quit();
		
	}

}
