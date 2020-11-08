package W3.D2;

public class ChangeOddIndexToUpperCase {
	
	
	
		
		
		/*
		 Pseudo Code
		 
		 * Declare String Input as Follow
		  
		 * String test = "changeme";
		 
		 * a) Convert the String to character array
		 
		 * b) Traverse through each character (using loop)
		 
		 * c)find the odd index within the loop (use mod operator)
		 
		 * d)within the loop, change the character to uppercase, if the index is odd else don't change
		  
		 */
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String test = "changeme";
		
		
		char[] charArray = test.toCharArray();
		
		
		for(int i=0;i<=charArray.length-1;i++) {
			
			if(i%2!=0) {
				
				System.out.print(Character.toUpperCase(charArray[i]));
			}
			else {
				System.out.print(charArray[i]);
			}
		}
		
	}

}
