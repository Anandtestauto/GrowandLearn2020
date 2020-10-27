package W3.D1;

public class SmartPhone  extends AndroidPhone  {
	
	public void connectWhatsapp() {

		System.out.println("Connecting Whatsapp");
	}
 
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SmartPhone s=new SmartPhone();
		
		
		System.out.println(s.pu_model);
		//System.out.println(s.pro_processor);
		System.out.println(s.De_Display);
		//System.out.println(s.Price);
		
		//s.connectWhatsapp();
		s.pu_sendMSG();
		s.def_saveContact();
		//s.pro_makeCall();
		s.takeVideo();
		
	
	
		
		
		Mobile m=new Mobile();
		
		System.out.println(m.De_Display);
		System.out.println(m.pu_model);
		System.out.println(m.pro_processor);
		//System.out.println(m.price);
		
		
		m.pu_sendMSG();
		m.pro_makeCall();
		m.def_saveContact();
		//m.Sample();
			

	}

}
