package w4.d1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnStaticWebtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/table.html");
		
		
		
		// to get the first row text
		
		//String text = driver.findElementByXPath("//table[@id='table_id']//tr[2]/td").getText();
		//System.out.println(text);
		
		
//		for(int i=2;i<6;i++) {
//			String text = driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]/td").getText();
//			System.out.println(text);
//		}
		
		//  to find row count
		
		List<WebElement> rCount = driver.findElementsByXPath("//table[@id='table_id']//tr");
		
		int rowCount = rCount.size();
		
		System.out.println("The number 	of rows are "+rowCount);
		
		// to find cell count
		int cellCount = driver.findElementsByXPath("//table[@id='table_id']//tr[2]/td").size();
		
		System.out.println("The number 	of cells are "+cellCount);
	
	for(int i=2;i<=rowCount;i++) {
		
		for(int j=1;j<=cellCount;j++) {
			
			String text = driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]/td["+j+"]").getText();
			System.out.println(text);
		}
		
	}

	
	WebElement secondele = driver.findElementByXPath("//*[@id=\"table_id\"]/tbody/tr[3]/td[2]");
	
	System.out.println("The progress value of Learn to interact with Elements="+secondele.getText());
	
	driver.findElementByXPath("//*[@id=\"table_id\"]/tbody/tr[4]/td[3]/input").click();
}
	
}

