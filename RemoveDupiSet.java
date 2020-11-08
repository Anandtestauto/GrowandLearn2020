package W3.D2;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDupiSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] input = {"HCL", "Wipro",  "Infosys", "Aspire Systems", "CTS","Infosys"};
		
		//Set<String> setvalues=new LinkedHashSet<String>();
		Set<String> setvalues=new TreeSet<String>();
		
		for(String values: input) {
			
			setvalues.add(values);
		}
		
		System.out.println(setvalues);
		
		
		
		
	}

}
