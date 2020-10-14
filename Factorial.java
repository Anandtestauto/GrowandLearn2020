package week1.d1;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * Goal: Find the Factorial of a given number
		 * 
		 * input: 5
		 * output: 5*4*3*2*1 = 120
		 * 
		 * Shortcuts:
		 * 1) Print : type: syso, followed by: ctrl + space + enter
		 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
		 *   
		 * What are my learnings from this code?
		 * 1)
		 * 2)
		 * 3) 
		 * 
		 */
		
		     int n=5;
		     int fact=1;
		     
		     for (int i = 1; i <= n; i++) {
		    	 
		    	System.out.println("The val of i s  "+i);
		    	fact=i*fact;
				System.out.println(fact);
		    
			}
              System.out.println("The factorial of "+ n +" is "+fact);
	} 

}
