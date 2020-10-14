package week1.d2;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Calculator c=new Calculator();
		
		int resultadd = c.add(2, 10, 7);
		System.out.println(resultadd);
		
		int resultsub = c.sub(17, 10);
		System.out.println(resultsub);
		
		double resultmul = c.mul(257.25152, 2225.2546585);
		System.out.println(resultmul);
		
		float resultdiv =c.div(7.25f, 1.25f);
		System.out.println(resultdiv);
		
	}
	
}

