package w2.d2;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MyCalc cal=new MyCalc();
		
		System.out.println(cal.name);
		System.out.println(cal.version);
		
		System.out.println("the sum of "+cal.add(10,20));
		System.out.println("the sub of "+cal.sub(2522,54));
		System.out.println("the mul of "+cal.mul(11.25f,25.54f));
		System.out.println("the div of "+cal.div(5525,525));

	}

}
