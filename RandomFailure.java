package testng.day3;

import org.testng.annotations.Test;

public class RandomFailure {
	
	@Test(timeOut = 500)
	public void testcase1() throws InterruptedException {
		
		
		System.out.println((int)(Math.random()*1000));
		
		int ranNum= (int)(Math.random()*1000);
		
		Thread.sleep(ranNum);

	}

}
