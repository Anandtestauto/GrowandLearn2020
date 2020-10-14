package week1.d2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//declare array
		
		int[] values=new int[3];
		
		//String[] names=new String[5];
		
		values[0]=10;
		values[1]=20;
		values[2]=30;
		
		// find length of array 
		
		System.out.println(values.length);
		
		// to sort the array using inbuilt method
		
		Arrays.sort(values);
		
		System.out.println(values);
		
		// to print values in array
		
		for(int i=0;i<=values.length-1;i++) {
			
			System.out.println(values[i]);
			
		}
		
		//// to print values in array reverse
		
		System.out.println("REVERSE ORDER");
        for(int i=values.length-1;i>=0;i--) {
			
			System.out.println(values[i]);
			
		}  
		

	}

}
     