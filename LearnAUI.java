package w4.d1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver(options);
		
		//driver.get("https://www.myntra.com/");
		
		
//		WebElement elementtomove1 = driver.findElementByXPath("//a[text()='Men']");
//		WebElement elementtomove2 = driver.findElementByXPath("//a[text()='Women']");
//		WebElement elementtomove3 = driver.findElementByXPath("//a[text()='Kids']");
//		WebElement elementtomove4 = driver.findElementByXPath("//a[text()='Offers']");
//		
//		Actions builder=new Actions(driver);
		
		// mouse over the element
		
//		builder.moveToElement(elementtomove1).perform();
//		builder.moveToElement(elementtomove2).perform();
//		builder.moveToElement(elementtomove3).perform();
//		builder.moveToElement(elementtomove4).perform();
		
		// right clck 
		
		//builder.contextClick(elementtomove1).perform();
		
		
		//builder.doubleClick(elementtomove1).perform();
		
		
		
		driver.get("https://www.snapdeal.com/");
		WebElement movermens = driver.findElementByXPath("//*[@id=\"leftNavMenuRevamp\"]/div[1]/div[2]/ul/li[7]/a/span");

		Actions builder1=new Actions(driver);
		
		builder1.moveToElement(movermens).perform();
		
		driver.findElementByXPath("//*[@id=\"category6Data\"]/div[2]/div/div/p[3]/a/span").click();
		
		
		WebElement movershirt = driver.findElementByXPath("//*[@id=\"display-price-657264832988\"]");
		
		builder1.moveToElement(movershirt).perform();
		
		
	}

}
