package w2.d2;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[][] number=new int[3][2];
		
		number[0][0]= 10;
		number[0][1]= 20;
		
		number[1][0]= 30;
		number[1][1]= 40;
		
		number[2][0]= 50;
		number[2][1]= 60;
		
		
   // System.out.println(number[2][0]);
		
		
	for(int i=0;i<number.length;i++) {
			for(int j=0;j<number[i].length;j++) {
			
			System.out.print("The values in 2D are:");
				
				System.out.println("Number"+"["+i+"]"+"["+j+"]"+"="+number[i][j]);
				
			}
		}
		
	    
		
		

	}

}
