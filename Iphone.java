package w2.d2;

import W3.D1.Mobile;

public class Iphone extends Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Iphone i=new Iphone();
		
		System.out.println(i.pu_model);
		System.out.println(i.pro_processor);
		//System.out.println(i.De_Display);
		//System.out.println(i.price);
		
		
		i.pu_sendMSG();
		i.pro_makeCall();
		//i.def_saveContact();
		
		
		
		
		Mobile m=new Mobile();
		
		System.out.println(m.pu_model);
		
		//System.out.println(m.De_Display);
		
		m.pu_sendMSG();
		//m.def_saveContact(); 

	}

}
