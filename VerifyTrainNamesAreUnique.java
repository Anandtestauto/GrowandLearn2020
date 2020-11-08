package w4.d1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTrainNamesAreUnique {

	public static void main(String[] args) throws InterruptedException {
		
//		Set the system property and Launch the URL
		
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://erail.in");
		
//		Click the 'sort on date' checkbox
		
		driver.findElementById("chkSelectDateOnly").click();
		
//		clear the existing text from station text field
		
		driver.findElementById("txtStationFrom").clear();
		
//		type "ms"in the from station text field
		
		driver.findElementById("txtStationFrom").sendKeys("ms");
		
//		tab in the from station text field
		
		driver.findElementById("txtStationFrom").sendKeys(Keys.TAB);
		
//		clear the existing text in the to station text field
		
		driver.findElementById("txtStationTo").clear();
//		type "mdu" in the to station text field
		
		driver.findElementById("txtStationTo").sendKeys("mdu");
		
//		tab in the to station text field
		
		driver.findElementById("txtStationTo").sendKeys(Keys.TAB);
		
//		Add a java sleep for 2 seconds
		
		Thread.sleep(4000);
		
//		Store all the train names in a list
		
		List<String> trainnames=new ArrayList<String>();
		
		 List<WebElement> rcount = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr");
		
	    int rowcount = rcount.size();
	    
	    System.out.println(rowcount);
	    
	    for(int i=2;i<=rowcount;i++) {
		
		String text = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]//td[2]").getText();
		
		System.out.println(text);
		
		trainnames.add(text);
		
	    }		
		

	    
//		Get the size of list
        int listsize = trainnames.size();
	    
	    System.out.println("The list size is"+listsize);
//		Add the list into a new Set
	    
	    Set<String> trainset =new LinkedHashSet<String>();
	    
	    trainset.addAll(trainnames);
		
//		Get the size of set
	    
	    int setsize = trainset.size();
	    
	    System.out.println("The set size is"+setsize);

//		Compare the Size of list and Set to verify the names are unique

	
		if(listsize==setsize) {
			System.out.println("NO DUPLCATE TRAIN NAMES");
		}
		else {
			System.out.println("DUPLCATE TRAIN NAMES");
		}
		
	}

}
