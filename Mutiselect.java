package w4.d1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mutiselect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/selectable/");
		
		// to get into frame
		driver.switchTo().frame(0);
		
		WebElement firstele = driver.findElementByXPath("(//li[contains(text(),'Item 1')])[1]");
		//WebElement secondele= driver.findElementByXPath("(//li[contains(text(),'Item 3')])[1])");
		
	//	WebElement thirdele= driver.findElementByXPath("(//li[contains(text(),'Item 5')])[1])");
		
		
		Actions builder=new Actions(driver);
		
		builder.keyDown(Keys.CONTROL).click(firstele).keyUp(Keys.CONTROL).perform();
		
		//click(secondele)
		
		

	}

}
