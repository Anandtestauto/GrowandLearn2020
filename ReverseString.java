package W3.D2;

public class ReverseString {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "feeling good";
		
		
		
		// Build the logic to find the count of each
				/* Pseudo Code: 1
					a) Convert the String to character array
					b) Traverse through each character (using loop in reverse direction)
					c) Print the character (without newline -> like below
					   System.out.print(ch);
				*/

//		char[] charArray = test.toCharArray();	
//		
//		for(int i=charArray.length-1;i>=0;i--) {
//			
//			System.out.print(charArray[i]);
//		}
		
		
				
				/* Pseudo Code: 2
				a) Find the length of the string
				b) Traverse through each index from length-1 -> 0 (using loop in reverse direction)
				c) Find the character of the String using its index
				*/
				
		int length = test.length();
		String rev="";
		for(int i=length-1;i>=0;i--) {
			
			rev=rev+test.charAt(i);
		
			
		}
		System.out.println(rev);
		
	}

}
