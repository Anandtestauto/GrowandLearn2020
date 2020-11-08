package W3.D2;

import java.util.ArrayList;
import java.util.List;

public class SortDescList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] input = {"HCL", "Wipro",  "Aspire Systems", "CTS"};
		
		List<String> lstvalues= new ArrayList<String>();
		
		
		for (String eachinput : input) {
			
			lstvalues.add(eachinput);
			
			
		}
		
		System.out.println(lstvalues);
		
		
		for(int i=lstvalues.size()-1;i>=0;i--) {
			
			System.out.println(lstvalues.get(i));
		}
	
	}

}
