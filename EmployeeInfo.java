package W3.D1;

public class EmployeeInfo {

	int id;
	String Name;
	static String CompanyName;
	

		
	
	public static void grtDetails() {
		System.out.println("Static Method");
	}

	EmployeeInfo(int id, String Name, String CompanyName) {

		this.id = id;
		this.Name = Name;
		this.CompanyName = CompanyName;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		grtDetails();

		EmployeeInfo e = new EmployeeInfo(10, "Anand", "EQUINITI");

		

		EmployeeInfo e1 = new EmployeeInfo(20, "Padman", "EQI");
		
	
		
		System.out.println(e.id);
		System.out.println(e.Name);
		System.out.println(CompanyName);

		System.out.println(e1.id);
		System.out.println(e1.Name);
		System.out.println(CompanyName);

	}

}
