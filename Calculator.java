package W3.D1;

public class Calculator {
	
	
	public void add(int a,int b) {
		
		System.out.println("The sum of two var"+(a+b));
	}
	
	public void add(int a,int b,int c) {
		
		System.out.println("The sum of three var"+(a+b));
	}
	
	
	public void mul(int a,int b) {
		
		System.out.println("The mul of two var"+(a*b));
	}
	
	
	public void mul(int a,double b) {
		
		System.out.println("The sub of two var"+(a-b));
	}

	public void sub(double a,double b) {
		
		System.out.println("The sub of two var"+(a-b));
	}
	
	
	public void sub(int a,int b) {
		
		System.out.println("The sub of two var"+(a-b));
	}
	
	public void div(double a,int b) {
		
		System.out.println("The div of two var"+(a/b));
	}
	
	public void div(int a,int b) {
		
		System.out.println("The div of two var"+(a/b));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator c=new Calculator();
		
		c.add(10, 15);
		c.add(10, 15, 25);
		c.mul(10, 1458);
		c.mul(15, 25);
		c.sub(54451, 4545454);
		c.sub(25, 15);
		c.div(10, 5);
		c.div(44545, 2);
		

	}

}
