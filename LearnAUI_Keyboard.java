package w4.d1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAUI_Keyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		WebElement selenium = driver.findElementByXPath("//option[text()='Select your programs']/following-sibling::option[1]");
		WebElement Appium = driver.findElementByXPath("//option[text()='Select your programs']/following-sibling::option[2]");
		
		Actions builder=new Actions(driver);
		
         builder.keyDown(Keys.CONTROL).click(selenium).click(Appium).keyUp(Keys.CONTROL).perform();
		
	}

}
