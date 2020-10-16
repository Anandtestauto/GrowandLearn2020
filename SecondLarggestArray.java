package w2.d2;

import java.util.Arrays;

public class SecondLarggestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] num= {56,54,85,10,22};
		
		Arrays.sort(num);
		
		
//	    // sorted array details
		
//		for(int i=0;i<num.length;i++) {
//			
//			System.out.println(+num[i]+",");
//		}
		
		// to print in descending order
		
		for(int i=num.length-1;i>=0;i--) {
			
			System.out.println(+num[i]+",");
		}
		
		System.out.println("The lenth of array"+num.length);
		
//		// To find second largest
//		
//		for(int i=num.length-2;i==num.length-2;i++) {
//			
//			System.out.println("The second largest num are"+num[i]);
//		}
		

	}

}
