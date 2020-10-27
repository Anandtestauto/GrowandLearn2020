package W3.D1;

public class Mobile {
	
	
	public int pu_model=5000;
	protected String pro_processor="Qualcom";
	String De_Display="Gorilla";
    private int price=1000;
	

	public void pu_sendMSG() {
 
		System.out.println("sendngMSG from mobile class as public");
	}

	protected void pro_makeCall() {

		System.out.println("Making call from mobile class as protected");
	}

	 void def_saveContact() {

		System.out.println("SaveContact from mobile class as default");
	}
	
	
	private void pri_sample() {
		System.out.println("Private method as Private");
	}
}
