package testng.day3;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class DuplicateAdd {
	
	@Test(groups="regression")
	public void runDuplicate(){
		System.out.println("Duplicate add");
		throw new NoSuchElementException();
	}
	

}
