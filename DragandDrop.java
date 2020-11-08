package w4.d1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

WebDriverManager.chromedriver().setup();

ChromeOptions options=new ChromeOptions();
options.addArguments("--disable-notifications");
		
		ChromeDriver driver=new ChromeDriver(options);
		
//		driver.get("http://www.leafground.com/pages/drop.html");
//		
//		
//		WebElement source = driver.findElementById("draggable");
//		
//		WebElement target = driver.findElementById("droppable");
//		
//		Actions builder=new Actions(driver);
//		
//		//builder.dragAndDrop(source, target).perform();
//		
//		builder.dragAndDropBy(source, 100, 50).perform();
	
	
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		
		WebElement source = driver.findElementById("draggable");
		
		WebElement target = driver.findElementById("droppable");
		
		System.out.println(target.getLocation());
		
		
		Actions builder=new Actions(driver);
		
		builder.dragAndDropBy(source, 146, 18).perform();
		
	}

}
