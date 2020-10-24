package w2.d1;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UI_Activity {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		
//		// EDIT page
//		driver.get("http://leafground.com/pages/Edit.html");
//		
//		driver.findElementByXPath("//input[@id='email']").sendKeys("anand@gmail.com");
//		
//		WebElement edit2 = driver.findElementByXPath("//input[@value='Append ']");
//		
//		edit2.sendKeys("testng");
//		
//		Thread.sleep(2000);
//		
//		edit2.sendKeys(Keys.TAB);
//		
//		Thread.sleep(2000);
//		
//		// need to clarify get text
//		WebElement Attrval = driver.findElementByXPath("//input[@value='TestLeaf']");
//		
//		String text = Attrval.getText();
//		
//		System.out.println("edit3 value="+text);
//		
//		System.out.println("Get Attribute value"+driver.findElementByXPath("//input[@value='TestLeaf']").getAttribute("value"));
//		
//		driver.findElementByXPath("//input[@value='Clear me!!']").clear();
//		
//		Thread.sleep(2000);
//		
// 		System.out.println(driver.findElementByXPath("//input[@disabled='true']").isEnabled());
//		
		
		
		// BUTTON PAGE
//		driver.get("http://leafground.com/pages/Button.html");
//		
//		driver.findElementByXPath("//button[text()='Go to Home Page']").click();
//		
//		String title = driver.getTitle();
//		
//		System.out.println(title);
//		
//		//driver.findElementByXPath("//img[@class='wp-categories-icon svg-image']").click();
//		
//		driver.get("http://leafground.com/pages/Button.html");
//		
//		System.out.println("The location coordinates are"+driver.findElementByXPath("//button[@id='position']").getLocation());
//		
//		System.out.println(driver.findElementByXPath("//button[@id='color']").getCssValue("background-color"));
//		
//		System.out.println("The width and Height "+driver.findElementByXPath("//button[@id='size']").getSize());
//		
		
		//HTPHERLINKS
//		
//		driver.get("http://leafground.com/pages/Link.html");
//		
//	    driver.findElementByLinkText("Go to Home Page").click();
//		
//	    System.out.println("THE TITLE OF THE PAGE is="+driver.getTitle());
//		
//		driver.findElementByXPath("//img[@src='images/link.png']").click();
//		
//        driver.findElementByLinkText("Find where am supposed to go without clicking me?").click();
//		
//        System.out.println("THE second TITLE OF THE PAGE is="+driver.getTitle());
//		
//        driver.get("http://leafground.com/pages/Link.html");
//		
//		driver.findElementByLinkText("Verify am I broken?").click();
//		
//   
//		
//		System.out.println("THE third TITLE OF THE PAGE is="+  driver.getTitle());
//		 
//		driver.navigate().back();
//		
//		Thread.sleep(2000);
//		
		
		// to find the number of links
		
		// WebElement links =  driver.findElementByTagName("a");
		
		 
	   
//		 
//		 for(int i=0;i<links.size();i++) {
//			 
//			 System.out.println(links. get(i).getText());
//		 }
//	     
	    
		// IMAGE INTERACTION
		
//		driver.get("http://leafground.com/pages/Image.html");
//		
//		driver.findElementByXPath("//img[@src='../images/home.png']").click();
//		
//		System.out.println("The title of the page="+driver.getTitle());
//		
//		driver.get("http://leafground.com/pages/Image.html");
//		
//		driver.findElementByXPath("//img[@src='../images/keyboard.png']").click();
//		
//		System.out.println("The title of the page img3="+driver.getTitle());
		
		
		//  drop down interaction
//		
//		driver.get("http://leafground.com/pages/Dropdown.html");
//		
//		WebElement dd1 = driver.findElementById("dropdown1"); 
//		
//		Select eelement1=new Select(dd1);
//		
//	    eelement1.selectByIndex(1);
//	    
//	    WebElement dd2 = driver.findElementByName("dropdown2");   
//		
//        Select eelement2=new Select(dd2);
//		
//	    eelement2.selectByVisibleText("Appium");
//	    
//	    WebElement dd3 = driver.findElementById("dropdown3");   
//		
//        Select eelement3=new Select(dd3);
//		
//	    eelement2.selectByValue("3");
//	    
//	    
//	    //   get the number of options and print
//        WebElement dd4 = driver.findElementByClassName("dropdown");   
//		
//        Select options1=new Select(dd4);
//		
//        List<WebElement> options = options1.getOptions();
//        
//         System.out.println("The no of options are="+options.size());
//         
//		  
//         for(int i=0;i<options.size()-1;i++) {
//        	 
//        	 System.out.println("The each option in"+i+"="+options.get(i).getText());
//         }
         
//         WebElement dd5 = driver.findElementByTagName("select");
// 		
//         Select options5=new Select(dd5);
//         
//         
         
         
//         WebElement dd5 = driver.findElementByClassName("dropdown");   
// 		
//         Select options1=new Select(dd4);
         
         
		    // radio button interaction
		
//		driver.get("http://leafground.com/pages/radio.html");
//		
//		Thread.sleep(3000);
//		
//		driver.findElementByXPath("//input[@type='radio']").click();
//		
//		Thread.sleep(5000);
//		
//		
//		System.out.println(driver.findElementByXPath("//input[@type='radio' and @value='1']").isSelected());
//         
//		System.out.println(driver.findElementByXPath("//input[@type='radio' and @value='2']").isEnabled());
//		
		
         // check box interaction
		
		
	   
	     driver.close(); 
		
		
	}
	
}
