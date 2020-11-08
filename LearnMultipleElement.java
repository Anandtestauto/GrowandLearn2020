package w4.d1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnMultipleElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		
		
//		List<WebElement> inputtags = driver.findElementsByTagName("input");
//		
//		
//		System.out.println(inputtags.size());
//		
//		
//		for (WebElement eachele: inputtags) {
//			
//			System.out.println(eachele.getAttribute("name"));
//		}
//		
		
		List<WebElement> listClassName = driver.findElementsByClassName("inputLogin");
		
		System.out.println(listClassName.size());
		
		for (WebElement eache : listClassName) {
			
			System.out.println(eache.getAttribute("id"));
			
		}
		
	}

}
