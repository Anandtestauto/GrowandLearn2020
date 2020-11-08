package W3.D2;

public class Palindrome {

	//Build a logic to find the given string is palindrome or not
    
		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String val="system";
		String rev="";
		
		
		
         for(int i=val.length()-1;i>=0;i--) {
        	
        	 System.out.println(val.charAt(i));
        	 rev=rev+val.charAt(i);	 
         }
		
         
         if(val.equals(rev)) {
        	 System.out.println("Paliyandrome string");
         }
         else {
        	 System.out.println("Not an Paliyandrome string");
         }
	}

}
