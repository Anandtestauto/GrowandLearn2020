package W3.D1;

public class Employee {
	
	int id;
	String Name;
	
	
	Employee(){
		
		this(10,"Anand");
		System.out.println("Default constructor");
	}
	
	Employee(int id,String Name ){
		
		this.id=id;
		this.Name=Name;
		
		System.out.println("Parameterized constructor");
	}
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e=new Employee();
		
		System.out.println(e.id); 
		System.out.println(e.Name);

	}

}
