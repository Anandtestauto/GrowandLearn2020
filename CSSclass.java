package Inter;

import org.openqa.selenium.chrome.ChromeDriver;


public class CSSclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
        //WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		// using attribute
		//************ tagname[attribute_name = ‘attribute_value’]************
		
		//driver.findElementByCssSelector("input[id=username]").sendKeys("demosalesmanager");
		//driver.findElementByCssSelector("input[id=password]").sendKeys("crmsfa");
		//driver.findElementByCssSelector("input[value=Login]").click();
		
		// id
		//************ tagname#id-attributevale************
		
		
		driver.findElementByCssSelector("input#username").sendKeys("demosalesmanager");
		driver.findElementByCssSelector("input#password").sendKeys("crmsfa");
		
		
		// class
				//************ tagname.class-attributevale************
		
		driver.findElementByCssSelector("input.decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		
		driver.findElementByCssSelector("input#createLeadForm_companyName").sendKeys("TestLeaf");
		
		// multiple attribute
		
		driver.findElementByCssSelector("input#createLeadForm_firstName[name=firstName]").sendKeys("Babu");
		driver.findElementByCssSelector("input.inputBox[name=lastName]").sendKeys("Babu");
		
		// dynamic web element Parent child and text strings
		
		// parent child
		
		//Parent-css selector>child HTML tag:nth-of-type(index)
		
		
		// text String contains
		
		driver.findElementByCssSelector("input[id*=personalTitle]").sendKeys("Mr.");
		// text String starting text
		driver.findElementByCssSelector("input[id^=createLeadForm_sic]").sendKeys("111");
		
		// text String ending text
		driver.findElementByCssSelector("input[id$=lastNameLocal]").sendKeys("adadda");
		
		driver.findElementByCssSelector("input.smallSubmit").click();
		
		
		
		
		
		
	}

}
