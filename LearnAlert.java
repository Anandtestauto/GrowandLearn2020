package w4.d2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
    	driver.get("http://www.leafground.com/pages/Alert.html");
		
//		driver.findElementByXPath("//button[text()='Alert Box']").click();
//		
//		Thread.sleep(3000);
//		
//		Alert alert2 = driver.switchTo().alert();
//		
//		System.out.println(alert2.getText());
//		
//		alert2.accept();
		
		
//		driver.findElementByXPath("//button[text()='Confirm Box']").click();
//		
//		Thread.sleep(3000);
//		
//	    Alert alert = driver.switchTo().alert();
//				
//		String text1 =alert.getText();
//		System.out.println(text1);   
//		driver.switchTo().alert().dismiss();
		
		
		
//		driver.findElementByXPath("//button[text()='Prompt Box']").click();
//		
//		Alert alert = driver.switchTo().alert();
//		Thread.sleep(2000);
//		alert.sendKeys("anand");
//		Thread.sleep(2000);
//		System.out.println(alert.getText());
//		
//		alert.accept();
		

		
//		driver.findElementByXPath("//button[text()='Sweet Alert']").click();
//		
//		 Thread.sleep(3000);
//		driver.findElementByXPath("//button[text()='OK']").click();
		
		
		
//		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
//		
//		driver.switchTo().frame(0);
//		
//		driver.findElementByXPath("/html/body/button").click();
//		
//		Alert alert = driver.switchTo().alert();
//		
//		System.out.println(alert.getText());
//		
//		alert.sendKeys("ANAND");
//		
//		Thread.sleep(2000);
//		alert.accept();
//		
//		String text = driver.findElementByXPath("//*[@id=\"demo\"]").getText();
//		
//		System.out.println(text);
//		
//		if(text.contains("ANAND")){
//			System.out.println("My name is avalable");
//       }
//		else {
//			System.out.println("My name is not avalable");
//		}
//		
		
		
//		driver.get("https://www.irctc.co.in/nget/train-search");
//		
//		driver.findElementByXPath("//button[text()='Ok']").click();
//		
//		//driver.findElementByXPath("//label[text()='FLIGHTS']").click();
//		
		
		driver.findElementByXPath("//button[text()='Line Breaks?']").click();
		
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		
		System.out.println(text);
		
        alert.accept();
		
	}

}
