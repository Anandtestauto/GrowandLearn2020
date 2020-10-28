package W3.D1;

public class LearnConstructor extends Parent {
	
	int id;
	String Name;
	
	public LearnConstructor() {
		System.out.println("Default constructor");
	}
	
	public LearnConstructor(int num,String Nam) {
		
		id=num;
		Name=Nam;
		System.out.println("Parameterized constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LearnConstructor l=new LearnConstructor(1,"Anand");
		
		System.out.println(l.id); 
		System.out.println(l.Name);
		

	}

}
