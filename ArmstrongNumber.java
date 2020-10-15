package w1.d1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input=153;
		
		int rem;
		
		int result=0;
		
		int original=input;
		
		while(input>0) {
			
			rem= (input%10);
			
		    result= result+(rem*rem*rem);	
			
		    input= input/10;
			
		}
		
		
		if(original==result) {
			
			System.out.println("ArmstrongNumber");
		}
		
		else{
			System.out.println("Not ArmstrongNumber");
		}
	}

} 
